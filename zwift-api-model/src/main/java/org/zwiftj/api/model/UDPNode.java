package org.zwiftj.api.model;

@javax.annotation.Generated("login-response.proto")
public final class UDPNode
        implements io.protostuff.Message<UDPNode> {

    private static final UDPNode DEFAULT_INSTANCE = newBuilder().build();

    private String ip;

    private int port;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UDPNode() {
        this.ip = "";
        this.port = 0;
    }

    private UDPNode(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UDPNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UDPNode> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getIp() {
        return ip;
    }

    public boolean hasIp() {
        return (__bitField0 & 1) == 1;
    }

    public UDPNode withIp(String value) {
        return UDPNode.newBuilder()
            .mergeFrom(this)
            .setIp(value)
            .build();
    }

    public int getPort() {
        return port;
    }

    public boolean hasPort() {
        return (__bitField0 & 2) == 2;
    }

    public UDPNode withPort(int value) {
        return UDPNode.newBuilder()
            .mergeFrom(this)
            .setPort(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UDPNode> cachedSchema() {
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
        UDPNode that = (UDPNode) obj;
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
        result = 31 * result + (this.ip == null ? 0 : this.ip.hashCode());
        result = 31 * result + Integer.hashCode(this.port);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasIp()) {
            parts.add("ip=" + getIp());
        }
        if (hasPort()) {
            parts.add("port=" + getPort());
        }
        return "UDPNode{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UDPNode>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ip", 1);
        	__fieldMap.put("port", 2);
        }

        @Override
        public UDPNode newMessage() {
            return new UDPNode();
        }

        @Override
        public Class<UDPNode> typeClass() {
            return UDPNode.class;
        }

        @Override
        public String messageName() {
            return UDPNode.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UDPNode.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UDPNode message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UDPNode instance) throws java.io.IOException {
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
                    	instance.ip = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.port = input.readUInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UDPNode instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.ip, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeUInt32(2, instance.port, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ip";
        		case 2: return "port";
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

        private String ip;

        private int port;

        private int __bitField0;

        private Builder() {
            this.ip = "";
            this.port = 0;
        }

        public Builder mergeFrom(UDPNode instance) {
            if (instance.hasIp()) {
                this.setIp(instance.getIp());
            }

            if (instance.hasPort()) {
                this.setPort(instance.getPort());
            }

            return this;
        }

        public String getIp() {
            return ip;
        }

        public Builder setIp(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UDPNode#ip to null");
            }

            this.ip = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearIp() {
            this.ip = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasIp() {
            return (__bitField0 & 1) == 1;
        }

        public int getPort() {
            return port;
        }

        public Builder setPort(int value) {
            this.port = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPort() {
            this.port = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasPort() {
            return (__bitField0 & 2) == 2;
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
            result = 31 * result + (this.ip == null ? 0 : this.ip.hashCode());
            result = 31 * result + Integer.hashCode(this.port);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasIp()) {
                parts.add("ip=" + getIp());
            }
            if (hasPort()) {
                parts.add("port=" + getPort());
            }
            return "UDPNode{" + String.join(", ", parts) + "}";
        }

        public UDPNode build() {
            org.zwiftj.api.model.UDPNode result = new org.zwiftj.api.model.UDPNode();
            result.__bitField0 = __bitField0;
            result.ip = this.ip;
            result.port = this.port;
            return result;
        }

    }



}