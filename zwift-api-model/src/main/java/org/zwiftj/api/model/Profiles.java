package org.zwiftj.api.model;

@javax.annotation.Generated("profile.proto")
public final class Profiles
        implements io.protostuff.Message<Profiles> {

    private static final Profiles DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.Profile> profiles;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Profiles() {
        this.profiles = java.util.Collections.emptyList();
    }

    private Profiles(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Profiles getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Profiles> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.Profile> getProfilesList() {
        return profiles;
    }

    public int getProfilesCount() {
        return profiles.size();
    }

    public org.zwiftj.api.model.Profile getProfiles(int index) {
        return profiles.get(index);
    }

    public Profiles withProfiles(java.util.List<org.zwiftj.api.model.Profile> value) {
        return Profiles.newBuilder()
            .mergeFrom(this)
            .clearProfiles()
            .addAllProfiles(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Profiles> cachedSchema() {
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
        Profiles that = (Profiles) obj;
        if (!java.util.Objects.equals(this.profiles, that.profiles)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.profiles == null ? 0 : this.profiles.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!profiles.isEmpty()) {
            parts.add("profiles=" + getProfilesList());
        }
        return "Profiles{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Profiles>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("profiles", 1);
        }

        @Override
        public Profiles newMessage() {
            return new Profiles();
        }

        @Override
        public Class<Profiles> typeClass() {
            return Profiles.class;
        }

        @Override
        public String messageName() {
            return Profiles.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Profiles.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Profiles message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Profiles instance) throws java.io.IOException {
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
                    	    instance.profiles = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.profiles.add(input.mergeObject(null, org.zwiftj.api.model.Profile.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.profiles = java.util.Collections.unmodifiableList(instance.profiles);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Profiles instance) throws java.io.IOException {
            for(org.zwiftj.api.model.Profile profiles : instance.profiles) {
                output.writeObject(1, profiles, org.zwiftj.api.model.Profile.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "profiles";
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

        private java.util.List<org.zwiftj.api.model.Profile> profiles;

        private int __bitField0;

        private Builder() {
            this.profiles = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Profiles instance) {
            this.addAllProfiles(instance.getProfilesList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.Profile> getProfilesList() {
            return profiles;
        }

        public Builder setProfiles(int index, org.zwiftj.api.model.Profile value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profiles#profiles to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.profiles = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.profiles.set(index, value);
            return this;
        }

        public Builder addProfiles(org.zwiftj.api.model.Profile value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profiles#profiles to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.profiles = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.profiles.add(value);
            return this;
        }

        public Builder addAllProfiles(java.lang.Iterable<org.zwiftj.api.model.Profile> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Profiles#profiles to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.profiles = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.Profile value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Profiles#profiles to null");
                }
                this.profiles.add(value);
            }
            return this;
        }

        public Builder clearProfiles() {
            this.profiles = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getProfilesCount() {
            return profiles.size();
        }

        public org.zwiftj.api.model.Profile getProfiles(int index) {
            return profiles.get(index);
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
            if (!java.util.Objects.equals(this.profiles, that.profiles)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.profiles == null ? 0 : this.profiles.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!profiles.isEmpty()) {
                parts.add("profiles=" + getProfilesList());
            }
            return "Profiles{" + String.join(", ", parts) + "}";
        }

        public Profiles build() {
            org.zwiftj.api.model.Profiles result = new org.zwiftj.api.model.Profiles();
            result.__bitField0 = __bitField0;
            result.profiles = java.util.Collections.unmodifiableList(this.profiles);
            return result;
        }

    }



}