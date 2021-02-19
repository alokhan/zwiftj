package org.zwiftj.api.model;

@javax.annotation.Generated("segment-result.proto")
public final class SegmentResults
        implements io.protostuff.Message<SegmentResults> {

    private static final SegmentResults DEFAULT_INSTANCE = newBuilder().build();

    private int worldId;

    private long segmentId;

    private long eventSubgroupId;

    private java.util.List<org.zwiftj.api.model.SegmentResult> segmentResults;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SegmentResults() {
        this.worldId = 0;
        this.segmentId = 0L;
        this.eventSubgroupId = 0L;
        this.segmentResults = java.util.Collections.emptyList();
    }

    private SegmentResults(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SegmentResults getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SegmentResults> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getWorldId() {
        return worldId;
    }

    public boolean hasWorldId() {
        return (__bitField0 & 1) == 1;
    }

    public SegmentResults withWorldId(int value) {
        return SegmentResults.newBuilder()
            .mergeFrom(this)
            .setWorldId(value)
            .build();
    }

    public long getSegmentId() {
        return segmentId;
    }

    public boolean hasSegmentId() {
        return (__bitField0 & 2) == 2;
    }

    public SegmentResults withSegmentId(long value) {
        return SegmentResults.newBuilder()
            .mergeFrom(this)
            .setSegmentId(value)
            .build();
    }

    public long getEventSubgroupId() {
        return eventSubgroupId;
    }

    public boolean hasEventSubgroupId() {
        return (__bitField0 & 4) == 4;
    }

    public SegmentResults withEventSubgroupId(long value) {
        return SegmentResults.newBuilder()
            .mergeFrom(this)
            .setEventSubgroupId(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.SegmentResult> getSegmentResultsList() {
        return segmentResults;
    }

    public int getSegmentResultsCount() {
        return segmentResults.size();
    }

    public org.zwiftj.api.model.SegmentResult getSegmentResults(int index) {
        return segmentResults.get(index);
    }

    public SegmentResults withSegmentResults(java.util.List<org.zwiftj.api.model.SegmentResult> value) {
        return SegmentResults.newBuilder()
            .mergeFrom(this)
            .clearSegmentResults()
            .addAllSegmentResults(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SegmentResults> cachedSchema() {
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
        SegmentResults that = (SegmentResults) obj;
        if (!java.util.Objects.equals(this.worldId, that.worldId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.segmentId, that.segmentId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.eventSubgroupId, that.eventSubgroupId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.segmentResults, that.segmentResults)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.worldId);
        result = 31 * result + Long.hashCode(this.segmentId);
        result = 31 * result + Long.hashCode(this.eventSubgroupId);
        result = 31 * result + (this.segmentResults == null ? 0 : this.segmentResults.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasWorldId()) {
            parts.add("worldId=" + getWorldId());
        }
        if (hasSegmentId()) {
            parts.add("segmentId=" + getSegmentId());
        }
        if (hasEventSubgroupId()) {
            parts.add("eventSubgroupId=" + getEventSubgroupId());
        }
        if (!segmentResults.isEmpty()) {
            parts.add("segmentResults=" + getSegmentResultsList());
        }
        return "SegmentResults{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SegmentResults>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("worldId", 1);
        	__fieldMap.put("segmentId", 2);
        	__fieldMap.put("eventSubgroupId", 3);
        	__fieldMap.put("segmentResults", 4);
        }

        @Override
        public SegmentResults newMessage() {
            return new SegmentResults();
        }

        @Override
        public Class<SegmentResults> typeClass() {
            return SegmentResults.class;
        }

        @Override
        public String messageName() {
            return SegmentResults.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SegmentResults.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SegmentResults message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SegmentResults instance) throws java.io.IOException {
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
                    	instance.worldId = input.readUInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.segmentId = input.readUInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.eventSubgroupId = input.readUInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.segmentResults = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.segmentResults.add(input.mergeObject(null, org.zwiftj.api.model.SegmentResult.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 8) == 8) {
                instance.segmentResults = java.util.Collections.unmodifiableList(instance.segmentResults);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, SegmentResults instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt32(1, instance.worldId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeUInt64(2, instance.segmentId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeUInt64(3, instance.eventSubgroupId, false);
            }

            for(org.zwiftj.api.model.SegmentResult segmentResults : instance.segmentResults) {
                output.writeObject(4, segmentResults, org.zwiftj.api.model.SegmentResult.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "worldId";
        		case 2: return "segmentId";
        		case 3: return "eventSubgroupId";
        		case 4: return "segmentResults";
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

        private int worldId;

        private long segmentId;

        private long eventSubgroupId;

        private java.util.List<org.zwiftj.api.model.SegmentResult> segmentResults;

        private int __bitField0;

        private Builder() {
            this.worldId = 0;
            this.segmentId = 0L;
            this.eventSubgroupId = 0L;
            this.segmentResults = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(SegmentResults instance) {
            if (instance.hasWorldId()) {
                this.setWorldId(instance.getWorldId());
            }

            if (instance.hasSegmentId()) {
                this.setSegmentId(instance.getSegmentId());
            }

            if (instance.hasEventSubgroupId()) {
                this.setEventSubgroupId(instance.getEventSubgroupId());
            }

            this.addAllSegmentResults(instance.getSegmentResultsList());

            return this;
        }

        public int getWorldId() {
            return worldId;
        }

        public Builder setWorldId(int value) {
            this.worldId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearWorldId() {
            this.worldId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasWorldId() {
            return (__bitField0 & 1) == 1;
        }

        public long getSegmentId() {
            return segmentId;
        }

        public Builder setSegmentId(long value) {
            this.segmentId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearSegmentId() {
            this.segmentId = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasSegmentId() {
            return (__bitField0 & 2) == 2;
        }

        public long getEventSubgroupId() {
            return eventSubgroupId;
        }

        public Builder setEventSubgroupId(long value) {
            this.eventSubgroupId = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearEventSubgroupId() {
            this.eventSubgroupId = 0L;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasEventSubgroupId() {
            return (__bitField0 & 4) == 4;
        }

        public java.util.List<org.zwiftj.api.model.SegmentResult> getSegmentResultsList() {
            return segmentResults;
        }

        public Builder setSegmentResults(int index, org.zwiftj.api.model.SegmentResult value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentResults#segmentResults to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.segmentResults = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.segmentResults.set(index, value);
            return this;
        }

        public Builder addSegmentResults(org.zwiftj.api.model.SegmentResult value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SegmentResults#segmentResults to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.segmentResults = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.segmentResults.add(value);
            return this;
        }

        public Builder addAllSegmentResults(java.lang.Iterable<org.zwiftj.api.model.SegmentResult> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set SegmentResults#segmentResults to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.segmentResults = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final org.zwiftj.api.model.SegmentResult value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set SegmentResults#segmentResults to null");
                }
                this.segmentResults.add(value);
            }
            return this;
        }

        public Builder clearSegmentResults() {
            this.segmentResults = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getSegmentResultsCount() {
            return segmentResults.size();
        }

        public org.zwiftj.api.model.SegmentResult getSegmentResults(int index) {
            return segmentResults.get(index);
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
            if (!java.util.Objects.equals(this.worldId, that.worldId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.segmentId, that.segmentId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.eventSubgroupId, that.eventSubgroupId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.segmentResults, that.segmentResults)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.worldId);
            result = 31 * result + Long.hashCode(this.segmentId);
            result = 31 * result + Long.hashCode(this.eventSubgroupId);
            result = 31 * result + (this.segmentResults == null ? 0 : this.segmentResults.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasWorldId()) {
                parts.add("worldId=" + getWorldId());
            }
            if (hasSegmentId()) {
                parts.add("segmentId=" + getSegmentId());
            }
            if (hasEventSubgroupId()) {
                parts.add("eventSubgroupId=" + getEventSubgroupId());
            }
            if (!segmentResults.isEmpty()) {
                parts.add("segmentResults=" + getSegmentResultsList());
            }
            return "SegmentResults{" + String.join(", ", parts) + "}";
        }

        public SegmentResults build() {
            org.zwiftj.api.model.SegmentResults result = new org.zwiftj.api.model.SegmentResults();
            result.__bitField0 = __bitField0;
            result.worldId = this.worldId;
            result.segmentId = this.segmentId;
            result.eventSubgroupId = this.eventSubgroupId;
            result.segmentResults = java.util.Collections.unmodifiableList(this.segmentResults);
            return result;
        }

    }



}