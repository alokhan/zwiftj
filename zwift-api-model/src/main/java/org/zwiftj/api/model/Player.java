package org.zwiftj.api.model;

@javax.annotation.Generated("world.proto")
public final class Player
        implements io.protostuff.Message<Player> {

    private static final Player DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private String firstName;

    private String lastName;

    private int distance;

    private int time;

    private int f6;

    private int f8;

    private int f9;

    private int f10;

    private int f11;

    private int power;

    private int f13;

    private float x;

    private float altitude;

    private float y;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Player() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.distance = 0;
        this.time = 0;
        this.f6 = 0;
        this.f8 = 0;
        this.f9 = 0;
        this.f10 = 0;
        this.f11 = 0;
        this.power = 0;
        this.f13 = 0;
        this.x = 0f;
        this.altitude = 0f;
        this.y = 0f;
    }

    private Player(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Player getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Player> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public Player withId(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean hasFirstName() {
        return (__bitField0 & 2) == 2;
    }

    public Player withFirstName(String value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setFirstName(value)
            .build();
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasLastName() {
        return (__bitField0 & 4) == 4;
    }

    public Player withLastName(String value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setLastName(value)
            .build();
    }

    public int getDistance() {
        return distance;
    }

    public boolean hasDistance() {
        return (__bitField0 & 8) == 8;
    }

    public Player withDistance(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setDistance(value)
            .build();
    }

    public int getTime() {
        return time;
    }

    public boolean hasTime() {
        return (__bitField0 & 16) == 16;
    }

    public Player withTime(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setTime(value)
            .build();
    }

    public int getF6() {
        return f6;
    }

    public boolean hasF6() {
        return (__bitField0 & 32) == 32;
    }

    public Player withF6(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setF6(value)
            .build();
    }

    public int getF8() {
        return f8;
    }

    public boolean hasF8() {
        return (__bitField0 & 64) == 64;
    }

    public Player withF8(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setF8(value)
            .build();
    }

    public int getF9() {
        return f9;
    }

    public boolean hasF9() {
        return (__bitField0 & 128) == 128;
    }

    public Player withF9(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setF9(value)
            .build();
    }

    public int getF10() {
        return f10;
    }

    public boolean hasF10() {
        return (__bitField0 & 256) == 256;
    }

    public Player withF10(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setF10(value)
            .build();
    }

    public int getF11() {
        return f11;
    }

    public boolean hasF11() {
        return (__bitField0 & 512) == 512;
    }

    public Player withF11(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setF11(value)
            .build();
    }

    public int getPower() {
        return power;
    }

    public boolean hasPower() {
        return (__bitField0 & 1024) == 1024;
    }

    public Player withPower(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setPower(value)
            .build();
    }

    public int getF13() {
        return f13;
    }

    public boolean hasF13() {
        return (__bitField0 & 2048) == 2048;
    }

    public Player withF13(int value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setF13(value)
            .build();
    }

    public float getX() {
        return x;
    }

    public boolean hasX() {
        return (__bitField0 & 4096) == 4096;
    }

    public Player withX(float value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setX(value)
            .build();
    }

    public float getAltitude() {
        return altitude;
    }

    public boolean hasAltitude() {
        return (__bitField0 & 8192) == 8192;
    }

    public Player withAltitude(float value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setAltitude(value)
            .build();
    }

    public float getY() {
        return y;
    }

    public boolean hasY() {
        return (__bitField0 & 16384) == 16384;
    }

    public Player withY(float value) {
        return Player.newBuilder()
            .mergeFrom(this)
            .setY(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Player> cachedSchema() {
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
        Player that = (Player) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.firstName, that.firstName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lastName, that.lastName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.distance, that.distance)) {
            return false;
        }
        if (!java.util.Objects.equals(this.time, that.time)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f6, that.f6)) {
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
        if (!java.util.Objects.equals(this.power, that.power)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f13, that.f13)) {
            return false;
        }
        if (!java.util.Objects.equals(this.x, that.x)) {
            return false;
        }
        if (!java.util.Objects.equals(this.altitude, that.altitude)) {
            return false;
        }
        if (!java.util.Objects.equals(this.y, that.y)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
        result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
        result = 31 * result + Integer.hashCode(this.distance);
        result = 31 * result + Integer.hashCode(this.time);
        result = 31 * result + Integer.hashCode(this.f6);
        result = 31 * result + Integer.hashCode(this.f8);
        result = 31 * result + Integer.hashCode(this.f9);
        result = 31 * result + Integer.hashCode(this.f10);
        result = 31 * result + Integer.hashCode(this.f11);
        result = 31 * result + Integer.hashCode(this.power);
        result = 31 * result + Integer.hashCode(this.f13);
        result = 31 * result + Float.hashCode(this.x);
        result = 31 * result + Float.hashCode(this.altitude);
        result = 31 * result + Float.hashCode(this.y);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasFirstName()) {
            parts.add("firstName=" + getFirstName());
        }
        if (hasLastName()) {
            parts.add("lastName=" + getLastName());
        }
        if (hasDistance()) {
            parts.add("distance=" + getDistance());
        }
        if (hasTime()) {
            parts.add("time=" + getTime());
        }
        if (hasF6()) {
            parts.add("f6=" + getF6());
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
            parts.add("f11=" + getF11());
        }
        if (hasPower()) {
            parts.add("power=" + getPower());
        }
        if (hasF13()) {
            parts.add("f13=" + getF13());
        }
        if (hasX()) {
            parts.add("x=" + getX());
        }
        if (hasAltitude()) {
            parts.add("altitude=" + getAltitude());
        }
        if (hasY()) {
            parts.add("y=" + getY());
        }
        return "Player{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Player>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("firstName", 2);
        	__fieldMap.put("lastName", 3);
        	__fieldMap.put("distance", 4);
        	__fieldMap.put("time", 5);
        	__fieldMap.put("f6", 6);
        	__fieldMap.put("f8", 8);
        	__fieldMap.put("f9", 9);
        	__fieldMap.put("f10", 10);
        	__fieldMap.put("f11", 11);
        	__fieldMap.put("power", 12);
        	__fieldMap.put("f13", 13);
        	__fieldMap.put("x", 14);
        	__fieldMap.put("altitude", 15);
        	__fieldMap.put("y", 16);
        }

        @Override
        public Player newMessage() {
            return new Player();
        }

        @Override
        public Class<Player> typeClass() {
            return Player.class;
        }

        @Override
        public String messageName() {
            return Player.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Player.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Player message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Player instance) throws java.io.IOException {
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
                    	instance.id = input.readUInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.firstName = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.lastName = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.distance = input.readUInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.time = input.readUInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.f6 = input.readUInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 8:
                    	instance.f8 = input.readUInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 9:
                    	instance.f9 = input.readUInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 10:
                    	instance.f10 = input.readUInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 11:
                    	instance.f11 = input.readUInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 12:
                    	instance.power = input.readUInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 13:
                    	instance.f13 = input.readUInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 14:
                    	instance.x = input.readFloat();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 15:
                    	instance.altitude = input.readFloat();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 16:
                    	instance.y = input.readFloat();
                    	instance.__bitField0 |= 16384;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, Player instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.firstName, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.lastName, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeUInt32(4, instance.distance, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeUInt32(5, instance.time, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeUInt32(6, instance.f6, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeUInt32(8, instance.f8, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeUInt32(9, instance.f9, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeUInt32(10, instance.f10, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeUInt32(11, instance.f11, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeUInt32(12, instance.power, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeUInt32(13, instance.f13, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeFloat(14, instance.x, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeFloat(15, instance.altitude, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeFloat(16, instance.y, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "firstName";
        		case 3: return "lastName";
        		case 4: return "distance";
        		case 5: return "time";
        		case 6: return "f6";
        		case 8: return "f8";
        		case 9: return "f9";
        		case 10: return "f10";
        		case 11: return "f11";
        		case 12: return "power";
        		case 13: return "f13";
        		case 14: return "x";
        		case 15: return "altitude";
        		case 16: return "y";
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

        private int id;

        private String firstName;

        private String lastName;

        private int distance;

        private int time;

        private int f6;

        private int f8;

        private int f9;

        private int f10;

        private int f11;

        private int power;

        private int f13;

        private float x;

        private float altitude;

        private float y;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.firstName = "";
            this.lastName = "";
            this.distance = 0;
            this.time = 0;
            this.f6 = 0;
            this.f8 = 0;
            this.f9 = 0;
            this.f10 = 0;
            this.f11 = 0;
            this.power = 0;
            this.f13 = 0;
            this.x = 0f;
            this.altitude = 0f;
            this.y = 0f;
        }

        public Builder mergeFrom(Player instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasFirstName()) {
                this.setFirstName(instance.getFirstName());
            }

            if (instance.hasLastName()) {
                this.setLastName(instance.getLastName());
            }

            if (instance.hasDistance()) {
                this.setDistance(instance.getDistance());
            }

            if (instance.hasTime()) {
                this.setTime(instance.getTime());
            }

            if (instance.hasF6()) {
                this.setF6(instance.getF6());
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

            if (instance.hasPower()) {
                this.setPower(instance.getPower());
            }

            if (instance.hasF13()) {
                this.setF13(instance.getF13());
            }

            if (instance.hasX()) {
                this.setX(instance.getX());
            }

            if (instance.hasAltitude()) {
                this.setAltitude(instance.getAltitude());
            }

            if (instance.hasY()) {
                this.setY(instance.getY());
            }

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Player#firstName to null");
            }

            this.firstName = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearFirstName() {
            this.firstName = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasFirstName() {
            return (__bitField0 & 2) == 2;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Player#lastName to null");
            }

            this.lastName = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearLastName() {
            this.lastName = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasLastName() {
            return (__bitField0 & 4) == 4;
        }

        public int getDistance() {
            return distance;
        }

        public Builder setDistance(int value) {
            this.distance = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearDistance() {
            this.distance = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasDistance() {
            return (__bitField0 & 8) == 8;
        }

        public int getTime() {
            return time;
        }

        public Builder setTime(int value) {
            this.time = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearTime() {
            this.time = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasTime() {
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

        public int getF8() {
            return f8;
        }

        public Builder setF8(int value) {
            this.f8 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearF8() {
            this.f8 = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasF8() {
            return (__bitField0 & 64) == 64;
        }

        public int getF9() {
            return f9;
        }

        public Builder setF9(int value) {
            this.f9 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearF9() {
            this.f9 = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasF9() {
            return (__bitField0 & 128) == 128;
        }

        public int getF10() {
            return f10;
        }

        public Builder setF10(int value) {
            this.f10 = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearF10() {
            this.f10 = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasF10() {
            return (__bitField0 & 256) == 256;
        }

        public int getF11() {
            return f11;
        }

        public Builder setF11(int value) {
            this.f11 = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearF11() {
            this.f11 = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasF11() {
            return (__bitField0 & 512) == 512;
        }

        public int getPower() {
            return power;
        }

        public Builder setPower(int value) {
            this.power = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearPower() {
            this.power = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasPower() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getF13() {
            return f13;
        }

        public Builder setF13(int value) {
            this.f13 = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearF13() {
            this.f13 = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasF13() {
            return (__bitField0 & 2048) == 2048;
        }

        public float getX() {
            return x;
        }

        public Builder setX(float value) {
            this.x = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearX() {
            this.x = 0f;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasX() {
            return (__bitField0 & 4096) == 4096;
        }

        public float getAltitude() {
            return altitude;
        }

        public Builder setAltitude(float value) {
            this.altitude = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearAltitude() {
            this.altitude = 0f;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasAltitude() {
            return (__bitField0 & 8192) == 8192;
        }

        public float getY() {
            return y;
        }

        public Builder setY(float value) {
            this.y = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearY() {
            this.y = 0f;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasY() {
            return (__bitField0 & 16384) == 16384;
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
            if (!java.util.Objects.equals(this.firstName, that.firstName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lastName, that.lastName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.distance, that.distance)) {
                return false;
            }
            if (!java.util.Objects.equals(this.time, that.time)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f6, that.f6)) {
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
            if (!java.util.Objects.equals(this.power, that.power)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f13, that.f13)) {
                return false;
            }
            if (!java.util.Objects.equals(this.x, that.x)) {
                return false;
            }
            if (!java.util.Objects.equals(this.altitude, that.altitude)) {
                return false;
            }
            if (!java.util.Objects.equals(this.y, that.y)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
            result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
            result = 31 * result + Integer.hashCode(this.distance);
            result = 31 * result + Integer.hashCode(this.time);
            result = 31 * result + Integer.hashCode(this.f6);
            result = 31 * result + Integer.hashCode(this.f8);
            result = 31 * result + Integer.hashCode(this.f9);
            result = 31 * result + Integer.hashCode(this.f10);
            result = 31 * result + Integer.hashCode(this.f11);
            result = 31 * result + Integer.hashCode(this.power);
            result = 31 * result + Integer.hashCode(this.f13);
            result = 31 * result + Float.hashCode(this.x);
            result = 31 * result + Float.hashCode(this.altitude);
            result = 31 * result + Float.hashCode(this.y);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasFirstName()) {
                parts.add("firstName=" + getFirstName());
            }
            if (hasLastName()) {
                parts.add("lastName=" + getLastName());
            }
            if (hasDistance()) {
                parts.add("distance=" + getDistance());
            }
            if (hasTime()) {
                parts.add("time=" + getTime());
            }
            if (hasF6()) {
                parts.add("f6=" + getF6());
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
                parts.add("f11=" + getF11());
            }
            if (hasPower()) {
                parts.add("power=" + getPower());
            }
            if (hasF13()) {
                parts.add("f13=" + getF13());
            }
            if (hasX()) {
                parts.add("x=" + getX());
            }
            if (hasAltitude()) {
                parts.add("altitude=" + getAltitude());
            }
            if (hasY()) {
                parts.add("y=" + getY());
            }
            return "Player{" + String.join(", ", parts) + "}";
        }

        public Player build() {
            org.zwiftj.api.model.Player result = new org.zwiftj.api.model.Player();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.firstName = this.firstName;
            result.lastName = this.lastName;
            result.distance = this.distance;
            result.time = this.time;
            result.f6 = this.f6;
            result.f8 = this.f8;
            result.f9 = this.f9;
            result.f10 = this.f10;
            result.f11 = this.f11;
            result.power = this.power;
            result.f13 = this.f13;
            result.x = this.x;
            result.altitude = this.altitude;
            result.y = this.y;
            return result;
        }

    }



}