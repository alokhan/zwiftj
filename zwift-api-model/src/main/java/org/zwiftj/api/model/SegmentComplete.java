package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class SegmentComplete
        implements io.protostuff.Message<SegmentComplete> {

    private static final SegmentComplete DEFAULT_INSTANCE = newBuilder().build();

    private long f1;

    private int riderId;

    private int f3;

    private long f4;

    private long segmentId;

    private long f6;

    private String firstName;

    private String lastName;

    private long worldTime;

    private long milliseconds;

    private int f12;

    private int weightInGrams;

    private int f14;

    private int avgPower;

    private int f16;

    private String f7date;

    private int f19;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SegmentComplete() {
        this.f1 = 0L;
        this.riderId = 0;
        this.f3 = 0;
        this.f4 = 0L;
        this.segmentId = 0L;
        this.f6 = 0L;
        this.firstName = "";
        this.lastName = "";
        this.worldTime = 0L;
        this.milliseconds = 0L;
        this.f12 = 0;
        this.weightInGrams = 0;
        this.f14 = 0;
        this.avgPower = 0;
        this.f16 = 0;
        this.f7date = "";
        this.f19 = 0;
    }

    private SegmentComplete(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SegmentComplete getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SegmentComplete> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getF1() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public SegmentComplete withF1(long value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF1(value)
            .build();
    }

    public int getRiderId() {
        return riderId;
    }

    public boolean hasRiderId() {
        return (__bitField0 & 2) == 2;
    }

    public SegmentComplete withRiderId(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setRiderId(value)
            .build();
    }

    public int getF3() {
        return f3;
    }

    public boolean hasF3() {
        return (__bitField0 & 4) == 4;
    }

    public SegmentComplete withF3(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public long getF4() {
        return f4;
    }

    public boolean hasF4() {
        return (__bitField0 & 8) == 8;
    }

    public SegmentComplete withF4(long value) {
        return SegmentComplete.newBuilder()
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

    public SegmentComplete withSegmentId(long value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setSegmentId(value)
            .build();
    }

    public long getF6() {
        return f6;
    }

    public boolean hasF6() {
        return (__bitField0 & 32) == 32;
    }

    public SegmentComplete withF6(long value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF6(value)
            .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean hasFirstName() {
        return (__bitField0 & 64) == 64;
    }

    public SegmentComplete withFirstName(String value) {
        return SegmentComplete.newBuilder()
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

    public SegmentComplete withLastName(String value) {
        return SegmentComplete.newBuilder()
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

    public SegmentComplete withWorldTime(long value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setWorldTime(value)
            .build();
    }

    public long getMilliseconds() {
        return milliseconds;
    }

    public boolean hasMilliseconds() {
        return (__bitField0 & 512) == 512;
    }

    public SegmentComplete withMilliseconds(long value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setMilliseconds(value)
            .build();
    }

    public int getF12() {
        return f12;
    }

    public boolean hasF12() {
        return (__bitField0 & 1024) == 1024;
    }

    public SegmentComplete withF12(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF12(value)
            .build();
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public boolean hasWeightInGrams() {
        return (__bitField0 & 2048) == 2048;
    }

    public SegmentComplete withWeightInGrams(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setWeightInGrams(value)
            .build();
    }

    public int getF14() {
        return f14;
    }

    public boolean hasF14() {
        return (__bitField0 & 4096) == 4096;
    }

    public SegmentComplete withF14(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF14(value)
            .build();
    }

    public int getAvgPower() {
        return avgPower;
    }

    public boolean hasAvgPower() {
        return (__bitField0 & 8192) == 8192;
    }

    public SegmentComplete withAvgPower(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setAvgPower(value)
            .build();
    }

    public int getF16() {
        return f16;
    }

    public boolean hasF16() {
        return (__bitField0 & 16384) == 16384;
    }

    public SegmentComplete withF16(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF16(value)
            .build();
    }

    public String getF7date() {
        return f7date;
    }

    public boolean hasF7date() {
        return (__bitField0 & 32768) == 32768;
    }

    public SegmentComplete withF7date(String value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF7date(value)
            .build();
    }

    public int getF19() {
        return f19;
    }

    public boolean hasF19() {
        return (__bitField0 & 65536) == 65536;
    }

    public SegmentComplete withF19(int value) {
        return SegmentComplete.newBuilder()
            .mergeFrom(this)
            .setF19(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SegmentComplete> cachedSchema() {
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
        SegmentComplete that = (SegmentComplete) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.riderId, that.riderId)) {
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
        if (!java.util.Objects.equals(this.f6, that.f6)) {
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
        if (!java.util.Objects.equals(this.milliseconds, that.milliseconds)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f12, that.f12)) {
            return false;
        }
        if (!java.util.Objects.equals(this.weightInGrams, that.weightInGrams)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f14, that.f14)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avgPower, that.avgPower)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f16, that.f16)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f7date, that.f7date)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f19, that.f19)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.f1);
        result = 31 * result + Integer.hashCode(this.riderId);
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + Long.hashCode(this.f4);
        result = 31 * result + Long.hashCode(this.segmentId);
        result = 31 * result + Long.hashCode(this.f6);
        result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
        result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
        result = 31 * result + Long.hashCode(this.worldTime);
        result = 31 * result + Long.hashCode(this.milliseconds);
        result = 31 * result + Integer.hashCode(this.f12);
        result = 31 * result + Integer.hashCode(this.weightInGrams);
        result = 31 * result + Integer.hashCode(this.f14);
        result = 31 * result + Integer.hashCode(this.avgPower);
        result = 31 * result + Integer.hashCode(this.f16);
        result = 31 * result + (this.f7date == null ? 0 : this.f7date.hashCode());
        result = 31 * result + Integer.hashCode(this.f19);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasF1()) {
            parts.add("f1=" + getF1());
        }
        if (hasRiderId()) {
            parts.add("riderId=" + getRiderId());
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
        if (hasF6()) {
            parts.add("f6=" + getF6());
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
        if (hasMilliseconds()) {
            parts.add("milliseconds=" + getMilliseconds());
        }
        if (hasF12()) {
            parts.add("f12=" + getF12());
        }
        if (hasWeightInGrams()) {
            parts.add("weightInGrams=" + getWeightInGrams());
        }
        if (hasF14()) {
            parts.add("f14=" + getF14());
        }
        if (hasAvgPower()) {
            parts.add("avgPower=" + getAvgPower());
        }
        if (hasF16()) {
            parts.add("f16=" + getF16());
        }
        if (hasF7date()) {
            parts.add("f7date=" + getF7date());
        }
        if (hasF19()) {
            parts.add("f19=" + getF19());
        }
        return "SegmentComplete{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SegmentComplete>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("riderId", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("f4", 4);
        	__fieldMap.put("segmentId", 5);
        	__fieldMap.put("f6", 6);
        	__fieldMap.put("firstName", 7);
        	__fieldMap.put("lastName", 8);
        	__fieldMap.put("worldTime", 9);
        	__fieldMap.put("milliseconds", 11);
        	__fieldMap.put("f12", 12);
        	__fieldMap.put("weightInGrams", 13);
        	__fieldMap.put("f14", 14);
        	__fieldMap.put("avgPower", 15);
        	__fieldMap.put("f16", 16);
        	__fieldMap.put("f7date", 17);
        	__fieldMap.put("f19", 19);
        }

        @Override
        public SegmentComplete newMessage() {
            return new SegmentComplete();
        }

        @Override
        public Class<SegmentComplete> typeClass() {
            return SegmentComplete.class;
        }

        @Override
        public String messageName() {
            return SegmentComplete.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SegmentComplete.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SegmentComplete message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SegmentComplete instance) throws java.io.IOException {
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
                    	instance.f1 = input.readInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.riderId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.f3 = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.f4 = input.readInt64();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.segmentId = input.readInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.f6 = input.readInt64();
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
                    	instance.worldTime = input.readInt64();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 11:
                    	instance.milliseconds = input.readInt64();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 12:
                    	instance.f12 = input.readInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 13:
                    	instance.weightInGrams = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 14:
                    	instance.f14 = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 15:
                    	instance.avgPower = input.readInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 16:
                    	instance.f16 = input.readInt32();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 17:
                    	instance.f7date = input.readString();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 19:
                    	instance.f19 = input.readInt32();
                    	instance.__bitField0 |= 65536;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SegmentComplete instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.riderId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt64(4, instance.f4, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt64(5, instance.segmentId, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt64(6, instance.f6, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeString(7, instance.firstName, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeString(8, instance.lastName, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt64(9, instance.worldTime, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt64(11, instance.milliseconds, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt32(12, instance.f12, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(13, instance.weightInGrams, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(14, instance.f14, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeInt32(15, instance.avgPower, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeInt32(16, instance.f16, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeString(17, instance.f7date, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeInt32(19, instance.f19, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "riderId";
        		case 3: return "f3";
        		case 4: return "f4";
        		case 5: return "segmentId";
        		case 6: return "f6";
        		case 7: return "firstName";
        		case 8: return "lastName";
        		case 9: return "worldTime";
        		case 11: return "milliseconds";
        		case 12: return "f12";
        		case 13: return "weightInGrams";
        		case 14: return "f14";
        		case 15: return "avgPower";
        		case 16: return "f16";
        		case 17: return "f7date";
        		case 19: return "f19";
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

        private long f1;

        private int riderId;

        private int f3;

        private long f4;

        private long segmentId;

        private long f6;

        private String firstName;

        private String lastName;

        private long worldTime;

        private long milliseconds;

        private int f12;

        private int weightInGrams;

        private int f14;

        private int avgPower;

        private int f16;

        private String f7date;

        private int f19;

        private int __bitField0;

        private Builder() {
            this.f1 = 0L;
            this.riderId = 0;
            this.f3 = 0;
            this.f4 = 0L;
            this.segmentId = 0L;
            this.f6 = 0L;
            this.firstName = "";
            this.lastName = "";
            this.worldTime = 0L;
            this.milliseconds = 0L;
            this.f12 = 0;
            this.weightInGrams = 0;
            this.f14 = 0;
            this.avgPower = 0;
            this.f16 = 0;
            this.f7date = "";
            this.f19 = 0;
        }

        public Builder mergeFrom(SegmentComplete instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasRiderId()) {
                this.setRiderId(instance.getRiderId());
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

            if (instance.hasF6()) {
                this.setF6(instance.getF6());
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

            if (instance.hasMilliseconds()) {
                this.setMilliseconds(instance.getMilliseconds());
            }

            if (instance.hasF12()) {
                this.setF12(instance.getF12());
            }

            if (instance.hasWeightInGrams()) {
                this.setWeightInGrams(instance.getWeightInGrams());
            }

            if (instance.hasF14()) {
                this.setF14(instance.getF14());
            }

            if (instance.hasAvgPower()) {
                this.setAvgPower(instance.getAvgPower());
            }

            if (instance.hasF16()) {
                this.setF16(instance.getF16());
            }

            if (instance.hasF7date()) {
                this.setF7date(instance.getF7date());
            }

            if (instance.hasF19()) {
                this.setF19(instance.getF19());
            }

            return this;
        }

        public long getF1() {
            return f1;
        }

        public Builder setF1(long value) {
            this.f1 = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearF1() {
            this.f1 = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasF1() {
            return (__bitField0 & 1) == 1;
        }

        public int getRiderId() {
            return riderId;
        }

        public Builder setRiderId(int value) {
            this.riderId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearRiderId() {
            this.riderId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasRiderId() {
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

        public long getF4() {
            return f4;
        }

        public Builder setF4(long value) {
            this.f4 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearF4() {
            this.f4 = 0L;
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

        public long getF6() {
            return f6;
        }

        public Builder setF6(long value) {
            this.f6 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearF6() {
            this.f6 = 0L;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasF6() {
            return (__bitField0 & 32) == 32;
        }

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentComplete#firstName to null");
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
                throw new NullPointerException("Cannot set SegmentComplete#lastName to null");
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

        public long getMilliseconds() {
            return milliseconds;
        }

        public Builder setMilliseconds(long value) {
            this.milliseconds = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearMilliseconds() {
            this.milliseconds = 0L;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasMilliseconds() {
            return (__bitField0 & 512) == 512;
        }

        public int getF12() {
            return f12;
        }

        public Builder setF12(int value) {
            this.f12 = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearF12() {
            this.f12 = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasF12() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getWeightInGrams() {
            return weightInGrams;
        }

        public Builder setWeightInGrams(int value) {
            this.weightInGrams = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearWeightInGrams() {
            this.weightInGrams = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasWeightInGrams() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getF14() {
            return f14;
        }

        public Builder setF14(int value) {
            this.f14 = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearF14() {
            this.f14 = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasF14() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getAvgPower() {
            return avgPower;
        }

        public Builder setAvgPower(int value) {
            this.avgPower = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearAvgPower() {
            this.avgPower = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasAvgPower() {
            return (__bitField0 & 8192) == 8192;
        }

        public int getF16() {
            return f16;
        }

        public Builder setF16(int value) {
            this.f16 = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearF16() {
            this.f16 = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasF16() {
            return (__bitField0 & 16384) == 16384;
        }

        public String getF7date() {
            return f7date;
        }

        public Builder setF7date(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentComplete#f7date to null");
            }

            this.f7date = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearF7date() {
            this.f7date = "";
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasF7date() {
            return (__bitField0 & 32768) == 32768;
        }

        public int getF19() {
            return f19;
        }

        public Builder setF19(int value) {
            this.f19 = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearF19() {
            this.f19 = 0;
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasF19() {
            return (__bitField0 & 65536) == 65536;
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
            if (!java.util.Objects.equals(this.f1, that.f1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.riderId, that.riderId)) {
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
            if (!java.util.Objects.equals(this.f6, that.f6)) {
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
            if (!java.util.Objects.equals(this.milliseconds, that.milliseconds)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f12, that.f12)) {
                return false;
            }
            if (!java.util.Objects.equals(this.weightInGrams, that.weightInGrams)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f14, that.f14)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avgPower, that.avgPower)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f16, that.f16)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f7date, that.f7date)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f19, that.f19)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.f1);
            result = 31 * result + Integer.hashCode(this.riderId);
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + Long.hashCode(this.f4);
            result = 31 * result + Long.hashCode(this.segmentId);
            result = 31 * result + Long.hashCode(this.f6);
            result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
            result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
            result = 31 * result + Long.hashCode(this.worldTime);
            result = 31 * result + Long.hashCode(this.milliseconds);
            result = 31 * result + Integer.hashCode(this.f12);
            result = 31 * result + Integer.hashCode(this.weightInGrams);
            result = 31 * result + Integer.hashCode(this.f14);
            result = 31 * result + Integer.hashCode(this.avgPower);
            result = 31 * result + Integer.hashCode(this.f16);
            result = 31 * result + (this.f7date == null ? 0 : this.f7date.hashCode());
            result = 31 * result + Integer.hashCode(this.f19);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasF1()) {
                parts.add("f1=" + getF1());
            }
            if (hasRiderId()) {
                parts.add("riderId=" + getRiderId());
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
            if (hasF6()) {
                parts.add("f6=" + getF6());
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
            if (hasMilliseconds()) {
                parts.add("milliseconds=" + getMilliseconds());
            }
            if (hasF12()) {
                parts.add("f12=" + getF12());
            }
            if (hasWeightInGrams()) {
                parts.add("weightInGrams=" + getWeightInGrams());
            }
            if (hasF14()) {
                parts.add("f14=" + getF14());
            }
            if (hasAvgPower()) {
                parts.add("avgPower=" + getAvgPower());
            }
            if (hasF16()) {
                parts.add("f16=" + getF16());
            }
            if (hasF7date()) {
                parts.add("f7date=" + getF7date());
            }
            if (hasF19()) {
                parts.add("f19=" + getF19());
            }
            return "SegmentComplete{" + String.join(", ", parts) + "}";
        }

        public SegmentComplete build() {
            org.zwiftj.api.model.SegmentComplete result = new org.zwiftj.api.model.SegmentComplete();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.riderId = this.riderId;
            result.f3 = this.f3;
            result.f4 = this.f4;
            result.segmentId = this.segmentId;
            result.f6 = this.f6;
            result.firstName = this.firstName;
            result.lastName = this.lastName;
            result.worldTime = this.worldTime;
            result.milliseconds = this.milliseconds;
            result.f12 = this.f12;
            result.weightInGrams = this.weightInGrams;
            result.f14 = this.f14;
            result.avgPower = this.avgPower;
            result.f16 = this.f16;
            result.f7date = this.f7date;
            result.f19 = this.f19;
            return result;
        }

    }



}