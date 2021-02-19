package org.zwiftj.api.model;

@javax.annotation.Generated("hash-seeds.proto")
public final class HashSeeds
        implements io.protostuff.Message<HashSeeds> {

    private static final HashSeeds DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.HashSeed> seeds;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HashSeeds() {
        this.seeds = java.util.Collections.emptyList();
    }

    private HashSeeds(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HashSeeds getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HashSeeds> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.HashSeed> getSeedsList() {
        return seeds;
    }

    public int getSeedsCount() {
        return seeds.size();
    }

    public org.zwiftj.api.model.HashSeed getSeeds(int index) {
        return seeds.get(index);
    }

    public HashSeeds withSeeds(java.util.List<org.zwiftj.api.model.HashSeed> value) {
        return HashSeeds.newBuilder()
            .mergeFrom(this)
            .clearSeeds()
            .addAllSeeds(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HashSeeds> cachedSchema() {
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
        HashSeeds that = (HashSeeds) obj;
        if (!java.util.Objects.equals(this.seeds, that.seeds)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.seeds == null ? 0 : this.seeds.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!seeds.isEmpty()) {
            parts.add("seeds=" + getSeedsList());
        }
        return "HashSeeds{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HashSeeds>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("seeds", 1);
        }

        @Override
        public HashSeeds newMessage() {
            return new HashSeeds();
        }

        @Override
        public Class<HashSeeds> typeClass() {
            return HashSeeds.class;
        }

        @Override
        public String messageName() {
            return HashSeeds.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HashSeeds.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HashSeeds message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HashSeeds instance) throws java.io.IOException {
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
                    	    instance.seeds = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.seeds.add(input.mergeObject(null, org.zwiftj.api.model.HashSeed.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.seeds = java.util.Collections.unmodifiableList(instance.seeds);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, HashSeeds instance) throws java.io.IOException {
            for(org.zwiftj.api.model.HashSeed seeds : instance.seeds) {
                output.writeObject(1, seeds, org.zwiftj.api.model.HashSeed.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "seeds";
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

        private java.util.List<org.zwiftj.api.model.HashSeed> seeds;

        private int __bitField0;

        private Builder() {
            this.seeds = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(HashSeeds instance) {
            this.addAllSeeds(instance.getSeedsList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.HashSeed> getSeedsList() {
            return seeds;
        }

        public Builder setSeeds(int index, org.zwiftj.api.model.HashSeed value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HashSeeds#seeds to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.seeds = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.seeds.set(index, value);
            return this;
        }

        public Builder addSeeds(org.zwiftj.api.model.HashSeed value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HashSeeds#seeds to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.seeds = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.seeds.add(value);
            return this;
        }

        public Builder addAllSeeds(java.lang.Iterable<org.zwiftj.api.model.HashSeed> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set HashSeeds#seeds to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.seeds = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.HashSeed value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set HashSeeds#seeds to null");
                }
                this.seeds.add(value);
            }
            return this;
        }

        public Builder clearSeeds() {
            this.seeds = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getSeedsCount() {
            return seeds.size();
        }

        public org.zwiftj.api.model.HashSeed getSeeds(int index) {
            return seeds.get(index);
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
            if (!java.util.Objects.equals(this.seeds, that.seeds)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.seeds == null ? 0 : this.seeds.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!seeds.isEmpty()) {
                parts.add("seeds=" + getSeedsList());
            }
            return "HashSeeds{" + String.join(", ", parts) + "}";
        }

        public HashSeeds build() {
            org.zwiftj.api.model.HashSeeds result = new org.zwiftj.api.model.HashSeeds();
            result.__bitField0 = __bitField0;
            result.seeds = java.util.Collections.unmodifiableList(this.seeds);
            return result;
        }

    }



}