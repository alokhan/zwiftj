package org.zwiftj.api.model;

@javax.annotation.Generated("activity.proto")
public final class Activities
        implements io.protostuff.Message<Activities> {

    private static final Activities DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.Activity> activities;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Activities() {
        this.activities = java.util.Collections.emptyList();
    }

    private Activities(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Activities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Activities> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.Activity> getActivitiesList() {
        return activities;
    }

    public int getActivitiesCount() {
        return activities.size();
    }

    public org.zwiftj.api.model.Activity getActivities(int index) {
        return activities.get(index);
    }

    public Activities withActivities(java.util.List<org.zwiftj.api.model.Activity> value) {
        return Activities.newBuilder()
            .mergeFrom(this)
            .clearActivities()
            .addAllActivities(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Activities> cachedSchema() {
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
        Activities that = (Activities) obj;
        if (!java.util.Objects.equals(this.activities, that.activities)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.activities == null ? 0 : this.activities.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!activities.isEmpty()) {
            parts.add("activities=" + getActivitiesList());
        }
        return "Activities{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Activities>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("activities", 1);
        }

        @Override
        public Activities newMessage() {
            return new Activities();
        }

        @Override
        public Class<Activities> typeClass() {
            return Activities.class;
        }

        @Override
        public String messageName() {
            return Activities.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Activities.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Activities message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Activities instance) throws java.io.IOException {
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
                    	    instance.activities = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.activities.add(input.mergeObject(null, org.zwiftj.api.model.Activity.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.activities = java.util.Collections.unmodifiableList(instance.activities);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Activities instance) throws java.io.IOException {
            for(org.zwiftj.api.model.Activity activities : instance.activities) {
                output.writeObject(1, activities, org.zwiftj.api.model.Activity.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "activities";
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

        private java.util.List<org.zwiftj.api.model.Activity> activities;

        private int __bitField0;

        private Builder() {
            this.activities = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Activities instance) {
            this.addAllActivities(instance.getActivitiesList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.Activity> getActivitiesList() {
            return activities;
        }

        public Builder setActivities(int index, org.zwiftj.api.model.Activity value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activities#activities to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.activities = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.activities.set(index, value);
            return this;
        }

        public Builder addActivities(org.zwiftj.api.model.Activity value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Activities#activities to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.activities = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.activities.add(value);
            return this;
        }

        public Builder addAllActivities(java.lang.Iterable<org.zwiftj.api.model.Activity> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Activities#activities to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.activities = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.Activity value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Activities#activities to null");
                }
                this.activities.add(value);
            }
            return this;
        }

        public Builder clearActivities() {
            this.activities = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getActivitiesCount() {
            return activities.size();
        }

        public org.zwiftj.api.model.Activity getActivities(int index) {
            return activities.get(index);
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
            if (!java.util.Objects.equals(this.activities, that.activities)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.activities == null ? 0 : this.activities.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!activities.isEmpty()) {
                parts.add("activities=" + getActivitiesList());
            }
            return "Activities{" + String.join(", ", parts) + "}";
        }

        public Activities build() {
            org.zwiftj.api.model.Activities result = new org.zwiftj.api.model.Activities();
            result.__bitField0 = __bitField0;
            result.activities = java.util.Collections.unmodifiableList(this.activities);
            return result;
        }

    }



}