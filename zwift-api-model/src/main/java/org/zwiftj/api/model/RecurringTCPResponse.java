package org.zwiftj.api.model;

@javax.annotation.Generated("tcp-node-msgs.proto")
public final class RecurringTCPResponse
        implements io.protostuff.Message<RecurringTCPResponse> {

    private static final RecurringTCPResponse DEFAULT_INSTANCE = newBuilder().build();

    private int f1;

    private int playerId;

    private int f3;

    private int f11;

    private boolean __merge_lock = false;
    private int __bitField0;

    private RecurringTCPResponse() {
        this.f1 = 0;
        this.playerId = 0;
        this.f3 = 0;
        this.f11 = 0;
    }

    private RecurringTCPResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static RecurringTCPResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<RecurringTCPResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getF1() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public RecurringTCPResponse withF1(int value) {
        return RecurringTCPResponse.newBuilder()
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

    public RecurringTCPResponse withPlayerId(int value) {
        return RecurringTCPResponse.newBuilder()
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

    public RecurringTCPResponse withF3(int value) {
        return RecurringTCPResponse.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public int getF11() {
        return f11;
    }

    public boolean hasF11() {
        return (__bitField0 & 8) == 8;
    }

    public RecurringTCPResponse withF11(int value) {
        return RecurringTCPResponse.newBuilder()
            .mergeFrom(this)
            .setF11(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<RecurringTCPResponse> cachedSchema() {
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
        RecurringTCPResponse that = (RecurringTCPResponse) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f11, that.f11)) {
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
        result = 31 * result + Integer.hashCode(this.f11);

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
        if (hasF11()) {
            parts.add("f11=" + getF11());
        }
        return "RecurringTCPResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<RecurringTCPResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("playerId", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("f11", 11);
        }

        @Override
        public RecurringTCPResponse newMessage() {
            return new RecurringTCPResponse();
        }

        @Override
        public Class<RecurringTCPResponse> typeClass() {
            return RecurringTCPResponse.class;
        }

        @Override
        public String messageName() {
            return RecurringTCPResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return RecurringTCPResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(RecurringTCPResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, RecurringTCPResponse instance) throws java.io.IOException {
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
                    case 11:
                    	instance.f11 = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, RecurringTCPResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.playerId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(11, instance.f11, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "playerId";
        		case 3: return "f3";
        		case 11: return "f11";
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

        private int f11;

        private int __bitField0;

        private Builder() {
            this.f1 = 0;
            this.playerId = 0;
            this.f3 = 0;
            this.f11 = 0;
        }

        public Builder mergeFrom(RecurringTCPResponse instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasF11()) {
                this.setF11(instance.getF11());
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

        public int getF11() {
            return f11;
        }

        public Builder setF11(int value) {
            this.f11 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearF11() {
            this.f11 = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasF11() {
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
            if (!java.util.Objects.equals(this.playerId, that.playerId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f11, that.f11)) {
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
            result = 31 * result + Integer.hashCode(this.f11);

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
            if (hasF11()) {
                parts.add("f11=" + getF11());
            }
            return "RecurringTCPResponse{" + String.join(", ", parts) + "}";
        }

        public RecurringTCPResponse build() {
            org.zwiftj.api.model.RecurringTCPResponse result = new org.zwiftj.api.model.RecurringTCPResponse();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.playerId = this.playerId;
            result.f3 = this.f3;
            result.f11 = this.f11;
            return result;
        }

    }



}