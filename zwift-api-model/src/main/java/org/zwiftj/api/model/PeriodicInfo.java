package org.zwiftj.api.model;

@javax.annotation.Generated("periodic-info.proto")
public final class PeriodicInfo
        implements io.protostuff.Message<PeriodicInfo> {

    private static final PeriodicInfo DEFAULT_INSTANCE = newBuilder().build();

    private String gameServerIp;

    private int f2;

    private int f3;

    private int f4;

    private int f5;

    private int f6;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PeriodicInfo() {
        this.gameServerIp = "";
        this.f2 = 0;
        this.f3 = 0;
        this.f4 = 0;
        this.f5 = 0;
        this.f6 = 0;
    }

    private PeriodicInfo(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PeriodicInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PeriodicInfo> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getGameServerIp() {
        return gameServerIp;
    }

    public boolean hasGameServerIp() {
        return (__bitField0 & 1) == 1;
    }

    public PeriodicInfo withGameServerIp(String value) {
        return PeriodicInfo.newBuilder()
            .mergeFrom(this)
            .setGameServerIp(value)
            .build();
    }

    public int getF2() {
        return f2;
    }

    public boolean hasF2() {
        return (__bitField0 & 2) == 2;
    }

    public PeriodicInfo withF2(int value) {
        return PeriodicInfo.newBuilder()
            .mergeFrom(this)
            .setF2(value)
            .build();
    }

    public int getF3() {
        return f3;
    }

    public boolean hasF3() {
        return (__bitField0 & 4) == 4;
    }

    public PeriodicInfo withF3(int value) {
        return PeriodicInfo.newBuilder()
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

    public PeriodicInfo withF4(int value) {
        return PeriodicInfo.newBuilder()
            .mergeFrom(this)
            .setF4(value)
            .build();
    }

    public int getF5() {
        return f5;
    }

    public boolean hasF5() {
        return (__bitField0 & 16) == 16;
    }

    public PeriodicInfo withF5(int value) {
        return PeriodicInfo.newBuilder()
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

    public PeriodicInfo withF6(int value) {
        return PeriodicInfo.newBuilder()
            .mergeFrom(this)
            .setF6(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PeriodicInfo> cachedSchema() {
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
        PeriodicInfo that = (PeriodicInfo) obj;
        if (!java.util.Objects.equals(this.gameServerIp, that.gameServerIp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f2, that.f2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f4, that.f4)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f5, that.f5)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f6, that.f6)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.gameServerIp == null ? 0 : this.gameServerIp.hashCode());
        result = 31 * result + Integer.hashCode(this.f2);
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + Integer.hashCode(this.f4);
        result = 31 * result + Integer.hashCode(this.f5);
        result = 31 * result + Integer.hashCode(this.f6);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGameServerIp()) {
            parts.add("gameServerIp=" + getGameServerIp());
        }
        if (hasF2()) {
            parts.add("f2=" + getF2());
        }
        if (hasF3()) {
            parts.add("f3=" + getF3());
        }
        if (hasF4()) {
            parts.add("f4=" + getF4());
        }
        if (hasF5()) {
            parts.add("f5=" + getF5());
        }
        if (hasF6()) {
            parts.add("f6=" + getF6());
        }
        return "PeriodicInfo{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PeriodicInfo>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameServerIp", 1);
        	__fieldMap.put("f2", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("f4", 4);
        	__fieldMap.put("f5", 5);
        	__fieldMap.put("f6", 6);
        }

        @Override
        public PeriodicInfo newMessage() {
            return new PeriodicInfo();
        }

        @Override
        public Class<PeriodicInfo> typeClass() {
            return PeriodicInfo.class;
        }

        @Override
        public String messageName() {
            return PeriodicInfo.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PeriodicInfo.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PeriodicInfo message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PeriodicInfo instance) throws java.io.IOException {
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
                    	instance.gameServerIp = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.f2 = input.readUInt32();
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
                    	instance.f5 = input.readUInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.f6 = input.readUInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PeriodicInfo instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.gameServerIp, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeUInt32(2, instance.f2, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeUInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeUInt32(4, instance.f4, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeUInt32(5, instance.f5, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeUInt32(6, instance.f6, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameServerIp";
        		case 2: return "f2";
        		case 3: return "f3";
        		case 4: return "f4";
        		case 5: return "f5";
        		case 6: return "f6";
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

        private String gameServerIp;

        private int f2;

        private int f3;

        private int f4;

        private int f5;

        private int f6;

        private int __bitField0;

        private Builder() {
            this.gameServerIp = "";
            this.f2 = 0;
            this.f3 = 0;
            this.f4 = 0;
            this.f5 = 0;
            this.f6 = 0;
        }

        public Builder mergeFrom(PeriodicInfo instance) {
            if (instance.hasGameServerIp()) {
                this.setGameServerIp(instance.getGameServerIp());
            }

            if (instance.hasF2()) {
                this.setF2(instance.getF2());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasF4()) {
                this.setF4(instance.getF4());
            }

            if (instance.hasF5()) {
                this.setF5(instance.getF5());
            }

            if (instance.hasF6()) {
                this.setF6(instance.getF6());
            }

            return this;
        }

        public String getGameServerIp() {
            return gameServerIp;
        }

        public Builder setGameServerIp(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PeriodicInfo#gameServerIp to null");
            }

            this.gameServerIp = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearGameServerIp() {
            this.gameServerIp = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasGameServerIp() {
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




        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Builder that = (Builder) obj;
            if (!java.util.Objects.equals(this.gameServerIp, that.gameServerIp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f2, that.f2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f4, that.f4)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f5, that.f5)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f6, that.f6)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.gameServerIp == null ? 0 : this.gameServerIp.hashCode());
            result = 31 * result + Integer.hashCode(this.f2);
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + Integer.hashCode(this.f4);
            result = 31 * result + Integer.hashCode(this.f5);
            result = 31 * result + Integer.hashCode(this.f6);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameServerIp()) {
                parts.add("gameServerIp=" + getGameServerIp());
            }
            if (hasF2()) {
                parts.add("f2=" + getF2());
            }
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (hasF4()) {
                parts.add("f4=" + getF4());
            }
            if (hasF5()) {
                parts.add("f5=" + getF5());
            }
            if (hasF6()) {
                parts.add("f6=" + getF6());
            }
            return "PeriodicInfo{" + String.join(", ", parts) + "}";
        }

        public PeriodicInfo build() {
            org.zwiftj.api.model.PeriodicInfo result = new org.zwiftj.api.model.PeriodicInfo();
            result.__bitField0 = __bitField0;
            result.gameServerIp = this.gameServerIp;
            result.f2 = this.f2;
            result.f3 = this.f3;
            result.f4 = this.f4;
            result.f5 = this.f5;
            result.f6 = this.f6;
            return result;
        }

    }



}