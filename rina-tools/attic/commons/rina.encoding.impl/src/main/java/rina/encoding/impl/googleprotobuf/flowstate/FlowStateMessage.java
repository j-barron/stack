// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FlowStateMessage.proto

package rina.encoding.impl.googleprotobuf.flowstate;

public final class FlowStateMessage {
  private FlowStateMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class flowStateObject_t extends
      com.google.protobuf.GeneratedMessage {
    // Use flowStateObject_t.newBuilder() to construct.
    private flowStateObject_t() {
      initFields();
    }
    private flowStateObject_t(boolean noInit) {}
    
    private static final flowStateObject_t defaultInstance;
    public static flowStateObject_t getDefaultInstance() {
      return defaultInstance;
    }
    
    public flowStateObject_t getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internal_static_rina_messages_flowStateObject_t_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internal_static_rina_messages_flowStateObject_t_fieldAccessorTable;
    }
    
    // optional uint64 address = 1;
    public static final int ADDRESS_FIELD_NUMBER = 1;
    private boolean hasAddress;
    private long address_ = 0L;
    public boolean hasAddress() { return hasAddress; }
    public long getAddress() { return address_; }
    
    // optional uint32 portid = 2;
    public static final int PORTID_FIELD_NUMBER = 2;
    private boolean hasPortid;
    private int portid_ = 0;
    public boolean hasPortid() { return hasPortid; }
    public int getPortid() { return portid_; }
    
    // optional uint64 neighbor_address = 3;
    public static final int NEIGHBOR_ADDRESS_FIELD_NUMBER = 3;
    private boolean hasNeighborAddress;
    private long neighborAddress_ = 0L;
    public boolean hasNeighborAddress() { return hasNeighborAddress; }
    public long getNeighborAddress() { return neighborAddress_; }
    
    // optional uint32 neighbor_portid = 4;
    public static final int NEIGHBOR_PORTID_FIELD_NUMBER = 4;
    private boolean hasNeighborPortid;
    private int neighborPortid_ = 0;
    public boolean hasNeighborPortid() { return hasNeighborPortid; }
    public int getNeighborPortid() { return neighborPortid_; }
    
    // optional bool state = 5;
    public static final int STATE_FIELD_NUMBER = 5;
    private boolean hasState;
    private boolean state_ = false;
    public boolean hasState() { return hasState; }
    public boolean getState() { return state_; }
    
    // optional uint32 sequence_number = 6;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 6;
    private boolean hasSequenceNumber;
    private int sequenceNumber_ = 0;
    public boolean hasSequenceNumber() { return hasSequenceNumber; }
    public int getSequenceNumber() { return sequenceNumber_; }
    
    // optional uint32 age = 7;
    public static final int AGE_FIELD_NUMBER = 7;
    private boolean hasAge;
    private int age_ = 0;
    public boolean hasAge() { return hasAge; }
    public int getAge() { return age_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasAddress()) {
        output.writeUInt64(1, getAddress());
      }
      if (hasPortid()) {
        output.writeUInt32(2, getPortid());
      }
      if (hasNeighborAddress()) {
        output.writeUInt64(3, getNeighborAddress());
      }
      if (hasNeighborPortid()) {
        output.writeUInt32(4, getNeighborPortid());
      }
      if (hasState()) {
        output.writeBool(5, getState());
      }
      if (hasSequenceNumber()) {
        output.writeUInt32(6, getSequenceNumber());
      }
      if (hasAge()) {
        output.writeUInt32(7, getAge());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasAddress()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, getAddress());
      }
      if (hasPortid()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, getPortid());
      }
      if (hasNeighborAddress()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, getNeighborAddress());
      }
      if (hasNeighborPortid()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, getNeighborPortid());
      }
      if (hasState()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, getState());
      }
      if (hasSequenceNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, getSequenceNumber());
      }
      if (hasAge()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, getAge());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t result;
      
      // Construct using rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t();
        return builder;
      }
      
      protected rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.getDescriptor();
      }
      
      public rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t getDefaultInstanceForType() {
        return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t) {
          return mergeFrom((rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t other) {
        if (other == rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.getDefaultInstance()) return this;
        if (other.hasAddress()) {
          setAddress(other.getAddress());
        }
        if (other.hasPortid()) {
          setPortid(other.getPortid());
        }
        if (other.hasNeighborAddress()) {
          setNeighborAddress(other.getNeighborAddress());
        }
        if (other.hasNeighborPortid()) {
          setNeighborPortid(other.getNeighborPortid());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasSequenceNumber()) {
          setSequenceNumber(other.getSequenceNumber());
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setAddress(input.readUInt64());
              break;
            }
            case 16: {
              setPortid(input.readUInt32());
              break;
            }
            case 24: {
              setNeighborAddress(input.readUInt64());
              break;
            }
            case 32: {
              setNeighborPortid(input.readUInt32());
              break;
            }
            case 40: {
              setState(input.readBool());
              break;
            }
            case 48: {
              setSequenceNumber(input.readUInt32());
              break;
            }
            case 56: {
              setAge(input.readUInt32());
              break;
            }
          }
        }
      }
      
      
      // optional uint64 address = 1;
      public boolean hasAddress() {
        return result.hasAddress();
      }
      public long getAddress() {
        return result.getAddress();
      }
      public Builder setAddress(long value) {
        result.hasAddress = true;
        result.address_ = value;
        return this;
      }
      public Builder clearAddress() {
        result.hasAddress = false;
        result.address_ = 0L;
        return this;
      }
      
      // optional uint32 portid = 2;
      public boolean hasPortid() {
        return result.hasPortid();
      }
      public int getPortid() {
        return result.getPortid();
      }
      public Builder setPortid(int value) {
        result.hasPortid = true;
        result.portid_ = value;
        return this;
      }
      public Builder clearPortid() {
        result.hasPortid = false;
        result.portid_ = 0;
        return this;
      }
      
      // optional uint64 neighbor_address = 3;
      public boolean hasNeighborAddress() {
        return result.hasNeighborAddress();
      }
      public long getNeighborAddress() {
        return result.getNeighborAddress();
      }
      public Builder setNeighborAddress(long value) {
        result.hasNeighborAddress = true;
        result.neighborAddress_ = value;
        return this;
      }
      public Builder clearNeighborAddress() {
        result.hasNeighborAddress = false;
        result.neighborAddress_ = 0L;
        return this;
      }
      
      // optional uint32 neighbor_portid = 4;
      public boolean hasNeighborPortid() {
        return result.hasNeighborPortid();
      }
      public int getNeighborPortid() {
        return result.getNeighborPortid();
      }
      public Builder setNeighborPortid(int value) {
        result.hasNeighborPortid = true;
        result.neighborPortid_ = value;
        return this;
      }
      public Builder clearNeighborPortid() {
        result.hasNeighborPortid = false;
        result.neighborPortid_ = 0;
        return this;
      }
      
      // optional bool state = 5;
      public boolean hasState() {
        return result.hasState();
      }
      public boolean getState() {
        return result.getState();
      }
      public Builder setState(boolean value) {
        result.hasState = true;
        result.state_ = value;
        return this;
      }
      public Builder clearState() {
        result.hasState = false;
        result.state_ = false;
        return this;
      }
      
      // optional uint32 sequence_number = 6;
      public boolean hasSequenceNumber() {
        return result.hasSequenceNumber();
      }
      public int getSequenceNumber() {
        return result.getSequenceNumber();
      }
      public Builder setSequenceNumber(int value) {
        result.hasSequenceNumber = true;
        result.sequenceNumber_ = value;
        return this;
      }
      public Builder clearSequenceNumber() {
        result.hasSequenceNumber = false;
        result.sequenceNumber_ = 0;
        return this;
      }
      
      // optional uint32 age = 7;
      public boolean hasAge() {
        return result.hasAge();
      }
      public int getAge() {
        return result.getAge();
      }
      public Builder setAge(int value) {
        result.hasAge = true;
        result.age_ = value;
        return this;
      }
      public Builder clearAge() {
        result.hasAge = false;
        result.age_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:rina.messages.flowStateObject_t)
    }
    
    static {
      defaultInstance = new flowStateObject_t(true);
      rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:rina.messages.flowStateObject_t)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_rina_messages_flowStateObject_t_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_rina_messages_flowStateObject_t_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FlowStateMessage.proto\022\rrina.messages\"" +
      "\234\001\n\021flowStateObject_t\022\017\n\007address\030\001 \001(\004\022\016" +
      "\n\006portid\030\002 \001(\r\022\030\n\020neighbor_address\030\003 \001(\004" +
      "\022\027\n\017neighbor_portid\030\004 \001(\r\022\r\n\005state\030\005 \001(\010" +
      "\022\027\n\017sequence_number\030\006 \001(\r\022\013\n\003age\030\007 \001(\rB-" +
      "\n+rina.encoding.impl.googleprotobuf.flow" +
      "state"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_rina_messages_flowStateObject_t_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_rina_messages_flowStateObject_t_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_rina_messages_flowStateObject_t_descriptor,
              new java.lang.String[] { "Address", "Portid", "NeighborAddress", "NeighborPortid", "State", "SequenceNumber", "Age", },
              rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.class,
              rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
