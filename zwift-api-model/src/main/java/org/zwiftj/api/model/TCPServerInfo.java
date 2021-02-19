package org.zwiftj.api.model;

@javax.annotation.Generated("tcp-node-msgs.proto")
public final class TCPServerInfo
        implements io.protostuff.Message<TCPServerInfo> {

    private static final TCPServerInfo DEFAULT_INSTANCE = newBuilder().build();

    private int f1;

    private int playerId;

    private int f3;

    private java.util.List<org.zwiftj.api.model.ServersType1> servers;

    private java.util.List<org.zwiftj.api.model.ServersType2> otherServers;

    private boolean __merge_lock = false;
    private int __bitField0;

    private TCPServerInfo() {
        this.f1 = 0;
        this.playerId = 0;
        this.f3 = 0;
        this.servers = java.util.Collections.emptyList();
        this.otherServers = java.util.Collections.emptyList();
    }

    private TCPServerInfo(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static TCPServerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<TCPServerInfo> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getF1() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public TCPServerInfo withF1(int value) {
        return TCPServerInfo.newBuilder()
            .mergeFrom(this)
            .setF1(value)
            .build();
    }

    public int getPlayerId() {
        return playerId;
    }

    public boolean hasPlayerId() {
        return (__bitField0 & 2) == 2;
    }

    public TCPServerInfo withPlayerId(int value) {
        return TCPServerInfo.newBuilder()
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

    public TCPServerInfo withF3(int value) {
        return TCPServerInfo.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.ServersType1> getServersList() {
        return servers;
    }

    public int getServersCount() {
        return servers.size();
    }

    public org.zwiftj.api.model.ServersType1 getServers(int index) {
        return servers.get(index);
    }

    public TCPServerInfo withServers(java.util.List<org.zwiftj.api.model.ServersType1> value) {
        return TCPServerInfo.newBuilder()
            .mergeFrom(this)
            .clearServers()
            .addAllServers(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.ServersType2> getOtherServersList() {
        return otherServers;
    }

    public int getOtherServersCount() {
        return otherServers.size();
    }

    public org.zwiftj.api.model.ServersType2 getOtherServers(int index) {
        return otherServers.get(index);
    }

    public TCPServerInfo withOtherServers(java.util.List<org.zwiftj.api.model.ServersType2> value) {
        return TCPServerInfo.newBuilder()
            .mergeFrom(this)
            .clearOtherServers()
            .addAllOtherServers(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<TCPServerInfo> cachedSchema() {
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
        TCPServerInfo that = (TCPServerInfo) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.servers, that.servers)) {
            return false;
        }
        if (!java.util.Objects.equals(this.otherServers, that.otherServers)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.f1);
        result = 31 * result + Integer.hashCode(this.playerId);
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + (this.servers == null ? 0 : this.servers.hashCode());
        result = 31 * result + (this.otherServers == null ? 0 : this.otherServers.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasF1()) {
            parts.add("f1=" + getF1());
        }
        if (hasPlayerId()) {
            parts.add("playerId=" + getPlayerId());
        }
        if (hasF3()) {
            parts.add("f3=" + getF3());
        }
        if (!servers.isEmpty()) {
            parts.add("servers=" + getServersList());
        }
        if (!otherServers.isEmpty()) {
            parts.add("otherServers=" + getOtherServersList());
        }
        return "TCPServerInfo{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<TCPServerInfo>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("playerId", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("servers", 24);
        	__fieldMap.put("otherServers", 25);
        }

        @Override
        public TCPServerInfo newMessage() {
            return new TCPServerInfo();
        }

        @Override
        public Class<TCPServerInfo> typeClass() {
            return TCPServerInfo.class;
        }

        @Override
        public String messageName() {
            return TCPServerInfo.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return TCPServerInfo.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(TCPServerInfo message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, TCPServerInfo instance) throws java.io.IOException {
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
                    	instance.playerId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.f3 = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 24:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.servers = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.servers.add(input.mergeObject(null, org.zwiftj.api.model.ServersType1.getSchema()));

                    	break;
                    case 25:
                    	if(!((instance.__bitField0 & 16) == 16)) {
                    	    instance.otherServers = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 16;
                    	}
                    	instance.otherServers.add(input.mergeObject(null, org.zwiftj.api.model.ServersType2.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 8) == 8) {
                instance.servers = java.util.Collections.unmodifiableList(instance.servers);
            }

            if((instance.__bitField0 & 16) == 16) {
                instance.otherServers = java.util.Collections.unmodifiableList(instance.otherServers);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, TCPServerInfo instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.playerId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.f3, false);
            }

            for(org.zwiftj.api.model.ServersType1 servers : instance.servers) {
                output.writeObject(24, servers, org.zwiftj.api.model.ServersType1.getSchema(), true);
            }

            for(org.zwiftj.api.model.ServersType2 otherServers : instance.otherServers) {
                output.writeObject(25, otherServers, org.zwiftj.api.model.ServersType2.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "playerId";
        		case 3: return "f3";
        		case 24: return "servers";
        		case 25: return "otherServers";
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

        private int playerId;

        private int f3;

        private java.util.List<org.zwiftj.api.model.ServersType1> servers;

        private java.util.List<org.zwiftj.api.model.ServersType2> otherServers;

        private int __bitField0;

        private Builder() {
            this.f1 = 0;
            this.playerId = 0;
            this.f3 = 0;
            this.servers = java.util.Collections.emptyList();
            this.otherServers = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(TCPServerInfo instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            this.addAllServers(instance.getServersList());

            this.addAllOtherServers(instance.getOtherServersList());

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

        public int getPlayerId() {
            return playerId;
        }

        public Builder setPlayerId(int value) {
            this.playerId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPlayerId() {
            this.playerId = 0;
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

        public java.util.List<org.zwiftj.api.model.ServersType1> getServersList() {
            return servers;
        }

        public Builder setServers(int index, org.zwiftj.api.model.ServersType1 value) {
            if (value == null) {
                throw new NullPointerException("Cannot set TCPServerInfo#servers to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.servers = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.servers.set(index, value);
            return this;
        }

        public Builder addServers(org.zwiftj.api.model.ServersType1 value) {
            if (value == null) {
                throw new NullPointerException("Cannot set TCPServerInfo#servers to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.servers = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.servers.add(value);
            return this;
        }

        public Builder addAllServers(java.lang.Iterable<org.zwiftj.api.model.ServersType1> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set TCPServerInfo#servers to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.servers = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final org.zwiftj.api.model.ServersType1 value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set TCPServerInfo#servers to null");
                }
                this.servers.add(value);
            }
            return this;
        }

        public Builder clearServers() {
            this.servers = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getServersCount() {
            return servers.size();
        }

        public org.zwiftj.api.model.ServersType1 getServers(int index) {
            return servers.get(index);
        }

        public java.util.List<org.zwiftj.api.model.ServersType2> getOtherServersList() {
            return otherServers;
        }

        public Builder setOtherServers(int index, org.zwiftj.api.model.ServersType2 value) {
            if (value == null) {
                throw new NullPointerException("Cannot set TCPServerInfo#otherServers to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.otherServers = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.otherServers.set(index, value);
            return this;
        }

        public Builder addOtherServers(org.zwiftj.api.model.ServersType2 value) {
            if (value == null) {
                throw new NullPointerException("Cannot set TCPServerInfo#otherServers to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.otherServers = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.otherServers.add(value);
            return this;
        }

        public Builder addAllOtherServers(java.lang.Iterable<org.zwiftj.api.model.ServersType2> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set TCPServerInfo#otherServers to null");
            }
            if(!((__bitField0 & 16) == 16)) {
                this.otherServers = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            for (final org.zwiftj.api.model.ServersType2 value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set TCPServerInfo#otherServers to null");
                }
                this.otherServers.add(value);
            }
            return this;
        }

        public Builder clearOtherServers() {
            this.otherServers = java.util.Collections.emptyList();
            __bitField0 &= ~16;
            return this;
        }

        public int getOtherServersCount() {
            return otherServers.size();
        }

        public org.zwiftj.api.model.ServersType2 getOtherServers(int index) {
            return otherServers.get(index);
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
            if (!java.util.Objects.equals(this.playerId, that.playerId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.servers, that.servers)) {
                return false;
            }
            if (!java.util.Objects.equals(this.otherServers, that.otherServers)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.f1);
            result = 31 * result + Integer.hashCode(this.playerId);
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + (this.servers == null ? 0 : this.servers.hashCode());
            result = 31 * result + (this.otherServers == null ? 0 : this.otherServers.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasF1()) {
                parts.add("f1=" + getF1());
            }
            if (hasPlayerId()) {
                parts.add("playerId=" + getPlayerId());
            }
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (!servers.isEmpty()) {
                parts.add("servers=" + getServersList());
            }
            if (!otherServers.isEmpty()) {
                parts.add("otherServers=" + getOtherServersList());
            }
            return "TCPServerInfo{" + String.join(", ", parts) + "}";
        }

        public TCPServerInfo build() {
            org.zwiftj.api.model.TCPServerInfo result = new org.zwiftj.api.model.TCPServerInfo();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.playerId = this.playerId;
            result.f3 = this.f3;
            result.servers = java.util.Collections.unmodifiableList(this.servers);
            result.otherServers = java.util.Collections.unmodifiableList(this.otherServers);
            return result;
        }

    }



}