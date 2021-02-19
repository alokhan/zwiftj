package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class Ghosts
        implements io.protostuff.Message<Ghosts> {

    private static final Ghosts DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.Ghost> ghosts;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Ghosts() {
        this.ghosts = java.util.Collections.emptyList();
    }

    private Ghosts(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Ghosts getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Ghosts> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.Ghost> getGhostsList() {
        return ghosts;
    }

    public int getGhostsCount() {
        return ghosts.size();
    }

    public org.zwiftj.api.model.Ghost getGhosts(int index) {
        return ghosts.get(index);
    }

    public Ghosts withGhosts(java.util.List<org.zwiftj.api.model.Ghost> value) {
        return Ghosts.newBuilder()
            .mergeFrom(this)
            .clearGhosts()
            .addAllGhosts(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Ghosts> cachedSchema() {
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
        Ghosts that = (Ghosts) obj;
        if (!java.util.Objects.equals(this.ghosts, that.ghosts)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.ghosts == null ? 0 : this.ghosts.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!ghosts.isEmpty()) {
            parts.add("ghosts=" + getGhostsList());
        }
        return "Ghosts{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Ghosts>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ghosts", 1);
        }

        @Override
        public Ghosts newMessage() {
            return new Ghosts();
        }

        @Override
        public Class<Ghosts> typeClass() {
            return Ghosts.class;
        }

        @Override
        public String messageName() {
            return Ghosts.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Ghosts.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Ghosts message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Ghosts instance) throws java.io.IOException {
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
                    	    instance.ghosts = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.ghosts.add(input.mergeObject(null, org.zwiftj.api.model.Ghost.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.ghosts = java.util.Collections.unmodifiableList(instance.ghosts);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Ghosts instance) throws java.io.IOException {
            for(org.zwiftj.api.model.Ghost ghosts : instance.ghosts) {
                output.writeObject(1, ghosts, org.zwiftj.api.model.Ghost.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ghosts";
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

        private java.util.List<org.zwiftj.api.model.Ghost> ghosts;

        private int __bitField0;

        private Builder() {
            this.ghosts = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Ghosts instance) {
            this.addAllGhosts(instance.getGhostsList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.Ghost> getGhostsList() {
            return ghosts;
        }

        public Builder setGhosts(int index, org.zwiftj.api.model.Ghost value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Ghosts#ghosts to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.ghosts = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.ghosts.set(index, value);
            return this;
        }

        public Builder addGhosts(org.zwiftj.api.model.Ghost value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Ghosts#ghosts to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.ghosts = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.ghosts.add(value);
            return this;
        }

        public Builder addAllGhosts(java.lang.Iterable<org.zwiftj.api.model.Ghost> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Ghosts#ghosts to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.ghosts = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.Ghost value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Ghosts#ghosts to null");
                }
                this.ghosts.add(value);
            }
            return this;
        }

        public Builder clearGhosts() {
            this.ghosts = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getGhostsCount() {
            return ghosts.size();
        }

        public org.zwiftj.api.model.Ghost getGhosts(int index) {
            return ghosts.get(index);
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
            if (!java.util.Objects.equals(this.ghosts, that.ghosts)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.ghosts == null ? 0 : this.ghosts.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!ghosts.isEmpty()) {
                parts.add("ghosts=" + getGhostsList());
            }
            return "Ghosts{" + String.join(", ", parts) + "}";
        }

        public Ghosts build() {
            org.zwiftj.api.model.Ghosts result = new org.zwiftj.api.model.Ghosts();
            result.__bitField0 = __bitField0;
            result.ghosts = java.util.Collections.unmodifiableList(this.ghosts);
            return result;
        }

    }



}