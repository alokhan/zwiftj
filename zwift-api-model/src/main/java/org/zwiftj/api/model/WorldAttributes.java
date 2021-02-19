package org.zwiftj.api.model;

@javax.annotation.Generated("world.proto")
public final class WorldAttributes
        implements io.protostuff.Message<WorldAttributes> {

    private static final WorldAttributes DEFAULT_INSTANCE = newBuilder().build();

    private long worldTime;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WorldAttributes() {
        this.worldTime = 0L;
    }

    private WorldAttributes(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WorldAttributes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WorldAttributes> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getWorldTime() {
        return worldTime;
    }

    public boolean hasWorldTime() {
        return (__bitField0 & 1) == 1;
    }

    public WorldAttributes withWorldTime(long value) {
        return WorldAttributes.newBuilder()
            .mergeFrom(this)
            .setWorldTime(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WorldAttributes> cachedSchema() {
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
        WorldAttributes that = (WorldAttributes) obj;
        if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.worldTime);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasWorldTime()) {
            parts.add("worldTime=" + getWorldTime());
        }
        return "WorldAttributes{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WorldAttributes>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("worldTime", 2);
        }

        @Override
        public WorldAttributes newMessage() {
            return new WorldAttributes();
        }

        @Override
        public Class<WorldAttributes> typeClass() {
            return WorldAttributes.class;
        }

        @Override
        public String messageName() {
            return WorldAttributes.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WorldAttributes.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WorldAttributes message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WorldAttributes instance) throws java.io.IOException {
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
                    	instance.worldTime = input.readInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WorldAttributes instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(2, instance.worldTime, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 2: return "worldTime";
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

        private long worldTime;

        private int __bitField0;

        private Builder() {
            this.worldTime = 0L;
        }

        public Builder mergeFrom(WorldAttributes instance) {
            if (instance.hasWorldTime()) {
                this.setWorldTime(instance.getWorldTime());
            }

            return this;
        }

        public long getWorldTime() {
            return worldTime;
        }

        public Builder setWorldTime(long value) {
            this.worldTime = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearWorldTime() {
            this.worldTime = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasWorldTime() {
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
            if (!java.util.Objects.equals(this.worldTime, that.worldTime)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.worldTime);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasWorldTime()) {
                parts.add("worldTime=" + getWorldTime());
            }
            return "WorldAttributes{" + String.join(", ", parts) + "}";
        }

        public WorldAttributes build() {
            org.zwiftj.api.model.WorldAttributes result = new org.zwiftj.api.model.WorldAttributes();
            result.__bitField0 = __bitField0;
            result.worldTime = this.worldTime;
            return result;
        }

    }



}