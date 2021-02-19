package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class PlayerUpdate
        implements io.protostuff.Message<PlayerUpdate> {

    private static final PlayerUpdate DEFAULT_INSTANCE = newBuilder().build();

    private long f1;

    private int f2;

    private int type;

    private io.protostuff.ByteString payload;

    private long worldTime1;

    private long x;

    private long altitude;

    private long y;

    private long worldTime2;

    private long f11;

    private long f12;

    private long f14;

    private long f15;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PlayerUpdate() {
        this.f1 = 0L;
        this.f2 = 0;
        this.type = 0;
        this.payload = io.protostuff.ByteString.EMPTY;
        this.worldTime1 = 0L;
        this.x = 0L;
        this.altitude = 0L;
        this.y = 0L;
        this.worldTime2 = 0L;
        this.f11 = 0L;
        this.f12 = 0L;
        this.f14 = 0L;
        this.f15 = 0L;
    }

    private PlayerUpdate(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PlayerUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PlayerUpdate> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getF1() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public PlayerUpdate withF1(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setF1(value)
            .build();
    }

    public int getF2() {
        return f2;
    }

    public boolean hasF2() {
        return (__bitField0 & 2) == 2;
    }

    public PlayerUpdate withF2(int value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setF2(value)
            .build();
    }

    public int getType() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 4) == 4;
    }

    public PlayerUpdate withType(int value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public io.protostuff.ByteString getPayload() {
        return payload;
    }

    public boolean hasPayload() {
        return (__bitField0 & 8) == 8;
    }

    public PlayerUpdate withPayload(io.protostuff.ByteString value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setPayload(value)
            .build();
    }

    public long getWorldTime1() {
        return worldTime1;
    }

    public boolean hasWorldTime1() {
        return (__bitField0 & 16) == 16;
    }

    public PlayerUpdate withWorldTime1(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setWorldTime1(value)
            .build();
    }

    public long getX() {
        return x;
    }

    public boolean hasX() {
        return (__bitField0 & 32) == 32;
    }

    public PlayerUpdate withX(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setX(value)
            .build();
    }

    public long getAltitude() {
        return altitude;
    }

    public boolean hasAltitude() {
        return (__bitField0 & 64) == 64;
    }

    public PlayerUpdate withAltitude(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setAltitude(value)
            .build();
    }

    public long getY() {
        return y;
    }

    public boolean hasY() {
        return (__bitField0 & 128) == 128;
    }

    public PlayerUpdate withY(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setY(value)
            .build();
    }

    public long getWorldTime2() {
        return worldTime2;
    }

    public boolean hasWorldTime2() {
        return (__bitField0 & 256) == 256;
    }

    public PlayerUpdate withWorldTime2(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setWorldTime2(value)
            .build();
    }

    public long getF11() {
        return f11;
    }

    public boolean hasF11() {
        return (__bitField0 & 512) == 512;
    }

    public PlayerUpdate withF11(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setF11(value)
            .build();
    }

    public long getF12() {
        return f12;
    }

    public boolean hasF12() {
        return (__bitField0 & 1024) == 1024;
    }

    public PlayerUpdate withF12(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setF12(value)
            .build();
    }

    public long getF14() {
        return f14;
    }

    public boolean hasF14() {
        return (__bitField0 & 2048) == 2048;
    }

    public PlayerUpdate withF14(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setF14(value)
            .build();
    }

    public long getF15() {
        return f15;
    }

    public boolean hasF15() {
        return (__bitField0 & 4096) == 4096;
    }

    public PlayerUpdate withF15(long value) {
        return PlayerUpdate.newBuilder()
            .mergeFrom(this)
            .setF15(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PlayerUpdate> cachedSchema() {
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
        PlayerUpdate that = (PlayerUpdate) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f2, that.f2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.payload, that.payload)) {
            return false;
        }
        if (!java.util.Objects.equals(this.worldTime1, that.worldTime1)) {
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
        if (!java.util.Objects.equals(this.worldTime2, that.worldTime2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f11, that.f11)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f12, that.f12)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f14, that.f14)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f15, that.f15)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.f1);
        result = 31 * result + Integer.hashCode(this.f2);
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + (this.payload == null ? 0 : this.payload.hashCode());
        result = 31 * result + Long.hashCode(this.worldTime1);
        result = 31 * result + Long.hashCode(this.x);
        result = 31 * result + Long.hashCode(this.altitude);
        result = 31 * result + Long.hashCode(this.y);
        result = 31 * result + Long.hashCode(this.worldTime2);
        result = 31 * result + Long.hashCode(this.f11);
        result = 31 * result + Long.hashCode(this.f12);
        result = 31 * result + Long.hashCode(this.f14);
        result = 31 * result + Long.hashCode(this.f15);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasF1()) {
            parts.add("f1=" + getF1());
        }
        if (hasF2()) {
            parts.add("f2=" + getF2());
        }
        if (hasType()) {
            parts.add("type=" + getType());
        }
        if (hasPayload()) {
            parts.add("payload=" + getPayload());
        }
        if (hasWorldTime1()) {
            parts.add("worldTime1=" + getWorldTime1());
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
        if (hasWorldTime2()) {
            parts.add("worldTime2=" + getWorldTime2());
        }
        if (hasF11()) {
            parts.add("f11=" + getF11());
        }
        if (hasF12()) {
            parts.add("f12=" + getF12());
        }
        if (hasF14()) {
            parts.add("f14=" + getF14());
        }
        if (hasF15()) {
            parts.add("f15=" + getF15());
        }
        return "PlayerUpdate{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PlayerUpdate>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("f2", 2);
        	__fieldMap.put("type", 3);
        	__fieldMap.put("payload", 4);
        	__fieldMap.put("worldTime1", 5);
        	__fieldMap.put("x", 6);
        	__fieldMap.put("altitude", 7);
        	__fieldMap.put("y", 8);
        	__fieldMap.put("worldTime2", 9);
        	__fieldMap.put("f11", 11);
        	__fieldMap.put("f12", 12);
        	__fieldMap.put("f14", 14);
        	__fieldMap.put("f15", 15);
        }

        @Override
        public PlayerUpdate newMessage() {
            return new PlayerUpdate();
        }

        @Override
        public Class<PlayerUpdate> typeClass() {
            return PlayerUpdate.class;
        }

        @Override
        public String messageName() {
            return PlayerUpdate.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PlayerUpdate.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PlayerUpdate message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PlayerUpdate instance) throws java.io.IOException {
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
                    	instance.f2 = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.type = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.payload = input.readBytes();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.worldTime1 = input.readInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.x = input.readInt64();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.altitude = input.readInt64();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.y = input.readInt64();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.worldTime2 = input.readInt64();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 11:
                    	instance.f11 = input.readInt64();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 12:
                    	instance.f12 = input.readInt64();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 14:
                    	instance.f14 = input.readInt64();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 15:
                    	instance.f15 = input.readInt64();
                    	instance.__bitField0 |= 4096;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PlayerUpdate instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.f2, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.type, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeBytes(4, instance.payload, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt64(5, instance.worldTime1, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt64(6, instance.x, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt64(7, instance.altitude, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt64(8, instance.y, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt64(9, instance.worldTime2, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt64(11, instance.f11, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt64(12, instance.f12, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt64(14, instance.f14, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt64(15, instance.f15, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "f2";
        		case 3: return "type";
        		case 4: return "payload";
        		case 5: return "worldTime1";
        		case 6: return "x";
        		case 7: return "altitude";
        		case 8: return "y";
        		case 9: return "worldTime2";
        		case 11: return "f11";
        		case 12: return "f12";
        		case 14: return "f14";
        		case 15: return "f15";
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

        private int f2;

        private int type;

        private io.protostuff.ByteString payload;

        private long worldTime1;

        private long x;

        private long altitude;

        private long y;

        private long worldTime2;

        private long f11;

        private long f12;

        private long f14;

        private long f15;

        private int __bitField0;

        private Builder() {
            this.f1 = 0L;
            this.f2 = 0;
            this.type = 0;
            this.payload = io.protostuff.ByteString.EMPTY;
            this.worldTime1 = 0L;
            this.x = 0L;
            this.altitude = 0L;
            this.y = 0L;
            this.worldTime2 = 0L;
            this.f11 = 0L;
            this.f12 = 0L;
            this.f14 = 0L;
            this.f15 = 0L;
        }

        public Builder mergeFrom(PlayerUpdate instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasF2()) {
                this.setF2(instance.getF2());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasPayload()) {
                this.setPayload(instance.getPayload());
            }

            if (instance.hasWorldTime1()) {
                this.setWorldTime1(instance.getWorldTime1());
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

            if (instance.hasWorldTime2()) {
                this.setWorldTime2(instance.getWorldTime2());
            }

            if (instance.hasF11()) {
                this.setF11(instance.getF11());
            }

            if (instance.hasF12()) {
                this.setF12(instance.getF12());
            }

            if (instance.hasF14()) {
                this.setF14(instance.getF14());
            }

            if (instance.hasF15()) {
                this.setF15(instance.getF15());
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

        public int getF2() {
            return f2;
        }

        public Builder setF2(int value) {
            this.f2 = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearF2() {
            this.f2 = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasF2() {
            return (__bitField0 & 2) == 2;
        }

        public int getType() {
            return type;
        }

        public Builder setType(int value) {
            this.type = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 4) == 4;
        }

        public io.protostuff.ByteString getPayload() {
            return payload;
        }

        public Builder setPayload(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PlayerUpdate#payload to null");
            }

            this.payload = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearPayload() {
            this.payload = io.protostuff.ByteString.EMPTY;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasPayload() {
            return (__bitField0 & 8) == 8;
        }

        public long getWorldTime1() {
            return worldTime1;
        }

        public Builder setWorldTime1(long value) {
            this.worldTime1 = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearWorldTime1() {
            this.worldTime1 = 0L;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasWorldTime1() {
            return (__bitField0 & 16) == 16;
        }

        public long getX() {
            return x;
        }

        public Builder setX(long value) {
            this.x = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearX() {
            this.x = 0L;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasX() {
            return (__bitField0 & 32) == 32;
        }

        public long getAltitude() {
            return altitude;
        }

        public Builder setAltitude(long value) {
            this.altitude = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearAltitude() {
            this.altitude = 0L;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasAltitude() {
            return (__bitField0 & 64) == 64;
        }

        public long getY() {
            return y;
        }

        public Builder setY(long value) {
            this.y = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearY() {
            this.y = 0L;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasY() {
            return (__bitField0 & 128) == 128;
        }

        public long getWorldTime2() {
            return worldTime2;
        }

        public Builder setWorldTime2(long value) {
            this.worldTime2 = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearWorldTime2() {
            this.worldTime2 = 0L;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasWorldTime2() {
            return (__bitField0 & 256) == 256;
        }

        public long getF11() {
            return f11;
        }

        public Builder setF11(long value) {
            this.f11 = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearF11() {
            this.f11 = 0L;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasF11() {
            return (__bitField0 & 512) == 512;
        }

        public long getF12() {
            return f12;
        }

        public Builder setF12(long value) {
            this.f12 = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearF12() {
            this.f12 = 0L;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasF12() {
            return (__bitField0 & 1024) == 1024;
        }

        public long getF14() {
            return f14;
        }

        public Builder setF14(long value) {
            this.f14 = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearF14() {
            this.f14 = 0L;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasF14() {
            return (__bitField0 & 2048) == 2048;
        }

        public long getF15() {
            return f15;
        }

        public Builder setF15(long value) {
            this.f15 = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearF15() {
            this.f15 = 0L;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasF15() {
            return (__bitField0 & 4096) == 4096;
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
            if (!java.util.Objects.equals(this.f2, that.f2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.payload, that.payload)) {
                return false;
            }
            if (!java.util.Objects.equals(this.worldTime1, that.worldTime1)) {
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
            if (!java.util.Objects.equals(this.worldTime2, that.worldTime2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f11, that.f11)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f12, that.f12)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f14, that.f14)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f15, that.f15)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.f1);
            result = 31 * result + Integer.hashCode(this.f2);
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + (this.payload == null ? 0 : this.payload.hashCode());
            result = 31 * result + Long.hashCode(this.worldTime1);
            result = 31 * result + Long.hashCode(this.x);
            result = 31 * result + Long.hashCode(this.altitude);
            result = 31 * result + Long.hashCode(this.y);
            result = 31 * result + Long.hashCode(this.worldTime2);
            result = 31 * result + Long.hashCode(this.f11);
            result = 31 * result + Long.hashCode(this.f12);
            result = 31 * result + Long.hashCode(this.f14);
            result = 31 * result + Long.hashCode(this.f15);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasF1()) {
                parts.add("f1=" + getF1());
            }
            if (hasF2()) {
                parts.add("f2=" + getF2());
            }
            if (hasType()) {
                parts.add("type=" + getType());
            }
            if (hasPayload()) {
                parts.add("payload=" + getPayload());
            }
            if (hasWorldTime1()) {
                parts.add("worldTime1=" + getWorldTime1());
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
            if (hasWorldTime2()) {
                parts.add("worldTime2=" + getWorldTime2());
            }
            if (hasF11()) {
                parts.add("f11=" + getF11());
            }
            if (hasF12()) {
                parts.add("f12=" + getF12());
            }
            if (hasF14()) {
                parts.add("f14=" + getF14());
            }
            if (hasF15()) {
                parts.add("f15=" + getF15());
            }
            return "PlayerUpdate{" + String.join(", ", parts) + "}";
        }

        public PlayerUpdate build() {
            org.zwiftj.api.model.PlayerUpdate result = new org.zwiftj.api.model.PlayerUpdate();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.f2 = this.f2;
            result.type = this.type;
            result.payload = this.payload;
            result.worldTime1 = this.worldTime1;
            result.x = this.x;
            result.altitude = this.altitude;
            result.y = this.y;
            result.worldTime2 = this.worldTime2;
            result.f11 = this.f11;
            result.f12 = this.f12;
            result.f14 = this.f14;
            result.f15 = this.f15;
            return result;
        }

    }



}