package org.zwiftj.api.model;

@javax.annotation.Generated("tcp-node-msgs.proto")
public final class ServerDetails
        implements io.protostuff.Message<ServerDetails> {

    private static final ServerDetails DEFAULT_INSTANCE = newBuilder().build();

    private int f1;

    private int f2;

    private String ip;

    private int port;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ServerDetails() {
        this.f1 = 0;
        this.f2 = 0;
        this.ip = "";
        this.port = 0;
    }

    private ServerDetails(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ServerDetails getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ServerDetails> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getF1() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public ServerDetails withF1(int value) {
        return ServerDetails.newBuilder()
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

    public ServerDetails withF2(int value) {
        return ServerDetails.newBuilder()
            .mergeFrom(this)
            .setF2(value)
            .build();
    }

    public String getIp() {
        return ip;
    }

    public boolean hasIp() {
        return (__bitField0 & 4) == 4;
    }

    public ServerDetails withIp(String value) {
        return ServerDetails.newBuilder()
            .mergeFrom(this)
            .setIp(value)
            .build();
    }

    public int getPort() {
        return port;
    }

    public boolean hasPort() {
        return (__bitField0 & 8) == 8;
    }

    public ServerDetails withPort(int value) {
        return ServerDetails.newBuilder()
            .mergeFrom(this)
            .setPort(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ServerDetails> cachedSchema() {
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
        ServerDetails that = (ServerDetails) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f2, that.f2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ip, that.ip)) {
            return false;
        }
        if (!java.util.Objects.equals(this.port, that.port)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.f1);
        result = 31 * result + Integer.hashCode(this.f2);
        result = 31 * result + (this.ip == null ? 0 : this.ip.hashCode());
        result = 31 * result + Integer.hashCode(this.port);

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
        if (hasIp()) {
            parts.add("ip=" + getIp());
        }
        if (hasPort()) {
            parts.add("port=" + getPort());
        }
        return "ServerDetails{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ServerDetails>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("f2", 2);
        	__fieldMap.put("ip", 3);
        	__fieldMap.put("port", 4);
        }

        @Override
        public ServerDetails newMessage() {
            return new ServerDetails();
        }

        @Override
        public Class<ServerDetails> typeClass() {
            return ServerDetails.class;
        }

        @Override
        public String messageName() {
            return ServerDetails.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ServerDetails.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ServerDetails message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ServerDetails instance) throws java.io.IOException {
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
                    	instance.f1 = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.f2 = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.ip = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.port = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ServerDetails instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.f2, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.ip, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.port, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "f2";
        		case 3: return "ip";
        		case 4: return "port";
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

        private int f1;

        private int f2;

        private String ip;

        private int port;

        private int __bitField0;

        private Builder() {
            this.f1 = 0;
            this.f2 = 0;
            this.ip = "";
            this.port = 0;
        }

        public Builder mergeFrom(ServerDetails instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasF2()) {
                this.setF2(instance.getF2());
            }

            if (instance.hasIp()) {
                this.setIp(instance.getIp());
            }

            if (instance.hasPort()) {
                this.setPort(instance.getPort());
            }

            return this;
        }

        public int getF1() {
            return f1;
        }

        public Builder setF1(int value) {
            this.f1 = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearF1() {
            this.f1 = 0;
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

        public String getIp() {
            return ip;
        }

        public Builder setIp(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerDetails#ip to null");
            }

            this.ip = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearIp() {
            this.ip = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasIp() {
            return (__bitField0 & 4) == 4;
        }

        public int getPort() {
            return port;
        }

        public Builder setPort(int value) {
            this.port = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearPort() {
            this.port = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasPort() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.ip, that.ip)) {
                return false;
            }
            if (!java.util.Objects.equals(this.port, that.port)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.f1);
            result = 31 * result + Integer.hashCode(this.f2);
            result = 31 * result + (this.ip == null ? 0 : this.ip.hashCode());
            result = 31 * result + Integer.hashCode(this.port);

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
            if (hasIp()) {
                parts.add("ip=" + getIp());
            }
            if (hasPort()) {
                parts.add("port=" + getPort());
            }
            return "ServerDetails{" + String.join(", ", parts) + "}";
        }

        public ServerDetails build() {
            org.zwiftj.api.model.ServerDetails result = new org.zwiftj.api.model.ServerDetails();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.f2 = this.f2;
            result.ip = this.ip;
            result.port = this.port;
            return result;
        }

    }



}