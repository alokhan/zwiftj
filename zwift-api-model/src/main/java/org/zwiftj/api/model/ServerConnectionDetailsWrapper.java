package org.zwiftj.api.model;

@javax.annotation.Generated("tcp-node-msgs.proto")
public final class ServerConnectionDetailsWrapper
        implements io.protostuff.Message<ServerConnectionDetailsWrapper> {

    private static final ServerConnectionDetailsWrapper DEFAULT_INSTANCE = newBuilder().build();

    private int f1;

    private int f2;

    private java.util.List<org.zwiftj.api.model.ServerDetails> details;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ServerConnectionDetailsWrapper() {
        this.f1 = 0;
        this.f2 = 0;
        this.details = java.util.Collections.emptyList();
    }

    private ServerConnectionDetailsWrapper(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ServerConnectionDetailsWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ServerConnectionDetailsWrapper> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getF1() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public ServerConnectionDetailsWrapper withF1(int value) {
        return ServerConnectionDetailsWrapper.newBuilder()
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

    public ServerConnectionDetailsWrapper withF2(int value) {
        return ServerConnectionDetailsWrapper.newBuilder()
            .mergeFrom(this)
            .setF2(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.ServerDetails> getDetailsList() {
        return details;
    }

    public int getDetailsCount() {
        return details.size();
    }

    public org.zwiftj.api.model.ServerDetails getDetails(int index) {
        return details.get(index);
    }

    public ServerConnectionDetailsWrapper withDetails(java.util.List<org.zwiftj.api.model.ServerDetails> value) {
        return ServerConnectionDetailsWrapper.newBuilder()
            .mergeFrom(this)
            .clearDetails()
            .addAllDetails(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ServerConnectionDetailsWrapper> cachedSchema() {
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
        ServerConnectionDetailsWrapper that = (ServerConnectionDetailsWrapper) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f2, that.f2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.details, that.details)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.f1);
        result = 31 * result + Integer.hashCode(this.f2);
        result = 31 * result + (this.details == null ? 0 : this.details.hashCode());

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
        if (!details.isEmpty()) {
            parts.add("details=" + getDetailsList());
        }
        return "ServerConnectionDetailsWrapper{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ServerConnectionDetailsWrapper>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("f2", 2);
        	__fieldMap.put("details", 3);
        }

        @Override
        public ServerConnectionDetailsWrapper newMessage() {
            return new ServerConnectionDetailsWrapper();
        }

        @Override
        public Class<ServerConnectionDetailsWrapper> typeClass() {
            return ServerConnectionDetailsWrapper.class;
        }

        @Override
        public String messageName() {
            return ServerConnectionDetailsWrapper.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ServerConnectionDetailsWrapper.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ServerConnectionDetailsWrapper message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ServerConnectionDetailsWrapper instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.details = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.details.add(input.mergeObject(null, org.zwiftj.api.model.ServerDetails.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.details = java.util.Collections.unmodifiableList(instance.details);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ServerConnectionDetailsWrapper instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.f2, false);
            }

            for(org.zwiftj.api.model.ServerDetails details : instance.details) {
                output.writeObject(3, details, org.zwiftj.api.model.ServerDetails.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "f2";
        		case 3: return "details";
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

        private java.util.List<org.zwiftj.api.model.ServerDetails> details;

        private int __bitField0;

        private Builder() {
            this.f1 = 0;
            this.f2 = 0;
            this.details = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ServerConnectionDetailsWrapper instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasF2()) {
                this.setF2(instance.getF2());
            }

            this.addAllDetails(instance.getDetailsList());

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

        public java.util.List<org.zwiftj.api.model.ServerDetails> getDetailsList() {
            return details;
        }

        public Builder setDetails(int index, org.zwiftj.api.model.ServerDetails value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerConnectionDetailsWrapper#details to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.details = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.details.set(index, value);
            return this;
        }

        public Builder addDetails(org.zwiftj.api.model.ServerDetails value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServerConnectionDetailsWrapper#details to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.details = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.details.add(value);
            return this;
        }

        public Builder addAllDetails(java.lang.Iterable<org.zwiftj.api.model.ServerDetails> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ServerConnectionDetailsWrapper#details to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.details = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final org.zwiftj.api.model.ServerDetails value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ServerConnectionDetailsWrapper#details to null");
                }
                this.details.add(value);
            }
            return this;
        }

        public Builder clearDetails() {
            this.details = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getDetailsCount() {
            return details.size();
        }

        public org.zwiftj.api.model.ServerDetails getDetails(int index) {
            return details.get(index);
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
            if (!java.util.Objects.equals(this.details, that.details)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.f1);
            result = 31 * result + Integer.hashCode(this.f2);
            result = 31 * result + (this.details == null ? 0 : this.details.hashCode());

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
            if (!details.isEmpty()) {
                parts.add("details=" + getDetailsList());
            }
            return "ServerConnectionDetailsWrapper{" + String.join(", ", parts) + "}";
        }

        public ServerConnectionDetailsWrapper build() {
            org.zwiftj.api.model.ServerConnectionDetailsWrapper result = new org.zwiftj.api.model.ServerConnectionDetailsWrapper();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.f2 = this.f2;
            result.details = java.util.Collections.unmodifiableList(this.details);
            return result;
        }

    }



}