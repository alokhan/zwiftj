package org.zwiftj.api.model;

@javax.annotation.Generated("udp-node-msgs.proto")
public final class ChatMessage
        implements io.protostuff.Message<ChatMessage> {

    private static final ChatMessage DEFAULT_INSTANCE = newBuilder().build();

    private int riderId;

    private int toRiderId;

    private int f3;

    private String firstName;

    private String lastName;

    private String message;

    private String avatar;

    private int countryCode;

    private int eventSubgroup;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ChatMessage() {
        this.riderId = 0;
        this.toRiderId = 0;
        this.f3 = 0;
        this.firstName = "";
        this.lastName = "";
        this.message = "";
        this.avatar = "";
        this.countryCode = 0;
        this.eventSubgroup = 0;
    }

    private ChatMessage(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ChatMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ChatMessage> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getRiderId() {
        return riderId;
    }

    public boolean hasRiderId() {
        return (__bitField0 & 1) == 1;
    }

    public ChatMessage withRiderId(int value) {
        return ChatMessage.newBuilder()
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

    public ChatMessage withToRiderId(int value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setToRiderId(value)
            .build();
    }

    public int getF3() {
        return f3;
    }

    public boolean hasF3() {
        return (__bitField0 & 4) == 4;
    }

    public ChatMessage withF3(int value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean hasFirstName() {
        return (__bitField0 & 8) == 8;
    }

    public ChatMessage withFirstName(String value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setFirstName(value)
            .build();
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasLastName() {
        return (__bitField0 & 16) == 16;
    }

    public ChatMessage withLastName(String value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setLastName(value)
            .build();
    }

    public String getMessage() {
        return message;
    }

    public boolean hasMessage() {
        return (__bitField0 & 32) == 32;
    }

    public ChatMessage withMessage(String value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setMessage(value)
            .build();
    }

    public String getAvatar() {
        return avatar;
    }

    public boolean hasAvatar() {
        return (__bitField0 & 64) == 64;
    }

    public ChatMessage withAvatar(String value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setAvatar(value)
            .build();
    }

    public int getCountryCode() {
        return countryCode;
    }

    public boolean hasCountryCode() {
        return (__bitField0 & 128) == 128;
    }

    public ChatMessage withCountryCode(int value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setCountryCode(value)
            .build();
    }

    public int getEventSubgroup() {
        return eventSubgroup;
    }

    public boolean hasEventSubgroup() {
        return (__bitField0 & 256) == 256;
    }

    public ChatMessage withEventSubgroup(int value) {
        return ChatMessage.newBuilder()
            .mergeFrom(this)
            .setEventSubgroup(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ChatMessage> cachedSchema() {
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
        ChatMessage that = (ChatMessage) obj;
        if (!java.util.Objects.equals(this.riderId, that.riderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toRiderId, that.toRiderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.firstName, that.firstName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lastName, that.lastName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.message, that.message)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avatar, that.avatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.countryCode, that.countryCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.eventSubgroup, that.eventSubgroup)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.riderId);
        result = 31 * result + Integer.hashCode(this.toRiderId);
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
        result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
        result = 31 * result + (this.message == null ? 0 : this.message.hashCode());
        result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
        result = 31 * result + Integer.hashCode(this.countryCode);
        result = 31 * result + Integer.hashCode(this.eventSubgroup);

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
        if (hasF3()) {
            parts.add("f3=" + getF3());
        }
        if (hasFirstName()) {
            parts.add("firstName=" + getFirstName());
        }
        if (hasLastName()) {
            parts.add("lastName=" + getLastName());
        }
        if (hasMessage()) {
            parts.add("message=" + getMessage());
        }
        if (hasAvatar()) {
            parts.add("avatar=" + getAvatar());
        }
        if (hasCountryCode()) {
            parts.add("countryCode=" + getCountryCode());
        }
        if (hasEventSubgroup()) {
            parts.add("eventSubgroup=" + getEventSubgroup());
        }
        return "ChatMessage{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ChatMessage>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("riderId", 1);
        	__fieldMap.put("toRiderId", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("firstName", 4);
        	__fieldMap.put("lastName", 5);
        	__fieldMap.put("message", 6);
        	__fieldMap.put("avatar", 7);
        	__fieldMap.put("countryCode", 8);
        	__fieldMap.put("eventSubgroup", 11);
        }

        @Override
        public ChatMessage newMessage() {
            return new ChatMessage();
        }

        @Override
        public Class<ChatMessage> typeClass() {
            return ChatMessage.class;
        }

        @Override
        public String messageName() {
            return ChatMessage.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ChatMessage.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ChatMessage message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ChatMessage instance) throws java.io.IOException {
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
                    	instance.f3 = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.firstName = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.lastName = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.message = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.avatar = input.readString();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.countryCode = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 11:
                    	instance.eventSubgroup = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ChatMessage instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.riderId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.toRiderId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.firstName, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.lastName, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.message, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeString(7, instance.avatar, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.countryCode, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(11, instance.eventSubgroup, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "riderId";
        		case 2: return "toRiderId";
        		case 3: return "f3";
        		case 4: return "firstName";
        		case 5: return "lastName";
        		case 6: return "message";
        		case 7: return "avatar";
        		case 8: return "countryCode";
        		case 11: return "eventSubgroup";
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

        private int f3;

        private String firstName;

        private String lastName;

        private String message;

        private String avatar;

        private int countryCode;

        private int eventSubgroup;

        private int __bitField0;

        private Builder() {
            this.riderId = 0;
            this.toRiderId = 0;
            this.f3 = 0;
            this.firstName = "";
            this.lastName = "";
            this.message = "";
            this.avatar = "";
            this.countryCode = 0;
            this.eventSubgroup = 0;
        }

        public Builder mergeFrom(ChatMessage instance) {
            if (instance.hasRiderId()) {
                this.setRiderId(instance.getRiderId());
            }

            if (instance.hasToRiderId()) {
                this.setToRiderId(instance.getToRiderId());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasFirstName()) {
                this.setFirstName(instance.getFirstName());
            }

            if (instance.hasLastName()) {
                this.setLastName(instance.getLastName());
            }

            if (instance.hasMessage()) {
                this.setMessage(instance.getMessage());
            }

            if (instance.hasAvatar()) {
                this.setAvatar(instance.getAvatar());
            }

            if (instance.hasCountryCode()) {
                this.setCountryCode(instance.getCountryCode());
            }

            if (instance.hasEventSubgroup()) {
                this.setEventSubgroup(instance.getEventSubgroup());
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

        public int getF3() {
            return f3;
        }

        public Builder setF3(int value) {
            this.f3 = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearF3() {
            this.f3 = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasF3() {
            return (__bitField0 & 4) == 4;
        }

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChatMessage#firstName to null");
            }

            this.firstName = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFirstName() {
            this.firstName = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFirstName() {
            return (__bitField0 & 8) == 8;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChatMessage#lastName to null");
            }

            this.lastName = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearLastName() {
            this.lastName = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasLastName() {
            return (__bitField0 & 16) == 16;
        }

        public String getMessage() {
            return message;
        }

        public Builder setMessage(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChatMessage#message to null");
            }

            this.message = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearMessage() {
            this.message = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasMessage() {
            return (__bitField0 & 32) == 32;
        }

        public String getAvatar() {
            return avatar;
        }

        public Builder setAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChatMessage#avatar to null");
            }

            this.avatar = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearAvatar() {
            this.avatar = "";
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasAvatar() {
            return (__bitField0 & 64) == 64;
        }

        public int getCountryCode() {
            return countryCode;
        }

        public Builder setCountryCode(int value) {
            this.countryCode = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearCountryCode() {
            this.countryCode = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasCountryCode() {
            return (__bitField0 & 128) == 128;
        }

        public int getEventSubgroup() {
            return eventSubgroup;
        }

        public Builder setEventSubgroup(int value) {
            this.eventSubgroup = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearEventSubgroup() {
            this.eventSubgroup = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasEventSubgroup() {
            return (__bitField0 & 256) == 256;
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
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.firstName, that.firstName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lastName, that.lastName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.message, that.message)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avatar, that.avatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.countryCode, that.countryCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.eventSubgroup, that.eventSubgroup)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.riderId);
            result = 31 * result + Integer.hashCode(this.toRiderId);
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
            result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
            result = 31 * result + (this.message == null ? 0 : this.message.hashCode());
            result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
            result = 31 * result + Integer.hashCode(this.countryCode);
            result = 31 * result + Integer.hashCode(this.eventSubgroup);

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
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (hasFirstName()) {
                parts.add("firstName=" + getFirstName());
            }
            if (hasLastName()) {
                parts.add("lastName=" + getLastName());
            }
            if (hasMessage()) {
                parts.add("message=" + getMessage());
            }
            if (hasAvatar()) {
                parts.add("avatar=" + getAvatar());
            }
            if (hasCountryCode()) {
                parts.add("countryCode=" + getCountryCode());
            }
            if (hasEventSubgroup()) {
                parts.add("eventSubgroup=" + getEventSubgroup());
            }
            return "ChatMessage{" + String.join(", ", parts) + "}";
        }

        public ChatMessage build() {
            org.zwiftj.api.model.ChatMessage result = new org.zwiftj.api.model.ChatMessage();
            result.__bitField0 = __bitField0;
            result.riderId = this.riderId;
            result.toRiderId = this.toRiderId;
            result.f3 = this.f3;
            result.firstName = this.firstName;
            result.lastName = this.lastName;
            result.message = this.message;
            result.avatar = this.avatar;
            result.countryCode = this.countryCode;
            result.eventSubgroup = this.eventSubgroup;
            return result;
        }

    }



}