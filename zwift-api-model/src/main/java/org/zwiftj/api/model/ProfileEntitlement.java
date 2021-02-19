package org.zwiftj.api.model;

@javax.annotation.Generated("profile.proto")
public final class ProfileEntitlement
        implements io.protostuff.Message<ProfileEntitlement> {

    private static final ProfileEntitlement DEFAULT_INSTANCE = newBuilder().build();

    private int f1;

    private long f2;

    private int c;

    private io.protostuff.ByteString f4;

    private int f5;

    private int f6;

    private int f7;

    private int f8;

    private int f9;

    private io.protostuff.ByteString f10;

    private int f11;

    private int f12;

    private boolean f13;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ProfileEntitlement() {
        this.f1 = org.zwiftj.api.model.ProfileEntitlement.EntitlementType.ENTITLEMENTTYPE0.getNumber();
        this.f2 = 0L;
        this.c = org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus.ENTITLEMENTSTATUS0.getNumber();
        this.f4 = io.protostuff.ByteString.EMPTY;
        this.f5 = 0;
        this.f6 = 0;
        this.f7 = 0;
        this.f8 = 0;
        this.f9 = 0;
        this.f10 = io.protostuff.ByteString.EMPTY;
        this.f11 = org.zwiftj.api.model.ProfileEntitlement.Platform.PLATFORM0.getNumber();
        this.f12 = 0;
        this.f13 = false;
    }

    private ProfileEntitlement(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ProfileEntitlement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ProfileEntitlement> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public org.zwiftj.api.model.ProfileEntitlement.EntitlementType getF1() {
        return org.zwiftj.api.model.ProfileEntitlement.EntitlementType.valueOf(f1);
    }

    public int getF1Value() {
        return f1;
    }

    public boolean hasF1() {
        return (__bitField0 & 1) == 1;
    }

    public ProfileEntitlement withF1(org.zwiftj.api.model.ProfileEntitlement.EntitlementType value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF1(value)
            .build();
    }

    public long getF2() {
        return f2;
    }

    public boolean hasF2() {
        return (__bitField0 & 2) == 2;
    }

    public ProfileEntitlement withF2(long value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF2(value)
            .build();
    }

    public org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus getC() {
        return org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus.valueOf(c);
    }

    public int getCValue() {
        return c;
    }

    public boolean hasC() {
        return (__bitField0 & 4) == 4;
    }

    public ProfileEntitlement withC(org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setC(value)
            .build();
    }

    public io.protostuff.ByteString getF4() {
        return f4;
    }

    public boolean hasF4() {
        return (__bitField0 & 8) == 8;
    }

    public ProfileEntitlement withF4(io.protostuff.ByteString value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF4(value)
            .build();
    }

    public int getF5() {
        return f5;
    }

    public boolean hasF5() {
        return (__bitField0 & 16) == 16;
    }

    public ProfileEntitlement withF5(int value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF5(value)
            .build();
    }

    public int getF6() {
        return f6;
    }

    public boolean hasF6() {
        return (__bitField0 & 32) == 32;
    }

    public ProfileEntitlement withF6(int value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF6(value)
            .build();
    }

    public int getF7() {
        return f7;
    }

    public boolean hasF7() {
        return (__bitField0 & 64) == 64;
    }

    public ProfileEntitlement withF7(int value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF7(value)
            .build();
    }

    public int getF8() {
        return f8;
    }

    public boolean hasF8() {
        return (__bitField0 & 128) == 128;
    }

    public ProfileEntitlement withF8(int value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF8(value)
            .build();
    }

    public int getF9() {
        return f9;
    }

    public boolean hasF9() {
        return (__bitField0 & 256) == 256;
    }

    public ProfileEntitlement withF9(int value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF9(value)
            .build();
    }

    public io.protostuff.ByteString getF10() {
        return f10;
    }

    public boolean hasF10() {
        return (__bitField0 & 512) == 512;
    }

    public ProfileEntitlement withF10(io.protostuff.ByteString value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF10(value)
            .build();
    }

    public org.zwiftj.api.model.ProfileEntitlement.Platform getF11() {
        return org.zwiftj.api.model.ProfileEntitlement.Platform.valueOf(f11);
    }

    public int getF11Value() {
        return f11;
    }

    public boolean hasF11() {
        return (__bitField0 & 1024) == 1024;
    }

    public ProfileEntitlement withF11(org.zwiftj.api.model.ProfileEntitlement.Platform value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF11(value)
            .build();
    }

    public int getF12() {
        return f12;
    }

    public boolean hasF12() {
        return (__bitField0 & 2048) == 2048;
    }

    public ProfileEntitlement withF12(int value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF12(value)
            .build();
    }

    public boolean getF13() {
        return f13;
    }

    public boolean hasF13() {
        return (__bitField0 & 4096) == 4096;
    }

    public ProfileEntitlement withF13(boolean value) {
        return ProfileEntitlement.newBuilder()
            .mergeFrom(this)
            .setF13(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ProfileEntitlement> cachedSchema() {
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
        ProfileEntitlement that = (ProfileEntitlement) obj;
        if (!java.util.Objects.equals(this.f1, that.f1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f2, that.f2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.c, that.c)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f4, that.f4)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f5, that.f5)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f6, that.f6)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f7, that.f7)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f8, that.f8)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f9, that.f9)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f10, that.f10)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f11, that.f11)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f12, that.f12)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f13, that.f13)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.f1);
        result = 31 * result + Long.hashCode(this.f2);
        result = 31 * result + Integer.hashCode(this.c);
        result = 31 * result + (this.f4 == null ? 0 : this.f4.hashCode());
        result = 31 * result + Integer.hashCode(this.f5);
        result = 31 * result + Integer.hashCode(this.f6);
        result = 31 * result + Integer.hashCode(this.f7);
        result = 31 * result + Integer.hashCode(this.f8);
        result = 31 * result + Integer.hashCode(this.f9);
        result = 31 * result + (this.f10 == null ? 0 : this.f10.hashCode());
        result = 31 * result + Integer.hashCode(this.f11);
        result = 31 * result + Integer.hashCode(this.f12);
        result = 31 * result + Boolean.hashCode(this.f13);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasF1()) {
            parts.add("f1=" + getF1() + '(' + getF1Value() + ')');
        }
        if (hasF2()) {
            parts.add("f2=" + getF2());
        }
        if (hasC()) {
            parts.add("c=" + getC() + '(' + getCValue() + ')');
        }
        if (hasF4()) {
            parts.add("f4=" + getF4());
        }
        if (hasF5()) {
            parts.add("f5=" + getF5());
        }
        if (hasF6()) {
            parts.add("f6=" + getF6());
        }
        if (hasF7()) {
            parts.add("f7=" + getF7());
        }
        if (hasF8()) {
            parts.add("f8=" + getF8());
        }
        if (hasF9()) {
            parts.add("f9=" + getF9());
        }
        if (hasF10()) {
            parts.add("f10=" + getF10());
        }
        if (hasF11()) {
            parts.add("f11=" + getF11() + '(' + getF11Value() + ')');
        }
        if (hasF12()) {
            parts.add("f12=" + getF12());
        }
        if (hasF13()) {
            parts.add("f13=" + getF13());
        }
        return "ProfileEntitlement{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ProfileEntitlement>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("f1", 1);
        	__fieldMap.put("f2", 2);
        	__fieldMap.put("c", 3);
        	__fieldMap.put("f4", 4);
        	__fieldMap.put("f5", 5);
        	__fieldMap.put("f6", 6);
        	__fieldMap.put("f7", 7);
        	__fieldMap.put("f8", 8);
        	__fieldMap.put("f9", 9);
        	__fieldMap.put("f10", 10);
        	__fieldMap.put("f11", 11);
        	__fieldMap.put("f12", 12);
        	__fieldMap.put("f13", 13);
        }

        @Override
        public ProfileEntitlement newMessage() {
            return new ProfileEntitlement();
        }

        @Override
        public Class<ProfileEntitlement> typeClass() {
            return ProfileEntitlement.class;
        }

        @Override
        public String messageName() {
            return ProfileEntitlement.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ProfileEntitlement.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ProfileEntitlement message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ProfileEntitlement instance) throws java.io.IOException {
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
                    	instance.f2 = input.readInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.c = input.readEnum();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.f4 = input.readBytes();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.f5 = input.readUInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.f6 = input.readUInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.f7 = input.readUInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.f8 = input.readUInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.f9 = input.readUInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.f10 = input.readBytes();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.f11 = input.readEnum();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.f12 = input.readUInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.f13 = input.readBool();
                    	instance.__bitField0 |= 4096;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ProfileEntitlement instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.f1, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt64(2, instance.f2, false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeEnum(3, instance.c, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeBytes(4, instance.f4, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeUInt32(5, instance.f5, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeUInt32(6, instance.f6, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeUInt32(7, instance.f7, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeUInt32(8, instance.f8, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeUInt32(9, instance.f9, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeBytes(10, instance.f10, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
            	output.writeEnum(11, instance.f11, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeUInt32(12, instance.f12, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeBool(13, instance.f13, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "f1";
        		case 2: return "f2";
        		case 3: return "c";
        		case 4: return "f4";
        		case 5: return "f5";
        		case 6: return "f6";
        		case 7: return "f7";
        		case 8: return "f8";
        		case 9: return "f9";
        		case 10: return "f10";
        		case 11: return "f11";
        		case 12: return "f12";
        		case 13: return "f13";
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

        private long f2;

        private int c;

        private io.protostuff.ByteString f4;

        private int f5;

        private int f6;

        private int f7;

        private int f8;

        private int f9;

        private io.protostuff.ByteString f10;

        private int f11;

        private int f12;

        private boolean f13;

        private int __bitField0;

        private Builder() {
            this.f1 = org.zwiftj.api.model.ProfileEntitlement.EntitlementType.ENTITLEMENTTYPE0.getNumber();
            this.f2 = 0L;
            this.c = org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus.ENTITLEMENTSTATUS0.getNumber();
            this.f4 = io.protostuff.ByteString.EMPTY;
            this.f5 = 0;
            this.f6 = 0;
            this.f7 = 0;
            this.f8 = 0;
            this.f9 = 0;
            this.f10 = io.protostuff.ByteString.EMPTY;
            this.f11 = org.zwiftj.api.model.ProfileEntitlement.Platform.PLATFORM0.getNumber();
            this.f12 = 0;
            this.f13 = false;
        }

        public Builder mergeFrom(ProfileEntitlement instance) {
            if (instance.hasF1()) {
                this.setF1(instance.getF1());
            }

            if (instance.hasF2()) {
                this.setF2(instance.getF2());
            }

            if (instance.hasC()) {
                this.setC(instance.getC());
            }

            if (instance.hasF4()) {
                this.setF4(instance.getF4());
            }

            if (instance.hasF5()) {
                this.setF5(instance.getF5());
            }

            if (instance.hasF6()) {
                this.setF6(instance.getF6());
            }

            if (instance.hasF7()) {
                this.setF7(instance.getF7());
            }

            if (instance.hasF8()) {
                this.setF8(instance.getF8());
            }

            if (instance.hasF9()) {
                this.setF9(instance.getF9());
            }

            if (instance.hasF10()) {
                this.setF10(instance.getF10());
            }

            if (instance.hasF11()) {
                this.setF11(instance.getF11());
            }

            if (instance.hasF12()) {
                this.setF12(instance.getF12());
            }

            if (instance.hasF13()) {
                this.setF13(instance.getF13());
            }

            return this;
        }

        public org.zwiftj.api.model.ProfileEntitlement.EntitlementType getF1() {
            return org.zwiftj.api.model.ProfileEntitlement.EntitlementType.valueOf(f1);
        }

        public int getF1Value() {
            return f1;
        }

        public Builder setF1(org.zwiftj.api.model.ProfileEntitlement.EntitlementType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileEntitlement#f1 to null");
            }

            if (value == org.zwiftj.api.model.ProfileEntitlement.EntitlementType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ProfileEntitlement#f1 to UNRECOGNIZED");
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

        public long getF2() {
            return f2;
        }

        public Builder setF2(long value) {
            this.f2 = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearF2() {
            this.f2 = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasF2() {
            return (__bitField0 & 2) == 2;
        }

        public org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus getC() {
            return org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus.valueOf(c);
        }

        public int getCValue() {
            return c;
        }

        public Builder setC(org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileEntitlement#c to null");
            }

            if (value == org.zwiftj.api.model.ProfileEntitlement.ProfileEntitlementStatus.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ProfileEntitlement#c to UNRECOGNIZED");
            }

            this.c = value.getNumber();
            __bitField0 |= 4;
            return this;
        }

        public Builder setCValue(int value) {
            this.c = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearC() {
            this.c = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasC() {
            return (__bitField0 & 4) == 4;
        }

        public io.protostuff.ByteString getF4() {
            return f4;
        }

        public Builder setF4(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileEntitlement#f4 to null");
            }

            this.f4 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearF4() {
            this.f4 = io.protostuff.ByteString.EMPTY;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasF4() {
            return (__bitField0 & 8) == 8;
        }

        public int getF5() {
            return f5;
        }

        public Builder setF5(int value) {
            this.f5 = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearF5() {
            this.f5 = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasF5() {
            return (__bitField0 & 16) == 16;
        }

        public int getF6() {
            return f6;
        }

        public Builder setF6(int value) {
            this.f6 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearF6() {
            this.f6 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasF6() {
            return (__bitField0 & 32) == 32;
        }

        public int getF7() {
            return f7;
        }

        public Builder setF7(int value) {
            this.f7 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearF7() {
            this.f7 = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasF7() {
            return (__bitField0 & 64) == 64;
        }

        public int getF8() {
            return f8;
        }

        public Builder setF8(int value) {
            this.f8 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearF8() {
            this.f8 = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasF8() {
            return (__bitField0 & 128) == 128;
        }

        public int getF9() {
            return f9;
        }

        public Builder setF9(int value) {
            this.f9 = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearF9() {
            this.f9 = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasF9() {
            return (__bitField0 & 256) == 256;
        }

        public io.protostuff.ByteString getF10() {
            return f10;
        }

        public Builder setF10(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileEntitlement#f10 to null");
            }

            this.f10 = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearF10() {
            this.f10 = io.protostuff.ByteString.EMPTY;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasF10() {
            return (__bitField0 & 512) == 512;
        }

        public org.zwiftj.api.model.ProfileEntitlement.Platform getF11() {
            return org.zwiftj.api.model.ProfileEntitlement.Platform.valueOf(f11);
        }

        public int getF11Value() {
            return f11;
        }

        public Builder setF11(org.zwiftj.api.model.ProfileEntitlement.Platform value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileEntitlement#f11 to null");
            }

            if (value == org.zwiftj.api.model.ProfileEntitlement.Platform.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ProfileEntitlement#f11 to UNRECOGNIZED");
            }

            this.f11 = value.getNumber();
            __bitField0 |= 1024;
            return this;
        }

        public Builder setF11Value(int value) {
            this.f11 = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearF11() {
            this.f11 = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasF11() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getF12() {
            return f12;
        }

        public Builder setF12(int value) {
            this.f12 = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearF12() {
            this.f12 = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasF12() {
            return (__bitField0 & 2048) == 2048;
        }

        public boolean getF13() {
            return f13;
        }

        public Builder setF13(boolean value) {
            this.f13 = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearF13() {
            this.f13 = false;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasF13() {
            return (__bitField0 & 4096) == 4096;
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
            if (!java.util.Objects.equals(this.c, that.c)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f4, that.f4)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f5, that.f5)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f6, that.f6)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f7, that.f7)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f8, that.f8)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f9, that.f9)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f10, that.f10)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f11, that.f11)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f12, that.f12)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f13, that.f13)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.f1);
            result = 31 * result + Long.hashCode(this.f2);
            result = 31 * result + Integer.hashCode(this.c);
            result = 31 * result + (this.f4 == null ? 0 : this.f4.hashCode());
            result = 31 * result + Integer.hashCode(this.f5);
            result = 31 * result + Integer.hashCode(this.f6);
            result = 31 * result + Integer.hashCode(this.f7);
            result = 31 * result + Integer.hashCode(this.f8);
            result = 31 * result + Integer.hashCode(this.f9);
            result = 31 * result + (this.f10 == null ? 0 : this.f10.hashCode());
            result = 31 * result + Integer.hashCode(this.f11);
            result = 31 * result + Integer.hashCode(this.f12);
            result = 31 * result + Boolean.hashCode(this.f13);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasF1()) {
                parts.add("f1=" + getF1() + '(' + getF1Value() + ')');
            }
            if (hasF2()) {
                parts.add("f2=" + getF2());
            }
            if (hasC()) {
                parts.add("c=" + getC() + '(' + getCValue() + ')');
            }
            if (hasF4()) {
                parts.add("f4=" + getF4());
            }
            if (hasF5()) {
                parts.add("f5=" + getF5());
            }
            if (hasF6()) {
                parts.add("f6=" + getF6());
            }
            if (hasF7()) {
                parts.add("f7=" + getF7());
            }
            if (hasF8()) {
                parts.add("f8=" + getF8());
            }
            if (hasF9()) {
                parts.add("f9=" + getF9());
            }
            if (hasF10()) {
                parts.add("f10=" + getF10());
            }
            if (hasF11()) {
                parts.add("f11=" + getF11() + '(' + getF11Value() + ')');
            }
            if (hasF12()) {
                parts.add("f12=" + getF12());
            }
            if (hasF13()) {
                parts.add("f13=" + getF13());
            }
            return "ProfileEntitlement{" + String.join(", ", parts) + "}";
        }

        public ProfileEntitlement build() {
            org.zwiftj.api.model.ProfileEntitlement result = new org.zwiftj.api.model.ProfileEntitlement();
            result.__bitField0 = __bitField0;
            result.f1 = this.f1;
            result.f2 = this.f2;
            result.c = this.c;
            result.f4 = this.f4;
            result.f5 = this.f5;
            result.f6 = this.f6;
            result.f7 = this.f7;
            result.f8 = this.f8;
            result.f9 = this.f9;
            result.f10 = this.f10;
            result.f11 = this.f11;
            result.f12 = this.f12;
            result.f13 = this.f13;
            return result;
        }

    }


    public enum EntitlementType implements io.protostuff.EnumLite<EntitlementType>{

        ENTITLEMENTTYPE0(0),
        ENTITLEMENTTYPE1(1),
        ENTITLEMENTTYPE2(2),
        ENTITLEMENTTYPE3(3),
        ENTITLEMENTTYPE4(4),
        UNRECOGNIZED(-1);

        private final int value;

        private EntitlementType(int n) {
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

        public static final EntitlementType valueOf(int tag) {
            switch(tag) {
                case 0: return ENTITLEMENTTYPE0;
                case 1: return ENTITLEMENTTYPE1;
                case 2: return ENTITLEMENTTYPE2;
                case 3: return ENTITLEMENTTYPE3;
                case 4: return ENTITLEMENTTYPE4;
                default: return UNRECOGNIZED;
            }
        }
    }

    public enum ProfileEntitlementStatus implements io.protostuff.EnumLite<ProfileEntitlementStatus>{

        ENTITLEMENTSTATUS0(0),
        ENTITLEMENTSTATUS1(1),
        ENTITLEMENTSTATUS2(2),
        ENTITLEMENTSTATUS3(3),
        ENTITLEMENTSTATUS4(4),
        UNRECOGNIZED(-1);

        private final int value;

        private ProfileEntitlementStatus(int n) {
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

        public static final ProfileEntitlementStatus valueOf(int tag) {
            switch(tag) {
                case 0: return ENTITLEMENTSTATUS0;
                case 1: return ENTITLEMENTSTATUS1;
                case 2: return ENTITLEMENTSTATUS2;
                case 3: return ENTITLEMENTSTATUS3;
                case 4: return ENTITLEMENTSTATUS4;
                default: return UNRECOGNIZED;
            }
        }
    }

    public enum Platform implements io.protostuff.EnumLite<Platform>{

        PLATFORM0(0),
        PLATFORM1(1),
        PLATFORM2(2),
        PLATFORM3(3),
        PLATFORM4(4),
        PLATFORM5(5),
        PLATFORM6(6),
        UNRECOGNIZED(-1);

        private final int value;

        private Platform(int n) {
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

        public static final Platform valueOf(int tag) {
            switch(tag) {
                case 0: return PLATFORM0;
                case 1: return PLATFORM1;
                case 2: return PLATFORM2;
                case 3: return PLATFORM3;
                case 4: return PLATFORM4;
                case 5: return PLATFORM5;
                case 6: return PLATFORM6;
                default: return UNRECOGNIZED;
            }
        }
    }

}