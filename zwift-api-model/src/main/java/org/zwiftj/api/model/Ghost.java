package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class Ghost
        implements io.protostuff.Message<Ghost> {

    private static final Ghost DEFAULT_INSTANCE = newBuilder().build();

    private int playerId;

    private java.util.List<org.zwiftj.api.model.PlayerState> states;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Ghost() {
        this.playerId = 0;
        this.states = java.util.Collections.emptyList();
    }

    private Ghost(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Ghost getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Ghost> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getPlayerId() {
        return playerId;
    }

    public boolean hasPlayerId() {
        return (__bitField0 & 1) == 1;
    }

    public Ghost withPlayerId(int value) {
        return Ghost.newBuilder()
            .mergeFrom(this)
            .setPlayerId(value)
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

    public Ghost withStates(java.util.List<org.zwiftj.api.model.PlayerState> value) {
        return Ghost.newBuilder()
            .mergeFrom(this)
            .clearStates()
            .addAllStates(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Ghost> cachedSchema() {
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
        Ghost that = (Ghost) obj;
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.states, that.states)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.playerId);
        result = 31 * result + (this.states == null ? 0 : this.states.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasPlayerId()) {
            parts.add("playerId=" + getPlayerId());
        }
        if (!states.isEmpty()) {
            parts.add("states=" + getStatesList());
        }
        return "Ghost{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Ghost>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("playerId", 1);
        	__fieldMap.put("states", 2);
        }

        @Override
        public Ghost newMessage() {
            return new Ghost();
        }

        @Override
        public Class<Ghost> typeClass() {
            return Ghost.class;
        }

        @Override
        public String messageName() {
            return Ghost.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Ghost.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Ghost message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Ghost instance) throws java.io.IOException {
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
                    	instance.playerId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.states = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.states.add(input.mergeObject(null, org.zwiftj.api.model.PlayerState.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.states = java.util.Collections.unmodifiableList(instance.states);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Ghost instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.playerId, false);
            }

            for(org.zwiftj.api.model.PlayerState states : instance.states) {
                output.writeObject(2, states, org.zwiftj.api.model.PlayerState.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "playerId";
        		case 2: return "states";
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

        private int playerId;

        private java.util.List<org.zwiftj.api.model.PlayerState> states;

        private int __bitField0;

        private Builder() {
            this.playerId = 0;
            this.states = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Ghost instance) {
            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

            this.addAllStates(instance.getStatesList());

            return this;
        }

        public int getPlayerId() {
            return playerId;
        }

        public Builder setPlayerId(int value) {
            this.playerId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearPlayerId() {
            this.playerId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasPlayerId() {
            return (__bitField0 & 1) == 1;
        }

        public java.util.List<org.zwiftj.api.model.PlayerState> getStatesList() {
            return states;
        }

        public Builder setStates(int index, org.zwiftj.api.model.PlayerState value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Ghost#states to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.states = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.states.set(index, value);
            return this;
        }

        public Builder addStates(org.zwiftj.api.model.PlayerState value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Ghost#states to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.states = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.states.add(value);
            return this;
        }

        public Builder addAllStates(java.lang.Iterable<org.zwiftj.api.model.PlayerState> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Ghost#states to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.states = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final org.zwiftj.api.model.PlayerState value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Ghost#states to null");
                }
                this.states.add(value);
            }
            return this;
        }

        public Builder clearStates() {
            this.states = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getStatesCount() {
            return states.size();
        }

        public org.zwiftj.api.model.PlayerState getStates(int index) {
            return states.get(index);
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
            if (!java.util.Objects.equals(this.playerId, that.playerId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.states, that.states)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.playerId);
            result = 31 * result + (this.states == null ? 0 : this.states.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasPlayerId()) {
                parts.add("playerId=" + getPlayerId());
            }
            if (!states.isEmpty()) {
                parts.add("states=" + getStatesList());
            }
            return "Ghost{" + String.join(", ", parts) + "}";
        }

        public Ghost build() {
            org.zwiftj.api.model.Ghost result = new org.zwiftj.api.model.Ghost();
            result.__bitField0 = __bitField0;
            result.playerId = this.playerId;
            result.states = java.util.Collections.unmodifiableList(this.states);
            return result;
        }

    }



}