package zwiftj.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class LauncherController {

    private static final Logger logger = LoggerFactory.getLogger(LauncherController.class);
    private Algorithm algorithm = Algorithm.HMAC256("nosecret");

    @GetMapping({"/launcher", "/launcher/realms/zwift/protocol/openid-connect/auth", "/launcher/realms/zwift/protocol/openid-connect/registrations",
            "/auth/realms/zwift/protocol/openid-connect/auth", "/auth/realms/zwift/login-actions/request/login", "/auth/realms/zwift/protocol/openid-connect/registrations",
            "/auth/realms/zwift/login-actions/startriding", "/auth/realms/zwift/tokens/login", "/auth/realms/zwift/tokens/registrations"})
    public void launcherStartGet(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Location", "/login");
        httpServletResponse.setStatus(302);
    }

    @PostMapping("/auth/realms/zwift/login-actions/request/login")
    public void launcherStartPost(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Location", "/login");
        httpServletResponse.setStatus(302);
    }

    @GetMapping("/ride")
    @ResponseStatus(HttpStatus.FOUND)
    public void zwiftRide(HttpServletResponse httpServletResponse, @CookieValue(value = "remember_token", required = false) String rememberToken) {
        logger.info("Got request to ride zwift");
        httpServletResponse.setStatus(302);
        try {

            String refresh_token = this.generateRefreshToken();
            httpServletResponse.setHeader("Location", "http://zwift/?code=zwift_refresh_token" + refresh_token);

        } catch (JWTCreationException | IOException exception) {
            logger.error("Failed to generate refresh token", exception);
            httpServletResponse.setStatus(404);
        }
    }

    private String generateAccessToken() throws IOException {
        return this.generateBaseTokenBuilder()
                .withClaim("name", "super name")
                .withClaim("given_name", "super name")
                .withClaim("family_name", "family name")
                .withClaim("email", "email@mail.com")
                .withClaim("auth_time", Instant.now().toEpochMilli())
                .withClaim("typ", "Bearer").sign(algorithm);
    }

    private String generateIdToken() {
        return JWT.create()
                .withNotBefore(Date.from(Instant.now()))
                .withIssuedAt(Date.from(Instant.now()))
                .withJWTId(UUID.randomUUID().toString())
                .withExpiresAt(Date.from(Instant.now().plus(20, ChronoUnit.DAYS)))
                .withClaim("aud", "Game_Launcher")
                .withClaim("azp", "Game_Launcher")
                .withClaim("typ", "ID")
                .withClaim("sub", UUID.randomUUID().toString())
                .withClaim("acr", 0)
                .withClaim("name", "super name")
                .withClaim("given_name", "super name")
                .withClaim("family_name", "family name")
                .withClaim("email", "email@mail.com")
                .withClaim("auth_time", Instant.now().toEpochMilli())
                .withIssuer("https://secure.zwift.com/auth/realms/zwift")
                .withClaim("session_state", UUID.randomUUID().toString())
                .sign(algorithm);
    }

    private String generateRefreshToken() throws IOException {
        return this.generateBaseTokenBuilder().sign(algorithm);
    }

    private JWTCreator.Builder generateBaseTokenBuilder() {
        Map<String, String[]> rolesMap = new HashMap<>();
        String[] roles = new String[]{"everybody",
                "trial-subscriber",
                "everyone",
                "beta-tester"};
        rolesMap.put("roles", roles);


        Map<String, String[]> authenticatedMap = new HashMap<>();
        String[] authenticatedRoles = new String[]{"authenticated-user", "authorized-player"};
        authenticatedMap.put("roles", authenticatedRoles);

        Map<String, Map<String, String[]>> resourceMap = new HashMap<>();
        resourceMap.put("my-zwift", authenticatedMap);
        resourceMap.put("Game_Launcher", authenticatedMap);
        resourceMap.put("Zwift REST API -- production", authenticatedMap);
        resourceMap.put("Zwift Zendesk", authenticatedMap);
        resourceMap.put("Zwift Relay REST API -- production", authenticatedMap);
        resourceMap.put("ecom-server", authenticatedMap);

        Map<String, String[]> accountMap = new HashMap<>();
        String[] accountRoles = new String[]{"manage-account", "manage-account-links", "view-profile"};
        accountMap.put("roles", accountRoles);
        resourceMap.put("account", accountMap);

        return JWT.create()
                .withNotBefore(Date.from(Instant.now()))
                .withIssuedAt(Date.from(Instant.now()))
                .withJWTId(UUID.randomUUID().toString())
                .withExpiresAt(Date.from(Instant.now().plus(20, ChronoUnit.DAYS)))
                .withClaim("aud", "Game_Launcher")
                .withClaim("azp", "Game_Launcher")
                .withClaim("typ", "Refresh")
                .withClaim("realm_access", rolesMap)
                .withClaim("resource_access", resourceMap)
                .withIssuer("https://secure.zwift.com/auth/realms/zwift")
                .withClaim("session_state", UUID.randomUUID().toString());
    }

    @PostMapping("/auth/rb_bf03269xbi")
    private String authRb() {
        return "OK(Java)";
    }

    @PostMapping("/auth/realms/zwift/protocol/openid-connect/token")
    private String openIdConnect(HttpServletResponse httpServletResponse) {
        try {
            return "{\"access_token\":\"" + this.generateAccessToken() +
                    "\",\"expires_in\":1000021600,\"refresh_expires_in\":611975560,\"refresh_token\":\"" +
                    this.generateRefreshToken() + "\",\"token_type\":\"bearer\",\"id_token\":\"" +
                    this.generateIdToken() + "\",\"not-before-policy\":1408478984,\"session_state\":\"0846ab9a-765d-4c3f-a20c-6cac9e86e5f3\",\"scope\":\"\"}";

        } catch (IOException e) {
            logger.error("Failed to generate openid token", e);
            throw new RuntimeException("Failed to generate openid token");
        }
    }

    @PostMapping("/start-zwift")
    public void zwiftStart(HttpServletResponse httpServletResponse, @RequestParam String map) {
        logger.info("Got request to start zwift with map {}", map);
        if (map.equals("CALENDAR")) {
            httpServletResponse.setHeader("Location", "/ride");
            httpServletResponse.setStatus(302);
        } else {
            Cookie cookie = new Cookie("selected_map", map);
            cookie.setDomain(".zwift.com");

            httpServletResponse.addHeader("Location", "/ride");
            httpServletResponse.addHeader("Cookie", generateHeader(cookie));
            httpServletResponse.setStatus(302);
            httpServletResponse.addCookie(cookie);
        }
    }

    public String generateHeader(Cookie cookie) {

        // Can't use StringBuilder due to DateFormat
        StringBuffer header = new StringBuffer();

        // TODO: Name validation takes place in Cookie and cannot be configured
        //       per Context. Moving it to here would allow per Context config
        //       but delay validation until the header is generated. However,
        //       the spec requires an IllegalArgumentException on Cookie
        //       generation.
        header.append(cookie.getName());
        header.append('=');
        String value = cookie.getValue();
        if (value != null && value.length() > 0) {
            header.append(value);
        }

        // RFC 6265 prefers Max-Age to Expires but... (see below)
        int maxAge = cookie.getMaxAge();
        if (maxAge > -1) {
            // Negative Max-Age is equivalent to no Max-Age
            header.append("; Max-Age=");
            header.append(maxAge);

            // Microsoft IE and Microsoft Edge don't understand Max-Age so send
            // expires as well. Without this, persistent cookies fail with those
            // browsers. See http://tomcat.markmail.org/thread/g6sipbofsjossacn


        }

        String domain = cookie.getDomain();
        if (domain != null && domain.length() > 0) {
            header.append("; Domain=");
            header.append(domain);
        }

        String path = cookie.getPath();
        if (path != null && path.length() > 0) {
            header.append("; Path=");
            header.append(path);
        }

        if (cookie.getSecure()) {
            header.append("; Secure");
        }

        if (cookie.isHttpOnly()) {
            header.append("; HttpOnly");
        }

        return header.toString();
    }

    @PostMapping("/auth/realms/zwift/tokens/access/codes")
    public ResponseEntity zwiftTokenAccessCodes(HttpServletResponse httpServletResponse) {
        String json = "AccessCodes";
        return ResponseEntity.ok(json);
    }
}
