package org.zwiftj.api.model;

@javax.annotation.Generated("login-response.proto")
public final class UDPNodes
        implements io.protostuff.Message<UDPNodes> {

    private static final UDPNodes DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<org.zwiftj.api.model.UDPNode> node;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UDPNodes() {
        this.node = java.util.Collections.emptyList();
    }

    private UDPNodes(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UDPNodes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UDPNodes> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<org.zwiftj.api.model.UDPNode> getNodeList() {
        return node;
    }

    public int getNodeCount() {
        return node.size();
    }

    public org.zwiftj.api.model.UDPNode getNode(int index) {
        return node.get(index);
    }

    public UDPNodes withNode(java.util.List<org.zwiftj.api.model.UDPNode> value) {
        return UDPNodes.newBuilder()
            .mergeFrom(this)
            .clearNode()
            .addAllNode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UDPNodes> cachedSchema() {
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
        UDPNodes that = (UDPNodes) obj;
        if (!java.util.Objects.equals(this.node, that.node)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.node == null ? 0 : this.node.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!node.isEmpty()) {
            parts.add("node=" + getNodeList());
        }
        return "UDPNodes{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UDPNodes>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("node", 1);
        }

        @Override
        public UDPNodes newMessage() {
            return new UDPNodes();
        }

        @Override
        public Class<UDPNodes> typeClass() {
            return UDPNodes.class;
        }

        @Override
        public String messageName() {
            return UDPNodes.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UDPNodes.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UDPNodes message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UDPNodes instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.node = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.node.add(input.mergeObject(null, org.zwiftj.api.model.UDPNode.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.node = java.util.Collections.unmodifiableList(instance.node);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, UDPNodes instance) throws java.io.IOException {
            for(org.zwiftj.api.model.UDPNode node : instance.node) {
                output.writeObject(1, node, org.zwiftj.api.model.UDPNode.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "node";
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

        private java.util.List<org.zwiftj.api.model.UDPNode> node;

        private int __bitField0;

        private Builder() {
            this.node = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(UDPNodes instance) {
            this.addAllNode(instance.getNodeList());

            return this;
        }

        public java.util.List<org.zwiftj.api.model.UDPNode> getNodeList() {
            return node;
        }

        public Builder setNode(int index, org.zwiftj.api.model.UDPNode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UDPNodes#node to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.node = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.node.set(index, value);
            return this;
        }

        public Builder addNode(org.zwiftj.api.model.UDPNode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UDPNodes#node to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.node = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.node.add(value);
            return this;
        }

        public Builder addAllNode(java.lang.Iterable<org.zwiftj.api.model.UDPNode> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set UDPNodes#node to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.node = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final org.zwiftj.api.model.UDPNode value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set UDPNodes#node to null");
                }
                this.node.add(value);
            }
            return this;
        }

        public Builder clearNode() {
            this.node = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getNodeCount() {
            return node.size();
        }

        public org.zwiftj.api.model.UDPNode getNode(int index) {
            return node.get(index);
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
            if (!java.util.Objects.equals(this.node, that.node)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.node == null ? 0 : this.node.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!node.isEmpty()) {
                parts.add("node=" + getNodeList());
            }
            return "UDPNodes{" + String.join(", ", parts) + "}";
        }

        public UDPNodes build() {
            org.zwiftj.api.model.UDPNodes result = new org.zwiftj.api.model.UDPNodes();
            result.__bitField0 = __bitField0;
            result.node = java.util.Collections.unmodifiableList(this.node);
            return result;
        }

    }



}