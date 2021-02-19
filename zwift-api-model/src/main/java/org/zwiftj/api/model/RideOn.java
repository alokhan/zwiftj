package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class RideOn
        implements io.protostuff.Message<RideOn> {

    private static final RideOn DEFAULT_INSTANCE = newBuilder().build();

    private int riderId;

    private int toRiderId;

    private String firstName;

    private String lastName;

    private int countryCode;

    private boolean __merge_lock = false;
    private int __bitField0;

    private RideOn() {
        this.riderId = 0;
        this.toRiderId = 0;
        this.firstName = "";
        this.lastName = "";
        this.countryCode = 0;
    }

    private RideOn(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static RideOn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<RideOn> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getRiderId() {
        return riderId;
    }

    public boolean hasRiderId() {
        return (__bitField0 & 1) == 1;
    }

    public RideOn withRiderId(int value) {
        return RideOn.newBuilder()
            .mergeFrom(this)
            .setRiderId(value)
            .build();
    }

    public int getToRiderId() {
        return toRiderId;
    }

    public boolean hasToRiderId() {
        return (__bitField0 & 2) == 2;
    }

    public RideOn withToRiderId(int value) {
        return RideOn.newBuilder()
            .mergeFrom(this)
            .setToRiderId(value)
            .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean hasFirstName() {
        return (__bitField0 & 4) == 4;
    }

    public RideOn withFirstName(String value) {
        return RideOn.newBuilder()
            .mergeFrom(this)
            .setFirstName(value)
            .build();
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasLastName() {
        return (__bitField0 & 8) == 8;
    }

    public RideOn withLastName(String value) {
        return RideOn.newBuilder()
            .mergeFrom(this)
            .setLastName(value)
            .build();
    }

    public int getCountryCode() {
        return countryCode;
    }

    public boolean hasCountryCode() {
        return (__bitField0 & 16) == 16;
    }

    public RideOn withCountryCode(int value) {
        return RideOn.newBuilder()
            .mergeFrom(this)
            .setCountryCode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<RideOn> cachedSchema() {
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
        RideOn that = (RideOn) obj;
        if (!java.util.Objects.equals(this.riderId, that.riderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toRiderId, that.toRiderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.firstName, that.firstName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lastName, that.lastName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.countryCode, that.countryCode)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.riderId);
        result = 31 * result + Integer.hashCode(this.toRiderId);
        result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
        result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
        result = 31 * result + Integer.hashCode(this.countryCode);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasRiderId()) {
            parts.add("riderId=" + getRiderId());
        }
        if (hasToRiderId()) {
            parts.add("toRiderId=" + getToRiderId());
        }
        if (hasFirstName()) {
            parts.add("firstName=" + getFirstName());
        }
        if (hasLastName()) {
            parts.add("lastName=" + getLastName());
        }
        if (hasCountryCode()) {
            parts.add("countryCode=" + getCountryCode());
        }
        return "RideOn{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<RideOn>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("riderId", 1);
        	__fieldMap.put("toRiderId", 2);
        	__fieldMap.put("firstName", 3);
        	__fieldMap.put("lastName", 4);
        	__fieldMap.put("countryCode", 5);
        }

        @Override
        public RideOn newMessage() {
            return new RideOn();
        }

        @Override
        public Class<RideOn> typeClass() {
            return RideOn.class;
        }

        @Override
        public String messageName() {
            return RideOn.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return RideOn.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(RideOn message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, RideOn instance) throws java.io.IOException {
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
                    	instance.riderId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.toRiderId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.firstName = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.lastName = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.countryCode = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, RideOn instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.riderId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.toRiderId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.firstName, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.lastName, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.countryCode, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "riderId";
        		case 2: return "toRiderId";
        		case 3: return "firstName";
        		case 4: return "lastName";
        		case 5: return "countryCode";
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

        private int riderId;

        private int toRiderId;

        private String firstName;

        private String lastName;

        private int countryCode;

        private int __bitField0;

        private Builder() {
            this.riderId = 0;
            this.toRiderId = 0;
            this.firstName = "";
            this.lastName = "";
            this.countryCode = 0;
        }

        public Builder mergeFrom(RideOn instance) {
            if (instance.hasRiderId()) {
                this.setRiderId(instance.getRiderId());
            }

            if (instance.hasToRiderId()) {
                this.setToRiderId(instance.getToRiderId());
            }

            if (instance.hasFirstName()) {
                this.setFirstName(instance.getFirstName());
            }

            if (instance.hasLastName()) {
                this.setLastName(instance.getLastName());
            }

            if (instance.hasCountryCode()) {
                this.setCountryCode(instance.getCountryCode());
            }

            return this;
        }

        public int getRiderId() {
            return riderId;
        }

        public Builder setRiderId(int value) {
            this.riderId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearRiderId() {
            this.riderId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasRiderId() {
            return (__bitField0 & 1) == 1;
        }

        public int getToRiderId() {
            return toRiderId;
        }

        public Builder setToRiderId(int value) {
            this.toRiderId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearToRiderId() {
            this.toRiderId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasToRiderId() {
            return (__bitField0 & 2) == 2;
        }

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set RideOn#firstName to null");
            }

            this.firstName = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearFirstName() {
            this.firstName = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasFirstName() {
            return (__bitField0 & 4) == 4;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set RideOn#lastName to null");
            }

            this.lastName = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearLastName() {
            this.lastName = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasLastName() {
            return (__bitField0 & 8) == 8;
        }

        public int getCountryCode() {
            return countryCode;
        }

        public Builder setCountryCode(int value) {
            this.countryCode = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearCountryCode() {
            this.countryCode = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasCountryCode() {
            return (__bitField0 & 16) == 16;
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
            if (!java.util.Objects.equals(this.riderId, that.riderId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toRiderId, that.toRiderId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.firstName, that.firstName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lastName, that.lastName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.countryCode, that.countryCode)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.riderId);
            result = 31 * result + Integer.hashCode(this.toRiderId);
            result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
            result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
            result = 31 * result + Integer.hashCode(this.countryCode);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasRiderId()) {
                parts.add("riderId=" + getRiderId());
            }
            if (hasToRiderId()) {
                parts.add("toRiderId=" + getToRiderId());
            }
            if (hasFirstName()) {
                parts.add("firstName=" + getFirstName());
            }
            if (hasLastName()) {
                parts.add("lastName=" + getLastName());
            }
            if (hasCountryCode()) {
                parts.add("countryCode=" + getCountryCode());
            }
            return "RideOn{" + String.join(", ", parts) + "}";
        }

        public RideOn build() {
            org.zwiftj.api.model.RideOn result = new org.zwiftj.api.model.RideOn();
            result.__bitField0 = __bitField0;
            result.riderId = this.riderId;
            result.toRiderId = this.toRiderId;
            result.firstName = this.firstName;
            result.lastName = this.lastName;
            result.countryCode = this.countryCode;
            return result;
        }

    }



}