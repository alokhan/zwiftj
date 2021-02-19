package org.zwiftj.api.model;

@javax.annotation.Generated("periodic-info.proto")
public final class PeriodicInfos
        implements io.protostuff.Message<PeriodicInfos> {

    private static final PeriodicInfos DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.PeriodicInfo> infos;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PeriodicInfos() {
        this.infos = java.util.Collections.emptyList();
    }

    private PeriodicInfos(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PeriodicInfos getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PeriodicInfos> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.PeriodicInfo> getInfosList() {
        return infos;
    }

    public int getInfosCount() {
        return infos.size();
    }

    public org.zwiftj.api.model.PeriodicInfo getInfos(int index) {
        return infos.get(index);
    }

    public PeriodicInfos withInfos(java.util.List<org.zwiftj.api.model.PeriodicInfo> value) {
        return PeriodicInfos.newBuilder()
            .mergeFrom(this)
            .clearInfos()
            .addAllInfos(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PeriodicInfos> cachedSchema() {
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
        PeriodicInfos that = (PeriodicInfos) obj;
        if (!java.util.Objects.equals(this.infos, that.infos)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.infos == null ? 0 : this.infos.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!infos.isEmpty()) {
            parts.add("infos=" + getInfosList());
        }
        return "PeriodicInfos{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PeriodicInfos>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("infos", 1);
        }

        @Override
        public PeriodicInfos newMessage() {
            return new PeriodicInfos();
        }

        @Override
        public Class<PeriodicInfos> typeClass() {
            return PeriodicInfos.class;
        }

        @Override
        public String messageName() {
            return PeriodicInfos.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PeriodicInfos.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PeriodicInfos message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PeriodicInfos instance) throws java.io.IOException {
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
                    	    instance.infos = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.infos.add(input.mergeObject(null, org.zwiftj.api.model.PeriodicInfo.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.infos = java.util.Collections.unmodifiableList(instance.infos);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, PeriodicInfos instance) throws java.io.IOException {
            for(org.zwiftj.api.model.PeriodicInfo infos : instance.infos) {
                output.writeObject(1, infos, org.zwiftj.api.model.PeriodicInfo.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "infos";
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

        private java.util.List<org.zwiftj.api.model.PeriodicInfo> infos;

        private int __bitField0;

        private Builder() {
            this.infos = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(PeriodicInfos instance) {
            this.addAllInfos(instance.getInfosList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.PeriodicInfo> getInfosList() {
            return infos;
        }

        public Builder setInfos(int index, org.zwiftj.api.model.PeriodicInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PeriodicInfos#infos to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.infos = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.infos.set(index, value);
            return this;
        }

        public Builder addInfos(org.zwiftj.api.model.PeriodicInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PeriodicInfos#infos to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.infos = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.infos.add(value);
            return this;
        }

        public Builder addAllInfos(java.lang.Iterable<org.zwiftj.api.model.PeriodicInfo> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set PeriodicInfos#infos to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.infos = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.PeriodicInfo value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set PeriodicInfos#infos to null");
                }
                this.infos.add(value);
            }
            return this;
        }

        public Builder clearInfos() {
            this.infos = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getInfosCount() {
            return infos.size();
        }

        public org.zwiftj.api.model.PeriodicInfo getInfos(int index) {
            return infos.get(index);
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
            if (!java.util.Objects.equals(this.infos, that.infos)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.infos == null ? 0 : this.infos.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!infos.isEmpty()) {
                parts.add("infos=" + getInfosList());
            }
            return "PeriodicInfos{" + String.join(", ", parts) + "}";
        }

        public PeriodicInfos build() {
            org.zwiftj.api.model.PeriodicInfos result = new org.zwiftj.api.model.PeriodicInfos();
            result.__bitField0 = __bitField0;
            result.infos = java.util.Collections.unmodifiableList(this.infos);
            return result;
        }

    }



}