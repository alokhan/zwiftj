package org.zwiftj.api.model;

@javax.annotation.Generated("login-response.proto")
public final class ServerInfo
        implements io.protostuff.Message<ServerInfo> {

    private static final ServerInfo DEFAULT_INSTANCE = newBuilder().build();

    private String relayUrl;

    private org.zwiftj.api.model.APIs apis;

    private long time;

    private org.zwiftj.api.model.UDPNodes nodes;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ServerInfo() {
        this.relayUrl = "";
        this.apis = org.zwiftj.api.model.APIs.getDefaultInstance();
        this.time = 0L;
        this.nodes = org.zwiftj.api.model.UDPNodes.getDefaultInstance();
    }

    private ServerInfo(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ServerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ServerInfo> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getRelayUrl() {
        return relayUrl;
    }

    public boolean hasRelayUrl() {
        return (__bitField0 & 1) == 1;
    }

    public ServerInfo withRelayUrl(String value) {
        return ServerInfo.newBuilder()
            .mergeFrom(this)
            .setRelayUrl(value)
            .build();
    }

    public org.zwiftj.api.model.APIs getApis() {
        return apis;
    }

    public boolean hasApis() {
        return (__bitField0 & 2) == 2;
    }

    public ServerInfo withApis(org.zwiftj.api.model.APIs value) {
        return ServerInfo.newBuilder()
            .mergeFrom(this)
            .setApis(value)
            .build();
    }

    public long getTime() {
        return time;
    }

    public boolean hasTime() {
        return (__bitField0 & 4) == 4;
    }

    public ServerInfo withTime(long value) {
        return ServerInfo.newBuilder()
            .mergeFrom(this)
            .setTime(value)
            .build();
    }

    public org.zwiftj.api.model.UDPNodes getNodes() {
        return nodes;
    }

    public boolean hasNodes() {
        return (__bitField0 & 8) == 8;
    }

    public ServerInfo withNodes(org.zwiftj.api.model.UDPNodes value) {
        return ServerInfo.newBuilder()
            .mergeFrom(this)
            .setNodes(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ServerInfo> cachedSchema() {
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
        ServerInfo that = (ServerInfo) obj;
        if (!java.util.Objects.equals(this.relayUrl, that.relayUrl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.apis, that.apis)) {
            return false;
        }
        if (!java.util.Objects.equals(this.time, that.time)) {
            return false;
        }
        if (!java.util.Objects.equals(this.nodes, that.nodes)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.relayUrl == null ? 0 : this.relayUrl.hashCode());
        result = 31 * result + (this.apis == null ? 0 : this.apis.hashCode());
        result = 31 * result + Long.hashCode(this.time);
        result = 31 * result + (this.nodes == null ? 0 : this.nodes.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasRelayUrl()) {
            parts.add("relayUrl=" + getRelayUrl());
        }
        if (hasApis()) {
            parts.add("apis=" + getApis());
        }
        if (hasTime()) {
            parts.add("time=" + getTime());
        }
        if (hasNodes()) {
            parts.add("nodes=" + getNodes());
        }
        return "ServerInfo{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ServerInfo>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("relayUrl", 1);
        	__fieldMap.put("apis", 2);
        	__fieldMap.put("time", 3);
        	__fieldMap.put("nodes", 4);
        }

        @Override
        public ServerInfo newMessage() {
            return new ServerInfo();
        }

        @Override
        public Class<ServerInfo> typeClass() {
            return ServerInfo.class;
        }

        @Override
        public String messageName() {
            return ServerInfo.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ServerInfo.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ServerInfo message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ServerInfo instance) throws java.io.IOException {
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
                    	instance.relayUrl = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.apis = input.mergeObject(null, org.zwiftj.api.model.APIs.getSchema());
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.time = input.readUInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.nodes = input.mergeObject(null, org.zwiftj.api.model.UDPNodes.getSchema());
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ServerInfo instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.relayUrl, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeObject(2, instance.apis, org.zwiftj.api.model.APIs.getSchema(), false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeUInt64(3, instance.time, false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeObject(4, instance.nodes, org.zwiftj.api.model.UDPNodes.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "relayUrl";
        		case 2: return "apis";
        		case 3: return "time";
        		case 4: return "nodes";
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

        private String relayUrl;

        private org.zwiftj.api.model.APIs apis;

        private long time;

        private org.zwiftj.api.model.UDPNodes nodes;

        private int __bitField0;

        private Builder() {
            this.relayUrl = "";
            this.apis = org.zwiftj.api.model.APIs.getDefaultInstance();
            this.time = 0L;
            this.nodes = org.zwiftj.api.model.UDPNodes.getDefaultInstance();
        }

        public Builder mergeFrom(ServerInfo instance) {
            if (instance.hasRelayUrl()) {
                this.setRelayUrl(instance.getRelayUrl());
            }

            if (instance.hasApis()) {
                this.setApis(instance.getApis());
            }

            if (instance.hasTime()) {
                this.setTime(instance.getTime());
            }

            if (instance.hasNodes()) {
                this.setNodes(instance.getNodes());
            }

            return this;
        }

        public String getRelayUrl() {
            return relayUrl;
        }

        public Builder setRelayUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerInfo#relayUrl to null");
            }

            this.relayUrl = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearRelayUrl() {
            this.relayUrl = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasRelayUrl() {
            return (__bitField0 & 1) == 1;
        }

        public org.zwiftj.api.model.APIs getApis() {
            return apis;
        }

        public Builder setApis(org.zwiftj.api.model.APIs value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerInfo#apis to null");
            }

            this.apis = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearApis() {
            this.apis = org.zwiftj.api.model.APIs.getDefaultInstance();
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasApis() {
            return (__bitField0 & 2) == 2;
        }

        public long getTime() {
            return time;
        }

        public Builder setTime(long value) {
            this.time = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearTime() {
            this.time = 0L;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasTime() {
            return (__bitField0 & 4) == 4;
        }

        public org.zwiftj.api.model.UDPNodes getNodes() {
            return nodes;
        }

        public Builder setNodes(org.zwiftj.api.model.UDPNodes value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerInfo#nodes to null");
            }

            this.nodes = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearNodes() {
            this.nodes = org.zwiftj.api.model.UDPNodes.getDefaultInstance();
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasNodes() {
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
            if (!java.util.Objects.equals(this.relayUrl, that.relayUrl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.apis, that.apis)) {
                return false;
            }
            if (!java.util.Objects.equals(this.time, that.time)) {
                return false;
            }
            if (!java.util.Objects.equals(this.nodes, that.nodes)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.relayUrl == null ? 0 : this.relayUrl.hashCode());
            result = 31 * result + (this.apis == null ? 0 : this.apis.hashCode());
            result = 31 * result + Long.hashCode(this.time);
            result = 31 * result + (this.nodes == null ? 0 : this.nodes.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasRelayUrl()) {
                parts.add("relayUrl=" + getRelayUrl());
            }
            if (hasApis()) {
                parts.add("apis=" + getApis());
            }
            if (hasTime()) {
                parts.add("time=" + getTime());
            }
            if (hasNodes()) {
                parts.add("nodes=" + getNodes());
            }
            return "ServerInfo{" + String.join(", ", parts) + "}";
        }

        public ServerInfo build() {
            org.zwiftj.api.model.ServerInfo result = new org.zwiftj.api.model.ServerInfo();
            result.__bitField0 = __bitField0;
            result.relayUrl = this.relayUrl;
            result.apis = this.apis;
            result.time = this.time;
            result.nodes = this.nodes;
            return result;
        }

    }



}