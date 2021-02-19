package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class ClientToServer
        implements io.protostuff.Message<ClientToServer> {

    private static final ClientToServer DEFAULT_INSTANCE = newBuilder().build();

    private int connected;

    private int playerId;

    private long worldTime;

    private int seqno;

    private org.zwiftj.api.model.PlayerState state;

    private long f8;

    private long f9;

    private long lastUpdate;

    private long f11;

    private long lastPlayerUpdate;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClientToServer() {
        this.connected = 0;
        this.playerId = 0;
        this.worldTime = 0L;
        this.seqno = 0;
        this.state = org.zwiftj.api.model.PlayerState.getDefaultInstance();
        this.f8 = 0L;
        this.f9 = 0L;
        this.lastUpdate = 0L;
        this.f11 = 0L;
        this.lastPlayerUpdate = 0L;
    }

    private ClientToServer(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClientToServer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClientToServer> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getConnected() {
        return connected;
    }

    public boolean hasConnected() {
        return (__bitField0 & 1) == 1;
    }

    public ClientToServer withConnected(int value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setConnected(value)
            .build();
    }

    public int getPlayerId() {
        return playerId;
    }

    public boolean hasPlayerId() {
        return (__bitField0 & 2) == 2;
    }

    public ClientToServer withPlayerId(int value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setPlayerId(value)
            .build();
    }

    public long getWorldTime() {
        return worldTime;
    }

    public boolean hasWorldTime() {
        return (__bitField0 & 4) == 4;
    }

    public ClientToServer withWorldTime(long value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setWorldTime(value)
            .build();
    }

    public int getSeqno() {
        return seqno;
    }

    public boolean hasSeqno() {
        return (__bitField0 & 8) == 8;
    }

    public ClientToServer withSeqno(int value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setSeqno(value)
            .build();
    }

    public org.zwiftj.api.model.PlayerState getState() {
        return state;
    }

    public boolean hasState() {
        return (__bitField0 & 16) == 16;
    }

    public ClientToServer withState(org.zwiftj.api.model.PlayerState value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setState(value)
            .build();
    }

    public long getF8() {
        return f8;
    }

    public boolean hasF8() {
        return (__bitField0 & 32) == 32;
    }

    public ClientToServer withF8(long value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setF8(value)
            .build();
    }

    public long getF9() {
        return f9;
    }

    public boolean hasF9() {
        return (__bitField0 & 64) == 64;
    }

    public ClientToServer withF9(long value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setF9(value)
            .build();
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public boolean hasLastUpdate() {
        return (__bitField0 & 128) == 128;
    }

    public ClientToServer withLastUpdate(long value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setLastUpdate(value)
            .build();
    }

    public long getF11() {
        return f11;
    }

    public boolean hasF11() {
        return (__bitField0 & 256) == 256;
    }

    public ClientToServer withF11(long value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setF11(value)
            .build();
    }

    public long getLastPlayerUpdate() {
        return lastPlayerUpdate;
    }

    public boolean hasLastPlayerUpdate() {
        return (__bitField0 & 512) == 512;
    }

    public ClientToServer withLastPlayerUpdate(long value) {
        return ClientToServer.newBuilder()
            .mergeFrom(this)
            .setLastPlayerUpdate(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClientToServer> cachedSchema() {
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
        ClientToServer that = (ClientToServer) obj;
        if (!java.util.Objects.equals(this.connected, that.connected)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.seqno, that.seqno)) {
            return false;
        }
        if (!java.util.Objects.equals(this.state, that.state)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f8, that.f8)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f9, that.f9)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lastUpdate, that.lastUpdate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f11, that.f11)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lastPlayerUpdate, that.lastPlayerUpdate)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.connected);
        result = 31 * result + Integer.hashCode(this.playerId);
        result = 31 * result + Long.hashCode(this.worldTime);
        result = 31 * result + Integer.hashCode(this.seqno);
        result = 31 * result + (this.state == null ? 0 : this.state.hashCode());
        result = 31 * result + Long.hashCode(this.f8);
        result = 31 * result + Long.hashCode(this.f9);
        result = 31 * result + Long.hashCode(this.lastUpdate);
        result = 31 * result + Long.hashCode(this.f11);
        result = 31 * result + Long.hashCode(this.lastPlayerUpdate);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasConnected()) {
            parts.add("connected=" + getConnected());
        }
        if (hasPlayerId()) {
            parts.add("playerId=" + getPlayerId());
        }
        if (hasWorldTime()) {
            parts.add("worldTime=" + getWorldTime());
        }
        if (hasSeqno()) {
            parts.add("seqno=" + getSeqno());
        }
        if (hasState()) {
            parts.add("state=" + getState());
        }
        if (hasF8()) {
            parts.add("f8=" + getF8());
        }
        if (hasF9()) {
            parts.add("f9=" + getF9());
        }
        if (hasLastUpdate()) {
            parts.add("lastUpdate=" + getLastUpdate());
        }
        if (hasF11()) {
            parts.add("f11=" + getF11());
        }
        if (hasLastPlayerUpdate()) {
            parts.add("lastPlayerUpdate=" + getLastPlayerUpdate());
        }
        return "ClientToServer{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClientToServer>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("connected", 1);
        	__fieldMap.put("playerId", 2);
        	__fieldMap.put("worldTime", 3);
        	__fieldMap.put("seqno", 4);
        	__fieldMap.put("state", 7);
        	__fieldMap.put("f8", 8);
        	__fieldMap.put("f9", 9);
        	__fieldMap.put("lastUpdate", 10);
        	__fieldMap.put("f11", 11);
        	__fieldMap.put("lastPlayerUpdate", 12);
        }

        @Override
        public ClientToServer newMessage() {
            return new ClientToServer();
        }

        @Override
        public Class<ClientToServer> typeClass() {
            return ClientToServer.class;
        }

        @Override
        public String messageName() {
            return ClientToServer.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClientToServer.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClientToServer message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClientToServer instance) throws java.io.IOException {
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
                    	instance.connected = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.playerId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.worldTime = input.readInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.seqno = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 7:
                    	instance.state = input.mergeObject(null, org.zwiftj.api.model.PlayerState.getSchema());
                    	instance.__bitField0 |= 16;
                    	break;
                    case 8:
                    	instance.f8 = input.readInt64();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 9:
                    	instance.f9 = input.readInt64();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 10:
                    	instance.lastUpdate = input.readInt64();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 11:
                    	instance.f11 = input.readInt64();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 12:
                    	instance.lastPlayerUpdate = input.readInt64();
                    	instance.__bitField0 |= 512;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ClientToServer instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.connected, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.playerId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt64(3, instance.worldTime, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.seqno, false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeObject(7, instance.state, org.zwiftj.api.model.PlayerState.getSchema(), false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt64(8, instance.f8, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt64(9, instance.f9, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt64(10, instance.lastUpdate, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt64(11, instance.f11, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt64(12, instance.lastPlayerUpdate, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "connected";
        		case 2: return "playerId";
        		case 3: return "worldTime";
        		case 4: return "seqno";
        		case 7: return "state";
        		case 8: return "f8";
        		case 9: return "f9";
        		case 10: return "lastUpdate";
        		case 11: return "f11";
        		case 12: return "lastPlayerUpdate";
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

        private int connected;

        private int playerId;

        private long worldTime;

        private int seqno;

        private org.zwiftj.api.model.PlayerState state;

        private long f8;

        private long f9;

        private long lastUpdate;

        private long f11;

        private long lastPlayerUpdate;

        private int __bitField0;

        private Builder() {
            this.connected = 0;
            this.playerId = 0;
            this.worldTime = 0L;
            this.seqno = 0;
            this.state = org.zwiftj.api.model.PlayerState.getDefaultInstance();
            this.f8 = 0L;
            this.f9 = 0L;
            this.lastUpdate = 0L;
            this.f11 = 0L;
            this.lastPlayerUpdate = 0L;
        }

        public Builder mergeFrom(ClientToServer instance) {
            if (instance.hasConnected()) {
                this.setConnected(instance.getConnected());
            }

            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

            if (instance.hasWorldTime()) {
                this.setWorldTime(instance.getWorldTime());
            }

            if (instance.hasSeqno()) {
                this.setSeqno(instance.getSeqno());
            }

            if (instance.hasState()) {
                this.setState(instance.getState());
            }

            if (instance.hasF8()) {
                this.setF8(instance.getF8());
            }

            if (instance.hasF9()) {
                this.setF9(instance.getF9());
            }

            if (instance.hasLastUpdate()) {
                this.setLastUpdate(instance.getLastUpdate());
            }

            if (instance.hasF11()) {
                this.setF11(instance.getF11());
            }

            if (instance.hasLastPlayerUpdate()) {
                this.setLastPlayerUpdate(instance.getLastPlayerUpdate());
            }

            return this;
        }

        public int getConnected() {
            return connected;
        }

        public Builder setConnected(int value) {
            this.connected = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearConnected() {
            this.connected = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasConnected() {
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

        public long getWorldTime() {
            return worldTime;
        }

        public Builder setWorldTime(long value) {
            this.worldTime = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearWorldTime() {
            this.worldTime = 0L;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasWorldTime() {
            return (__bitField0 & 4) == 4;
        }

        public int getSeqno() {
            return seqno;
        }

        public Builder setSeqno(int value) {
            this.seqno = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearSeqno() {
            this.seqno = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasSeqno() {
            return (__bitField0 & 8) == 8;
        }

        public org.zwiftj.api.model.PlayerState getState() {
            return state;
        }

        public Builder setState(org.zwiftj.api.model.PlayerState value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClientToServer#state to null");
            }

            this.state = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearState() {
            this.state = org.zwiftj.api.model.PlayerState.getDefaultInstance();
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasState() {
            return (__bitField0 & 16) == 16;
        }

        public long getF8() {
            return f8;
        }

        public Builder setF8(long value) {
            this.f8 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearF8() {
            this.f8 = 0L;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasF8() {
            return (__bitField0 & 32) == 32;
        }

        public long getF9() {
            return f9;
        }

        public Builder setF9(long value) {
            this.f9 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearF9() {
            this.f9 = 0L;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasF9() {
            return (__bitField0 & 64) == 64;
        }

        public long getLastUpdate() {
            return lastUpdate;
        }

        public Builder setLastUpdate(long value) {
            this.lastUpdate = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearLastUpdate() {
            this.lastUpdate = 0L;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasLastUpdate() {
            return (__bitField0 & 128) == 128;
        }

        public long getF11() {
            return f11;
        }

        public Builder setF11(long value) {
            this.f11 = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearF11() {
            this.f11 = 0L;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasF11() {
            return (__bitField0 & 256) == 256;
        }

        public long getLastPlayerUpdate() {
            return lastPlayerUpdate;
        }

        public Builder setLastPlayerUpdate(long value) {
            this.lastPlayerUpdate = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearLastPlayerUpdate() {
            this.lastPlayerUpdate = 0L;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasLastPlayerUpdate() {
            return (__bitField0 & 512) == 512;
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
            if (!java.util.Objects.equals(this.connected, that.connected)) {
                return false;
            }
            if (!java.util.Objects.equals(this.playerId, that.playerId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.seqno, that.seqno)) {
                return false;
            }
            if (!java.util.Objects.equals(this.state, that.state)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f8, that.f8)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f9, that.f9)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lastUpdate, that.lastUpdate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f11, that.f11)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lastPlayerUpdate, that.lastPlayerUpdate)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.connected);
            result = 31 * result + Integer.hashCode(this.playerId);
            result = 31 * result + Long.hashCode(this.worldTime);
            result = 31 * result + Integer.hashCode(this.seqno);
            result = 31 * result + (this.state == null ? 0 : this.state.hashCode());
            result = 31 * result + Long.hashCode(this.f8);
            result = 31 * result + Long.hashCode(this.f9);
            result = 31 * result + Long.hashCode(this.lastUpdate);
            result = 31 * result + Long.hashCode(this.f11);
            result = 31 * result + Long.hashCode(this.lastPlayerUpdate);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasConnected()) {
                parts.add("connected=" + getConnected());
            }
            if (hasPlayerId()) {
                parts.add("playerId=" + getPlayerId());
            }
            if (hasWorldTime()) {
                parts.add("worldTime=" + getWorldTime());
            }
            if (hasSeqno()) {
                parts.add("seqno=" + getSeqno());
            }
            if (hasState()) {
                parts.add("state=" + getState());
            }
            if (hasF8()) {
                parts.add("f8=" + getF8());
            }
            if (hasF9()) {
                parts.add("f9=" + getF9());
            }
            if (hasLastUpdate()) {
                parts.add("lastUpdate=" + getLastUpdate());
            }
            if (hasF11()) {
                parts.add("f11=" + getF11());
            }
            if (hasLastPlayerUpdate()) {
                parts.add("lastPlayerUpdate=" + getLastPlayerUpdate());
            }
            return "ClientToServer{" + String.join(", ", parts) + "}";
        }

        public ClientToServer build() {
            org.zwiftj.api.model.ClientToServer result = new org.zwiftj.api.model.ClientToServer();
            result.__bitField0 = __bitField0;
            result.connected = this.connected;
            result.playerId = this.playerId;
            result.worldTime = this.worldTime;
            result.seqno = this.seqno;
            result.state = this.state;
            result.f8 = this.f8;
            result.f9 = this.f9;
            result.lastUpdate = this.lastUpdate;
            result.f11 = this.f11;
            result.lastPlayerUpdate = this.lastPlayerUpdate;
            return result;
        }

    }



}