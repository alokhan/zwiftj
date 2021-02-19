package org.zwiftj.api.model;

@javax.annotation.Generated("tcp-node-msgs.proto")
public final class ServersType2
        implements io.protostuff.Message<ServersType2> {

    private static final ServersType2 DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.ServerConnectionDetailsWrapper> detailsWrapper;

    private int port;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ServersType2() {
        this.detailsWrapper = java.util.Collections.emptyList();
        this.port = 0;
    }

    private ServersType2(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ServersType2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ServersType2> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.ServerConnectionDetailsWrapper> getDetailsWrapperList() {
        return detailsWrapper;
    }

    public int getDetailsWrapperCount() {
        return detailsWrapper.size();
    }

    public org.zwiftj.api.model.ServerConnectionDetailsWrapper getDetailsWrapper(int index) {
        return detailsWrapper.get(index);
    }

    public ServersType2 withDetailsWrapper(java.util.List<org.zwiftj.api.model.ServerConnectionDetailsWrapper> value) {
        return ServersType2.newBuilder()
            .mergeFrom(this)
            .clearDetailsWrapper()
            .addAllDetailsWrapper(value)
            .build();
    }

    public int getPort() {
        return port;
    }

    public boolean hasPort() {
        return (__bitField0 & 2) == 2;
    }

    public ServersType2 withPort(int value) {
        return ServersType2.newBuilder()
            .mergeFrom(this)
            .setPort(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ServersType2> cachedSchema() {
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
        ServersType2 that = (ServersType2) obj;
        if (!java.util.Objects.equals(this.detailsWrapper, that.detailsWrapper)) {
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
        result = 31 * result + (this.detailsWrapper == null ? 0 : this.detailsWrapper.hashCode());
        result = 31 * result + Integer.hashCode(this.port);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!detailsWrapper.isEmpty()) {
            parts.add("detailsWrapper=" + getDetailsWrapperList());
        }
        if (hasPort()) {
            parts.add("port=" + getPort());
        }
        return "ServersType2{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ServersType2>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("detailsWrapper", 1);
        	__fieldMap.put("port", 2);
        }

        @Override
        public ServersType2 newMessage() {
            return new ServersType2();
        }

        @Override
        public Class<ServersType2> typeClass() {
            return ServersType2.class;
        }

        @Override
        public String messageName() {
            return ServersType2.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ServersType2.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ServersType2 message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ServersType2 instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.detailsWrapper = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.detailsWrapper.add(input.mergeObject(null, org.zwiftj.api.model.ServerConnectionDetailsWrapper.getSchema()));

                    	break;
                    case 2:
                    	instance.port = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.detailsWrapper = java.util.Collections.unmodifiableList(instance.detailsWrapper);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, ServersType2 instance) throws java.io.IOException {
            for(org.zwiftj.api.model.ServerConnectionDetailsWrapper detailsWrapper : instance.detailsWrapper) {
                output.writeObject(1, detailsWrapper, org.zwiftj.api.model.ServerConnectionDetailsWrapper.getSchema(), true);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.port, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "detailsWrapper";
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

        private java.util.List<org.zwiftj.api.model.ServerConnectionDetailsWrapper> detailsWrapper;

        private int port;

        private int __bitField0;

        private Builder() {
            this.detailsWrapper = java.util.Collections.emptyList();
            this.port = 0;
        }

        public Builder mergeFrom(ServersType2 instance) {
            this.addAllDetailsWrapper(instance.getDetailsWrapperList());

            if (instance.hasPort()) {
                this.setPort(instance.getPort());
            }

            return this;
        }

        public java.util.List<org.zwiftj.api.model.ServerConnectionDetailsWrapper> getDetailsWrapperList() {
            return detailsWrapper;
        }

        public Builder setDetailsWrapper(int index, org.zwiftj.api.model.ServerConnectionDetailsWrapper value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServersType2#detailsWrapper to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.detailsWrapper = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.detailsWrapper.set(index, value);
            return this;
        }

        public Builder addDetailsWrapper(org.zwiftj.api.model.ServerConnectionDetailsWrapper value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServersType2#detailsWrapper to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.detailsWrapper = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.detailsWrapper.add(value);
            return this;
        }

        public Builder addAllDetailsWrapper(java.lang.Iterable<org.zwiftj.api.model.ServerConnectionDetailsWrapper> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ServersType2#detailsWrapper to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.detailsWrapper = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.ServerConnectionDetailsWrapper value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ServersType2#detailsWrapper to null");
                }
                this.detailsWrapper.add(value);
            }
            return this;
        }

        public Builder clearDetailsWrapper() {
            this.detailsWrapper = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getDetailsWrapperCount() {
            return detailsWrapper.size();
        }

        public org.zwiftj.api.model.ServerConnectionDetailsWrapper getDetailsWrapper(int index) {
            return detailsWrapper.get(index);
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
            if (!java.util.Objects.equals(this.detailsWrapper, that.detailsWrapper)) {
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
            result = 31 * result + (this.detailsWrapper == null ? 0 : this.detailsWrapper.hashCode());
            result = 31 * result + Integer.hashCode(this.port);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!detailsWrapper.isEmpty()) {
                parts.add("detailsWrapper=" + getDetailsWrapperList());
            }
            if (hasPort()) {
                parts.add("port=" + getPort());
            }
            return "ServersType2{" + String.join(", ", parts) + "}";
        }

        public ServersType2 build() {
            org.zwiftj.api.model.ServersType2 result = new org.zwiftj.api.model.ServersType2();
            result.__bitField0 = __bitField0;
            result.detailsWrapper = java.util.Collections.unmodifiableList(this.detailsWrapper);
            result.port = this.port;
            return result;
        }

    }



}