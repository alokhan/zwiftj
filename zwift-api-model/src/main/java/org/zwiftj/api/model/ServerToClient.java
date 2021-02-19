package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class ServerToClient
        implements io.protostuff.Message<ServerToClient> {

    private static final ServerToClient DEFAULT_INSTANCE = newBuilder().build();

    private int f1;

    private int playerId;

    private long worldTime;

    private int seqno;

    private int f5;

    private java.util.List<org.zwiftj.api.model.PlayerState> states;

    private java.util.List<org.zwiftj.api.model.PlayerUpdate> updates;

    private long f11;

    private int numMsgs;

    private int msgnum;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ServerToClient() {
        this.f1 = 0;
        this.playerId = 0;
        this.worldTime = 0L;
        this.seqno = 0;
        this.f5 = 0;
        this.states = java.util.Collections.emptyList();
        this.updates = java.util.Collections.emptyList();
        this.f11 = 0L;
        this.numMsgs = 0;
        this.msgnum = 0;
    }

    private ServerToClient(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ServerToClient getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ServerToClient> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getF1() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public ServerToClient withF1(int value) {
        return ServerToClient.newBuilder()
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

    public ServerToClient withPlayerId(int value) {
        return ServerToClient.newBuilder()
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

    public ServerToClient withWorldTime(long value) {
        return ServerToClient.newBuilder()
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

    public ServerToClient withSeqno(int value) {
        return ServerToClient.newBuilder()
            .mergeFrom(this)
            .setSeqno(value)
            .build();
    }

    public int getF5() {
        return f5;
    }

    public boolean hasF5() {
        return (__bitField0 & 16) == 16;
    }

    public ServerToClient withF5(int value) {
        return ServerToClient.newBuilder()
            .mergeFrom(this)
            .setF5(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.PlayerState> getStatesList() {
        return states;
    }

    public int getStatesCount() {
        return states.size();
    }

    public org.zwiftj.api.model.PlayerState getStates(int index) {
        return states.get(index);
    }

    public ServerToClient withStates(java.util.List<org.zwiftj.api.model.PlayerState> value) {
        return ServerToClient.newBuilder()
            .mergeFrom(this)
            .clearStates()
            .addAllStates(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.PlayerUpdate> getUpdatesList() {
        return updates;
    }

    public int getUpdatesCount() {
        return updates.size();
    }

    public org.zwiftj.api.model.PlayerUpdate getUpdates(int index) {
        return updates.get(index);
    }

    public ServerToClient withUpdates(java.util.List<org.zwiftj.api.model.PlayerUpdate> value) {
        return ServerToClient.newBuilder()
            .mergeFrom(this)
            .clearUpdates()
            .addAllUpdates(value)
            .build();
    }

    public long getF11() {
        return f11;
    }

    public boolean hasF11() {
        return (__bitField0 & 128) == 128;
    }

    public ServerToClient withF11(long value) {
        return ServerToClient.newBuilder()
            .mergeFrom(this)
            .setF11(value)
            .build();
    }

    public int getNumMsgs() {
        return numMsgs;
    }

    public boolean hasNumMsgs() {
        return (__bitField0 & 256) == 256;
    }

    public ServerToClient withNumMsgs(int value) {
        return ServerToClient.newBuilder()
            .mergeFrom(this)
            .setNumMsgs(value)
            .build();
    }

    public int getMsgnum() {
        return msgnum;
    }

    public boolean hasMsgnum() {
        return (__bitField0 & 512) == 512;
    }

    public ServerToClient withMsgnum(int value) {
        return ServerToClient.newBuilder()
            .mergeFrom(this)
            .setMsgnum(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ServerToClient> cachedSchema() {
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
        ServerToClient that = (ServerToClient) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
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
        if (!java.util.Objects.equals(this.f5, that.f5)) {
            return false;
        }
        if (!java.util.Objects.equals(this.states, that.states)) {
            return false;
        }
        if (!java.util.Objects.equals(this.updates, that.updates)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f11, that.f11)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numMsgs, that.numMsgs)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgnum, that.msgnum)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.f1);
        result = 31 * result + Integer.hashCode(this.playerId);
        result = 31 * result + Long.hashCode(this.worldTime);
        result = 31 * result + Integer.hashCode(this.seqno);
        result = 31 * result + Integer.hashCode(this.f5);
        result = 31 * result + (this.states == null ? 0 : this.states.hashCode());
        result = 31 * result + (this.updates == null ? 0 : this.updates.hashCode());
        result = 31 * result + Long.hashCode(this.f11);
        result = 31 * result + Integer.hashCode(this.numMsgs);
        result = 31 * result + Integer.hashCode(this.msgnum);

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
        if (hasWorldTime()) {
            parts.add("worldTime=" + getWorldTime());
        }
        if (hasSeqno()) {
            parts.add("seqno=" + getSeqno());
        }
        if (hasF5()) {
            parts.add("f5=" + getF5());
        }
        if (!states.isEmpty()) {
            parts.add("states=" + getStatesList());
        }
        if (!updates.isEmpty()) {
            parts.add("updates=" + getUpdatesList());
        }
        if (hasF11()) {
            parts.add("f11=" + getF11());
        }
        if (hasNumMsgs()) {
            parts.add("numMsgs=" + getNumMsgs());
        }
        if (hasMsgnum()) {
            parts.add("msgnum=" + getMsgnum());
        }
        return "ServerToClient{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ServerToClient>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("playerId", 2);
        	__fieldMap.put("worldTime", 3);
        	__fieldMap.put("seqno", 4);
        	__fieldMap.put("f5", 5);
        	__fieldMap.put("states", 8);
        	__fieldMap.put("updates", 9);
        	__fieldMap.put("f11", 11);
        	__fieldMap.put("numMsgs", 18);
        	__fieldMap.put("msgnum", 19);
        }

        @Override
        public ServerToClient newMessage() {
            return new ServerToClient();
        }

        @Override
        public Class<ServerToClient> typeClass() {
            return ServerToClient.class;
        }

        @Override
        public String messageName() {
            return ServerToClient.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ServerToClient.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ServerToClient message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ServerToClient instance) throws java.io.IOException {
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
                    	instance.worldTime = input.readInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.seqno = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.f5 = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 8:
                    	if(!((instance.__bitField0 & 32) == 32)) {
                    	    instance.states = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 32;
                    	}
                    	instance.states.add(input.mergeObject(null, org.zwiftj.api.model.PlayerState.getSchema()));

                    	break;
                    case 9:
                    	if(!((instance.__bitField0 & 64) == 64)) {
                    	    instance.updates = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 64;
                    	}
                    	instance.updates.add(input.mergeObject(null, org.zwiftj.api.model.PlayerUpdate.getSchema()));

                    	break;
                    case 11:
                    	instance.f11 = input.readInt64();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 18:
                    	instance.numMsgs = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 19:
                    	instance.msgnum = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 32) == 32) {
                instance.states = java.util.Collections.unmodifiableList(instance.states);
            }

            if((instance.__bitField0 & 64) == 64) {
                instance.updates = java.util.Collections.unmodifiableList(instance.updates);
            }




        }

        @Override
        public void writeTo(io.protostuff.Output output, ServerToClient instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.f1, false);
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
                output.writeInt32(5, instance.f5, false);
            }

            for(org.zwiftj.api.model.PlayerState states : instance.states) {
                output.writeObject(8, states, org.zwiftj.api.model.PlayerState.getSchema(), true);
            }

            for(org.zwiftj.api.model.PlayerUpdate updates : instance.updates) {
                output.writeObject(9, updates, org.zwiftj.api.model.PlayerUpdate.getSchema(), true);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt64(11, instance.f11, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(18, instance.numMsgs, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(19, instance.msgnum, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "playerId";
        		case 3: return "worldTime";
        		case 4: return "seqno";
        		case 5: return "f5";
        		case 8: return "states";
        		case 9: return "updates";
        		case 11: return "f11";
        		case 18: return "numMsgs";
        		case 19: return "msgnum";
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

        private long worldTime;

        private int seqno;

        private int f5;

        private java.util.List<org.zwiftj.api.model.PlayerState> states;

        private java.util.List<org.zwiftj.api.model.PlayerUpdate> updates;

        private long f11;

        private int numMsgs;

        private int msgnum;

        private int __bitField0;

        private Builder() {
            this.f1 = 0;
            this.playerId = 0;
            this.worldTime = 0L;
            this.seqno = 0;
            this.f5 = 0;
            this.states = java.util.Collections.emptyList();
            this.updates = java.util.Collections.emptyList();
            this.f11 = 0L;
            this.numMsgs = 0;
            this.msgnum = 0;
        }

        public Builder mergeFrom(ServerToClient instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
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

            if (instance.hasF5()) {
                this.setF5(instance.getF5());
            }

            this.addAllStates(instance.getStatesList());

            this.addAllUpdates(instance.getUpdatesList());

            if (instance.hasF11()) {
                this.setF11(instance.getF11());
            }

            if (instance.hasNumMsgs()) {
                this.setNumMsgs(instance.getNumMsgs());
            }

            if (instance.hasMsgnum()) {
                this.setMsgnum(instance.getMsgnum());
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

        public java.util.List<org.zwiftj.api.model.PlayerState> getStatesList() {
            return states;
        }

        public Builder setStates(int index, org.zwiftj.api.model.PlayerState value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerToClient#states to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.states = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.states.set(index, value);
            return this;
        }

        public Builder addStates(org.zwiftj.api.model.PlayerState value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerToClient#states to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.states = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.states.add(value);
            return this;
        }

        public Builder addAllStates(java.lang.Iterable<org.zwiftj.api.model.PlayerState> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ServerToClient#states to null");
            }
            if(!((__bitField0 & 32) == 32)) {
                this.states = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            for (final org.zwiftj.api.model.PlayerState value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ServerToClient#states to null");
                }
                this.states.add(value);
            }
            return this;
        }

        public Builder clearStates() {
            this.states = java.util.Collections.emptyList();
            __bitField0 &= ~32;
            return this;
        }

        public int getStatesCount() {
            return states.size();
        }

        public org.zwiftj.api.model.PlayerState getStates(int index) {
            return states.get(index);
        }

        public java.util.List<org.zwiftj.api.model.PlayerUpdate> getUpdatesList() {
            return updates;
        }

        public Builder setUpdates(int index, org.zwiftj.api.model.PlayerUpdate value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerToClient#updates to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.updates = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.updates.set(index, value);
            return this;
        }

        public Builder addUpdates(org.zwiftj.api.model.PlayerUpdate value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerToClient#updates to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.updates = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.updates.add(value);
            return this;
        }

        public Builder addAllUpdates(java.lang.Iterable<org.zwiftj.api.model.PlayerUpdate> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ServerToClient#updates to null");
            }
            if(!((__bitField0 & 64) == 64)) {
                this.updates = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            for (final org.zwiftj.api.model.PlayerUpdate value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ServerToClient#updates to null");
                }
                this.updates.add(value);
            }
            return this;
        }

        public Builder clearUpdates() {
            this.updates = java.util.Collections.emptyList();
            __bitField0 &= ~64;
            return this;
        }

        public int getUpdatesCount() {
            return updates.size();
        }

        public org.zwiftj.api.model.PlayerUpdate getUpdates(int index) {
            return updates.get(index);
        }

        public long getF11() {
            return f11;
        }

        public Builder setF11(long value) {
            this.f11 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearF11() {
            this.f11 = 0L;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasF11() {
            return (__bitField0 & 128) == 128;
        }

        public int getNumMsgs() {
            return numMsgs;
        }

        public Builder setNumMsgs(int value) {
            this.numMsgs = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearNumMsgs() {
            this.numMsgs = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasNumMsgs() {
            return (__bitField0 & 256) == 256;
        }

        public int getMsgnum() {
            return msgnum;
        }

        public Builder setMsgnum(int value) {
            this.msgnum = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearMsgnum() {
            this.msgnum = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasMsgnum() {
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
            if (!java.util.Objects.equals(this.f1, that.f1)) {
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
            if (!java.util.Objects.equals(this.f5, that.f5)) {
                return false;
            }
            if (!java.util.Objects.equals(this.states, that.states)) {
                return false;
            }
            if (!java.util.Objects.equals(this.updates, that.updates)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f11, that.f11)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numMsgs, that.numMsgs)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgnum, that.msgnum)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.f1);
            result = 31 * result + Integer.hashCode(this.playerId);
            result = 31 * result + Long.hashCode(this.worldTime);
            result = 31 * result + Integer.hashCode(this.seqno);
            result = 31 * result + Integer.hashCode(this.f5);
            result = 31 * result + (this.states == null ? 0 : this.states.hashCode());
            result = 31 * result + (this.updates == null ? 0 : this.updates.hashCode());
            result = 31 * result + Long.hashCode(this.f11);
            result = 31 * result + Integer.hashCode(this.numMsgs);
            result = 31 * result + Integer.hashCode(this.msgnum);

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
            if (hasWorldTime()) {
                parts.add("worldTime=" + getWorldTime());
            }
            if (hasSeqno()) {
                parts.add("seqno=" + getSeqno());
            }
            if (hasF5()) {
                parts.add("f5=" + getF5());
            }
            if (!states.isEmpty()) {
                parts.add("states=" + getStatesList());
            }
            if (!updates.isEmpty()) {
                parts.add("updates=" + getUpdatesList());
            }
            if (hasF11()) {
                parts.add("f11=" + getF11());
            }
            if (hasNumMsgs()) {
                parts.add("numMsgs=" + getNumMsgs());
            }
            if (hasMsgnum()) {
                parts.add("msgnum=" + getMsgnum());
            }
            return "ServerToClient{" + String.join(", ", parts) + "}";
        }

        public ServerToClient build() {
            org.zwiftj.api.model.ServerToClient result = new org.zwiftj.api.model.ServerToClient();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.playerId = this.playerId;
            result.worldTime = this.worldTime;
            result.seqno = this.seqno;
            result.f5 = this.f5;
            result.states = java.util.Collections.unmodifiableList(this.states);
            result.updates = java.util.Collections.unmodifiableList(this.updates);
            result.f11 = this.f11;
            result.numMsgs = this.numMsgs;
            result.msgnum = this.msgnum;
            return result;
        }

    }



}