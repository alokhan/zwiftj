package org.zwiftj.api.model;

@javax.annotation.Generated("hash-seeds.proto")
public final class HashSeed
        implements io.protostuff.Message<HashSeed> {

    private static final HashSeed DEFAULT_INSTANCE = newBuilder().build();

    private long seed1;

    private long seed2;

    private long expiryDate;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HashSeed() {
        this.seed1 = 0L;
        this.seed2 = 0L;
        this.expiryDate = 0L;
    }

    private HashSeed(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HashSeed getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HashSeed> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getSeed1() {
        return seed1;
    }

    public boolean hasSeed1() {
        return (__bitField0 & 1) == 1;
    }

    public HashSeed withSeed1(long value) {
        return HashSeed.newBuilder()
            .mergeFrom(this)
            .setSeed1(value)
            .build();
    }

    public long getSeed2() {
        return seed2;
    }

    public boolean hasSeed2() {
        return (__bitField0 & 2) == 2;
    }

    public HashSeed withSeed2(long value) {
        return HashSeed.newBuilder()
            .mergeFrom(this)
            .setSeed2(value)
            .build();
    }

    public long getExpiryDate() {
        return expiryDate;
    }

    public boolean hasExpiryDate() {
        return (__bitField0 & 4) == 4;
    }

    public HashSeed withExpiryDate(long value) {
        return HashSeed.newBuilder()
            .mergeFrom(this)
            .setExpiryDate(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HashSeed> cachedSchema() {
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
        HashSeed that = (HashSeed) obj;
        if (!java.util.Objects.equals(this.seed1, that.seed1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.seed2, that.seed2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.expiryDate, that.expiryDate)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.seed1);
        result = 31 * result + Long.hashCode(this.seed2);
        result = 31 * result + Long.hashCode(this.expiryDate);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasSeed1()) {
            parts.add("seed1=" + getSeed1());
        }
        if (hasSeed2()) {
            parts.add("seed2=" + getSeed2());
        }
        if (hasExpiryDate()) {
            parts.add("expiryDate=" + getExpiryDate());
        }
        return "HashSeed{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HashSeed>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("seed1", 1);
        	__fieldMap.put("seed2", 2);
        	__fieldMap.put("expiryDate", 3);
        }

        @Override
        public HashSeed newMessage() {
            return new HashSeed();
        }

        @Override
        public Class<HashSeed> typeClass() {
            return HashSeed.class;
        }

        @Override
        public String messageName() {
            return HashSeed.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HashSeed.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HashSeed message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HashSeed instance) throws java.io.IOException {
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
                    	instance.seed1 = input.readUInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.seed2 = input.readUInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.expiryDate = input.readUInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HashSeed instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt64(1, instance.seed1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeUInt64(2, instance.seed2, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeUInt64(3, instance.expiryDate, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "seed1";
        		case 2: return "seed2";
        		case 3: return "expiryDate";
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

        private long seed1;

        private long seed2;

        private long expiryDate;

        private int __bitField0;

        private Builder() {
            this.seed1 = 0L;
            this.seed2 = 0L;
            this.expiryDate = 0L;
        }

        public Builder mergeFrom(HashSeed instance) {
            if (instance.hasSeed1()) {
                this.setSeed1(instance.getSeed1());
            }

            if (instance.hasSeed2()) {
                this.setSeed2(instance.getSeed2());
            }

            if (instance.hasExpiryDate()) {
                this.setExpiryDate(instance.getExpiryDate());
            }

            return this;
        }

        public long getSeed1() {
            return seed1;
        }

        public Builder setSeed1(long value) {
            this.seed1 = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearSeed1() {
            this.seed1 = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasSeed1() {
            return (__bitField0 & 1) == 1;
        }

        public long getSeed2() {
            return seed2;
        }

        public Builder setSeed2(long value) {
            this.seed2 = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearSeed2() {
            this.seed2 = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasSeed2() {
            return (__bitField0 & 2) == 2;
        }

        public long getExpiryDate() {
            return expiryDate;
        }

        public Builder setExpiryDate(long value) {
            this.expiryDate = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearExpiryDate() {
            this.expiryDate = 0L;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasExpiryDate() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.seed1, that.seed1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.seed2, that.seed2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.expiryDate, that.expiryDate)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.seed1);
            result = 31 * result + Long.hashCode(this.seed2);
            result = 31 * result + Long.hashCode(this.expiryDate);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasSeed1()) {
                parts.add("seed1=" + getSeed1());
            }
            if (hasSeed2()) {
                parts.add("seed2=" + getSeed2());
            }
            if (hasExpiryDate()) {
                parts.add("expiryDate=" + getExpiryDate());
            }
            return "HashSeed{" + String.join(", ", parts) + "}";
        }

        public HashSeed build() {
            org.zwiftj.api.model.HashSeed result = new org.zwiftj.api.model.HashSeed();
            result.__bitField0 = __bitField0;
            result.seed1 = this.seed1;
            result.seed2 = this.seed2;
            result.expiryDate = this.expiryDate;
            return result;
        }

    }



}