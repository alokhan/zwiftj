package zwiftj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zwiftj.api.model.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

@RestController
public class ApiController {

    public static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    private final int tcpServerPort = 3023;
    private final String tcpServerIp = "127.0.0.1";

    @GetMapping("/api/auth")
    public String auth() {
        return "{\"realm\":\"zwift\",\"launcher\":\"https://launcher.zwift.com/launcher\",\"url\":\"https://secure.zwift.com/auth/\"}";
    }

    @PostMapping(value = "/api/users/login")
    public LoginResponseOuterClass.LoginResponse authPost(HttpServletResponse response) {

        logger.info("Got Auth request");
        LoginResponseOuterClass.LoginResponse loginResponse = LoginResponseOuterClass.LoginResponse.newBuilder()
                .setSessionState("abc")
                .setInfo(LoginResponseOuterClass.ServerInfo.newBuilder()
                        .setNodes(LoginResponseOuterClass.UDPNodes.newBuilder()
                                .addNode(LoginResponseOuterClass.UDPNode.newBuilder()
                                        .setIp(tcpServerIp)
                                        .setPort(tcpServerPort).build())
                                .build())
                        .setRelayUrl("https://us-or-rly101.zwift.com/relay")
                        .setApis(LoginResponseOuterClass.APIs.newBuilder().setTrainingpeaksUrl("https://api.trainingpeaks.com").build())
                        .setTime(Instant.now().getEpochSecond())
                        .build()).build();
        response.setContentType("application/x-protobuf");
        return loginResponse;
    }

    @PostMapping("/api/users/logout")
    public void logout(HttpServletResponse response) {
        response.setStatus(204);
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
    public PerSessionInfoOuterClass.PerSessionInfo sessionInfo(HttpServletResponse response) {
        return PerSessionInfoOuterClass.PerSessionInfo.newBuilder().setRelayUrl("https://us-or-rly101.zwift.com/relay").build();
    }

    @GetMapping("/api/zfiles")
    public Zfiles.ZFile zFiles(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");
        return Zfiles.ZFile.newBuilder().setFilename("dummy.txt").setFolder("logfiles").setId(1L)
                .setTimestamp(Instant.now().getEpochSecond()).build();
    }

    @GetMapping("/api/zfile/list")
    public String zFilesList(HttpServletResponse response) {
        return "";
    }

    @GetMapping("/api/telemetry/config")
    public String telemetry(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return "{\"isEnabled\":false}";
    }

    @GetMapping("/api/profiles/me")
    public ProfileOuterClass.Profile profile(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");
        try {
            byte[] file = getProfileFromFile();
            return ProfileOuterClass.Profile.parseFrom(file);
        } catch (IOException e) {
            return ProfileOuterClass.Profile.newBuilder()
                    .setAge(25)
                    .setId(1)
                    .setAchievementLevel(50)
                    .setIsConnectedToStrava(0)
                    .setIsMale(true)
                    .setEmail("email@email.com")
                    .setFirstName("first name")
                    .setLastName("last name")
                    .build();
        }
    }

    @GetMapping("/api/profiles")
    public ProfileOuterClass.Profiles profiles(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return ProfileOuterClass.Profiles.newBuilder().addProfiles(ProfileOuterClass.Profile.newBuilder()
                .setAge(25)
                .setId(1)
                .setIsMale(true)
                .setEmail("email@email.com")
                .setFirstName("first name")
                .setLastName("last name")
                .build()).build();
    }

    @GetMapping("/api/tcp-config")
    public PeriodicInfoOuterClass.PeriodicInfos tcpConfig(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return PeriodicInfoOuterClass.PeriodicInfos.newBuilder()
                .addInfos(PeriodicInfoOuterClass.PeriodicInfo.newBuilder()
                        .setF2(tcpServerPort)
                        .setGameServerIp(tcpServerIp).build())
                .build();
    }

    @PostMapping("/api/tcp-config")
    public void playerProfile(HttpServletResponse response) {
        response.setStatus(204);
    }

    @GetMapping("/api/profiles/{playerId}/followees")
    public void followers() {

    }

    @GetMapping("/api/profiles/{playerId}/goals")
    public GoalOuterClass.Goals getGoal(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return GoalOuterClass.Goals.newBuilder().addGoals(GoalOuterClass.Goal.newBuilder().setId(1).setName("test goal").build()).build();
    }

    @PostMapping("/api/profiles/{playerId}/goals")
    public GoalOuterClass.Goals postGoal() {
        return GoalOuterClass.Goals.newBuilder().addGoals(GoalOuterClass.Goal.newBuilder().setId(1).setName("test goal").build()).build();
    }

    @PutMapping("/api/profiles/{playerId}")
    public void updateProfile(HttpServletResponse response) {
        response.setStatus(204);
    }

    @GetMapping("/api/profiles/{playerId}/activities")
    public ActivityOuterClass.Activities getActivitiesForPlayer(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");
        return ActivityOuterClass.Activities.newBuilder()
                .addActivities(ActivityOuterClass.Activity.newBuilder()
                        .setId(1)
                        .setPlayerId(1)
                        .setF3(0)
                        .setStartDate(Instant.now().minus(1, ChronoUnit.DAYS).toString())
                        .setName("super activity")
                        .setAvgWatts(500)
                        .build()).build();
    }

    @GetMapping("/api/private_event/feed")
    public EventsOuterClass.Events getPrivateEvents(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return EventsOuterClass.Events.newBuilder().addEvents(EventsOuterClass.Event.newBuilder()
                .setDescription("event description")
                .setEventStart(Instant.now().plus(1, ChronoUnit.MINUTES).getEpochSecond())
                .setMapId(1)
                .setId(2000)
                .addCategory(EventsOuterClass.Category.newBuilder().setId(2001).setRouteId(947394567)
                        .setStartLocation(1).build())
                .setTitle("GIGA EVENT")
                .build()).build();
    }

    @GetMapping("/api/events/search")
    public EventsOuterClass.Events getEvents(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return EventsOuterClass.Events.newBuilder().addEvents(EventsOuterClass.Event.newBuilder()
                .setDescription("event description")
                .setEventStart(Instant.now().plus(1, ChronoUnit.MINUTES).getEpochSecond())
                .setMapId(1)
                .setId(2000)
                .addCategory(EventsOuterClass.Category.newBuilder().setId(2001).setRouteId(947394567)
                        .setStartLocation(1).build())
                .setTitle("GIGA EVENT")
                .build()).build();
    }

    @GetMapping("/download/profile.bin")
    public ResponseEntity<byte[]> downloadProfile(HttpServletResponse httpServletResponse) {
        try {
            byte[] file = getProfileFromFile();
            return ResponseEntity.ok()
                    .contentLength(file.length)
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(file);
        } catch (IOException e) {
            logger.error("Failed to get player profile", e);
            return null;
        }
    }

    private byte[] getProfileFromFile() throws IOException {
        return Files.readAllBytes(Paths.get("C:\\Users\\alo\\Downloads\\storage\\1\\profile.bin"));
    }

    @GetMapping("/relay/dropin")
    public WorldOuterClass.Worlds dropin(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");
        return relayWorldsGeneric();
    }

    @GetMapping("/relay/worlds")
    public WorldOuterClass.Worlds relayWorlds(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");
        return relayWorldsGeneric();
    }

    @GetMapping("/relay/worlds/{worldId}")
    public WorldOuterClass.Worlds relayWorldsById(@PathVariable int worldId, HttpServletResponse response) {
        response.setContentType("application/x-protobuf");
        return WorldOuterClass.Worlds.newBuilder()
                .addWorlds(WorldOuterClass.World.newBuilder().setId(worldId).build())
                .build();
    }

    @GetMapping("/relay/worlds/{worldId}/join")
    public String worldJoin() {
        return "{\"worldTime\": \"" + Instant.now().getEpochSecond() + "\"}";
    }

    @GetMapping("/relay/worlds/{worldId}/my-hash-seeds")
    public String worldHashSeed() {
        return "[{\"expiryDate\":196859639979,\"seed1\":-733221030,\"seed2\":-2142448243},{\"expiryDate\":196860425476,\"seed1\":1528095532,\"seed2\":-2078218472},{\"expiryDate\":196862212008,\"seed1\":1794747796,\"seed2\":-1901929955},{\"expiryDate\":196862637148,\"seed1\":-1411883466,\"seed2\":1171710140},{\"expiryDate\":196863874267,\"seed1\":670195825,\"seed2\":-317830991}]";
    }

    @GetMapping("/relay/worlds/hash-seeds")
    public HashSeedsOuterClass.HashSeeds relayWorldHashSeed(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return HashSeedsOuterClass.HashSeeds.newBuilder()
                .addSeeds(HashSeedsOuterClass.HashSeed.newBuilder().setSeed1((long) Math.random()).setSeed2((long) Math.random())
                        .setExpiryDate(Instant.now().getEpochSecond() + (10800 + 1200) * 1000).build()).build();
    }

    @GetMapping("/relay/periodic-info")
    public PeriodicInfoOuterClass.PeriodicInfos periodicInfo(HttpServletResponse response) {
        response.setContentType("application/x-protobuf");

        return PeriodicInfoOuterClass.PeriodicInfos.newBuilder().addInfos(PeriodicInfoOuterClass.PeriodicInfo.newBuilder()
                .setGameServerIp(tcpServerIp)
                .setF2(3022).setF3(10).setF4(60).setF5(30).setF6(3).build()).build();
    }

    private WorldOuterClass.Worlds relayWorldsGeneric() {
        return WorldOuterClass.Worlds.newBuilder()
                .addWorlds(WorldOuterClass.World.newBuilder().setId(1)
                        .addPacePartnerStates(WorldOuterClass.Player.newBuilder().setId(1).setLastName("cucu").setFirstName("coucou").build())
                        .setF3(6).setRealTime(Instant.now().getEpochSecond()).setWorldTime(Instant.now().getEpochSecond()).setF5(0).setName("Watopia").build())
                .addWorlds(WorldOuterClass.World.newBuilder().setId(1)
                        .addPacePartnerStates(WorldOuterClass.Player.newBuilder().setId(1).setLastName("cucu").setFirstName("coucou").build())
                        .setF3(14).setRealTime(Instant.now().getEpochSecond()).setWorldTime(Instant.now().getEpochSecond()).setF5(0).setName("Watopia").build())
                .addWorlds(WorldOuterClass.World.newBuilder().setId(1).setF3(2).setRealTime(Instant.now().getEpochSecond()).setWorldTime(Instant.now().getEpochSecond()).setF5(0).setName("Watopia").build())
                .addWorlds(WorldOuterClass.World.newBuilder().setId(2).setF3(14).setRealTime(Instant.now().getEpochSecond()).setWorldTime(Instant.now().getEpochSecond()).setF5(0).setName("La France").build())
                .addWorlds(WorldOuterClass.World.newBuilder().setId(3)
                        .addPacePartnerStates(WorldOuterClass.Player.newBuilder().setId(1).setLastName("cucu").setFirstName("coucou").build())
                        .setF3(14).setRealTime(Instant.now().getEpochSecond()).setWorldTime(Instant.now().getEpochSecond()).setF5(0).setName("Other shiit").build())
                .build();
    }

}
