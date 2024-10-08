// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/comment.proto
// Protobuf Java Version: 4.28.0

package com.example.proto;

public final class CommentProto {
  private CommentProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 0,
      /* suffix= */ "",
      CommentProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CommentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.Comment)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string sender = 1;</code>
     * @return The sender.
     */
    java.lang.String getSender();
    /**
     * <code>string sender = 1;</code>
     * @return The bytes for sender.
     */
    com.google.protobuf.ByteString
        getSenderBytes();

    /**
     * <code>string receiver = 2;</code>
     * @return The receiver.
     */
    java.lang.String getReceiver();
    /**
     * <code>string receiver = 2;</code>
     * @return The bytes for receiver.
     */
    com.google.protobuf.ByteString
        getReceiverBytes();

    /**
     * <code>string text = 3;</code>
     * @return The text.
     */
    java.lang.String getText();
    /**
     * <code>string text = 3;</code>
     * @return The bytes for text.
     */
    com.google.protobuf.ByteString
        getTextBytes();

    /**
     * <code>.com.example.Comment.Priority priority = 4;</code>
     * @return The enum numeric value on the wire for priority.
     */
    int getPriorityValue();
    /**
     * <code>.com.example.Comment.Priority priority = 4;</code>
     * @return The priority.
     */
    com.example.proto.CommentProto.Comment.Priority getPriority();
  }
  /**
   * Protobuf type {@code com.example.Comment}
   */
  public static final class Comment extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.example.Comment)
      CommentOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 0,
        /* suffix= */ "",
        Comment.class.getName());
    }
    // Use Comment.newBuilder() to construct.
    private Comment(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Comment() {
      sender_ = "";
      receiver_ = "";
      text_ = "";
      priority_ = 0;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.proto.CommentProto.internal_static_com_example_Comment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.proto.CommentProto.internal_static_com_example_Comment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.proto.CommentProto.Comment.class, com.example.proto.CommentProto.Comment.Builder.class);
    }

    /**
     * Protobuf enum {@code com.example.Comment.Priority}
     */
    public enum Priority
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNDEFINED = 0;</code>
       */
      UNDEFINED(0),
      /**
       * <code>NORMAL = 1;</code>
       */
      NORMAL(1),
      /**
       * <code>URGENT = 2;</code>
       */
      URGENT(2),
      UNRECOGNIZED(-1),
      ;

      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 28,
          /* patch= */ 0,
          /* suffix= */ "",
          Priority.class.getName());
      }
      /**
       * <code>UNDEFINED = 0;</code>
       */
      public static final int UNDEFINED_VALUE = 0;
      /**
       * <code>NORMAL = 1;</code>
       */
      public static final int NORMAL_VALUE = 1;
      /**
       * <code>URGENT = 2;</code>
       */
      public static final int URGENT_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Priority valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Priority forNumber(int value) {
        switch (value) {
          case 0: return UNDEFINED;
          case 1: return NORMAL;
          case 2: return URGENT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Priority>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Priority> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Priority>() {
              public Priority findValueByNumber(int number) {
                return Priority.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.example.proto.CommentProto.Comment.getDescriptor().getEnumTypes().get(0);
      }

      private static final Priority[] VALUES = values();

      public static Priority valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Priority(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:com.example.Comment.Priority)
    }

    public static final int SENDER_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object sender_ = "";
    /**
     * <code>string sender = 1;</code>
     * @return The sender.
     */
    @java.lang.Override
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      }
    }
    /**
     * <code>string sender = 1;</code>
     * @return The bytes for sender.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECEIVER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object receiver_ = "";
    /**
     * <code>string receiver = 2;</code>
     * @return The receiver.
     */
    @java.lang.Override
    public java.lang.String getReceiver() {
      java.lang.Object ref = receiver_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiver_ = s;
        return s;
      }
    }
    /**
     * <code>string receiver = 2;</code>
     * @return The bytes for receiver.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReceiverBytes() {
      java.lang.Object ref = receiver_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiver_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEXT_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object text_ = "";
    /**
     * <code>string text = 3;</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      }
    }
    /**
     * <code>string text = 3;</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRIORITY_FIELD_NUMBER = 4;
    private int priority_ = 0;
    /**
     * <code>.com.example.Comment.Priority priority = 4;</code>
     * @return The enum numeric value on the wire for priority.
     */
    @java.lang.Override public int getPriorityValue() {
      return priority_;
    }
    /**
     * <code>.com.example.Comment.Priority priority = 4;</code>
     * @return The priority.
     */
    @java.lang.Override public com.example.proto.CommentProto.Comment.Priority getPriority() {
      com.example.proto.CommentProto.Comment.Priority result = com.example.proto.CommentProto.Comment.Priority.forNumber(priority_);
      return result == null ? com.example.proto.CommentProto.Comment.Priority.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sender_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, sender_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(receiver_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, receiver_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(text_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, text_);
      }
      if (priority_ != com.example.proto.CommentProto.Comment.Priority.UNDEFINED.getNumber()) {
        output.writeEnum(4, priority_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sender_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, sender_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(receiver_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, receiver_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(text_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, text_);
      }
      if (priority_ != com.example.proto.CommentProto.Comment.Priority.UNDEFINED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, priority_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.example.proto.CommentProto.Comment)) {
        return super.equals(obj);
      }
      com.example.proto.CommentProto.Comment other = (com.example.proto.CommentProto.Comment) obj;

      if (!getSender()
          .equals(other.getSender())) return false;
      if (!getReceiver()
          .equals(other.getReceiver())) return false;
      if (!getText()
          .equals(other.getText())) return false;
      if (priority_ != other.priority_) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
      hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
      hash = (53 * hash) + getReceiver().hashCode();
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + priority_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.proto.CommentProto.Comment parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.example.proto.CommentProto.Comment parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.example.proto.CommentProto.Comment parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.example.proto.CommentProto.Comment parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.example.proto.CommentProto.Comment prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.example.Comment}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.Comment)
        com.example.proto.CommentProto.CommentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.proto.CommentProto.internal_static_com_example_Comment_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.proto.CommentProto.internal_static_com_example_Comment_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.proto.CommentProto.Comment.class, com.example.proto.CommentProto.Comment.Builder.class);
      }

      // Construct using com.example.proto.CommentProto.Comment.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        sender_ = "";
        receiver_ = "";
        text_ = "";
        priority_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.proto.CommentProto.internal_static_com_example_Comment_descriptor;
      }

      @java.lang.Override
      public com.example.proto.CommentProto.Comment getDefaultInstanceForType() {
        return com.example.proto.CommentProto.Comment.getDefaultInstance();
      }

      @java.lang.Override
      public com.example.proto.CommentProto.Comment build() {
        com.example.proto.CommentProto.Comment result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.example.proto.CommentProto.Comment buildPartial() {
        com.example.proto.CommentProto.Comment result = new com.example.proto.CommentProto.Comment(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.example.proto.CommentProto.Comment result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sender_ = sender_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.receiver_ = receiver_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.text_ = text_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.priority_ = priority_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.proto.CommentProto.Comment) {
          return mergeFrom((com.example.proto.CommentProto.Comment)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.proto.CommentProto.Comment other) {
        if (other == com.example.proto.CommentProto.Comment.getDefaultInstance()) return this;
        if (!other.getSender().isEmpty()) {
          sender_ = other.sender_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getReceiver().isEmpty()) {
          receiver_ = other.receiver_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getText().isEmpty()) {
          text_ = other.text_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.priority_ != 0) {
          setPriorityValue(other.getPriorityValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                sender_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                receiver_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                text_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                priority_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object sender_ = "";
      /**
       * <code>string sender = 1;</code>
       * @return The sender.
       */
      public java.lang.String getSender() {
        java.lang.Object ref = sender_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sender_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sender = 1;</code>
       * @return The bytes for sender.
       */
      public com.google.protobuf.ByteString
          getSenderBytes() {
        java.lang.Object ref = sender_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sender = 1;</code>
       * @param value The sender to set.
       * @return This builder for chaining.
       */
      public Builder setSender(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        sender_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string sender = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSender() {
        sender_ = getDefaultInstance().getSender();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string sender = 1;</code>
       * @param value The bytes for sender to set.
       * @return This builder for chaining.
       */
      public Builder setSenderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        sender_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object receiver_ = "";
      /**
       * <code>string receiver = 2;</code>
       * @return The receiver.
       */
      public java.lang.String getReceiver() {
        java.lang.Object ref = receiver_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          receiver_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string receiver = 2;</code>
       * @return The bytes for receiver.
       */
      public com.google.protobuf.ByteString
          getReceiverBytes() {
        java.lang.Object ref = receiver_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          receiver_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string receiver = 2;</code>
       * @param value The receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiver(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        receiver_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReceiver() {
        receiver_ = getDefaultInstance().getReceiver();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 2;</code>
       * @param value The bytes for receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiverBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        receiver_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object text_ = "";
      /**
       * <code>string text = 3;</code>
       * @return The text.
       */
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          text_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string text = 3;</code>
       * @return The bytes for text.
       */
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string text = 3;</code>
       * @param value The text to set.
       * @return This builder for chaining.
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        text_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string text = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearText() {
        text_ = getDefaultInstance().getText();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string text = 3;</code>
       * @param value The bytes for text to set.
       * @return This builder for chaining.
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        text_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private int priority_ = 0;
      /**
       * <code>.com.example.Comment.Priority priority = 4;</code>
       * @return The enum numeric value on the wire for priority.
       */
      @java.lang.Override public int getPriorityValue() {
        return priority_;
      }
      /**
       * <code>.com.example.Comment.Priority priority = 4;</code>
       * @param value The enum numeric value on the wire for priority to set.
       * @return This builder for chaining.
       */
      public Builder setPriorityValue(int value) {
        priority_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.com.example.Comment.Priority priority = 4;</code>
       * @return The priority.
       */
      @java.lang.Override
      public com.example.proto.CommentProto.Comment.Priority getPriority() {
        com.example.proto.CommentProto.Comment.Priority result = com.example.proto.CommentProto.Comment.Priority.forNumber(priority_);
        return result == null ? com.example.proto.CommentProto.Comment.Priority.UNRECOGNIZED : result;
      }
      /**
       * <code>.com.example.Comment.Priority priority = 4;</code>
       * @param value The priority to set.
       * @return This builder for chaining.
       */
      public Builder setPriority(com.example.proto.CommentProto.Comment.Priority value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        priority_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.com.example.Comment.Priority priority = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriority() {
        bitField0_ = (bitField0_ & ~0x00000008);
        priority_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.example.Comment)
    }

    // @@protoc_insertion_point(class_scope:com.example.Comment)
    private static final com.example.proto.CommentProto.Comment DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.proto.CommentProto.Comment();
    }

    public static com.example.proto.CommentProto.Comment getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Comment>
        PARSER = new com.google.protobuf.AbstractParser<Comment>() {
      @java.lang.Override
      public Comment parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Comment> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Comment> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.proto.CommentProto.Comment getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_Comment_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_Comment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024protos/comment.proto\022\013com.example\"\235\001\n\007" +
      "Comment\022\016\n\006sender\030\001 \001(\t\022\020\n\010receiver\030\002 \001(" +
      "\t\022\014\n\004text\030\003 \001(\t\022/\n\010priority\030\004 \001(\0162\035.com." +
      "example.Comment.Priority\"1\n\010Priority\022\r\n\t" +
      "UNDEFINED\020\000\022\n\n\006NORMAL\020\001\022\n\n\006URGENT\020\002B!\n\021c" +
      "om.example.protoB\014CommentProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_Comment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_Comment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_example_Comment_descriptor,
        new java.lang.String[] { "Sender", "Receiver", "Text", "Priority", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
