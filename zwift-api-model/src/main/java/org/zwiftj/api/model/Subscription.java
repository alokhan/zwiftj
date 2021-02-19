package org.zwiftj.api.model;

@javax.annotation.Generated("profile.proto")
public final class Subscription
        implements io.protostuff.Message<Subscription> {

    private static final Subscription DEFAULT_INSTANCE = newBuilder().build();

    private int f1;

    private int f2;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Subscription() {
        this.f1 = org.zwiftj.api.model.Subscription.Gateway.GATEWAY0.getNumber();
        this.f2 = org.zwiftj.api.model.Subscription.SubscriptionStatus.STATUS0.getNumber();
    }

    private Subscription(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Subscription getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Subscription> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public org.zwiftj.api.model.Subscription.Gateway getF1() {
        return org.zwiftj.api.model.Subscription.Gateway.valueOf(f1);
    }

    public int getF1Value() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public Subscription withF1(org.zwiftj.api.model.Subscription.Gateway value) {
        return Subscription.newBuilder()
            .mergeFrom(this)
            .setF1(value)
            .build();
    }

    public org.zwiftj.api.model.Subscription.SubscriptionStatus getF2() {
        return org.zwiftj.api.model.Subscription.SubscriptionStatus.valueOf(f2);
    }

    public int getF2Value() {
        return f2;
    }

    public boolean hasF2() {
        return (__bitField0 & 2) == 2;
    }

    public Subscription withF2(org.zwiftj.api.model.Subscription.SubscriptionStatus value) {
        return Subscription.newBuilder()
            .mergeFrom(this)
            .setF2(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Subscription> cachedSchema() {
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
        Subscription that = (Subscription) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f2, that.f2)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.f1);
        result = 31 * result + Integer.hashCode(this.f2);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasF1()) {
            parts.add("f1=" + getF1() + '(' + getF1Value() + ')');
        }
        if (hasF2()) {
            parts.add("f2=" + getF2() + '(' + getF2Value() + ')');
        }
        return "Subscription{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Subscription>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("f2", 2);
        }

        @Override
        public Subscription newMessage() {
            return new Subscription();
        }

        @Override
        public Class<Subscription> typeClass() {
            return Subscription.class;
        }

        @Override
        public String messageName() {
            return Subscription.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Subscription.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Subscription message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Subscription instance) throws java.io.IOException {
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
                    	instance.f1 = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.f2 = input.readEnum();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, Subscription instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeEnum(2, instance.f2, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "f2";
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

        private int f1;

        private int f2;

        private int __bitField0;

        private Builder() {
            this.f1 = org.zwiftj.api.model.Subscription.Gateway.GATEWAY0.getNumber();
            this.f2 = org.zwiftj.api.model.Subscription.SubscriptionStatus.STATUS0.getNumber();
        }

        public Builder mergeFrom(Subscription instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasF2()) {
                this.setF2(instance.getF2());
            }

            return this;
        }

        public org.zwiftj.api.model.Subscription.Gateway getF1() {
            return org.zwiftj.api.model.Subscription.Gateway.valueOf(f1);
        }

        public int getF1Value() {
            return f1;
        }

        public Builder setF1(org.zwiftj.api.model.Subscription.Gateway value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Subscription#f1 to null");
            }

            if (value == org.zwiftj.api.model.Subscription.Gateway.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set Subscription#f1 to UNRECOGNIZED");
            }

            this.f1 = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setF1Value(int value) {
            this.f1 = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearF1() {
            this.f1 = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasF1() {
            return (__bitField0 & 1) == 1;
        }

        public org.zwiftj.api.model.Subscription.SubscriptionStatus getF2() {
            return org.zwiftj.api.model.Subscription.SubscriptionStatus.valueOf(f2);
        }

        public int getF2Value() {
            return f2;
        }

        public Builder setF2(org.zwiftj.api.model.Subscription.SubscriptionStatus value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Subscription#f2 to null");
            }

            if (value == org.zwiftj.api.model.Subscription.SubscriptionStatus.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set Subscription#f2 to UNRECOGNIZED");
            }

            this.f2 = value.getNumber();
            __bitField0 |= 2;
            return this;
        }

        public Builder setF2Value(int value) {
            this.f2 = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearF2() {
            this.f2 = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasF2() {
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
            if (!java.util.Objects.equals(this.f1, that.f1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f2, that.f2)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.f1);
            result = 31 * result + Integer.hashCode(this.f2);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasF1()) {
                parts.add("f1=" + getF1() + '(' + getF1Value() + ')');
            }
            if (hasF2()) {
                parts.add("f2=" + getF2() + '(' + getF2Value() + ')');
            }
            return "Subscription{" + String.join(", ", parts) + "}";
        }

        public Subscription build() {
            org.zwiftj.api.model.Subscription result = new org.zwiftj.api.model.Subscription();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.f2 = this.f2;
            return result;
        }

    }


    public enum Gateway implements io.protostuff.EnumLite<Gateway>{

        GATEWAY0(0),
        GATEWAY1(1),
        GATEWAY2(2),
        GATEWAY3(3),
        GATEWAY4(4),
        UNRECOGNIZED(-1);

        private final int value;

        private Gateway(int n) {
            this.value = n;
        }

        @Override
        public int getNumber() {
            if (value == -1) {
              throw new java.lang.IllegalStateException(
                  "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public static final Gateway valueOf(int tag) {
            switch(tag) {
                case 0: return GATEWAY0;
                case 1: return GATEWAY1;
                case 2: return GATEWAY2;
                case 3: return GATEWAY3;
                case 4: return GATEWAY4;
                default: return UNRECOGNIZED;
            }
        }
    }

    public enum SubscriptionStatus implements io.protostuff.EnumLite<SubscriptionStatus>{

        STATUS0(0),
        STATUS1(1),
        ACTIVE(2),
        ACTIVE_CANCELLED(3),
        STATUS4(4),
        STATUS5(5),
        STATUS6(6),
        UNRECOGNIZED(-1);

        private final int value;

        private SubscriptionStatus(int n) {
            this.value = n;
        }

        @Override
        public int getNumber() {
            if (value == -1) {
              throw new java.lang.IllegalStateException(
                  "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public static final SubscriptionStatus valueOf(int tag) {
            switch(tag) {
                case 0: return STATUS0;
                case 1: return STATUS1;
                case 2: return ACTIVE;
                case 3: return ACTIVE_CANCELLED;
                case 4: return STATUS4;
                case 5: return STATUS5;
                case 6: return STATUS6;
                default: return UNRECOGNIZED;
            }
        }
    }

}