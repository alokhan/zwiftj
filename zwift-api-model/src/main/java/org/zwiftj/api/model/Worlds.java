package org.zwiftj.api.model;

@javax.annotation.Generated("world.proto")
public final class Worlds
        implements io.protostuff.Message<Worlds> {

    private static final Worlds DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.World> worlds;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Worlds() {
        this.worlds = java.util.Collections.emptyList();
    }

    private Worlds(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Worlds getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Worlds> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.World> getWorldsList() {
        return worlds;
    }

    public int getWorldsCount() {
        return worlds.size();
    }

    public org.zwiftj.api.model.World getWorlds(int index) {
        return worlds.get(index);
    }

    public Worlds withWorlds(java.util.List<org.zwiftj.api.model.World> value) {
        return Worlds.newBuilder()
            .mergeFrom(this)
            .clearWorlds()
            .addAllWorlds(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Worlds> cachedSchema() {
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
        Worlds that = (Worlds) obj;
        if (!java.util.Objects.equals(this.worlds, that.worlds)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.worlds == null ? 0 : this.worlds.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!worlds.isEmpty()) {
            parts.add("worlds=" + getWorldsList());
        }
        return "Worlds{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Worlds>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("worlds", 1);
        }

        @Override
        public Worlds newMessage() {
            return new Worlds();
        }

        @Override
        public Class<Worlds> typeClass() {
            return Worlds.class;
        }

        @Override
        public String messageName() {
            return Worlds.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Worlds.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Worlds message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Worlds instance) throws java.io.IOException {
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
                    	    instance.worlds = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.worlds.add(input.mergeObject(null, org.zwiftj.api.model.World.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.worlds = java.util.Collections.unmodifiableList(instance.worlds);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Worlds instance) throws java.io.IOException {
            for(org.zwiftj.api.model.World worlds : instance.worlds) {
                output.writeObject(1, worlds, org.zwiftj.api.model.World.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "worlds";
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

        private java.util.List<org.zwiftj.api.model.World> worlds;

        private int __bitField0;

        private Builder() {
            this.worlds = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Worlds instance) {
            this.addAllWorlds(instance.getWorldsList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.World> getWorldsList() {
            return worlds;
        }

        public Builder setWorlds(int index, org.zwiftj.api.model.World value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Worlds#worlds to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.worlds = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.worlds.set(index, value);
            return this;
        }

        public Builder addWorlds(org.zwiftj.api.model.World value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Worlds#worlds to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.worlds = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.worlds.add(value);
            return this;
        }

        public Builder addAllWorlds(java.lang.Iterable<org.zwiftj.api.model.World> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Worlds#worlds to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.worlds = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.World value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Worlds#worlds to null");
                }
                this.worlds.add(value);
            }
            return this;
        }

        public Builder clearWorlds() {
            this.worlds = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getWorldsCount() {
            return worlds.size();
        }

        public org.zwiftj.api.model.World getWorlds(int index) {
            return worlds.get(index);
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
            if (!java.util.Objects.equals(this.worlds, that.worlds)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.worlds == null ? 0 : this.worlds.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!worlds.isEmpty()) {
                parts.add("worlds=" + getWorldsList());
            }
            return "Worlds{" + String.join(", ", parts) + "}";
        }

        public Worlds build() {
            org.zwiftj.api.model.Worlds result = new org.zwiftj.api.model.Worlds();
            result.__bitField0 = __bitField0;
            result.worlds = java.util.Collections.unmodifiableList(this.worlds);
            return result;
        }

    }



}