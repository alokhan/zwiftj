package org.zwiftj.api.model;

@javax.annotation.Generated("per-session-info.proto")
public final class PerSessionInfo
        implements io.protostuff.Message<PerSessionInfo> {

    private static final PerSessionInfo DEFAULT_INSTANCE = newBuilder().build();

    private String relayUrl;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PerSessionInfo() {
        this.relayUrl = "";
    }

    private PerSessionInfo(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PerSessionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PerSessionInfo> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getRelayUrl() {
        return relayUrl;
    }

    public boolean hasRelayUrl() {
        return (__bitField0 & 1) == 1;
    }

    public PerSessionInfo withRelayUrl(String value) {
        return PerSessionInfo.newBuilder()
            .mergeFrom(this)
            .setRelayUrl(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PerSessionInfo> cachedSchema() {
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
        PerSessionInfo that = (PerSessionInfo) obj;
        if (!java.util.Objects.equals(this.relayUrl, that.relayUrl)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.relayUrl == null ? 0 : this.relayUrl.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasRelayUrl()) {
            parts.add("relayUrl=" + getRelayUrl());
        }
        return "PerSessionInfo{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PerSessionInfo>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("relayUrl", 1);
        }

        @Override
        public PerSessionInfo newMessage() {
            return new PerSessionInfo();
        }

        @Override
        public Class<PerSessionInfo> typeClass() {
            return PerSessionInfo.class;
        }

        @Override
        public String messageName() {
            return PerSessionInfo.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PerSessionInfo.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PerSessionInfo message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PerSessionInfo instance) throws java.io.IOException {
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
                    	instance.relayUrl = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PerSessionInfo instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.relayUrl, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "relayUrl";
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

        private String relayUrl;

        private int __bitField0;

        private Builder() {
            this.relayUrl = "";
        }

        public Builder mergeFrom(PerSessionInfo instance) {
            if (instance.hasRelayUrl()) {
                this.setRelayUrl(instance.getRelayUrl());
            }

            return this;
        }

        public String getRelayUrl() {
            return relayUrl;
        }

        public Builder setRelayUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PerSessionInfo#relayUrl to null");
            }

            this.relayUrl = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearRelayUrl() {
            this.relayUrl = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasRelayUrl() {
            return (__bitField0 & 1) == 1;
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
            if (!java.util.Objects.equals(this.relayUrl, that.relayUrl)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.relayUrl == null ? 0 : this.relayUrl.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasRelayUrl()) {
                parts.add("relayUrl=" + getRelayUrl());
            }
            return "PerSessionInfo{" + String.join(", ", parts) + "}";
        }

        public PerSessionInfo build() {
            org.zwiftj.api.model.PerSessionInfo result = new org.zwiftj.api.model.PerSessionInfo();
            result.__bitField0 = __bitField0;
            result.relayUrl = this.relayUrl;
            return result;
        }

    }



}