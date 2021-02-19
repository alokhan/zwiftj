package org.zwiftj.api.model;

@javax.annotation.Generated("world.proto")
public final class World
        implements io.protostuff.Message<World> {

    private static final World DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private String name;

    private int f3;

    private long f5;

    private long worldTime;

    private long realTime;

    private java.util.List<org.zwiftj.api.model.Player> playerStates;

    private java.util.List<org.zwiftj.api.model.Player> pacePartnerStates;

    private boolean __merge_lock = false;
    private int __bitField0;

    private World() {
        this.id = 0;
        this.name = "";
        this.f3 = 0;
        this.f5 = 0L;
        this.worldTime = 0L;
        this.realTime = 0L;
        this.playerStates = java.util.Collections.emptyList();
        this.pacePartnerStates = java.util.Collections.emptyList();
    }

    private World(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static World getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<World> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public World withId(int value) {
        return World.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        return (__bitField0 & 2) == 2;
    }

    public World withName(String value) {
        return World.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public int getF3() {
        return f3;
    }

    public boolean hasF3() {
        return (__bitField0 & 4) == 4;
    }

    public World withF3(int value) {
        return World.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public long getF5() {
        return f5;
    }

    public boolean hasF5() {
        return (__bitField0 & 8) == 8;
    }

    public World withF5(long value) {
        return World.newBuilder()
            .mergeFrom(this)
            .setF5(value)
            .build();
    }

    public long getWorldTime() {
        return worldTime;
    }

    public boolean hasWorldTime() {
        return (__bitField0 & 16) == 16;
    }

    public World withWorldTime(long value) {
        return World.newBuilder()
            .mergeFrom(this)
            .setWorldTime(value)
            .build();
    }

    public long getRealTime() {
        return realTime;
    }

    public boolean hasRealTime() {
        return (__bitField0 & 32) == 32;
    }

    public World withRealTime(long value) {
        return World.newBuilder()
            .mergeFrom(this)
            .setRealTime(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.Player> getPlayerStatesList() {
        return playerStates;
    }

    public int getPlayerStatesCount() {
        return playerStates.size();
    }

    public org.zwiftj.api.model.Player getPlayerStates(int index) {
        return playerStates.get(index);
    }

    public World withPlayerStates(java.util.List<org.zwiftj.api.model.Player> value) {
        return World.newBuilder()
            .mergeFrom(this)
            .clearPlayerStates()
            .addAllPlayerStates(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.Player> getPacePartnerStatesList() {
        return pacePartnerStates;
    }

    public int getPacePartnerStatesCount() {
        return pacePartnerStates.size();
    }

    public org.zwiftj.api.model.Player getPacePartnerStates(int index) {
        return pacePartnerStates.get(index);
    }

    public World withPacePartnerStates(java.util.List<org.zwiftj.api.model.Player> value) {
        return World.newBuilder()
            .mergeFrom(this)
            .clearPacePartnerStates()
            .addAllPacePartnerStates(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<World> cachedSchema() {
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
        World that = (World) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f5, that.f5)) {
            return false;
        }
        if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.realTime, that.realTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerStates, that.playerStates)) {
            return false;
        }
        if (!java.util.Objects.equals(this.pacePartnerStates, that.pacePartnerStates)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + Long.hashCode(this.f5);
        result = 31 * result + Long.hashCode(this.worldTime);
        result = 31 * result + Long.hashCode(this.realTime);
        result = 31 * result + (this.playerStates == null ? 0 : this.playerStates.hashCode());
        result = 31 * result + (this.pacePartnerStates == null ? 0 : this.pacePartnerStates.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasName()) {
            parts.add("name=" + getName());
        }
        if (hasF3()) {
            parts.add("f3=" + getF3());
        }
        if (hasF5()) {
            parts.add("f5=" + getF5());
        }
        if (hasWorldTime()) {
            parts.add("worldTime=" + getWorldTime());
        }
        if (hasRealTime()) {
            parts.add("realTime=" + getRealTime());
        }
        if (!playerStates.isEmpty()) {
            parts.add("playerStates=" + getPlayerStatesList());
        }
        if (!pacePartnerStates.isEmpty()) {
            parts.add("pacePartnerStates=" + getPacePartnerStatesList());
        }
        return "World{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<World>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("name", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("f5", 5);
        	__fieldMap.put("worldTime", 6);
        	__fieldMap.put("realTime", 7);
        	__fieldMap.put("playerStates", 8);
        	__fieldMap.put("pacePartnerStates", 12);
        }

        @Override
        public World newMessage() {
            return new World();
        }

        @Override
        public Class<World> typeClass() {
            return World.class;
        }

        @Override
        public String messageName() {
            return World.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return World.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(World message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, World instance) throws java.io.IOException {
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
                    	instance.id = input.readUInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.name = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.f3 = input.readUInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 5:
                    	instance.f5 = input.readUInt64();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 6:
                    	instance.worldTime = input.readUInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 7:
                    	instance.realTime = input.readUInt64();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 8:
                    	if(!((instance.__bitField0 & 64) == 64)) {
                    	    instance.playerStates = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 64;
                    	}
                    	instance.playerStates.add(input.mergeObject(null, org.zwiftj.api.model.Player.getSchema()));

                    	break;
                    case 12:
                    	if(!((instance.__bitField0 & 128) == 128)) {
                    	    instance.pacePartnerStates = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 128;
                    	}
                    	instance.pacePartnerStates.add(input.mergeObject(null, org.zwiftj.api.model.Player.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 64) == 64) {
                instance.playerStates = java.util.Collections.unmodifiableList(instance.playerStates);
            }

            if((instance.__bitField0 & 128) == 128) {
                instance.pacePartnerStates = java.util.Collections.unmodifiableList(instance.pacePartnerStates);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, World instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.name, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeUInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeUInt64(5, instance.f5, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeUInt64(6, instance.worldTime, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeUInt64(7, instance.realTime, false);
            }

            for(org.zwiftj.api.model.Player playerStates : instance.playerStates) {
                output.writeObject(8, playerStates, org.zwiftj.api.model.Player.getSchema(), true);
            }

            for(org.zwiftj.api.model.Player pacePartnerStates : instance.pacePartnerStates) {
                output.writeObject(12, pacePartnerStates, org.zwiftj.api.model.Player.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "name";
        		case 3: return "f3";
        		case 5: return "f5";
        		case 6: return "worldTime";
        		case 7: return "realTime";
        		case 8: return "playerStates";
        		case 12: return "pacePartnerStates";
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

        private int id;

        private String name;

        private int f3;

        private long f5;

        private long worldTime;

        private long realTime;

        private java.util.List<org.zwiftj.api.model.Player> playerStates;

        private java.util.List<org.zwiftj.api.model.Player> pacePartnerStates;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.name = "";
            this.f3 = 0;
            this.f5 = 0L;
            this.worldTime = 0L;
            this.realTime = 0L;
            this.playerStates = java.util.Collections.emptyList();
            this.pacePartnerStates = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(World instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasF5()) {
                this.setF5(instance.getF5());
            }

            if (instance.hasWorldTime()) {
                this.setWorldTime(instance.getWorldTime());
            }

            if (instance.hasRealTime()) {
                this.setRealTime(instance.getRealTime());
            }

            this.addAllPlayerStates(instance.getPlayerStatesList());

            this.addAllPacePartnerStates(instance.getPacePartnerStatesList());

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set World#name to null");
            }

            this.name = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearName() {
            this.name = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasName() {
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

        public long getF5() {
            return f5;
        }

        public Builder setF5(long value) {
            this.f5 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearF5() {
            this.f5 = 0L;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasF5() {
            return (__bitField0 & 8) == 8;
        }

        public long getWorldTime() {
            return worldTime;
        }

        public Builder setWorldTime(long value) {
            this.worldTime = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearWorldTime() {
            this.worldTime = 0L;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasWorldTime() {
            return (__bitField0 & 16) == 16;
        }

        public long getRealTime() {
            return realTime;
        }

        public Builder setRealTime(long value) {
            this.realTime = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearRealTime() {
            this.realTime = 0L;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasRealTime() {
            return (__bitField0 & 32) == 32;
        }

        public java.util.List<org.zwiftj.api.model.Player> getPlayerStatesList() {
            return playerStates;
        }

        public Builder setPlayerStates(int index, org.zwiftj.api.model.Player value) {
            if (value == null) {
                throw new NullPointerException("Cannot set World#playerStates to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.playerStates = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.playerStates.set(index, value);
            return this;
        }

        public Builder addPlayerStates(org.zwiftj.api.model.Player value) {
            if (value == null) {
                throw new NullPointerException("Cannot set World#playerStates to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.playerStates = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.playerStates.add(value);
            return this;
        }

        public Builder addAllPlayerStates(java.lang.Iterable<org.zwiftj.api.model.Player> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set World#playerStates to null");
            }
            if(!((__bitField0 & 64) == 64)) {
                this.playerStates = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            for (final org.zwiftj.api.model.Player value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set World#playerStates to null");
                }
                this.playerStates.add(value);
            }
            return this;
        }

        public Builder clearPlayerStates() {
            this.playerStates = java.util.Collections.emptyList();
            __bitField0 &= ~64;
            return this;
        }

        public int getPlayerStatesCount() {
            return playerStates.size();
        }

        public org.zwiftj.api.model.Player getPlayerStates(int index) {
            return playerStates.get(index);
        }

        public java.util.List<org.zwiftj.api.model.Player> getPacePartnerStatesList() {
            return pacePartnerStates;
        }

        public Builder setPacePartnerStates(int index, org.zwiftj.api.model.Player value) {
            if (value == null) {
                throw new NullPointerException("Cannot set World#pacePartnerStates to null");
            }

            if(!((__bitField0 & 128) == 128)) {
                this.pacePartnerStates = new java.util.ArrayList<>();
                __bitField0 |= 128;
            }
            this.pacePartnerStates.set(index, value);
            return this;
        }

        public Builder addPacePartnerStates(org.zwiftj.api.model.Player value) {
            if (value == null) {
                throw new NullPointerException("Cannot set World#pacePartnerStates to null");
            }

            if(!((__bitField0 & 128) == 128)) {
                this.pacePartnerStates = new java.util.ArrayList<>();
                __bitField0 |= 128;
            }
            this.pacePartnerStates.add(value);
            return this;
        }

        public Builder addAllPacePartnerStates(java.lang.Iterable<org.zwiftj.api.model.Player> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set World#pacePartnerStates to null");
            }
            if(!((__bitField0 & 128) == 128)) {
                this.pacePartnerStates = new java.util.ArrayList<>();
                __bitField0 |= 128;
            }
            for (final org.zwiftj.api.model.Player value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set World#pacePartnerStates to null");
                }
                this.pacePartnerStates.add(value);
            }
            return this;
        }

        public Builder clearPacePartnerStates() {
            this.pacePartnerStates = java.util.Collections.emptyList();
            __bitField0 &= ~128;
            return this;
        }

        public int getPacePartnerStatesCount() {
            return pacePartnerStates.size();
        }

        public org.zwiftj.api.model.Player getPacePartnerStates(int index) {
            return pacePartnerStates.get(index);
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
            if (!java.util.Objects.equals(this.name, that.name)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f5, that.f5)) {
                return false;
            }
            if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.realTime, that.realTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.playerStates, that.playerStates)) {
                return false;
            }
            if (!java.util.Objects.equals(this.pacePartnerStates, that.pacePartnerStates)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + Long.hashCode(this.f5);
            result = 31 * result + Long.hashCode(this.worldTime);
            result = 31 * result + Long.hashCode(this.realTime);
            result = 31 * result + (this.playerStates == null ? 0 : this.playerStates.hashCode());
            result = 31 * result + (this.pacePartnerStates == null ? 0 : this.pacePartnerStates.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasName()) {
                parts.add("name=" + getName());
            }
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (hasF5()) {
                parts.add("f5=" + getF5());
            }
            if (hasWorldTime()) {
                parts.add("worldTime=" + getWorldTime());
            }
            if (hasRealTime()) {
                parts.add("realTime=" + getRealTime());
            }
            if (!playerStates.isEmpty()) {
                parts.add("playerStates=" + getPlayerStatesList());
            }
            if (!pacePartnerStates.isEmpty()) {
                parts.add("pacePartnerStates=" + getPacePartnerStatesList());
            }
            return "World{" + String.join(", ", parts) + "}";
        }

        public World build() {
            org.zwiftj.api.model.World result = new org.zwiftj.api.model.World();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.name = this.name;
            result.f3 = this.f3;
            result.f5 = this.f5;
            result.worldTime = this.worldTime;
            result.realTime = this.realTime;
            result.playerStates = java.util.Collections.unmodifiableList(this.playerStates);
            result.pacePartnerStates = java.util.Collections.unmodifiableList(this.pacePartnerStates);
            return result;
        }

    }



}