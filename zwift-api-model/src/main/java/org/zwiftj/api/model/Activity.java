package org.zwiftj.api.model;

@javax.annotation.Generated("activity.proto")
public final class Activity
        implements io.protostuff.Message<Activity> {

    private static final Activity DEFAULT_INSTANCE = newBuilder().build();

    private long id;

    private long playerId;

    private int f3;

    private String name;

    private int f5;

    private int f6;

    private String startDate;

    private String endDate;

    private float distance;

    private float avgHeartRate;

    private float maxHeartRate;

    private float avgWatts;

    private float maxWatts;

    private float avgCadence;

    private float maxCadence;

    private float avgSpeed;

    private float maxSpeed;

    private float calories;

    private float totalElevation;

    private long stravaUploadId;

    private long stravaActivityId;

    private int f23;

    private io.protostuff.ByteString fit;

    private String fitFilename;

    private int f29;

    private String date;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Activity() {
        this.id = 0L;
        this.playerId = 0L;
        this.f3 = 0;
        this.name = "";
        this.f5 = 0;
        this.f6 = 0;
        this.startDate = "";
        this.endDate = "";
        this.distance = 0f;
        this.avgHeartRate = 0f;
        this.maxHeartRate = 0f;
        this.avgWatts = 0f;
        this.maxWatts = 0f;
        this.avgCadence = 0f;
        this.maxCadence = 0f;
        this.avgSpeed = 0f;
        this.maxSpeed = 0f;
        this.calories = 0f;
        this.totalElevation = 0f;
        this.stravaUploadId = 0L;
        this.stravaActivityId = 0L;
        this.f23 = 0;
        this.fit = io.protostuff.ByteString.EMPTY;
        this.fitFilename = "";
        this.f29 = 0;
        this.date = "";
    }

    private Activity(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Activity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Activity> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public Activity withId(long value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public long getPlayerId() {
        return playerId;
    }

    public boolean hasPlayerId() {
        return (__bitField0 & 2) == 2;
    }

    public Activity withPlayerId(long value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setPlayerId(value)
            .build();
    }

    public int getF3() {
        return f3;
    }

    public boolean hasF3() {
        return (__bitField0 & 4) == 4;
    }

    public Activity withF3(int value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        return (__bitField0 & 8) == 8;
    }

    public Activity withName(String value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public int getF5() {
        return f5;
    }

    public boolean hasF5() {
        return (__bitField0 & 16) == 16;
    }

    public Activity withF5(int value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setF5(value)
            .build();
    }

    public int getF6() {
        return f6;
    }

    public boolean hasF6() {
        return (__bitField0 & 32) == 32;
    }

    public Activity withF6(int value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setF6(value)
            .build();
    }

    public String getStartDate() {
        return startDate;
    }

    public boolean hasStartDate() {
        return (__bitField0 & 64) == 64;
    }

    public Activity withStartDate(String value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setStartDate(value)
            .build();
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean hasEndDate() {
        return (__bitField0 & 128) == 128;
    }

    public Activity withEndDate(String value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setEndDate(value)
            .build();
    }

    public float getDistance() {
        return distance;
    }

    public boolean hasDistance() {
        return (__bitField0 & 256) == 256;
    }

    public Activity withDistance(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setDistance(value)
            .build();
    }

    public float getAvgHeartRate() {
        return avgHeartRate;
    }

    public boolean hasAvgHeartRate() {
        return (__bitField0 & 512) == 512;
    }

    public Activity withAvgHeartRate(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setAvgHeartRate(value)
            .build();
    }

    public float getMaxHeartRate() {
        return maxHeartRate;
    }

    public boolean hasMaxHeartRate() {
        return (__bitField0 & 1024) == 1024;
    }

    public Activity withMaxHeartRate(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setMaxHeartRate(value)
            .build();
    }

    public float getAvgWatts() {
        return avgWatts;
    }

    public boolean hasAvgWatts() {
        return (__bitField0 & 2048) == 2048;
    }

    public Activity withAvgWatts(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setAvgWatts(value)
            .build();
    }

    public float getMaxWatts() {
        return maxWatts;
    }

    public boolean hasMaxWatts() {
        return (__bitField0 & 4096) == 4096;
    }

    public Activity withMaxWatts(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setMaxWatts(value)
            .build();
    }

    public float getAvgCadence() {
        return avgCadence;
    }

    public boolean hasAvgCadence() {
        return (__bitField0 & 8192) == 8192;
    }

    public Activity withAvgCadence(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setAvgCadence(value)
            .build();
    }

    public float getMaxCadence() {
        return maxCadence;
    }

    public boolean hasMaxCadence() {
        return (__bitField0 & 16384) == 16384;
    }

    public Activity withMaxCadence(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setMaxCadence(value)
            .build();
    }

    public float getAvgSpeed() {
        return avgSpeed;
    }

    public boolean hasAvgSpeed() {
        return (__bitField0 & 32768) == 32768;
    }

    public Activity withAvgSpeed(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setAvgSpeed(value)
            .build();
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public boolean hasMaxSpeed() {
        return (__bitField0 & 65536) == 65536;
    }

    public Activity withMaxSpeed(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setMaxSpeed(value)
            .build();
    }

    public float getCalories() {
        return calories;
    }

    public boolean hasCalories() {
        return (__bitField0 & 131072) == 131072;
    }

    public Activity withCalories(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setCalories(value)
            .build();
    }

    public float getTotalElevation() {
        return totalElevation;
    }

    public boolean hasTotalElevation() {
        return (__bitField0 & 262144) == 262144;
    }

    public Activity withTotalElevation(float value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setTotalElevation(value)
            .build();
    }

    public long getStravaUploadId() {
        return stravaUploadId;
    }

    public boolean hasStravaUploadId() {
        return (__bitField0 & 524288) == 524288;
    }

    public Activity withStravaUploadId(long value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setStravaUploadId(value)
            .build();
    }

    public long getStravaActivityId() {
        return stravaActivityId;
    }

    public boolean hasStravaActivityId() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public Activity withStravaActivityId(long value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setStravaActivityId(value)
            .build();
    }

    public int getF23() {
        return f23;
    }

    public boolean hasF23() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public Activity withF23(int value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setF23(value)
            .build();
    }

    public io.protostuff.ByteString getFit() {
        return fit;
    }

    public boolean hasFit() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public Activity withFit(io.protostuff.ByteString value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setFit(value)
            .build();
    }

    public String getFitFilename() {
        return fitFilename;
    }

    public boolean hasFitFilename() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public Activity withFitFilename(String value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setFitFilename(value)
            .build();
    }

    public int getF29() {
        return f29;
    }

    public boolean hasF29() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public Activity withF29(int value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setF29(value)
            .build();
    }

    public String getDate() {
        return date;
    }

    public boolean hasDate() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public Activity withDate(String value) {
        return Activity.newBuilder()
            .mergeFrom(this)
            .setDate(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Activity> cachedSchema() {
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
        Activity that = (Activity) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f5, that.f5)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f6, that.f6)) {
            return false;
        }
        if (!java.util.Objects.equals(this.startDate, that.startDate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.endDate, that.endDate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.distance, that.distance)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avgHeartRate, that.avgHeartRate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxHeartRate, that.maxHeartRate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avgWatts, that.avgWatts)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxWatts, that.maxWatts)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avgCadence, that.avgCadence)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxCadence, that.maxCadence)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avgSpeed, that.avgSpeed)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxSpeed, that.maxSpeed)) {
            return false;
        }
        if (!java.util.Objects.equals(this.calories, that.calories)) {
            return false;
        }
        if (!java.util.Objects.equals(this.totalElevation, that.totalElevation)) {
            return false;
        }
        if (!java.util.Objects.equals(this.stravaUploadId, that.stravaUploadId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.stravaActivityId, that.stravaActivityId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f23, that.f23)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fit, that.fit)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fitFilename, that.fitFilename)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f29, that.f29)) {
            return false;
        }
        if (!java.util.Objects.equals(this.date, that.date)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.id);
        result = 31 * result + Long.hashCode(this.playerId);
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + Integer.hashCode(this.f5);
        result = 31 * result + Integer.hashCode(this.f6);
        result = 31 * result + (this.startDate == null ? 0 : this.startDate.hashCode());
        result = 31 * result + (this.endDate == null ? 0 : this.endDate.hashCode());
        result = 31 * result + Float.hashCode(this.distance);
        result = 31 * result + Float.hashCode(this.avgHeartRate);
        result = 31 * result + Float.hashCode(this.maxHeartRate);
        result = 31 * result + Float.hashCode(this.avgWatts);
        result = 31 * result + Float.hashCode(this.maxWatts);
        result = 31 * result + Float.hashCode(this.avgCadence);
        result = 31 * result + Float.hashCode(this.maxCadence);
        result = 31 * result + Float.hashCode(this.avgSpeed);
        result = 31 * result + Float.hashCode(this.maxSpeed);
        result = 31 * result + Float.hashCode(this.calories);
        result = 31 * result + Float.hashCode(this.totalElevation);
        result = 31 * result + Long.hashCode(this.stravaUploadId);
        result = 31 * result + Long.hashCode(this.stravaActivityId);
        result = 31 * result + Integer.hashCode(this.f23);
        result = 31 * result + (this.fit == null ? 0 : this.fit.hashCode());
        result = 31 * result + (this.fitFilename == null ? 0 : this.fitFilename.hashCode());
        result = 31 * result + Integer.hashCode(this.f29);
        result = 31 * result + (this.date == null ? 0 : this.date.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasPlayerId()) {
            parts.add("playerId=" + getPlayerId());
        }
        if (hasF3()) {
            parts.add("f3=" + getF3());
        }
        if (hasName()) {
            parts.add("name=" + getName());
        }
        if (hasF5()) {
            parts.add("f5=" + getF5());
        }
        if (hasF6()) {
            parts.add("f6=" + getF6());
        }
        if (hasStartDate()) {
            parts.add("startDate=" + getStartDate());
        }
        if (hasEndDate()) {
            parts.add("endDate=" + getEndDate());
        }
        if (hasDistance()) {
            parts.add("distance=" + getDistance());
        }
        if (hasAvgHeartRate()) {
            parts.add("avgHeartRate=" + getAvgHeartRate());
        }
        if (hasMaxHeartRate()) {
            parts.add("maxHeartRate=" + getMaxHeartRate());
        }
        if (hasAvgWatts()) {
            parts.add("avgWatts=" + getAvgWatts());
        }
        if (hasMaxWatts()) {
            parts.add("maxWatts=" + getMaxWatts());
        }
        if (hasAvgCadence()) {
            parts.add("avgCadence=" + getAvgCadence());
        }
        if (hasMaxCadence()) {
            parts.add("maxCadence=" + getMaxCadence());
        }
        if (hasAvgSpeed()) {
            parts.add("avgSpeed=" + getAvgSpeed());
        }
        if (hasMaxSpeed()) {
            parts.add("maxSpeed=" + getMaxSpeed());
        }
        if (hasCalories()) {
            parts.add("calories=" + getCalories());
        }
        if (hasTotalElevation()) {
            parts.add("totalElevation=" + getTotalElevation());
        }
        if (hasStravaUploadId()) {
            parts.add("stravaUploadId=" + getStravaUploadId());
        }
        if (hasStravaActivityId()) {
            parts.add("stravaActivityId=" + getStravaActivityId());
        }
        if (hasF23()) {
            parts.add("f23=" + getF23());
        }
        if (hasFit()) {
            parts.add("fit=" + getFit());
        }
        if (hasFitFilename()) {
            parts.add("fitFilename=" + getFitFilename());
        }
        if (hasF29()) {
            parts.add("f29=" + getF29());
        }
        if (hasDate()) {
            parts.add("date=" + getDate());
        }
        return "Activity{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Activity>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("playerId", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("name", 4);
        	__fieldMap.put("f5", 5);
        	__fieldMap.put("f6", 6);
        	__fieldMap.put("startDate", 7);
        	__fieldMap.put("endDate", 8);
        	__fieldMap.put("distance", 9);
        	__fieldMap.put("avgHeartRate", 10);
        	__fieldMap.put("maxHeartRate", 11);
        	__fieldMap.put("avgWatts", 12);
        	__fieldMap.put("maxWatts", 13);
        	__fieldMap.put("avgCadence", 14);
        	__fieldMap.put("maxCadence", 15);
        	__fieldMap.put("avgSpeed", 16);
        	__fieldMap.put("maxSpeed", 17);
        	__fieldMap.put("calories", 18);
        	__fieldMap.put("totalElevation", 19);
        	__fieldMap.put("stravaUploadId", 20);
        	__fieldMap.put("stravaActivityId", 21);
        	__fieldMap.put("f23", 23);
        	__fieldMap.put("fit", 24);
        	__fieldMap.put("fitFilename", 25);
        	__fieldMap.put("f29", 29);
        	__fieldMap.put("date", 31);
        }

        @Override
        public Activity newMessage() {
            return new Activity();
        }

        @Override
        public Class<Activity> typeClass() {
            return Activity.class;
        }

        @Override
        public String messageName() {
            return Activity.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Activity.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Activity message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Activity instance) throws java.io.IOException {
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
                    	instance.id = input.readUInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.playerId = input.readUInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.f3 = input.readUInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.name = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.f5 = input.readUInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.f6 = input.readUInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.startDate = input.readString();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.endDate = input.readString();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.distance = input.readFloat();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.avgHeartRate = input.readFloat();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.maxHeartRate = input.readFloat();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.avgWatts = input.readFloat();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.maxWatts = input.readFloat();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.avgCadence = input.readFloat();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.maxCadence = input.readFloat();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 16:
                    	instance.avgSpeed = input.readFloat();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 17:
                    	instance.maxSpeed = input.readFloat();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 18:
                    	instance.calories = input.readFloat();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 19:
                    	instance.totalElevation = input.readFloat();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 20:
                    	instance.stravaUploadId = input.readUInt64();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 21:
                    	instance.stravaActivityId = input.readUInt64();
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 23:
                    	instance.f23 = input.readUInt32();
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 24:
                    	instance.fit = input.readBytes();
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 25:
                    	instance.fitFilename = input.readString();
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 29:
                    	instance.f29 = input.readUInt32();
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 31:
                    	instance.date = input.readString();
                    	instance.__bitField0 |= 33554432;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, Activity instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt64(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeUInt64(2, instance.playerId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeUInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.name, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeUInt32(5, instance.f5, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeUInt32(6, instance.f6, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeString(7, instance.startDate, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeString(8, instance.endDate, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeFloat(9, instance.distance, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeFloat(10, instance.avgHeartRate, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeFloat(11, instance.maxHeartRate, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeFloat(12, instance.avgWatts, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeFloat(13, instance.maxWatts, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeFloat(14, instance.avgCadence, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeFloat(15, instance.maxCadence, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeFloat(16, instance.avgSpeed, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeFloat(17, instance.maxSpeed, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeFloat(18, instance.calories, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeFloat(19, instance.totalElevation, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeUInt64(20, instance.stravaUploadId, false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
                output.writeUInt64(21, instance.stravaActivityId, false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
                output.writeUInt32(23, instance.f23, false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
                output.writeBytes(24, instance.fit, false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
                output.writeString(25, instance.fitFilename, false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
                output.writeUInt32(29, instance.f29, false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
                output.writeString(31, instance.date, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "playerId";
        		case 3: return "f3";
        		case 4: return "name";
        		case 5: return "f5";
        		case 6: return "f6";
        		case 7: return "startDate";
        		case 8: return "endDate";
        		case 9: return "distance";
        		case 10: return "avgHeartRate";
        		case 11: return "maxHeartRate";
        		case 12: return "avgWatts";
        		case 13: return "maxWatts";
        		case 14: return "avgCadence";
        		case 15: return "maxCadence";
        		case 16: return "avgSpeed";
        		case 17: return "maxSpeed";
        		case 18: return "calories";
        		case 19: return "totalElevation";
        		case 20: return "stravaUploadId";
        		case 21: return "stravaActivityId";
        		case 23: return "f23";
        		case 24: return "fit";
        		case 25: return "fitFilename";
        		case 29: return "f29";
        		case 31: return "date";
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

        private long id;

        private long playerId;

        private int f3;

        private String name;

        private int f5;

        private int f6;

        private String startDate;

        private String endDate;

        private float distance;

        private float avgHeartRate;

        private float maxHeartRate;

        private float avgWatts;

        private float maxWatts;

        private float avgCadence;

        private float maxCadence;

        private float avgSpeed;

        private float maxSpeed;

        private float calories;

        private float totalElevation;

        private long stravaUploadId;

        private long stravaActivityId;

        private int f23;

        private io.protostuff.ByteString fit;

        private String fitFilename;

        private int f29;

        private String date;

        private int __bitField0;

        private Builder() {
            this.id = 0L;
            this.playerId = 0L;
            this.f3 = 0;
            this.name = "";
            this.f5 = 0;
            this.f6 = 0;
            this.startDate = "";
            this.endDate = "";
            this.distance = 0f;
            this.avgHeartRate = 0f;
            this.maxHeartRate = 0f;
            this.avgWatts = 0f;
            this.maxWatts = 0f;
            this.avgCadence = 0f;
            this.maxCadence = 0f;
            this.avgSpeed = 0f;
            this.maxSpeed = 0f;
            this.calories = 0f;
            this.totalElevation = 0f;
            this.stravaUploadId = 0L;
            this.stravaActivityId = 0L;
            this.f23 = 0;
            this.fit = io.protostuff.ByteString.EMPTY;
            this.fitFilename = "";
            this.f29 = 0;
            this.date = "";
        }

        public Builder mergeFrom(Activity instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasF5()) {
                this.setF5(instance.getF5());
            }

            if (instance.hasF6()) {
                this.setF6(instance.getF6());
            }

            if (instance.hasStartDate()) {
                this.setStartDate(instance.getStartDate());
            }

            if (instance.hasEndDate()) {
                this.setEndDate(instance.getEndDate());
            }

            if (instance.hasDistance()) {
                this.setDistance(instance.getDistance());
            }

            if (instance.hasAvgHeartRate()) {
                this.setAvgHeartRate(instance.getAvgHeartRate());
            }

            if (instance.hasMaxHeartRate()) {
                this.setMaxHeartRate(instance.getMaxHeartRate());
            }

            if (instance.hasAvgWatts()) {
                this.setAvgWatts(instance.getAvgWatts());
            }

            if (instance.hasMaxWatts()) {
                this.setMaxWatts(instance.getMaxWatts());
            }

            if (instance.hasAvgCadence()) {
                this.setAvgCadence(instance.getAvgCadence());
            }

            if (instance.hasMaxCadence()) {
                this.setMaxCadence(instance.getMaxCadence());
            }

            if (instance.hasAvgSpeed()) {
                this.setAvgSpeed(instance.getAvgSpeed());
            }

            if (instance.hasMaxSpeed()) {
                this.setMaxSpeed(instance.getMaxSpeed());
            }

            if (instance.hasCalories()) {
                this.setCalories(instance.getCalories());
            }

            if (instance.hasTotalElevation()) {
                this.setTotalElevation(instance.getTotalElevation());
            }

            if (instance.hasStravaUploadId()) {
                this.setStravaUploadId(instance.getStravaUploadId());
            }

            if (instance.hasStravaActivityId()) {
                this.setStravaActivityId(instance.getStravaActivityId());
            }

            if (instance.hasF23()) {
                this.setF23(instance.getF23());
            }

            if (instance.hasFit()) {
                this.setFit(instance.getFit());
            }

            if (instance.hasFitFilename()) {
                this.setFitFilename(instance.getFitFilename());
            }

            if (instance.hasF29()) {
                this.setF29(instance.getF29());
            }

            if (instance.hasDate()) {
                this.setDate(instance.getDate());
            }

            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public long getPlayerId() {
            return playerId;
        }

        public Builder setPlayerId(long value) {
            this.playerId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPlayerId() {
            this.playerId = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasPlayerId() {
            return (__bitField0 & 2) == 2;
        }

        public int getF3() {
            return f3;
        }

        public Builder setF3(int value) {
            this.f3 = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearF3() {
            this.f3 = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasF3() {
            return (__bitField0 & 4) == 4;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activity#name to null");
            }

            this.name = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearName() {
            this.name = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasName() {
            return (__bitField0 & 8) == 8;
        }

        public int getF5() {
            return f5;
        }

        public Builder setF5(int value) {
            this.f5 = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearF5() {
            this.f5 = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasF5() {
            return (__bitField0 & 16) == 16;
        }

        public int getF6() {
            return f6;
        }

        public Builder setF6(int value) {
            this.f6 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearF6() {
            this.f6 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasF6() {
            return (__bitField0 & 32) == 32;
        }

        public String getStartDate() {
            return startDate;
        }

        public Builder setStartDate(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activity#startDate to null");
            }

            this.startDate = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearStartDate() {
            this.startDate = "";
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasStartDate() {
            return (__bitField0 & 64) == 64;
        }

        public String getEndDate() {
            return endDate;
        }

        public Builder setEndDate(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activity#endDate to null");
            }

            this.endDate = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearEndDate() {
            this.endDate = "";
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasEndDate() {
            return (__bitField0 & 128) == 128;
        }

        public float getDistance() {
            return distance;
        }

        public Builder setDistance(float value) {
            this.distance = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearDistance() {
            this.distance = 0f;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasDistance() {
            return (__bitField0 & 256) == 256;
        }

        public float getAvgHeartRate() {
            return avgHeartRate;
        }

        public Builder setAvgHeartRate(float value) {
            this.avgHeartRate = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearAvgHeartRate() {
            this.avgHeartRate = 0f;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasAvgHeartRate() {
            return (__bitField0 & 512) == 512;
        }

        public float getMaxHeartRate() {
            return maxHeartRate;
        }

        public Builder setMaxHeartRate(float value) {
            this.maxHeartRate = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearMaxHeartRate() {
            this.maxHeartRate = 0f;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasMaxHeartRate() {
            return (__bitField0 & 1024) == 1024;
        }

        public float getAvgWatts() {
            return avgWatts;
        }

        public Builder setAvgWatts(float value) {
            this.avgWatts = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearAvgWatts() {
            this.avgWatts = 0f;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasAvgWatts() {
            return (__bitField0 & 2048) == 2048;
        }

        public float getMaxWatts() {
            return maxWatts;
        }

        public Builder setMaxWatts(float value) {
            this.maxWatts = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearMaxWatts() {
            this.maxWatts = 0f;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasMaxWatts() {
            return (__bitField0 & 4096) == 4096;
        }

        public float getAvgCadence() {
            return avgCadence;
        }

        public Builder setAvgCadence(float value) {
            this.avgCadence = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearAvgCadence() {
            this.avgCadence = 0f;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasAvgCadence() {
            return (__bitField0 & 8192) == 8192;
        }

        public float getMaxCadence() {
            return maxCadence;
        }

        public Builder setMaxCadence(float value) {
            this.maxCadence = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearMaxCadence() {
            this.maxCadence = 0f;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasMaxCadence() {
            return (__bitField0 & 16384) == 16384;
        }

        public float getAvgSpeed() {
            return avgSpeed;
        }

        public Builder setAvgSpeed(float value) {
            this.avgSpeed = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearAvgSpeed() {
            this.avgSpeed = 0f;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasAvgSpeed() {
            return (__bitField0 & 32768) == 32768;
        }

        public float getMaxSpeed() {
            return maxSpeed;
        }

        public Builder setMaxSpeed(float value) {
            this.maxSpeed = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearMaxSpeed() {
            this.maxSpeed = 0f;
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasMaxSpeed() {
            return (__bitField0 & 65536) == 65536;
        }

        public float getCalories() {
            return calories;
        }

        public Builder setCalories(float value) {
            this.calories = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearCalories() {
            this.calories = 0f;
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasCalories() {
            return (__bitField0 & 131072) == 131072;
        }

        public float getTotalElevation() {
            return totalElevation;
        }

        public Builder setTotalElevation(float value) {
            this.totalElevation = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearTotalElevation() {
            this.totalElevation = 0f;
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasTotalElevation() {
            return (__bitField0 & 262144) == 262144;
        }

        public long getStravaUploadId() {
            return stravaUploadId;
        }

        public Builder setStravaUploadId(long value) {
            this.stravaUploadId = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearStravaUploadId() {
            this.stravaUploadId = 0L;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasStravaUploadId() {
            return (__bitField0 & 524288) == 524288;
        }

        public long getStravaActivityId() {
            return stravaActivityId;
        }

        public Builder setStravaActivityId(long value) {
            this.stravaActivityId = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearStravaActivityId() {
            this.stravaActivityId = 0L;
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasStravaActivityId() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public int getF23() {
            return f23;
        }

        public Builder setF23(int value) {
            this.f23 = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearF23() {
            this.f23 = 0;
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasF23() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public io.protostuff.ByteString getFit() {
            return fit;
        }

        public Builder setFit(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activity#fit to null");
            }

            this.fit = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearFit() {
            this.fit = io.protostuff.ByteString.EMPTY;
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasFit() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public String getFitFilename() {
            return fitFilename;
        }

        public Builder setFitFilename(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activity#fitFilename to null");
            }

            this.fitFilename = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearFitFilename() {
            this.fitFilename = "";
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasFitFilename() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public int getF29() {
            return f29;
        }

        public Builder setF29(int value) {
            this.f29 = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearF29() {
            this.f29 = 0;
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasF29() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public String getDate() {
            return date;
        }

        public Builder setDate(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activity#date to null");
            }

            this.date = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearDate() {
            this.date = "";
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasDate() {
            return (__bitField0 & 33554432) == 33554432;
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
            if (!java.util.Objects.equals(this.playerId, that.playerId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.name, that.name)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f5, that.f5)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f6, that.f6)) {
                return false;
            }
            if (!java.util.Objects.equals(this.startDate, that.startDate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.endDate, that.endDate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.distance, that.distance)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avgHeartRate, that.avgHeartRate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxHeartRate, that.maxHeartRate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avgWatts, that.avgWatts)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxWatts, that.maxWatts)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avgCadence, that.avgCadence)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxCadence, that.maxCadence)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avgSpeed, that.avgSpeed)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxSpeed, that.maxSpeed)) {
                return false;
            }
            if (!java.util.Objects.equals(this.calories, that.calories)) {
                return false;
            }
            if (!java.util.Objects.equals(this.totalElevation, that.totalElevation)) {
                return false;
            }
            if (!java.util.Objects.equals(this.stravaUploadId, that.stravaUploadId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.stravaActivityId, that.stravaActivityId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f23, that.f23)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fit, that.fit)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fitFilename, that.fitFilename)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f29, that.f29)) {
                return false;
            }
            if (!java.util.Objects.equals(this.date, that.date)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.id);
            result = 31 * result + Long.hashCode(this.playerId);
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + Integer.hashCode(this.f5);
            result = 31 * result + Integer.hashCode(this.f6);
            result = 31 * result + (this.startDate == null ? 0 : this.startDate.hashCode());
            result = 31 * result + (this.endDate == null ? 0 : this.endDate.hashCode());
            result = 31 * result + Float.hashCode(this.distance);
            result = 31 * result + Float.hashCode(this.avgHeartRate);
            result = 31 * result + Float.hashCode(this.maxHeartRate);
            result = 31 * result + Float.hashCode(this.avgWatts);
            result = 31 * result + Float.hashCode(this.maxWatts);
            result = 31 * result + Float.hashCode(this.avgCadence);
            result = 31 * result + Float.hashCode(this.maxCadence);
            result = 31 * result + Float.hashCode(this.avgSpeed);
            result = 31 * result + Float.hashCode(this.maxSpeed);
            result = 31 * result + Float.hashCode(this.calories);
            result = 31 * result + Float.hashCode(this.totalElevation);
            result = 31 * result + Long.hashCode(this.stravaUploadId);
            result = 31 * result + Long.hashCode(this.stravaActivityId);
            result = 31 * result + Integer.hashCode(this.f23);
            result = 31 * result + (this.fit == null ? 0 : this.fit.hashCode());
            result = 31 * result + (this.fitFilename == null ? 0 : this.fitFilename.hashCode());
            result = 31 * result + Integer.hashCode(this.f29);
            result = 31 * result + (this.date == null ? 0 : this.date.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasPlayerId()) {
                parts.add("playerId=" + getPlayerId());
            }
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (hasName()) {
                parts.add("name=" + getName());
            }
            if (hasF5()) {
                parts.add("f5=" + getF5());
            }
            if (hasF6()) {
                parts.add("f6=" + getF6());
            }
            if (hasStartDate()) {
                parts.add("startDate=" + getStartDate());
            }
            if (hasEndDate()) {
                parts.add("endDate=" + getEndDate());
            }
            if (hasDistance()) {
                parts.add("distance=" + getDistance());
            }
            if (hasAvgHeartRate()) {
                parts.add("avgHeartRate=" + getAvgHeartRate());
            }
            if (hasMaxHeartRate()) {
                parts.add("maxHeartRate=" + getMaxHeartRate());
            }
            if (hasAvgWatts()) {
                parts.add("avgWatts=" + getAvgWatts());
            }
            if (hasMaxWatts()) {
                parts.add("maxWatts=" + getMaxWatts());
            }
            if (hasAvgCadence()) {
                parts.add("avgCadence=" + getAvgCadence());
            }
            if (hasMaxCadence()) {
                parts.add("maxCadence=" + getMaxCadence());
            }
            if (hasAvgSpeed()) {
                parts.add("avgSpeed=" + getAvgSpeed());
            }
            if (hasMaxSpeed()) {
                parts.add("maxSpeed=" + getMaxSpeed());
            }
            if (hasCalories()) {
                parts.add("calories=" + getCalories());
            }
            if (hasTotalElevation()) {
                parts.add("totalElevation=" + getTotalElevation());
            }
            if (hasStravaUploadId()) {
                parts.add("stravaUploadId=" + getStravaUploadId());
            }
            if (hasStravaActivityId()) {
                parts.add("stravaActivityId=" + getStravaActivityId());
            }
            if (hasF23()) {
                parts.add("f23=" + getF23());
            }
            if (hasFit()) {
                parts.add("fit=" + getFit());
            }
            if (hasFitFilename()) {
                parts.add("fitFilename=" + getFitFilename());
            }
            if (hasF29()) {
                parts.add("f29=" + getF29());
            }
            if (hasDate()) {
                parts.add("date=" + getDate());
            }
            return "Activity{" + String.join(", ", parts) + "}";
        }

        public Activity build() {
            org.zwiftj.api.model.Activity result = new org.zwiftj.api.model.Activity();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.playerId = this.playerId;
            result.f3 = this.f3;
            result.name = this.name;
            result.f5 = this.f5;
            result.f6 = this.f6;
            result.startDate = this.startDate;
            result.endDate = this.endDate;
            result.distance = this.distance;
            result.avgHeartRate = this.avgHeartRate;
            result.maxHeartRate = this.maxHeartRate;
            result.avgWatts = this.avgWatts;
            result.maxWatts = this.maxWatts;
            result.avgCadence = this.avgCadence;
            result.maxCadence = this.maxCadence;
            result.avgSpeed = this.avgSpeed;
            result.maxSpeed = this.maxSpeed;
            result.calories = this.calories;
            result.totalElevation = this.totalElevation;
            result.stravaUploadId = this.stravaUploadId;
            result.stravaActivityId = this.stravaActivityId;
            result.f23 = this.f23;
            result.fit = this.fit;
            result.fitFilename = this.fitFilename;
            result.f29 = this.f29;
            result.date = this.date;
            return result;
        }

    }



}