package org.zwiftj.api.model;

@javax.annotation.Generated("tcp-node-msgs.proto")
public final class TCPHello
        implements io.protostuff.Message<TCPHello> {

    private static final TCPHello DEFAULT_INSTANCE = newBuilder().build();

    private int playerId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private TCPHello() {
        this.playerId = 0;
    }

    private TCPHello(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static TCPHello getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<TCPHello> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getPlayerId() {
        return playerId;
    }

    public boolean hasPlayerId() {
        return (__bitField0 & 1) == 1;
    }

    public TCPHello withPlayerId(int value) {
        return TCPHello.newBuilder()
            .mergeFrom(this)
            .setPlayerId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<TCPHello> cachedSchema() {
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
        TCPHello that = (TCPHello) obj;
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.playerId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasPlayerId()) {
            parts.add("playerId=" + getPlayerId());
        }
        return "TCPHello{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<TCPHello>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("playerId", 2);
        }

        @Override
        public TCPHello newMessage() {
            return new TCPHello();
        }

        @Override
        public Class<TCPHello> typeClass() {
            return TCPHello.class;
        }

        @Override
        public String messageName() {
            return TCPHello.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return TCPHello.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(TCPHello message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, TCPHello instance) throws java.io.IOException {
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
                    case 2:
                    	instance.playerId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, TCPHello instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(2, instance.playerId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 2: return "playerId";
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

        private int __bitField0;

        private Builder() {
            this.playerId = 0;
        }

        public Builder mergeFrom(TCPHello instance) {
            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

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

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.playerId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasPlayerId()) {
                parts.add("playerId=" + getPlayerId());
            }
            return "TCPHello{" + String.join(", ", parts) + "}";
        }

        public TCPHello build() {
            org.zwiftj.api.model.TCPHello result = new org.zwiftj.api.model.TCPHello();
            result.__bitField0 = __bitField0;
            result.playerId = this.playerId;
            return result;
        }

    }



}