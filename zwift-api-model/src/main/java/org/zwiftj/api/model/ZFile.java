package org.zwiftj.api.model;

@javax.annotation.Generated("zfiles.proto")
public final class ZFile
        implements io.protostuff.Message<ZFile> {

    private static final ZFile DEFAULT_INSTANCE = newBuilder().build();

    private long id;

    private String folder;

    private String filename;

    private long timestamp;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ZFile() {
        this.id = 0L;
        this.folder = "";
        this.filename = "";
        this.timestamp = 0L;
    }

    private ZFile(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ZFile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ZFile> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public ZFile withId(long value) {
        return ZFile.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public String getFolder() {
        return folder;
    }

    public boolean hasFolder() {
        return (__bitField0 & 2) == 2;
    }

    public ZFile withFolder(String value) {
        return ZFile.newBuilder()
            .mergeFrom(this)
            .setFolder(value)
            .build();
    }

    public String getFilename() {
        return filename;
    }

    public boolean hasFilename() {
        return (__bitField0 & 4) == 4;
    }

    public ZFile withFilename(String value) {
        return ZFile.newBuilder()
            .mergeFrom(this)
            .setFilename(value)
            .build();
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean hasTimestamp() {
        return (__bitField0 & 8) == 8;
    }

    public ZFile withTimestamp(long value) {
        return ZFile.newBuilder()
            .mergeFrom(this)
            .setTimestamp(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ZFile> cachedSchema() {
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
        ZFile that = (ZFile) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.folder, that.folder)) {
            return false;
        }
        if (!java.util.Objects.equals(this.filename, that.filename)) {
            return false;
        }
        if (!java.util.Objects.equals(this.timestamp, that.timestamp)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.id);
        result = 31 * result + (this.folder == null ? 0 : this.folder.hashCode());
        result = 31 * result + (this.filename == null ? 0 : this.filename.hashCode());
        result = 31 * result + Long.hashCode(this.timestamp);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasFolder()) {
            parts.add("folder=" + getFolder());
        }
        if (hasFilename()) {
            parts.add("filename=" + getFilename());
        }
        if (hasTimestamp()) {
            parts.add("timestamp=" + getTimestamp());
        }
        return "ZFile{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ZFile>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("folder", 2);
        	__fieldMap.put("filename", 3);
        	__fieldMap.put("timestamp", 4);
        }

        @Override
        public ZFile newMessage() {
            return new ZFile();
        }

        @Override
        public Class<ZFile> typeClass() {
            return ZFile.class;
        }

        @Override
        public String messageName() {
            return ZFile.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ZFile.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ZFile message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ZFile instance) throws java.io.IOException {
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
                    	instance.folder = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.filename = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.timestamp = input.readUInt64();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ZFile instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt64(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.folder, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.filename, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeUInt64(4, instance.timestamp, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "folder";
        		case 3: return "filename";
        		case 4: return "timestamp";
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

        private String folder;

        private String filename;

        private long timestamp;

        private int __bitField0;

        private Builder() {
            this.id = 0L;
            this.folder = "";
            this.filename = "";
            this.timestamp = 0L;
        }

        public Builder mergeFrom(ZFile instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasFolder()) {
                this.setFolder(instance.getFolder());
            }

            if (instance.hasFilename()) {
                this.setFilename(instance.getFilename());
            }

            if (instance.hasTimestamp()) {
                this.setTimestamp(instance.getTimestamp());
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

        public String getFolder() {
            return folder;
        }

        public Builder setFolder(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ZFile#folder to null");
            }

            this.folder = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearFolder() {
            this.folder = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasFolder() {
            return (__bitField0 & 2) == 2;
        }

        public String getFilename() {
            return filename;
        }

        public Builder setFilename(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ZFile#filename to null");
            }

            this.filename = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearFilename() {
            this.filename = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasFilename() {
            return (__bitField0 & 4) == 4;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public Builder setTimestamp(long value) {
            this.timestamp = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearTimestamp() {
            this.timestamp = 0L;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasTimestamp() {
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
            if (!java.util.Objects.equals(this.folder, that.folder)) {
                return false;
            }
            if (!java.util.Objects.equals(this.filename, that.filename)) {
                return false;
            }
            if (!java.util.Objects.equals(this.timestamp, that.timestamp)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.id);
            result = 31 * result + (this.folder == null ? 0 : this.folder.hashCode());
            result = 31 * result + (this.filename == null ? 0 : this.filename.hashCode());
            result = 31 * result + Long.hashCode(this.timestamp);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasFolder()) {
                parts.add("folder=" + getFolder());
            }
            if (hasFilename()) {
                parts.add("filename=" + getFilename());
            }
            if (hasTimestamp()) {
                parts.add("timestamp=" + getTimestamp());
            }
            return "ZFile{" + String.join(", ", parts) + "}";
        }

        public ZFile build() {
            org.zwiftj.api.model.ZFile result = new org.zwiftj.api.model.ZFile();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.folder = this.folder;
            result.filename = this.filename;
            result.timestamp = this.timestamp;
            return result;
        }

    }



}