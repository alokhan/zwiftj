package zwiftj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zwiftj.api.model.*;

import javax.servlet.http.HttpServletResponse;
import java.time.Instant;

@RestController
public class ApiController {

    private int udpServerPort = 3023;
    private String udpServerIp = "127.0.0.1";

    @GetMapping("/api/auth")
    public String auth() {
        return "{\"realm\":\"zwift\",\"launcher\":\"https://launcher.zwift.com/launcher\",\"url\":\"https://secure.zwift.com/auth/\"}";
    }

    @PostMapping("/api/users/login")
    public LoginResponse authPost() {
        LoginResponse loginResponse = LoginResponse.newBuilder()
                .setSessionState("abc")
                .setInfo(ServerInfo.newBuilder()
                        .setNodes(UDPNodes.newBuilder()
                                .addNode(UDPNode.newBuilder().setIp(udpServerIp).setPort(udpServerPort).build())
                                .build())
                        .setRelayUrl("https://us-or-rly101.zwift.com/relay")
                        .setApis(APIs.newBuilder().setTrainingpeaksUrl("https://api.trainingpeaks.com").build())
                        .setTime(Instant.now().getEpochSecond())
                        .build()).build();

        return loginResponse;
    }

    @PostMapping("/api/users/logout")
    public void logout(HttpServletResponse response) {

    }

    @PostMapping("/api/analytics/event")
    public String event(HttpServletResponse response) {
        return "";
    }

    @PostMapping("/api/events/search")
    public String eventSearch(HttpServletResponse response) {
        return "";
    }

    @GetMapping("/api/per-session-info")
    public PerSessionInfo sessionInfo(HttpServletResponse response) {
        return PerSessionInfo.newBuilder().setRelayUrl("https://us-or-rly101.zwift.com/relay").build();
    }

    @GetMapping("/api/zfiles")
    public ZFile zFiles(HttpServletResponse response) {
        return ZFile.newBuilder().setFilename("dummy.txt").setFolder("logfiles").setId(1L)
                .setTimestamp(Instant.now().getEpochSecond()).build();
    }

    @GetMapping("/api/telemetry/config")
    public String telemetry(HttpServletResponse response) {
        return "{\"isEnabled\":false}";
    }

    @GetMapping("/api/profiles/me")
    public Profile profile(HttpServletResponse response) {
        return Profile.newBuilder().setAge(25).setId(1).setIsMale(true).setEmail("email").setFirstName("first name").setLastName("last name").build();
    }

    @GetMapping("/api/tcp-config")
    public PeriodicInfos tcpConfig(){
        return PeriodicInfos.newBuilder().addInfos(PeriodicInfo.newBuilder().setF2(udpServerPort).setGameServerIp(udpServerIp).build()).build();
    }

}
