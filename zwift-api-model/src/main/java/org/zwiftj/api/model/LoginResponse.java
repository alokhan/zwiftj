package org.zwiftj.api.model;

@javax.annotation.Generated("login-response.proto")
public final class LoginResponse
        implements io.protostuff.Message<LoginResponse> {

    private static final LoginResponse DEFAULT_INSTANCE = newBuilder().build();

    private String sessionState;

    private org.zwiftj.api.model.ServerInfo info;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LoginResponse() {
        this.sessionState = "";
        this.info = org.zwiftj.api.model.ServerInfo.getDefaultInstance();
    }

    private LoginResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LoginResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LoginResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getSessionState() {
        return sessionState;
    }

    public boolean hasSessionState() {
        return (__bitField0 & 1) == 1;
    }

    public LoginResponse withSessionState(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setSessionState(value)
            .build();
    }

    public org.zwiftj.api.model.ServerInfo getInfo() {
        return info;
    }

    public boolean hasInfo() {
        return (__bitField0 & 2) == 2;
    }

    public LoginResponse withInfo(org.zwiftj.api.model.ServerInfo value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setInfo(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LoginResponse> cachedSchema() {
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
        LoginResponse that = (LoginResponse) obj;
        if (!java.util.Objects.equals(this.sessionState, that.sessionState)) {
            return false;
        }
        if (!java.util.Objects.equals(this.info, that.info)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.sessionState == null ? 0 : this.sessionState.hashCode());
        result = 31 * result + (this.info == null ? 0 : this.info.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasSessionState()) {
            parts.add("sessionState=" + getSessionState());
        }
        if (hasInfo()) {
            parts.add("info=" + getInfo());
        }
        return "LoginResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LoginResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("sessionState", 1);
        	__fieldMap.put("info", 2);
        }

        @Override
        public LoginResponse newMessage() {
            return new LoginResponse();
        }

        @Override
        public Class<LoginResponse> typeClass() {
            return LoginResponse.class;
        }

        @Override
        public String messageName() {
            return LoginResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LoginResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LoginResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LoginResponse instance) throws java.io.IOException {
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
                    	instance.sessionState = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.info = input.mergeObject(null, org.zwiftj.api.model.ServerInfo.getSchema());
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, LoginResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.sessionState, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeObject(2, instance.info, org.zwiftj.api.model.ServerInfo.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "sessionState";
        		case 2: return "info";
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

        private String sessionState;

        private org.zwiftj.api.model.ServerInfo info;

        private int __bitField0;

        private Builder() {
            this.sessionState = "";
            this.info = org.zwiftj.api.model.ServerInfo.getDefaultInstance();
        }

        public Builder mergeFrom(LoginResponse instance) {
            if (instance.hasSessionState()) {
                this.setSessionState(instance.getSessionState());
            }

            if (instance.hasInfo()) {
                this.setInfo(instance.getInfo());
            }

            return this;
        }

        public String getSessionState() {
            return sessionState;
        }

        public Builder setSessionState(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#sessionState to null");
            }

            this.sessionState = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearSessionState() {
            this.sessionState = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasSessionState() {
            return (__bitField0 & 1) == 1;
        }

        public org.zwiftj.api.model.ServerInfo getInfo() {
            return info;
        }

        public Builder setInfo(org.zwiftj.api.model.ServerInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#info to null");
            }

            this.info = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearInfo() {
            this.info = org.zwiftj.api.model.ServerInfo.getDefaultInstance();
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasInfo() {
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
            if (!java.util.Objects.equals(this.sessionState, that.sessionState)) {
                return false;
            }
            if (!java.util.Objects.equals(this.info, that.info)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.sessionState == null ? 0 : this.sessionState.hashCode());
            result = 31 * result + (this.info == null ? 0 : this.info.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasSessionState()) {
                parts.add("sessionState=" + getSessionState());
            }
            if (hasInfo()) {
                parts.add("info=" + getInfo());
            }
            return "LoginResponse{" + String.join(", ", parts) + "}";
        }

        public LoginResponse build() {
            org.zwiftj.api.model.LoginResponse result = new org.zwiftj.api.model.LoginResponse();
            result.__bitField0 = __bitField0;
            result.sessionState = this.sessionState;
            result.info = this.info;
            return result;
        }

    }



}