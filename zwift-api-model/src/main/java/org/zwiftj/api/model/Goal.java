package org.zwiftj.api.model;

@javax.annotation.Generated("goal.proto")
public final class Goal
        implements io.protostuff.Message<Goal> {

    private static final Goal DEFAULT_INSTANCE = newBuilder().build();

    private long id;

    private long playerId;

    private int f3;

    private String name;

    private int type;

    private int periodicity;

    private float targetDistance;

    private float targetDuration;

    private float actualDistance;

    private float actualDuration;

    private long createdOn;

    private long periodEndDate;

    private long f13;

    private boolean __merge_lock = false;
    private int __bitField0;

    private Goal() {
        this.id = 0L;
        this.playerId = 0L;
        this.f3 = 0;
        this.name = "";
        this.type = 0;
        this.periodicity = 0;
        this.targetDistance = 0f;
        this.targetDuration = 0f;
        this.actualDistance = 0f;
        this.actualDuration = 0f;
        this.createdOn = 0L;
        this.periodEndDate = 0L;
        this.f13 = 0L;
    }

    private Goal(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Goal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Goal> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public Goal withId(long value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public long getPlayerId() {
        return playerId;
    }

    public boolean hasPlayerId() {
        return (__bitField0 & 2) == 2;
    }

    public Goal withPlayerId(long value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setPlayerId(value)
            .build();
    }

    public int getF3() {
        return f3;
    }

    public boolean hasF3() {
        return (__bitField0 & 4) == 4;
    }

    public Goal withF3(int value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setF3(value)
            .build();
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        return (__bitField0 & 8) == 8;
    }

    public Goal withName(String value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public int getType() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 16) == 16;
    }

    public Goal withType(int value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getPeriodicity() {
        return periodicity;
    }

    public boolean hasPeriodicity() {
        return (__bitField0 & 32) == 32;
    }

    public Goal withPeriodicity(int value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setPeriodicity(value)
            .build();
    }

    public float getTargetDistance() {
        return targetDistance;
    }

    public boolean hasTargetDistance() {
        return (__bitField0 & 64) == 64;
    }

    public Goal withTargetDistance(float value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setTargetDistance(value)
            .build();
    }

    public float getTargetDuration() {
        return targetDuration;
    }

    public boolean hasTargetDuration() {
        return (__bitField0 & 128) == 128;
    }

    public Goal withTargetDuration(float value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setTargetDuration(value)
            .build();
    }

    public float getActualDistance() {
        return actualDistance;
    }

    public boolean hasActualDistance() {
        return (__bitField0 & 256) == 256;
    }

    public Goal withActualDistance(float value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setActualDistance(value)
            .build();
    }

    public float getActualDuration() {
        return actualDuration;
    }

    public boolean hasActualDuration() {
        return (__bitField0 & 512) == 512;
    }

    public Goal withActualDuration(float value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setActualDuration(value)
            .build();
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public boolean hasCreatedOn() {
        return (__bitField0 & 1024) == 1024;
    }

    public Goal withCreatedOn(long value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setCreatedOn(value)
            .build();
    }

    public long getPeriodEndDate() {
        return periodEndDate;
    }

    public boolean hasPeriodEndDate() {
        return (__bitField0 & 2048) == 2048;
    }

    public Goal withPeriodEndDate(long value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setPeriodEndDate(value)
            .build();
    }

    public long getF13() {
        return f13;
    }

    public boolean hasF13() {
        return (__bitField0 & 4096) == 4096;
    }

    public Goal withF13(long value) {
        return Goal.newBuilder()
            .mergeFrom(this)
            .setF13(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Goal> cachedSchema() {
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
        Goal that = (Goal) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerId, that.playerId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f3, that.f3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.periodicity, that.periodicity)) {
            return false;
        }
        if (!java.util.Objects.equals(this.targetDistance, that.targetDistance)) {
            return false;
        }
        if (!java.util.Objects.equals(this.targetDuration, that.targetDuration)) {
            return false;
        }
        if (!java.util.Objects.equals(this.actualDistance, that.actualDistance)) {
            return false;
        }
        if (!java.util.Objects.equals(this.actualDuration, that.actualDuration)) {
            return false;
        }
        if (!java.util.Objects.equals(this.createdOn, that.createdOn)) {
            return false;
        }
        if (!java.util.Objects.equals(this.periodEndDate, that.periodEndDate)) {
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
        result = 31 * result + Long.hashCode(this.id);
        result = 31 * result + Long.hashCode(this.playerId);
        result = 31 * result + Integer.hashCode(this.f3);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.periodicity);
        result = 31 * result + Float.hashCode(this.targetDistance);
        result = 31 * result + Float.hashCode(this.targetDuration);
        result = 31 * result + Float.hashCode(this.actualDistance);
        result = 31 * result + Float.hashCode(this.actualDuration);
        result = 31 * result + Long.hashCode(this.createdOn);
        result = 31 * result + Long.hashCode(this.periodEndDate);
        result = 31 * result + Long.hashCode(this.f13);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasPlayerId()) {
            parts.add("playerId=" + getPlayerId());
        }
        if (hasF3()) {
            parts.add("f3=" + getF3());
        }
        if (hasName()) {
            parts.add("name=" + getName());
        }
        if (hasType()) {
            parts.add("type=" + getType());
        }
        if (hasPeriodicity()) {
            parts.add("periodicity=" + getPeriodicity());
        }
        if (hasTargetDistance()) {
            parts.add("targetDistance=" + getTargetDistance());
        }
        if (hasTargetDuration()) {
            parts.add("targetDuration=" + getTargetDuration());
        }
        if (hasActualDistance()) {
            parts.add("actualDistance=" + getActualDistance());
        }
        if (hasActualDuration()) {
            parts.add("actualDuration=" + getActualDuration());
        }
        if (hasCreatedOn()) {
            parts.add("createdOn=" + getCreatedOn());
        }
        if (hasPeriodEndDate()) {
            parts.add("periodEndDate=" + getPeriodEndDate());
        }
        if (hasF13()) {
            parts.add("f13=" + getF13());
        }
        return "Goal{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Goal>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("playerId", 2);
        	__fieldMap.put("f3", 3);
        	__fieldMap.put("name", 4);
        	__fieldMap.put("type", 5);
        	__fieldMap.put("periodicity", 6);
        	__fieldMap.put("targetDistance", 7);
        	__fieldMap.put("targetDuration", 8);
        	__fieldMap.put("actualDistance", 9);
        	__fieldMap.put("actualDuration", 10);
        	__fieldMap.put("createdOn", 11);
        	__fieldMap.put("periodEndDate", 12);
        	__fieldMap.put("f13", 13);
        }

        @Override
        public Goal newMessage() {
            return new Goal();
        }

        @Override
        public Class<Goal> typeClass() {
            return Goal.class;
        }

        @Override
        public String messageName() {
            return Goal.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Goal.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Goal message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Goal instance) throws java.io.IOException {
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
                    	instance.id = input.readUInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.playerId = input.readUInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.f3 = input.readUInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.name = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.type = input.readUInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.periodicity = input.readUInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.targetDistance = input.readFloat();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.targetDuration = input.readFloat();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.actualDistance = input.readFloat();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.actualDuration = input.readFloat();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.createdOn = input.readUInt64();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.periodEndDate = input.readUInt64();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.f13 = input.readUInt64();
                    	instance.__bitField0 |= 4096;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, Goal instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt64(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeUInt64(2, instance.playerId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeUInt32(3, instance.f3, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.name, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeUInt32(5, instance.type, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeUInt32(6, instance.periodicity, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeFloat(7, instance.targetDistance, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeFloat(8, instance.targetDuration, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeFloat(9, instance.actualDistance, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeFloat(10, instance.actualDuration, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeUInt64(11, instance.createdOn, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeUInt64(12, instance.periodEndDate, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeUInt64(13, instance.f13, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "playerId";
        		case 3: return "f3";
        		case 4: return "name";
        		case 5: return "type";
        		case 6: return "periodicity";
        		case 7: return "targetDistance";
        		case 8: return "targetDuration";
        		case 9: return "actualDistance";
        		case 10: return "actualDuration";
        		case 11: return "createdOn";
        		case 12: return "periodEndDate";
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

        private long id;

        private long playerId;

        private int f3;

        private String name;

        private int type;

        private int periodicity;

        private float targetDistance;

        private float targetDuration;

        private float actualDistance;

        private float actualDuration;

        private long createdOn;

        private long periodEndDate;

        private long f13;

        private int __bitField0;

        private Builder() {
            this.id = 0L;
            this.playerId = 0L;
            this.f3 = 0;
            this.name = "";
            this.type = 0;
            this.periodicity = 0;
            this.targetDistance = 0f;
            this.targetDuration = 0f;
            this.actualDistance = 0f;
            this.actualDuration = 0f;
            this.createdOn = 0L;
            this.periodEndDate = 0L;
            this.f13 = 0L;
        }

        public Builder mergeFrom(Goal instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasPlayerId()) {
                this.setPlayerId(instance.getPlayerId());
            }

            if (instance.hasF3()) {
                this.setF3(instance.getF3());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasPeriodicity()) {
                this.setPeriodicity(instance.getPeriodicity());
            }

            if (instance.hasTargetDistance()) {
                this.setTargetDistance(instance.getTargetDistance());
            }

            if (instance.hasTargetDuration()) {
                this.setTargetDuration(instance.getTargetDuration());
            }

            if (instance.hasActualDistance()) {
                this.setActualDistance(instance.getActualDistance());
            }

            if (instance.hasActualDuration()) {
                this.setActualDuration(instance.getActualDuration());
            }

            if (instance.hasCreatedOn()) {
                this.setCreatedOn(instance.getCreatedOn());
            }

            if (instance.hasPeriodEndDate()) {
                this.setPeriodEndDate(instance.getPeriodEndDate());
            }

            if (instance.hasF13()) {
                this.setF13(instance.getF13());
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

        public long getPlayerId() {
            return playerId;
        }

        public Builder setPlayerId(long value) {
            this.playerId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPlayerId() {
            this.playerId = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasPlayerId() {
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

        public String getName() {
            return name;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Goal#name to null");
            }

            this.name = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearName() {
            this.name = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasName() {
            return (__bitField0 & 8) == 8;
        }

        public int getType() {
            return type;
        }

        public Builder setType(int value) {
            this.type = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 16) == 16;
        }

        public int getPeriodicity() {
            return periodicity;
        }

        public Builder setPeriodicity(int value) {
            this.periodicity = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearPeriodicity() {
            this.periodicity = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasPeriodicity() {
            return (__bitField0 & 32) == 32;
        }

        public float getTargetDistance() {
            return targetDistance;
        }

        public Builder setTargetDistance(float value) {
            this.targetDistance = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearTargetDistance() {
            this.targetDistance = 0f;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasTargetDistance() {
            return (__bitField0 & 64) == 64;
        }

        public float getTargetDuration() {
            return targetDuration;
        }

        public Builder setTargetDuration(float value) {
            this.targetDuration = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearTargetDuration() {
            this.targetDuration = 0f;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasTargetDuration() {
            return (__bitField0 & 128) == 128;
        }

        public float getActualDistance() {
            return actualDistance;
        }

        public Builder setActualDistance(float value) {
            this.actualDistance = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearActualDistance() {
            this.actualDistance = 0f;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasActualDistance() {
            return (__bitField0 & 256) == 256;
        }

        public float getActualDuration() {
            return actualDuration;
        }

        public Builder setActualDuration(float value) {
            this.actualDuration = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearActualDuration() {
            this.actualDuration = 0f;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasActualDuration() {
            return (__bitField0 & 512) == 512;
        }

        public long getCreatedOn() {
            return createdOn;
        }

        public Builder setCreatedOn(long value) {
            this.createdOn = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearCreatedOn() {
            this.createdOn = 0L;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasCreatedOn() {
            return (__bitField0 & 1024) == 1024;
        }

        public long getPeriodEndDate() {
            return periodEndDate;
        }

        public Builder setPeriodEndDate(long value) {
            this.periodEndDate = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearPeriodEndDate() {
            this.periodEndDate = 0L;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasPeriodEndDate() {
            return (__bitField0 & 2048) == 2048;
        }

        public long getF13() {
            return f13;
        }

        public Builder setF13(long value) {
            this.f13 = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearF13() {
            this.f13 = 0L;
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.playerId, that.playerId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.name, that.name)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.periodicity, that.periodicity)) {
                return false;
            }
            if (!java.util.Objects.equals(this.targetDistance, that.targetDistance)) {
                return false;
            }
            if (!java.util.Objects.equals(this.targetDuration, that.targetDuration)) {
                return false;
            }
            if (!java.util.Objects.equals(this.actualDistance, that.actualDistance)) {
                return false;
            }
            if (!java.util.Objects.equals(this.actualDuration, that.actualDuration)) {
                return false;
            }
            if (!java.util.Objects.equals(this.createdOn, that.createdOn)) {
                return false;
            }
            if (!java.util.Objects.equals(this.periodEndDate, that.periodEndDate)) {
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
            result = 31 * result + Long.hashCode(this.id);
            result = 31 * result + Long.hashCode(this.playerId);
            result = 31 * result + Integer.hashCode(this.f3);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.periodicity);
            result = 31 * result + Float.hashCode(this.targetDistance);
            result = 31 * result + Float.hashCode(this.targetDuration);
            result = 31 * result + Float.hashCode(this.actualDistance);
            result = 31 * result + Float.hashCode(this.actualDuration);
            result = 31 * result + Long.hashCode(this.createdOn);
            result = 31 * result + Long.hashCode(this.periodEndDate);
            result = 31 * result + Long.hashCode(this.f13);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasPlayerId()) {
                parts.add("playerId=" + getPlayerId());
            }
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (hasName()) {
                parts.add("name=" + getName());
            }
            if (hasType()) {
                parts.add("type=" + getType());
            }
            if (hasPeriodicity()) {
                parts.add("periodicity=" + getPeriodicity());
            }
            if (hasTargetDistance()) {
                parts.add("targetDistance=" + getTargetDistance());
            }
            if (hasTargetDuration()) {
                parts.add("targetDuration=" + getTargetDuration());
            }
            if (hasActualDistance()) {
                parts.add("actualDistance=" + getActualDistance());
            }
            if (hasActualDuration()) {
                parts.add("actualDuration=" + getActualDuration());
            }
            if (hasCreatedOn()) {
                parts.add("createdOn=" + getCreatedOn());
            }
            if (hasPeriodEndDate()) {
                parts.add("periodEndDate=" + getPeriodEndDate());
            }
            if (hasF13()) {
                parts.add("f13=" + getF13());
            }
            return "Goal{" + String.join(", ", parts) + "}";
        }

        public Goal build() {
            org.zwiftj.api.model.Goal result = new org.zwiftj.api.model.Goal();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.playerId = this.playerId;
            result.f3 = this.f3;
            result.name = this.name;
            result.type = this.type;
            result.periodicity = this.periodicity;
            result.targetDistance = this.targetDistance;
            result.targetDuration = this.targetDuration;
            result.actualDistance = this.actualDistance;
            result.actualDuration = this.actualDuration;
            result.createdOn = this.createdOn;
            result.periodEndDate = this.periodEndDate;
            result.f13 = this.f13;
            return result;
        }

    }



}