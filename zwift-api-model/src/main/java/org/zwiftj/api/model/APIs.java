package org.zwiftj.api.model;

@javax.annotation.Generated("login-response.proto")
public final class APIs
        implements io.protostuff.Message<APIs> {

    private static final APIs DEFAULT_INSTANCE = newBuilder().build();

    private String todaysplanUrl;

    private String trainingpeaksUrl;

    private boolean __merge_lock = false;
    private int __bitField0;

    private APIs() {
        this.todaysplanUrl = "";
        this.trainingpeaksUrl = "";
    }

    private APIs(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static APIs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<APIs> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getTodaysplanUrl() {
        return todaysplanUrl;
    }

    public boolean hasTodaysplanUrl() {
        return (__bitField0 & 1) == 1;
    }

    public APIs withTodaysplanUrl(String value) {
        return APIs.newBuilder()
            .mergeFrom(this)
            .setTodaysplanUrl(value)
            .build();
    }

    public String getTrainingpeaksUrl() {
        return trainingpeaksUrl;
    }

    public boolean hasTrainingpeaksUrl() {
        return (__bitField0 & 2) == 2;
    }

    public APIs withTrainingpeaksUrl(String value) {
        return APIs.newBuilder()
            .mergeFrom(this)
            .setTrainingpeaksUrl(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<APIs> cachedSchema() {
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
        APIs that = (APIs) obj;
        if (!java.util.Objects.equals(this.todaysplanUrl, that.todaysplanUrl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.trainingpeaksUrl, that.trainingpeaksUrl)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.todaysplanUrl == null ? 0 : this.todaysplanUrl.hashCode());
        result = 31 * result + (this.trainingpeaksUrl == null ? 0 : this.trainingpeaksUrl.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasTodaysplanUrl()) {
            parts.add("todaysplanUrl=" + getTodaysplanUrl());
        }
        if (hasTrainingpeaksUrl()) {
            parts.add("trainingpeaksUrl=" + getTrainingpeaksUrl());
        }
        return "APIs{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<APIs>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("todaysplanUrl", 1);
        	__fieldMap.put("trainingpeaksUrl", 2);
        }

        @Override
        public APIs newMessage() {
            return new APIs();
        }

        @Override
        public Class<APIs> typeClass() {
            return APIs.class;
        }

        @Override
        public String messageName() {
            return APIs.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return APIs.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(APIs message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, APIs instance) throws java.io.IOException {
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
                    	instance.todaysplanUrl = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.trainingpeaksUrl = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, APIs instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.todaysplanUrl, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.trainingpeaksUrl, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "todaysplanUrl";
        		case 2: return "trainingpeaksUrl";
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

        private String todaysplanUrl;

        private String trainingpeaksUrl;

        private int __bitField0;

        private Builder() {
            this.todaysplanUrl = "";
            this.trainingpeaksUrl = "";
        }

        public Builder mergeFrom(APIs instance) {
            if (instance.hasTodaysplanUrl()) {
                this.setTodaysplanUrl(instance.getTodaysplanUrl());
            }

            if (instance.hasTrainingpeaksUrl()) {
                this.setTrainingpeaksUrl(instance.getTrainingpeaksUrl());
            }

            return this;
        }

        public String getTodaysplanUrl() {
            return todaysplanUrl;
        }

        public Builder setTodaysplanUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set APIs#todaysplanUrl to null");
            }

            this.todaysplanUrl = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearTodaysplanUrl() {
            this.todaysplanUrl = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasTodaysplanUrl() {
            return (__bitField0 & 1) == 1;
        }

        public String getTrainingpeaksUrl() {
            return trainingpeaksUrl;
        }

        public Builder setTrainingpeaksUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set APIs#trainingpeaksUrl to null");
            }

            this.trainingpeaksUrl = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearTrainingpeaksUrl() {
            this.trainingpeaksUrl = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasTrainingpeaksUrl() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.todaysplanUrl, that.todaysplanUrl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.trainingpeaksUrl, that.trainingpeaksUrl)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.todaysplanUrl == null ? 0 : this.todaysplanUrl.hashCode());
            result = 31 * result + (this.trainingpeaksUrl == null ? 0 : this.trainingpeaksUrl.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasTodaysplanUrl()) {
                parts.add("todaysplanUrl=" + getTodaysplanUrl());
            }
            if (hasTrainingpeaksUrl()) {
                parts.add("trainingpeaksUrl=" + getTrainingpeaksUrl());
            }
            return "APIs{" + String.join(", ", parts) + "}";
        }

        public APIs build() {
            org.zwiftj.api.model.APIs result = new org.zwiftj.api.model.APIs();
            result.__bitField0 = __bitField0;
            result.todaysplanUrl = this.todaysplanUrl;
            result.trainingpeaksUrl = this.trainingpeaksUrl;
            return result;
        }

    }



}