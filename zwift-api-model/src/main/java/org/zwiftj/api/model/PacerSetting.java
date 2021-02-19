package org.zwiftj.api.model;

@javax.annotation.Generated("profile.proto")
public final class PacerSetting
        implements io.protostuff.Message<PacerSetting> {

    private static final PacerSetting DEFAULT_INSTANCE = newBuilder().build();

    private long id;

    private long numberValue;

    private int hexValue;

    private String stringValue;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PacerSetting() {
        this.id = 0L;
        this.numberValue = 0L;
        this.hexValue = 0;
        this.stringValue = "";
    }

    private PacerSetting(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PacerSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PacerSetting> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public PacerSetting withId(long value) {
        return PacerSetting.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public long getNumberValue() {
        return numberValue;
    }

    public boolean hasNumberValue() {
        return (__bitField0 & 2) == 2;
    }

    public PacerSetting withNumberValue(long value) {
        return PacerSetting.newBuilder()
            .mergeFrom(this)
            .setNumberValue(value)
            .build();
    }

    public int getHexValue() {
        return hexValue;
    }

    public boolean hasHexValue() {
        return (__bitField0 & 4) == 4;
    }

    public PacerSetting withHexValue(int value) {
        return PacerSetting.newBuilder()
            .mergeFrom(this)
            .setHexValue(value)
            .build();
    }

    public String getStringValue() {
        return stringValue;
    }

    public boolean hasStringValue() {
        return (__bitField0 & 8) == 8;
    }

    public PacerSetting withStringValue(String value) {
        return PacerSetting.newBuilder()
            .mergeFrom(this)
            .setStringValue(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PacerSetting> cachedSchema() {
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
        PacerSetting that = (PacerSetting) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberValue, that.numberValue)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hexValue, that.hexValue)) {
            return false;
        }
        if (!java.util.Objects.equals(this.stringValue, that.stringValue)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.id);
        result = 31 * result + Long.hashCode(this.numberValue);
        result = 31 * result + Integer.hashCode(this.hexValue);
        result = 31 * result + (this.stringValue == null ? 0 : this.stringValue.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasNumberValue()) {
            parts.add("numberValue=" + getNumberValue());
        }
        if (hasHexValue()) {
            parts.add("hexValue=" + getHexValue());
        }
        if (hasStringValue()) {
            parts.add("stringValue=" + getStringValue());
        }
        return "PacerSetting{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PacerSetting>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("numberValue", 2);
        	__fieldMap.put("hexValue", 3);
        	__fieldMap.put("stringValue", 5);
        }

        @Override
        public PacerSetting newMessage() {
            return new PacerSetting();
        }

        @Override
        public Class<PacerSetting> typeClass() {
            return PacerSetting.class;
        }

        @Override
        public String messageName() {
            return PacerSetting.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PacerSetting.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PacerSetting message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PacerSetting instance) throws java.io.IOException {
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
                    	instance.id = input.readInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.numberValue = input.readInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.hexValue = input.readFixed32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 5:
                    	instance.stringValue = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PacerSetting instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt64(2, instance.numberValue, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeFixed32(3, instance.hexValue, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(5, instance.stringValue, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "numberValue";
        		case 3: return "hexValue";
        		case 5: return "stringValue";
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

        private long id;

        private long numberValue;

        private int hexValue;

        private String stringValue;

        private int __bitField0;

        private Builder() {
            this.id = 0L;
            this.numberValue = 0L;
            this.hexValue = 0;
            this.stringValue = "";
        }

        public Builder mergeFrom(PacerSetting instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasNumberValue()) {
                this.setNumberValue(instance.getNumberValue());
            }

            if (instance.hasHexValue()) {
                this.setHexValue(instance.getHexValue());
            }

            if (instance.hasStringValue()) {
                this.setStringValue(instance.getStringValue());
            }

            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public long getNumberValue() {
            return numberValue;
        }

        public Builder setNumberValue(long value) {
            this.numberValue = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearNumberValue() {
            this.numberValue = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasNumberValue() {
            return (__bitField0 & 2) == 2;
        }

        public int getHexValue() {
            return hexValue;
        }

        public Builder setHexValue(int value) {
            this.hexValue = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearHexValue() {
            this.hexValue = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasHexValue() {
            return (__bitField0 & 4) == 4;
        }

        public String getStringValue() {
            return stringValue;
        }

        public Builder setStringValue(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PacerSetting#stringValue to null");
            }

            this.stringValue = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearStringValue() {
            this.stringValue = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasStringValue() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numberValue, that.numberValue)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hexValue, that.hexValue)) {
                return false;
            }
            if (!java.util.Objects.equals(this.stringValue, that.stringValue)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.id);
            result = 31 * result + Long.hashCode(this.numberValue);
            result = 31 * result + Integer.hashCode(this.hexValue);
            result = 31 * result + (this.stringValue == null ? 0 : this.stringValue.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasNumberValue()) {
                parts.add("numberValue=" + getNumberValue());
            }
            if (hasHexValue()) {
                parts.add("hexValue=" + getHexValue());
            }
            if (hasStringValue()) {
                parts.add("stringValue=" + getStringValue());
            }
            return "PacerSetting{" + String.join(", ", parts) + "}";
        }

        public PacerSetting build() {
            org.zwiftj.api.model.PacerSetting result = new org.zwiftj.api.model.PacerSetting();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.numberValue = this.numberValue;
            result.hexValue = this.hexValue;
            result.stringValue = this.stringValue;
            return result;
        }

    }



}