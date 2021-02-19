package org.zwiftj.api.model;

@javax.annotation.Generated("tcp-node-msgs.proto")
public final class ServersType1
        implements io.protostuff.Message<ServersType1> {

    private static final ServersType1 DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.ServerDetails> details;

    private int f2;

    private int f3;

    private int f4;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ServersType1() {
        this.details = java.util.Collections.emptyList();
        this.f2 = 0;
        this.f3 = 0;
        this.f4 = 0;
    }

    private ServersType1(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ServersType1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ServersType1> getSchema()
    {
    	return Schema.INSTANCE;
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

    public ServersType1 withDetails(java.util.List<org.zwiftj.api.model.ServerDetails> value) {
        return ServersType1.newBuilder()
            .mergeFrom(this)
            .clearDetails()
            .addAllDetails(value)
            .build();
    }

    public int getF2() {
        return f2;
    }

    public boolean hasF2() {
        return (__bitField0 & 2) == 2;
    }

    public ServersType1 withF2(int value) {
        return ServersType1.newBuilder()
            .mergeFrom(this)
            .setF2(value)
            .build();
    }

    public int getF3() {
        return f3;
    }

    public boolean hasF3() {
        return (__bitField0 & 4) == 4;
    }

    public ServersType1 withF3(int value) {
        return ServersType1.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public int getF4() {
        return f4;
    }

    public boolean hasF4() {
        return (__bitField0 & 8) == 8;
    }

    public ServersType1 withF4(int value) {
        return ServersType1.newBuilder()
            .mergeFrom(this)
            .setF4(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ServersType1> cachedSchema() {
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
        ServersType1 that = (ServersType1) obj;
        if (!java.util.Objects.equals(this.details, that.details)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f2, that.f2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f4, that.f4)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.details == null ? 0 : this.details.hashCode());
        result = 31 * result + Integer.hashCode(this.f2);
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + Integer.hashCode(this.f4);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!details.isEmpty()) {
            parts.add("details=" + getDetailsList());
        }
        if (hasF2()) {
            parts.add("f2=" + getF2());
        }
        if (hasF3()) {
            parts.add("f3=" + getF3());
        }
        if (hasF4()) {
            parts.add("f4=" + getF4());
        }
        return "ServersType1{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ServersType1>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("details", 1);
        	__fieldMap.put("f2", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("f4", 4);
        }

        @Override
        public ServersType1 newMessage() {
            return new ServersType1();
        }

        @Override
        public Class<ServersType1> typeClass() {
            return ServersType1.class;
        }

        @Override
        public String messageName() {
            return ServersType1.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ServersType1.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ServersType1 message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ServersType1 instance) throws java.io.IOException {
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
                    	    instance.details = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.details.add(input.mergeObject(null, org.zwiftj.api.model.ServerDetails.getSchema()));

                    	break;
                    case 2:
                    	instance.f2 = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.f3 = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.f4 = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.details = java.util.Collections.unmodifiableList(instance.details);
            }




        }

        @Override
        public void writeTo(io.protostuff.Output output, ServersType1 instance) throws java.io.IOException {
            for(org.zwiftj.api.model.ServerDetails details : instance.details) {
                output.writeObject(1, details, org.zwiftj.api.model.ServerDetails.getSchema(), true);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.f2, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.f4, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "details";
        		case 2: return "f2";
        		case 3: return "f3";
        		case 4: return "f4";
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

        private java.util.List<org.zwiftj.api.model.ServerDetails> details;

        private int f2;

        private int f3;

        private int f4;

        private int __bitField0;

        private Builder() {
            this.details = java.util.Collections.emptyList();
            this.f2 = 0;
            this.f3 = 0;
            this.f4 = 0;
        }

        public Builder mergeFrom(ServersType1 instance) {
            this.addAllDetails(instance.getDetailsList());

            if (instance.hasF2()) {
                this.setF2(instance.getF2());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasF4()) {
                this.setF4(instance.getF4());
            }

            return this;
        }

        public java.util.List<org.zwiftj.api.model.ServerDetails> getDetailsList() {
            return details;
        }

        public Builder setDetails(int index, org.zwiftj.api.model.ServerDetails value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServersType1#details to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.details = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.details.set(index, value);
            return this;
        }

        public Builder addDetails(org.zwiftj.api.model.ServerDetails value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ServersType1#details to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.details = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.details.add(value);
            return this;
        }

        public Builder addAllDetails(java.lang.Iterable<org.zwiftj.api.model.ServerDetails> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ServersType1#details to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.details = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.ServerDetails value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ServersType1#details to null");
                }
                this.details.add(value);
            }
            return this;
        }

        public Builder clearDetails() {
            this.details = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getDetailsCount() {
            return details.size();
        }

        public org.zwiftj.api.model.ServerDetails getDetails(int index) {
            return details.get(index);
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

        public int getF4() {
            return f4;
        }

        public Builder setF4(int value) {
            this.f4 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearF4() {
            this.f4 = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasF4() {
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
            if (!java.util.Objects.equals(this.details, that.details)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f2, that.f2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f4, that.f4)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.details == null ? 0 : this.details.hashCode());
            result = 31 * result + Integer.hashCode(this.f2);
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + Integer.hashCode(this.f4);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!details.isEmpty()) {
                parts.add("details=" + getDetailsList());
            }
            if (hasF2()) {
                parts.add("f2=" + getF2());
            }
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (hasF4()) {
                parts.add("f4=" + getF4());
            }
            return "ServersType1{" + String.join(", ", parts) + "}";
        }

        public ServersType1 build() {
            org.zwiftj.api.model.ServersType1 result = new org.zwiftj.api.model.ServersType1();
            result.__bitField0 = __bitField0;
            result.details = java.util.Collections.unmodifiableList(this.details);
            result.f2 = this.f2;
            result.f3 = this.f3;
            result.f4 = this.f4;
            return result;
        }

    }



}