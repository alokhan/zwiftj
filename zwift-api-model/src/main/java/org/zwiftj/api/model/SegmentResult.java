package org.zwiftj.api.model;

@javax.annotation.Generated("segment-result.proto")
public final class SegmentResult
        implements io.protostuff.Message<SegmentResult> {

    private static final SegmentResult DEFAULT_INSTANCE = newBuilder().build();

    private long id;

    private long playerId;

    private int f3;

    private int f4;

    private long segmentId;

    private long eventSubgroupId;

    private String firstName;

    private String lastName;

    private long worldTime;

    private String finishTimeStr;

    private long elapsedMs;

    private boolean f12;

    private int f13;

    private int f14;

    private int f15;

    private boolean f16;

    private String f17;

    private long f18;

    private int f19;

    private int f20;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SegmentResult() {
        this.id = 0L;
        this.playerId = 0L;
        this.f3 = 0;
        this.f4 = 0;
        this.segmentId = 0L;
        this.eventSubgroupId = 0L;
        this.firstName = "";
        this.lastName = "";
        this.worldTime = 0L;
        this.finishTimeStr = "";
        this.elapsedMs = 0L;
        this.f12 = false;
        this.f13 = 0;
        this.f14 = 0;
        this.f15 = 0;
        this.f16 = false;
        this.f17 = "";
        this.f18 = 0L;
        this.f19 = 0;
        this.f20 = 0;
    }

    private SegmentResult(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SegmentResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SegmentResult> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public SegmentResult withId(long value) {
        return SegmentResult.newBuilder()
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

    public SegmentResult withPlayerId(long value) {
        return SegmentResult.newBuilder()
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

    public SegmentResult withF3(int value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public int getF4() {
        return f4;
    }

    public boolean hasF4() {
        return (__bitField0 & 8) == 8;
    }

    public SegmentResult withF4(int value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF4(value)
            .build();
    }

    public long getSegmentId() {
        return segmentId;
    }

    public boolean hasSegmentId() {
        return (__bitField0 & 16) == 16;
    }

    public SegmentResult withSegmentId(long value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setSegmentId(value)
            .build();
    }

    public long getEventSubgroupId() {
        return eventSubgroupId;
    }

    public boolean hasEventSubgroupId() {
        return (__bitField0 & 32) == 32;
    }

    public SegmentResult withEventSubgroupId(long value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setEventSubgroupId(value)
            .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean hasFirstName() {
        return (__bitField0 & 64) == 64;
    }

    public SegmentResult withFirstName(String value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setFirstName(value)
            .build();
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasLastName() {
        return (__bitField0 & 128) == 128;
    }

    public SegmentResult withLastName(String value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setLastName(value)
            .build();
    }

    public long getWorldTime() {
        return worldTime;
    }

    public boolean hasWorldTime() {
        return (__bitField0 & 256) == 256;
    }

    public SegmentResult withWorldTime(long value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setWorldTime(value)
            .build();
    }

    public String getFinishTimeStr() {
        return finishTimeStr;
    }

    public boolean hasFinishTimeStr() {
        return (__bitField0 & 512) == 512;
    }

    public SegmentResult withFinishTimeStr(String value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setFinishTimeStr(value)
            .build();
    }

    public long getElapsedMs() {
        return elapsedMs;
    }

    public boolean hasElapsedMs() {
        return (__bitField0 & 1024) == 1024;
    }

    public SegmentResult withElapsedMs(long value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setElapsedMs(value)
            .build();
    }

    public boolean getF12() {
        return f12;
    }

    public boolean hasF12() {
        return (__bitField0 & 2048) == 2048;
    }

    public SegmentResult withF12(boolean value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF12(value)
            .build();
    }

    public int getF13() {
        return f13;
    }

    public boolean hasF13() {
        return (__bitField0 & 4096) == 4096;
    }

    public SegmentResult withF13(int value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF13(value)
            .build();
    }

    public int getF14() {
        return f14;
    }

    public boolean hasF14() {
        return (__bitField0 & 8192) == 8192;
    }

    public SegmentResult withF14(int value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF14(value)
            .build();
    }

    public int getF15() {
        return f15;
    }

    public boolean hasF15() {
        return (__bitField0 & 16384) == 16384;
    }

    public SegmentResult withF15(int value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF15(value)
            .build();
    }

    public boolean getF16() {
        return f16;
    }

    public boolean hasF16() {
        return (__bitField0 & 32768) == 32768;
    }

    public SegmentResult withF16(boolean value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF16(value)
            .build();
    }

    public String getF17() {
        return f17;
    }

    public boolean hasF17() {
        return (__bitField0 & 65536) == 65536;
    }

    public SegmentResult withF17(String value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF17(value)
            .build();
    }

    public long getF18() {
        return f18;
    }

    public boolean hasF18() {
        return (__bitField0 & 131072) == 131072;
    }

    public SegmentResult withF18(long value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF18(value)
            .build();
    }

    public int getF19() {
        return f19;
    }

    public boolean hasF19() {
        return (__bitField0 & 262144) == 262144;
    }

    public SegmentResult withF19(int value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF19(value)
            .build();
    }

    public int getF20() {
        return f20;
    }

    public boolean hasF20() {
        return (__bitField0 & 524288) == 524288;
    }

    public SegmentResult withF20(int value) {
        return SegmentResult.newBuilder()
            .mergeFrom(this)
            .setF20(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SegmentResult> cachedSchema() {
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
        SegmentResult that = (SegmentResult) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f4, that.f4)) {
            return false;
        }
        if (!java.util.Objects.equals(this.segmentId, that.segmentId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.eventSubgroupId, that.eventSubgroupId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.firstName, that.firstName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lastName, that.lastName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.finishTimeStr, that.finishTimeStr)) {
            return false;
        }
        if (!java.util.Objects.equals(this.elapsedMs, that.elapsedMs)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f12, that.f12)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f13, that.f13)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f14, that.f14)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f15, that.f15)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f16, that.f16)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f17, that.f17)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f18, that.f18)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f19, that.f19)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f20, that.f20)) {
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
        result = 31 * result + Integer.hashCode(this.f4);
        result = 31 * result + Long.hashCode(this.segmentId);
        result = 31 * result + Long.hashCode(this.eventSubgroupId);
        result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
        result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
        result = 31 * result + Long.hashCode(this.worldTime);
        result = 31 * result + (this.finishTimeStr == null ? 0 : this.finishTimeStr.hashCode());
        result = 31 * result + Long.hashCode(this.elapsedMs);
        result = 31 * result + Boolean.hashCode(this.f12);
        result = 31 * result + Integer.hashCode(this.f13);
        result = 31 * result + Integer.hashCode(this.f14);
        result = 31 * result + Integer.hashCode(this.f15);
        result = 31 * result + Boolean.hashCode(this.f16);
        result = 31 * result + (this.f17 == null ? 0 : this.f17.hashCode());
        result = 31 * result + Long.hashCode(this.f18);
        result = 31 * result + Integer.hashCode(this.f19);
        result = 31 * result + Integer.hashCode(this.f20);

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
        if (hasF4()) {
            parts.add("f4=" + getF4());
        }
        if (hasSegmentId()) {
            parts.add("segmentId=" + getSegmentId());
        }
        if (hasEventSubgroupId()) {
            parts.add("eventSubgroupId=" + getEventSubgroupId());
        }
        if (hasFirstName()) {
            parts.add("firstName=" + getFirstName());
        }
        if (hasLastName()) {
            parts.add("lastName=" + getLastName());
        }
        if (hasWorldTime()) {
            parts.add("worldTime=" + getWorldTime());
        }
        if (hasFinishTimeStr()) {
            parts.add("finishTimeStr=" + getFinishTimeStr());
        }
        if (hasElapsedMs()) {
            parts.add("elapsedMs=" + getElapsedMs());
        }
        if (hasF12()) {
            parts.add("f12=" + getF12());
        }
        if (hasF13()) {
            parts.add("f13=" + getF13());
        }
        if (hasF14()) {
            parts.add("f14=" + getF14());
        }
        if (hasF15()) {
            parts.add("f15=" + getF15());
        }
        if (hasF16()) {
            parts.add("f16=" + getF16());
        }
        if (hasF17()) {
            parts.add("f17=" + getF17());
        }
        if (hasF18()) {
            parts.add("f18=" + getF18());
        }
        if (hasF19()) {
            parts.add("f19=" + getF19());
        }
        if (hasF20()) {
            parts.add("f20=" + getF20());
        }
        return "SegmentResult{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SegmentResult>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("playerId", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("f4", 4);
        	__fieldMap.put("segmentId", 5);
        	__fieldMap.put("eventSubgroupId", 6);
        	__fieldMap.put("firstName", 7);
        	__fieldMap.put("lastName", 8);
        	__fieldMap.put("worldTime", 9);
        	__fieldMap.put("finishTimeStr", 10);
        	__fieldMap.put("elapsedMs", 11);
        	__fieldMap.put("f12", 12);
        	__fieldMap.put("f13", 13);
        	__fieldMap.put("f14", 14);
        	__fieldMap.put("f15", 15);
        	__fieldMap.put("f16", 16);
        	__fieldMap.put("f17", 17);
        	__fieldMap.put("f18", 18);
        	__fieldMap.put("f19", 19);
        	__fieldMap.put("f20", 20);
        }

        @Override
        public SegmentResult newMessage() {
            return new SegmentResult();
        }

        @Override
        public Class<SegmentResult> typeClass() {
            return SegmentResult.class;
        }

        @Override
        public String messageName() {
            return SegmentResult.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SegmentResult.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SegmentResult message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SegmentResult instance) throws java.io.IOException {
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
                    	instance.f4 = input.readUInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.segmentId = input.readUInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.eventSubgroupId = input.readUInt64();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.firstName = input.readString();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.lastName = input.readString();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.worldTime = input.readUInt64();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.finishTimeStr = input.readString();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.elapsedMs = input.readUInt64();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.f12 = input.readBool();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.f13 = input.readUInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.f14 = input.readUInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.f15 = input.readUInt32();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 16:
                    	instance.f16 = input.readBool();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 17:
                    	instance.f17 = input.readString();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 18:
                    	instance.f18 = input.readUInt64();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 19:
                    	instance.f19 = input.readUInt32();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 20:
                    	instance.f20 = input.readUInt32();
                    	instance.__bitField0 |= 524288;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SegmentResult instance) throws java.io.IOException {
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
                output.writeUInt32(4, instance.f4, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeUInt64(5, instance.segmentId, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeUInt64(6, instance.eventSubgroupId, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeString(7, instance.firstName, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeString(8, instance.lastName, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeUInt64(9, instance.worldTime, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeString(10, instance.finishTimeStr, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeUInt64(11, instance.elapsedMs, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeBool(12, instance.f12, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeUInt32(13, instance.f13, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeUInt32(14, instance.f14, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeUInt32(15, instance.f15, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeBool(16, instance.f16, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeString(17, instance.f17, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeUInt64(18, instance.f18, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeUInt32(19, instance.f19, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeUInt32(20, instance.f20, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "playerId";
        		case 3: return "f3";
        		case 4: return "f4";
        		case 5: return "segmentId";
        		case 6: return "eventSubgroupId";
        		case 7: return "firstName";
        		case 8: return "lastName";
        		case 9: return "worldTime";
        		case 10: return "finishTimeStr";
        		case 11: return "elapsedMs";
        		case 12: return "f12";
        		case 13: return "f13";
        		case 14: return "f14";
        		case 15: return "f15";
        		case 16: return "f16";
        		case 17: return "f17";
        		case 18: return "f18";
        		case 19: return "f19";
        		case 20: return "f20";
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

        private int f4;

        private long segmentId;

        private long eventSubgroupId;

        private String firstName;

        private String lastName;

        private long worldTime;

        private String finishTimeStr;

        private long elapsedMs;

        private boolean f12;

        private int f13;

        private int f14;

        private int f15;

        private boolean f16;

        private String f17;

        private long f18;

        private int f19;

        private int f20;

        private int __bitField0;

        private Builder() {
            this.id = 0L;
            this.playerId = 0L;
            this.f3 = 0;
            this.f4 = 0;
            this.segmentId = 0L;
            this.eventSubgroupId = 0L;
            this.firstName = "";
            this.lastName = "";
            this.worldTime = 0L;
            this.finishTimeStr = "";
            this.elapsedMs = 0L;
            this.f12 = false;
            this.f13 = 0;
            this.f14 = 0;
            this.f15 = 0;
            this.f16 = false;
            this.f17 = "";
            this.f18 = 0L;
            this.f19 = 0;
            this.f20 = 0;
        }

        public Builder mergeFrom(SegmentResult instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasF4()) {
                this.setF4(instance.getF4());
            }

            if (instance.hasSegmentId()) {
                this.setSegmentId(instance.getSegmentId());
            }

            if (instance.hasEventSubgroupId()) {
                this.setEventSubgroupId(instance.getEventSubgroupId());
            }

            if (instance.hasFirstName()) {
                this.setFirstName(instance.getFirstName());
            }

            if (instance.hasLastName()) {
                this.setLastName(instance.getLastName());
            }

            if (instance.hasWorldTime()) {
                this.setWorldTime(instance.getWorldTime());
            }

            if (instance.hasFinishTimeStr()) {
                this.setFinishTimeStr(instance.getFinishTimeStr());
            }

            if (instance.hasElapsedMs()) {
                this.setElapsedMs(instance.getElapsedMs());
            }

            if (instance.hasF12()) {
                this.setF12(instance.getF12());
            }

            if (instance.hasF13()) {
                this.setF13(instance.getF13());
            }

            if (instance.hasF14()) {
                this.setF14(instance.getF14());
            }

            if (instance.hasF15()) {
                this.setF15(instance.getF15());
            }

            if (instance.hasF16()) {
                this.setF16(instance.getF16());
            }

            if (instance.hasF17()) {
                this.setF17(instance.getF17());
            }

            if (instance.hasF18()) {
                this.setF18(instance.getF18());
            }

            if (instance.hasF19()) {
                this.setF19(instance.getF19());
            }

            if (instance.hasF20()) {
                this.setF20(instance.getF20());
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

        public int getF4() {
            return f4;
        }

        public Builder setF4(int value) {
            this.f4 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearF4() {
            this.f4 = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasF4() {
            return (__bitField0 & 8) == 8;
        }

        public long getSegmentId() {
            return segmentId;
        }

        public Builder setSegmentId(long value) {
            this.segmentId = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearSegmentId() {
            this.segmentId = 0L;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasSegmentId() {
            return (__bitField0 & 16) == 16;
        }

        public long getEventSubgroupId() {
            return eventSubgroupId;
        }

        public Builder setEventSubgroupId(long value) {
            this.eventSubgroupId = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearEventSubgroupId() {
            this.eventSubgroupId = 0L;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasEventSubgroupId() {
            return (__bitField0 & 32) == 32;
        }

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentResult#firstName to null");
            }

            this.firstName = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearFirstName() {
            this.firstName = "";
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasFirstName() {
            return (__bitField0 & 64) == 64;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentResult#lastName to null");
            }

            this.lastName = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearLastName() {
            this.lastName = "";
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasLastName() {
            return (__bitField0 & 128) == 128;
        }

        public long getWorldTime() {
            return worldTime;
        }

        public Builder setWorldTime(long value) {
            this.worldTime = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearWorldTime() {
            this.worldTime = 0L;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasWorldTime() {
            return (__bitField0 & 256) == 256;
        }

        public String getFinishTimeStr() {
            return finishTimeStr;
        }

        public Builder setFinishTimeStr(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentResult#finishTimeStr to null");
            }

            this.finishTimeStr = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearFinishTimeStr() {
            this.finishTimeStr = "";
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasFinishTimeStr() {
            return (__bitField0 & 512) == 512;
        }

        public long getElapsedMs() {
            return elapsedMs;
        }

        public Builder setElapsedMs(long value) {
            this.elapsedMs = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearElapsedMs() {
            this.elapsedMs = 0L;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasElapsedMs() {
            return (__bitField0 & 1024) == 1024;
        }

        public boolean getF12() {
            return f12;
        }

        public Builder setF12(boolean value) {
            this.f12 = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearF12() {
            this.f12 = false;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasF12() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getF13() {
            return f13;
        }

        public Builder setF13(int value) {
            this.f13 = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearF13() {
            this.f13 = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasF13() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getF14() {
            return f14;
        }

        public Builder setF14(int value) {
            this.f14 = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearF14() {
            this.f14 = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasF14() {
            return (__bitField0 & 8192) == 8192;
        }

        public int getF15() {
            return f15;
        }

        public Builder setF15(int value) {
            this.f15 = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearF15() {
            this.f15 = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasF15() {
            return (__bitField0 & 16384) == 16384;
        }

        public boolean getF16() {
            return f16;
        }

        public Builder setF16(boolean value) {
            this.f16 = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearF16() {
            this.f16 = false;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasF16() {
            return (__bitField0 & 32768) == 32768;
        }

        public String getF17() {
            return f17;
        }

        public Builder setF17(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentResult#f17 to null");
            }

            this.f17 = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearF17() {
            this.f17 = "";
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasF17() {
            return (__bitField0 & 65536) == 65536;
        }

        public long getF18() {
            return f18;
        }

        public Builder setF18(long value) {
            this.f18 = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearF18() {
            this.f18 = 0L;
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasF18() {
            return (__bitField0 & 131072) == 131072;
        }

        public int getF19() {
            return f19;
        }

        public Builder setF19(int value) {
            this.f19 = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearF19() {
            this.f19 = 0;
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasF19() {
            return (__bitField0 & 262144) == 262144;
        }

        public int getF20() {
            return f20;
        }

        public Builder setF20(int value) {
            this.f20 = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearF20() {
            this.f20 = 0;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasF20() {
            return (__bitField0 & 524288) == 524288;
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
            if (!java.util.Objects.equals(this.f4, that.f4)) {
                return false;
            }
            if (!java.util.Objects.equals(this.segmentId, that.segmentId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.eventSubgroupId, that.eventSubgroupId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.firstName, that.firstName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lastName, that.lastName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.finishTimeStr, that.finishTimeStr)) {
                return false;
            }
            if (!java.util.Objects.equals(this.elapsedMs, that.elapsedMs)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f12, that.f12)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f13, that.f13)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f14, that.f14)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f15, that.f15)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f16, that.f16)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f17, that.f17)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f18, that.f18)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f19, that.f19)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f20, that.f20)) {
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
            result = 31 * result + Integer.hashCode(this.f4);
            result = 31 * result + Long.hashCode(this.segmentId);
            result = 31 * result + Long.hashCode(this.eventSubgroupId);
            result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
            result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
            result = 31 * result + Long.hashCode(this.worldTime);
            result = 31 * result + (this.finishTimeStr == null ? 0 : this.finishTimeStr.hashCode());
            result = 31 * result + Long.hashCode(this.elapsedMs);
            result = 31 * result + Boolean.hashCode(this.f12);
            result = 31 * result + Integer.hashCode(this.f13);
            result = 31 * result + Integer.hashCode(this.f14);
            result = 31 * result + Integer.hashCode(this.f15);
            result = 31 * result + Boolean.hashCode(this.f16);
            result = 31 * result + (this.f17 == null ? 0 : this.f17.hashCode());
            result = 31 * result + Long.hashCode(this.f18);
            result = 31 * result + Integer.hashCode(this.f19);
            result = 31 * result + Integer.hashCode(this.f20);

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
            if (hasF4()) {
                parts.add("f4=" + getF4());
            }
            if (hasSegmentId()) {
                parts.add("segmentId=" + getSegmentId());
            }
            if (hasEventSubgroupId()) {
                parts.add("eventSubgroupId=" + getEventSubgroupId());
            }
            if (hasFirstName()) {
                parts.add("firstName=" + getFirstName());
            }
            if (hasLastName()) {
                parts.add("lastName=" + getLastName());
            }
            if (hasWorldTime()) {
                parts.add("worldTime=" + getWorldTime());
            }
            if (hasFinishTimeStr()) {
                parts.add("finishTimeStr=" + getFinishTimeStr());
            }
            if (hasElapsedMs()) {
                parts.add("elapsedMs=" + getElapsedMs());
            }
            if (hasF12()) {
                parts.add("f12=" + getF12());
            }
            if (hasF13()) {
                parts.add("f13=" + getF13());
            }
            if (hasF14()) {
                parts.add("f14=" + getF14());
            }
            if (hasF15()) {
                parts.add("f15=" + getF15());
            }
            if (hasF16()) {
                parts.add("f16=" + getF16());
            }
            if (hasF17()) {
                parts.add("f17=" + getF17());
            }
            if (hasF18()) {
                parts.add("f18=" + getF18());
            }
            if (hasF19()) {
                parts.add("f19=" + getF19());
            }
            if (hasF20()) {
                parts.add("f20=" + getF20());
            }
            return "SegmentResult{" + String.join(", ", parts) + "}";
        }

        public SegmentResult build() {
            org.zwiftj.api.model.SegmentResult result = new org.zwiftj.api.model.SegmentResult();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.playerId = this.playerId;
            result.f3 = this.f3;
            result.f4 = this.f4;
            result.segmentId = this.segmentId;
            result.eventSubgroupId = this.eventSubgroupId;
            result.firstName = this.firstName;
            result.lastName = this.lastName;
            result.worldTime = this.worldTime;
            result.finishTimeStr = this.finishTimeStr;
            result.elapsedMs = this.elapsedMs;
            result.f12 = this.f12;
            result.f13 = this.f13;
            result.f14 = this.f14;
            result.f15 = this.f15;
            result.f16 = this.f16;
            result.f17 = this.f17;
            result.f18 = this.f18;
            result.f19 = this.f19;
            result.f20 = this.f20;
            return result;
        }

    }



}