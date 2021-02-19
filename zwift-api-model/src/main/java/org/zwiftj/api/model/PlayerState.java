package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class PlayerState
        implements io.protostuff.Message<PlayerState> {

    private static final PlayerState DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private long worldTime;

    private int distance;

    private int roadTime;

    private int laps;

    private int speed;

    private int roadPosition;

    private int cadenceUHz;

    private int heartrate;

    private int power;

    private long heading;

    private int lean;

    private int climbing;

    private int time;

    private int f19;

    private int f20;

    private int progress;

    private long customisationId;

    private int justWatching;

    private int calories;

    private float x;

    private float altitude;

    private float y;

    private int watchingRiderId;

    private int groupId;

    private long sport;

    private float f34;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PlayerState() {
        this.id = 0;
        this.worldTime = 0L;
        this.distance = 0;
        this.roadTime = 0;
        this.laps = 0;
        this.speed = 0;
        this.roadPosition = 0;
        this.cadenceUHz = 0;
        this.heartrate = 0;
        this.power = 0;
        this.heading = 0L;
        this.lean = 0;
        this.climbing = 0;
        this.time = 0;
        this.f19 = 0;
        this.f20 = 0;
        this.progress = 0;
        this.customisationId = 0L;
        this.justWatching = 0;
        this.calories = 0;
        this.x = 0f;
        this.altitude = 0f;
        this.y = 0f;
        this.watchingRiderId = 0;
        this.groupId = 0;
        this.sport = 0L;
        this.f34 = 0f;
    }

    private PlayerState(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PlayerState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PlayerState> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public PlayerState withId(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public long getWorldTime() {
        return worldTime;
    }

    public boolean hasWorldTime() {
        return (__bitField0 & 2) == 2;
    }

    public PlayerState withWorldTime(long value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setWorldTime(value)
            .build();
    }

    public int getDistance() {
        return distance;
    }

    public boolean hasDistance() {
        return (__bitField0 & 4) == 4;
    }

    public PlayerState withDistance(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setDistance(value)
            .build();
    }

    public int getRoadTime() {
        return roadTime;
    }

    public boolean hasRoadTime() {
        return (__bitField0 & 8) == 8;
    }

    public PlayerState withRoadTime(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setRoadTime(value)
            .build();
    }

    public int getLaps() {
        return laps;
    }

    public boolean hasLaps() {
        return (__bitField0 & 16) == 16;
    }

    public PlayerState withLaps(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setLaps(value)
            .build();
    }

    public int getSpeed() {
        return speed;
    }

    public boolean hasSpeed() {
        return (__bitField0 & 32) == 32;
    }

    public PlayerState withSpeed(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setSpeed(value)
            .build();
    }

    public int getRoadPosition() {
        return roadPosition;
    }

    public boolean hasRoadPosition() {
        return (__bitField0 & 64) == 64;
    }

    public PlayerState withRoadPosition(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setRoadPosition(value)
            .build();
    }

    public int getCadenceUHz() {
        return cadenceUHz;
    }

    public boolean hasCadenceUHz() {
        return (__bitField0 & 128) == 128;
    }

    public PlayerState withCadenceUHz(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setCadenceUHz(value)
            .build();
    }

    public int getHeartrate() {
        return heartrate;
    }

    public boolean hasHeartrate() {
        return (__bitField0 & 256) == 256;
    }

    public PlayerState withHeartrate(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setHeartrate(value)
            .build();
    }

    public int getPower() {
        return power;
    }

    public boolean hasPower() {
        return (__bitField0 & 512) == 512;
    }

    public PlayerState withPower(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setPower(value)
            .build();
    }

    public long getHeading() {
        return heading;
    }

    public boolean hasHeading() {
        return (__bitField0 & 1024) == 1024;
    }

    public PlayerState withHeading(long value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setHeading(value)
            .build();
    }

    public int getLean() {
        return lean;
    }

    public boolean hasLean() {
        return (__bitField0 & 2048) == 2048;
    }

    public PlayerState withLean(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setLean(value)
            .build();
    }

    public int getClimbing() {
        return climbing;
    }

    public boolean hasClimbing() {
        return (__bitField0 & 4096) == 4096;
    }

    public PlayerState withClimbing(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setClimbing(value)
            .build();
    }

    public int getTime() {
        return time;
    }

    public boolean hasTime() {
        return (__bitField0 & 8192) == 8192;
    }

    public PlayerState withTime(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setTime(value)
            .build();
    }

    public int getF19() {
        return f19;
    }

    public boolean hasF19() {
        return (__bitField0 & 16384) == 16384;
    }

    public PlayerState withF19(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setF19(value)
            .build();
    }

    public int getF20() {
        return f20;
    }

    public boolean hasF20() {
        return (__bitField0 & 32768) == 32768;
    }

    public PlayerState withF20(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setF20(value)
            .build();
    }

    public int getProgress() {
        return progress;
    }

    public boolean hasProgress() {
        return (__bitField0 & 65536) == 65536;
    }

    public PlayerState withProgress(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setProgress(value)
            .build();
    }

    public long getCustomisationId() {
        return customisationId;
    }

    public boolean hasCustomisationId() {
        return (__bitField0 & 131072) == 131072;
    }

    public PlayerState withCustomisationId(long value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setCustomisationId(value)
            .build();
    }

    public int getJustWatching() {
        return justWatching;
    }

    public boolean hasJustWatching() {
        return (__bitField0 & 262144) == 262144;
    }

    public PlayerState withJustWatching(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setJustWatching(value)
            .build();
    }

    public int getCalories() {
        return calories;
    }

    public boolean hasCalories() {
        return (__bitField0 & 524288) == 524288;
    }

    public PlayerState withCalories(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setCalories(value)
            .build();
    }

    public float getX() {
        return x;
    }

    public boolean hasX() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public PlayerState withX(float value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setX(value)
            .build();
    }

    public float getAltitude() {
        return altitude;
    }

    public boolean hasAltitude() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public PlayerState withAltitude(float value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setAltitude(value)
            .build();
    }

    public float getY() {
        return y;
    }

    public boolean hasY() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public PlayerState withY(float value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setY(value)
            .build();
    }

    public int getWatchingRiderId() {
        return watchingRiderId;
    }

    public boolean hasWatchingRiderId() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public PlayerState withWatchingRiderId(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setWatchingRiderId(value)
            .build();
    }

    public int getGroupId() {
        return groupId;
    }

    public boolean hasGroupId() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public PlayerState withGroupId(int value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setGroupId(value)
            .build();
    }

    public long getSport() {
        return sport;
    }

    public boolean hasSport() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public PlayerState withSport(long value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setSport(value)
            .build();
    }

    public float getF34() {
        return f34;
    }

    public boolean hasF34() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public PlayerState withF34(float value) {
        return PlayerState.newBuilder()
            .mergeFrom(this)
            .setF34(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PlayerState> cachedSchema() {
        return Schema.INSTANCE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        PlayerState that = (PlayerState) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.distance, that.distance)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roadTime, that.roadTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.laps, that.laps)) {
            return false;
        }
        if (!java.util.Objects.equals(this.speed, that.speed)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roadPosition, that.roadPosition)) {
            return false;
        }
        if (!java.util.Objects.equals(this.cadenceUHz, that.cadenceUHz)) {
            return false;
        }
        if (!java.util.Objects.equals(this.heartrate, that.heartrate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.power, that.power)) {
            return false;
        }
        if (!java.util.Objects.equals(this.heading, that.heading)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lean, that.lean)) {
            return false;
        }
        if (!java.util.Objects.equals(this.climbing, that.climbing)) {
            return false;
        }
        if (!java.util.Objects.equals(this.time, that.time)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f19, that.f19)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f20, that.f20)) {
            return false;
        }
        if (!java.util.Objects.equals(this.progress, that.progress)) {
            return false;
        }
        if (!java.util.Objects.equals(this.customisationId, that.customisationId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.justWatching, that.justWatching)) {
            return false;
        }
        if (!java.util.Objects.equals(this.calories, that.calories)) {
            return false;
        }
        if (!java.util.Objects.equals(this.x, that.x)) {
            return false;
        }
        if (!java.util.Objects.equals(this.altitude, that.altitude)) {
            return false;
        }
        if (!java.util.Objects.equals(this.y, that.y)) {
            return false;
        }
        if (!java.util.Objects.equals(this.watchingRiderId, that.watchingRiderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.groupId, that.groupId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.sport, that.sport)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f34, that.f34)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Long.hashCode(this.worldTime);
        result = 31 * result + Integer.hashCode(this.distance);
        result = 31 * result + Integer.hashCode(this.roadTime);
        result = 31 * result + Integer.hashCode(this.laps);
        result = 31 * result + Integer.hashCode(this.speed);
        result = 31 * result + Integer.hashCode(this.roadPosition);
        result = 31 * result + Integer.hashCode(this.cadenceUHz);
        result = 31 * result + Integer.hashCode(this.heartrate);
        result = 31 * result + Integer.hashCode(this.power);
        result = 31 * result + Long.hashCode(this.heading);
        result = 31 * result + Integer.hashCode(this.lean);
        result = 31 * result + Integer.hashCode(this.climbing);
        result = 31 * result + Integer.hashCode(this.time);
        result = 31 * result + Integer.hashCode(this.f19);
        result = 31 * result + Integer.hashCode(this.f20);
        result = 31 * result + Integer.hashCode(this.progress);
        result = 31 * result + Long.hashCode(this.customisationId);
        result = 31 * result + Integer.hashCode(this.justWatching);
        result = 31 * result + Integer.hashCode(this.calories);
        result = 31 * result + Float.hashCode(this.x);
        result = 31 * result + Float.hashCode(this.altitude);
        result = 31 * result + Float.hashCode(this.y);
        result = 31 * result + Integer.hashCode(this.watchingRiderId);
        result = 31 * result + Integer.hashCode(this.groupId);
        result = 31 * result + Long.hashCode(this.sport);
        result = 31 * result + Float.hashCode(this.f34);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasWorldTime()) {
            parts.add("worldTime=" + getWorldTime());
        }
        if (hasDistance()) {
            parts.add("distance=" + getDistance());
        }
        if (hasRoadTime()) {
            parts.add("roadTime=" + getRoadTime());
        }
        if (hasLaps()) {
            parts.add("laps=" + getLaps());
        }
        if (hasSpeed()) {
            parts.add("speed=" + getSpeed());
        }
        if (hasRoadPosition()) {
            parts.add("roadPosition=" + getRoadPosition());
        }
        if (hasCadenceUHz()) {
            parts.add("cadenceUHz=" + getCadenceUHz());
        }
        if (hasHeartrate()) {
            parts.add("heartrate=" + getHeartrate());
        }
        if (hasPower()) {
            parts.add("power=" + getPower());
        }
        if (hasHeading()) {
            parts.add("heading=" + getHeading());
        }
        if (hasLean()) {
            parts.add("lean=" + getLean());
        }
        if (hasClimbing()) {
            parts.add("climbing=" + getClimbing());
        }
        if (hasTime()) {
            parts.add("time=" + getTime());
        }
        if (hasF19()) {
            parts.add("f19=" + getF19());
        }
        if (hasF20()) {
            parts.add("f20=" + getF20());
        }
        if (hasProgress()) {
            parts.add("progress=" + getProgress());
        }
        if (hasCustomisationId()) {
            parts.add("customisationId=" + getCustomisationId());
        }
        if (hasJustWatching()) {
            parts.add("justWatching=" + getJustWatching());
        }
        if (hasCalories()) {
            parts.add("calories=" + getCalories());
        }
        if (hasX()) {
            parts.add("x=" + getX());
        }
        if (hasAltitude()) {
            parts.add("altitude=" + getAltitude());
        }
        if (hasY()) {
            parts.add("y=" + getY());
        }
        if (hasWatchingRiderId()) {
            parts.add("watchingRiderId=" + getWatchingRiderId());
        }
        if (hasGroupId()) {
            parts.add("groupId=" + getGroupId());
        }
        if (hasSport()) {
            parts.add("sport=" + getSport());
        }
        if (hasF34()) {
            parts.add("f34=" + getF34());
        }
        return "PlayerState{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PlayerState>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("worldTime", 2);
        	__fieldMap.put("distance", 3);
        	__fieldMap.put("roadTime", 4);
        	__fieldMap.put("laps", 5);
        	__fieldMap.put("speed", 6);
        	__fieldMap.put("roadPosition", 8);
        	__fieldMap.put("cadenceUHz", 9);
        	__fieldMap.put("heartrate", 11);
        	__fieldMap.put("power", 12);
        	__fieldMap.put("heading", 13);
        	__fieldMap.put("lean", 14);
        	__fieldMap.put("climbing", 15);
        	__fieldMap.put("time", 16);
        	__fieldMap.put("f19", 19);
        	__fieldMap.put("f20", 20);
        	__fieldMap.put("progress", 21);
        	__fieldMap.put("customisationId", 22);
        	__fieldMap.put("justWatching", 23);
        	__fieldMap.put("calories", 24);
        	__fieldMap.put("x", 25);
        	__fieldMap.put("altitude", 26);
        	__fieldMap.put("y", 27);
        	__fieldMap.put("watchingRiderId", 28);
        	__fieldMap.put("groupId", 29);
        	__fieldMap.put("sport", 31);
        	__fieldMap.put("f34", 34);
        }

        @Override
        public PlayerState newMessage() {
            return new PlayerState();
        }

        @Override
        public Class<PlayerState> typeClass() {
            return PlayerState.class;
        }

        @Override
        public String messageName() {
            return PlayerState.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PlayerState.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PlayerState message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PlayerState instance) throws java.io.IOException {
        	if (instance.__merge_lock) {
        		throw new IllegalStateException("Cannot reuse message instance");
        	} else {
        		instance.__merge_lock = true;
        	}
        	while(true) {
        		int number = input.readFieldNumber(this);
                if (number == 0) {
                    break;
                }
                switch(number) {
                    case 1:
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.worldTime = input.readInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.distance = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.roadTime = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.laps = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.speed = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 8:
                    	instance.roadPosition = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 9:
                    	instance.cadenceUHz = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 11:
                    	instance.heartrate = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 12:
                    	instance.power = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 13:
                    	instance.heading = input.readInt64();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 14:
                    	instance.lean = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 15:
                    	instance.climbing = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 16:
                    	instance.time = input.readInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 19:
                    	instance.f19 = input.readInt32();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 20:
                    	instance.f20 = input.readInt32();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 21:
                    	instance.progress = input.readInt32();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 22:
                    	instance.customisationId = input.readInt64();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 23:
                    	instance.justWatching = input.readInt32();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 24:
                    	instance.calories = input.readInt32();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 25:
                    	instance.x = input.readFloat();
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 26:
                    	instance.altitude = input.readFloat();
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 27:
                    	instance.y = input.readFloat();
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 28:
                    	instance.watchingRiderId = input.readInt32();
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 29:
                    	instance.groupId = input.readInt32();
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 31:
                    	instance.sport = input.readInt64();
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 34:
                    	instance.f34 = input.readFloat();
                    	instance.__bitField0 |= 67108864;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PlayerState instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt64(2, instance.worldTime, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.distance, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.roadTime, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.laps, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.speed, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(8, instance.roadPosition, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(9, instance.cadenceUHz, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(11, instance.heartrate, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(12, instance.power, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt64(13, instance.heading, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(14, instance.lean, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(15, instance.climbing, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeInt32(16, instance.time, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeInt32(19, instance.f19, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeInt32(20, instance.f20, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeInt32(21, instance.progress, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeInt64(22, instance.customisationId, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeInt32(23, instance.justWatching, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeInt32(24, instance.calories, false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
                output.writeFloat(25, instance.x, false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
                output.writeFloat(26, instance.altitude, false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
                output.writeFloat(27, instance.y, false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
                output.writeInt32(28, instance.watchingRiderId, false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
                output.writeInt32(29, instance.groupId, false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
                output.writeInt64(31, instance.sport, false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
                output.writeFloat(34, instance.f34, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "worldTime";
        		case 3: return "distance";
        		case 4: return "roadTime";
        		case 5: return "laps";
        		case 6: return "speed";
        		case 8: return "roadPosition";
        		case 9: return "cadenceUHz";
        		case 11: return "heartrate";
        		case 12: return "power";
        		case 13: return "heading";
        		case 14: return "lean";
        		case 15: return "climbing";
        		case 16: return "time";
        		case 19: return "f19";
        		case 20: return "f20";
        		case 21: return "progress";
        		case 22: return "customisationId";
        		case 23: return "justWatching";
        		case 24: return "calories";
        		case 25: return "x";
        		case 26: return "altitude";
        		case 27: return "y";
        		case 28: return "watchingRiderId";
        		case 29: return "groupId";
        		case 31: return "sport";
        		case 34: return "f34";
        		default: return null;
        	}
        }

        @Override
        public int getFieldNumber(String name) {
        	final Integer number = __fieldMap.get(name);
        	return number == null ? 0 : number.intValue();
        }

    }

    public static final class Builder  {

        private int id;

        private long worldTime;

        private int distance;

        private int roadTime;

        private int laps;

        private int speed;

        private int roadPosition;

        private int cadenceUHz;

        private int heartrate;

        private int power;

        private long heading;

        private int lean;

        private int climbing;

        private int time;

        private int f19;

        private int f20;

        private int progress;

        private long customisationId;

        private int justWatching;

        private int calories;

        private float x;

        private float altitude;

        private float y;

        private int watchingRiderId;

        private int groupId;

        private long sport;

        private float f34;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.worldTime = 0L;
            this.distance = 0;
            this.roadTime = 0;
            this.laps = 0;
            this.speed = 0;
            this.roadPosition = 0;
            this.cadenceUHz = 0;
            this.heartrate = 0;
            this.power = 0;
            this.heading = 0L;
            this.lean = 0;
            this.climbing = 0;
            this.time = 0;
            this.f19 = 0;
            this.f20 = 0;
            this.progress = 0;
            this.customisationId = 0L;
            this.justWatching = 0;
            this.calories = 0;
            this.x = 0f;
            this.altitude = 0f;
            this.y = 0f;
            this.watchingRiderId = 0;
            this.groupId = 0;
            this.sport = 0L;
            this.f34 = 0f;
        }

        public Builder mergeFrom(PlayerState instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasWorldTime()) {
                this.setWorldTime(instance.getWorldTime());
            }

            if (instance.hasDistance()) {
                this.setDistance(instance.getDistance());
            }

            if (instance.hasRoadTime()) {
                this.setRoadTime(instance.getRoadTime());
            }

            if (instance.hasLaps()) {
                this.setLaps(instance.getLaps());
            }

            if (instance.hasSpeed()) {
                this.setSpeed(instance.getSpeed());
            }

            if (instance.hasRoadPosition()) {
                this.setRoadPosition(instance.getRoadPosition());
            }

            if (instance.hasCadenceUHz()) {
                this.setCadenceUHz(instance.getCadenceUHz());
            }

            if (instance.hasHeartrate()) {
                this.setHeartrate(instance.getHeartrate());
            }

            if (instance.hasPower()) {
                this.setPower(instance.getPower());
            }

            if (instance.hasHeading()) {
                this.setHeading(instance.getHeading());
            }

            if (instance.hasLean()) {
                this.setLean(instance.getLean());
            }

            if (instance.hasClimbing()) {
                this.setClimbing(instance.getClimbing());
            }

            if (instance.hasTime()) {
                this.setTime(instance.getTime());
            }

            if (instance.hasF19()) {
                this.setF19(instance.getF19());
            }

            if (instance.hasF20()) {
                this.setF20(instance.getF20());
            }

            if (instance.hasProgress()) {
                this.setProgress(instance.getProgress());
            }

            if (instance.hasCustomisationId()) {
                this.setCustomisationId(instance.getCustomisationId());
            }

            if (instance.hasJustWatching()) {
                this.setJustWatching(instance.getJustWatching());
            }

            if (instance.hasCalories()) {
                this.setCalories(instance.getCalories());
            }

            if (instance.hasX()) {
                this.setX(instance.getX());
            }

            if (instance.hasAltitude()) {
                this.setAltitude(instance.getAltitude());
            }

            if (instance.hasY()) {
                this.setY(instance.getY());
            }

            if (instance.hasWatchingRiderId()) {
                this.setWatchingRiderId(instance.getWatchingRiderId());
            }

            if (instance.hasGroupId()) {
                this.setGroupId(instance.getGroupId());
            }

            if (instance.hasSport()) {
                this.setSport(instance.getSport());
            }

            if (instance.hasF34()) {
                this.setF34(instance.getF34());
            }

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public long getWorldTime() {
            return worldTime;
        }

        public Builder setWorldTime(long value) {
            this.worldTime = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearWorldTime() {
            this.worldTime = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasWorldTime() {
            return (__bitField0 & 2) == 2;
        }

        public int getDistance() {
            return distance;
        }

        public Builder setDistance(int value) {
            this.distance = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearDistance() {
            this.distance = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasDistance() {
            return (__bitField0 & 4) == 4;
        }

        public int getRoadTime() {
            return roadTime;
        }

        public Builder setRoadTime(int value) {
            this.roadTime = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearRoadTime() {
            this.roadTime = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasRoadTime() {
            return (__bitField0 & 8) == 8;
        }

        public int getLaps() {
            return laps;
        }

        public Builder setLaps(int value) {
            this.laps = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearLaps() {
            this.laps = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasLaps() {
            return (__bitField0 & 16) == 16;
        }

        public int getSpeed() {
            return speed;
        }

        public Builder setSpeed(int value) {
            this.speed = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearSpeed() {
            this.speed = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasSpeed() {
            return (__bitField0 & 32) == 32;
        }

        public int getRoadPosition() {
            return roadPosition;
        }

        public Builder setRoadPosition(int value) {
            this.roadPosition = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearRoadPosition() {
            this.roadPosition = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasRoadPosition() {
            return (__bitField0 & 64) == 64;
        }

        public int getCadenceUHz() {
            return cadenceUHz;
        }

        public Builder setCadenceUHz(int value) {
            this.cadenceUHz = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearCadenceUHz() {
            this.cadenceUHz = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasCadenceUHz() {
            return (__bitField0 & 128) == 128;
        }

        public int getHeartrate() {
            return heartrate;
        }

        public Builder setHeartrate(int value) {
            this.heartrate = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearHeartrate() {
            this.heartrate = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasHeartrate() {
            return (__bitField0 & 256) == 256;
        }

        public int getPower() {
            return power;
        }

        public Builder setPower(int value) {
            this.power = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearPower() {
            this.power = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasPower() {
            return (__bitField0 & 512) == 512;
        }

        public long getHeading() {
            return heading;
        }

        public Builder setHeading(long value) {
            this.heading = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearHeading() {
            this.heading = 0L;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasHeading() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getLean() {
            return lean;
        }

        public Builder setLean(int value) {
            this.lean = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearLean() {
            this.lean = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasLean() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getClimbing() {
            return climbing;
        }

        public Builder setClimbing(int value) {
            this.climbing = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearClimbing() {
            this.climbing = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasClimbing() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getTime() {
            return time;
        }

        public Builder setTime(int value) {
            this.time = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearTime() {
            this.time = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasTime() {
            return (__bitField0 & 8192) == 8192;
        }

        public int getF19() {
            return f19;
        }

        public Builder setF19(int value) {
            this.f19 = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearF19() {
            this.f19 = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasF19() {
            return (__bitField0 & 16384) == 16384;
        }

        public int getF20() {
            return f20;
        }

        public Builder setF20(int value) {
            this.f20 = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearF20() {
            this.f20 = 0;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasF20() {
            return (__bitField0 & 32768) == 32768;
        }

        public int getProgress() {
            return progress;
        }

        public Builder setProgress(int value) {
            this.progress = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearProgress() {
            this.progress = 0;
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasProgress() {
            return (__bitField0 & 65536) == 65536;
        }

        public long getCustomisationId() {
            return customisationId;
        }

        public Builder setCustomisationId(long value) {
            this.customisationId = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearCustomisationId() {
            this.customisationId = 0L;
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasCustomisationId() {
            return (__bitField0 & 131072) == 131072;
        }

        public int getJustWatching() {
            return justWatching;
        }

        public Builder setJustWatching(int value) {
            this.justWatching = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearJustWatching() {
            this.justWatching = 0;
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasJustWatching() {
            return (__bitField0 & 262144) == 262144;
        }

        public int getCalories() {
            return calories;
        }

        public Builder setCalories(int value) {
            this.calories = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearCalories() {
            this.calories = 0;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasCalories() {
            return (__bitField0 & 524288) == 524288;
        }

        public float getX() {
            return x;
        }

        public Builder setX(float value) {
            this.x = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearX() {
            this.x = 0f;
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasX() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public float getAltitude() {
            return altitude;
        }

        public Builder setAltitude(float value) {
            this.altitude = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearAltitude() {
            this.altitude = 0f;
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasAltitude() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public float getY() {
            return y;
        }

        public Builder setY(float value) {
            this.y = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearY() {
            this.y = 0f;
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasY() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public int getWatchingRiderId() {
            return watchingRiderId;
        }

        public Builder setWatchingRiderId(int value) {
            this.watchingRiderId = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearWatchingRiderId() {
            this.watchingRiderId = 0;
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasWatchingRiderId() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public int getGroupId() {
            return groupId;
        }

        public Builder setGroupId(int value) {
            this.groupId = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearGroupId() {
            this.groupId = 0;
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasGroupId() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public long getSport() {
            return sport;
        }

        public Builder setSport(long value) {
            this.sport = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearSport() {
            this.sport = 0L;
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasSport() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public float getF34() {
            return f34;
        }

        public Builder setF34(float value) {
            this.f34 = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearF34() {
            this.f34 = 0f;
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasF34() {
            return (__bitField0 & 67108864) == 67108864;
        }




        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Builder that = (Builder) obj;
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.distance, that.distance)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roadTime, that.roadTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.laps, that.laps)) {
                return false;
            }
            if (!java.util.Objects.equals(this.speed, that.speed)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roadPosition, that.roadPosition)) {
                return false;
            }
            if (!java.util.Objects.equals(this.cadenceUHz, that.cadenceUHz)) {
                return false;
            }
            if (!java.util.Objects.equals(this.heartrate, that.heartrate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.power, that.power)) {
                return false;
            }
            if (!java.util.Objects.equals(this.heading, that.heading)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lean, that.lean)) {
                return false;
            }
            if (!java.util.Objects.equals(this.climbing, that.climbing)) {
                return false;
            }
            if (!java.util.Objects.equals(this.time, that.time)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f19, that.f19)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f20, that.f20)) {
                return false;
            }
            if (!java.util.Objects.equals(this.progress, that.progress)) {
                return false;
            }
            if (!java.util.Objects.equals(this.customisationId, that.customisationId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.justWatching, that.justWatching)) {
                return false;
            }
            if (!java.util.Objects.equals(this.calories, that.calories)) {
                return false;
            }
            if (!java.util.Objects.equals(this.x, that.x)) {
                return false;
            }
            if (!java.util.Objects.equals(this.altitude, that.altitude)) {
                return false;
            }
            if (!java.util.Objects.equals(this.y, that.y)) {
                return false;
            }
            if (!java.util.Objects.equals(this.watchingRiderId, that.watchingRiderId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.groupId, that.groupId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.sport, that.sport)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f34, that.f34)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Long.hashCode(this.worldTime);
            result = 31 * result + Integer.hashCode(this.distance);
            result = 31 * result + Integer.hashCode(this.roadTime);
            result = 31 * result + Integer.hashCode(this.laps);
            result = 31 * result + Integer.hashCode(this.speed);
            result = 31 * result + Integer.hashCode(this.roadPosition);
            result = 31 * result + Integer.hashCode(this.cadenceUHz);
            result = 31 * result + Integer.hashCode(this.heartrate);
            result = 31 * result + Integer.hashCode(this.power);
            result = 31 * result + Long.hashCode(this.heading);
            result = 31 * result + Integer.hashCode(this.lean);
            result = 31 * result + Integer.hashCode(this.climbing);
            result = 31 * result + Integer.hashCode(this.time);
            result = 31 * result + Integer.hashCode(this.f19);
            result = 31 * result + Integer.hashCode(this.f20);
            result = 31 * result + Integer.hashCode(this.progress);
            result = 31 * result + Long.hashCode(this.customisationId);
            result = 31 * result + Integer.hashCode(this.justWatching);
            result = 31 * result + Integer.hashCode(this.calories);
            result = 31 * result + Float.hashCode(this.x);
            result = 31 * result + Float.hashCode(this.altitude);
            result = 31 * result + Float.hashCode(this.y);
            result = 31 * result + Integer.hashCode(this.watchingRiderId);
            result = 31 * result + Integer.hashCode(this.groupId);
            result = 31 * result + Long.hashCode(this.sport);
            result = 31 * result + Float.hashCode(this.f34);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasWorldTime()) {
                parts.add("worldTime=" + getWorldTime());
            }
            if (hasDistance()) {
                parts.add("distance=" + getDistance());
            }
            if (hasRoadTime()) {
                parts.add("roadTime=" + getRoadTime());
            }
            if (hasLaps()) {
                parts.add("laps=" + getLaps());
            }
            if (hasSpeed()) {
                parts.add("speed=" + getSpeed());
            }
            if (hasRoadPosition()) {
                parts.add("roadPosition=" + getRoadPosition());
            }
            if (hasCadenceUHz()) {
                parts.add("cadenceUHz=" + getCadenceUHz());
            }
            if (hasHeartrate()) {
                parts.add("heartrate=" + getHeartrate());
            }
            if (hasPower()) {
                parts.add("power=" + getPower());
            }
            if (hasHeading()) {
                parts.add("heading=" + getHeading());
            }
            if (hasLean()) {
                parts.add("lean=" + getLean());
            }
            if (hasClimbing()) {
                parts.add("climbing=" + getClimbing());
            }
            if (hasTime()) {
                parts.add("time=" + getTime());
            }
            if (hasF19()) {
                parts.add("f19=" + getF19());
            }
            if (hasF20()) {
                parts.add("f20=" + getF20());
            }
            if (hasProgress()) {
                parts.add("progress=" + getProgress());
            }
            if (hasCustomisationId()) {
                parts.add("customisationId=" + getCustomisationId());
            }
            if (hasJustWatching()) {
                parts.add("justWatching=" + getJustWatching());
            }
            if (hasCalories()) {
                parts.add("calories=" + getCalories());
            }
            if (hasX()) {
                parts.add("x=" + getX());
            }
            if (hasAltitude()) {
                parts.add("altitude=" + getAltitude());
            }
            if (hasY()) {
                parts.add("y=" + getY());
            }
            if (hasWatchingRiderId()) {
                parts.add("watchingRiderId=" + getWatchingRiderId());
            }
            if (hasGroupId()) {
                parts.add("groupId=" + getGroupId());
            }
            if (hasSport()) {
                parts.add("sport=" + getSport());
            }
            if (hasF34()) {
                parts.add("f34=" + getF34());
            }
            return "PlayerState{" + String.join(", ", parts) + "}";
        }

        public PlayerState build() {
            org.zwiftj.api.model.PlayerState result = new org.zwiftj.api.model.PlayerState();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.worldTime = this.worldTime;
            result.distance = this.distance;
            result.roadTime = this.roadTime;
            result.laps = this.laps;
            result.speed = this.speed;
            result.roadPosition = this.roadPosition;
            result.cadenceUHz = this.cadenceUHz;
            result.heartrate = this.heartrate;
            result.power = this.power;
            result.heading = this.heading;
            result.lean = this.lean;
            result.climbing = this.climbing;
            result.time = this.time;
            result.f19 = this.f19;
            result.f20 = this.f20;
            result.progress = this.progress;
            result.customisationId = this.customisationId;
            result.justWatching = this.justWatching;
            result.calories = this.calories;
            result.x = this.x;
            result.altitude = this.altitude;
            result.y = this.y;
            result.watchingRiderId = this.watchingRiderId;
            result.groupId = this.groupId;
            result.sport = this.sport;
            result.f34 = this.f34;
            return result;
        }

    }



}