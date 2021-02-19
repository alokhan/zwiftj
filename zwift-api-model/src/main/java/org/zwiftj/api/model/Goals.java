package org.zwiftj.api.model;

@javax.annotation.Generated("goal.proto")
public final class Goals
        implements io.protostuff.Message<Goals> {

    private static final Goals DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.Goal> goals;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Goals() {
        this.goals = java.util.Collections.emptyList();
    }

    private Goals(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Goals getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Goals> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.Goal> getGoalsList() {
        return goals;
    }

    public int getGoalsCount() {
        return goals.size();
    }

    public org.zwiftj.api.model.Goal getGoals(int index) {
        return goals.get(index);
    }

    public Goals withGoals(java.util.List<org.zwiftj.api.model.Goal> value) {
        return Goals.newBuilder()
            .mergeFrom(this)
            .clearGoals()
            .addAllGoals(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Goals> cachedSchema() {
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
        Goals that = (Goals) obj;
        if (!java.util.Objects.equals(this.goals, that.goals)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.goals == null ? 0 : this.goals.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!goals.isEmpty()) {
            parts.add("goals=" + getGoalsList());
        }
        return "Goals{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Goals>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("goals", 1);
        }

        @Override
        public Goals newMessage() {
            return new Goals();
        }

        @Override
        public Class<Goals> typeClass() {
            return Goals.class;
        }

        @Override
        public String messageName() {
            return Goals.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Goals.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Goals message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Goals instance) throws java.io.IOException {
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
                    	    instance.goals = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.goals.add(input.mergeObject(null, org.zwiftj.api.model.Goal.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.goals = java.util.Collections.unmodifiableList(instance.goals);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, Goals instance) throws java.io.IOException {
            for(org.zwiftj.api.model.Goal goals : instance.goals) {
                output.writeObject(1, goals, org.zwiftj.api.model.Goal.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "goals";
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

        private java.util.List<org.zwiftj.api.model.Goal> goals;

        private int __bitField0;

        private Builder() {
            this.goals = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(Goals instance) {
            this.addAllGoals(instance.getGoalsList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.Goal> getGoalsList() {
            return goals;
        }

        public Builder setGoals(int index, org.zwiftj.api.model.Goal value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Goals#goals to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.goals = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.goals.set(index, value);
            return this;
        }

        public Builder addGoals(org.zwiftj.api.model.Goal value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Goals#goals to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.goals = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.goals.add(value);
            return this;
        }

        public Builder addAllGoals(java.lang.Iterable<org.zwiftj.api.model.Goal> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Goals#goals to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.goals = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.Goal value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Goals#goals to null");
                }
                this.goals.add(value);
            }
            return this;
        }

        public Builder clearGoals() {
            this.goals = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getGoalsCount() {
            return goals.size();
        }

        public org.zwiftj.api.model.Goal getGoals(int index) {
            return goals.get(index);
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
            if (!java.util.Objects.equals(this.goals, that.goals)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.goals == null ? 0 : this.goals.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!goals.isEmpty()) {
                parts.add("goals=" + getGoalsList());
            }
            return "Goals{" + String.join(", ", parts) + "}";
        }

        public Goals build() {
            org.zwiftj.api.model.Goals result = new org.zwiftj.api.model.Goals();
            result.__bitField0 = __bitField0;
            result.goals = java.util.Collections.unmodifiableList(this.goals);
            return result;
        }

    }



}