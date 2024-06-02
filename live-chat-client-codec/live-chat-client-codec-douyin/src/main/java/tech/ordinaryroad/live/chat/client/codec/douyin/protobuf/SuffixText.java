/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

/**
 * Protobuf type {@code SuffixText}
 */
public final class SuffixText extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SuffixText)
    SuffixTextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuffixText.newBuilder() to construct.
  private SuffixText(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuffixText() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuffixText();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Douyin.internal_static_SuffixText_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Douyin.internal_static_SuffixText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SuffixText.class, Builder.class);
  }

  private int bitField0_;
  public static final int BIZ_TYPE_FIELD_NUMBER = 1;
  private long bizType_ = 0L;
  /**
   * <code>uint64 biz_type = 1;</code>
   * @return The bizType.
   */
  @Override
  public long getBizType() {
    return bizType_;
  }

  public static final int TEXT_FIELD_NUMBER = 2;
  private Text text_;
  /**
   * <code>.Text text = 2;</code>
   * @return Whether the text field is set.
   */
  @Override
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.Text text = 2;</code>
   * @return The text.
   */
  @Override
  public Text getText() {
    return text_ == null ? Text.getDefaultInstance() : text_;
  }
  /**
   * <code>.Text text = 2;</code>
   */
  @Override
  public TextOrBuilder getTextOrBuilder() {
    return text_ == null ? Text.getDefaultInstance() : text_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (bizType_ != 0L) {
      output.writeUInt64(1, bizType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getText());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bizType_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, bizType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getText());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SuffixText)) {
      return super.equals(obj);
    }
    SuffixText other = (SuffixText) obj;

    if (getBizType()
        != other.getBizType()) return false;
    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText()
          .equals(other.getText())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BIZ_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBizType());
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SuffixText parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SuffixText parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SuffixText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SuffixText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SuffixText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SuffixText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SuffixText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SuffixText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static SuffixText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static SuffixText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SuffixText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SuffixText parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SuffixText prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SuffixText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SuffixText)
      SuffixTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Douyin.internal_static_SuffixText_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Douyin.internal_static_SuffixText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SuffixText.class, Builder.class);
    }

    // Construct using tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.SuffixText.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTextFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      bizType_ = 0L;
      text_ = null;
      if (textBuilder_ != null) {
        textBuilder_.dispose();
        textBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Douyin.internal_static_SuffixText_descriptor;
    }

    @Override
    public SuffixText getDefaultInstanceForType() {
      return SuffixText.getDefaultInstance();
    }

    @Override
    public SuffixText build() {
      SuffixText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SuffixText buildPartial() {
      SuffixText result = new SuffixText(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(SuffixText result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bizType_ = bizType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.text_ = textBuilder_ == null
            ? text_
            : textBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SuffixText) {
        return mergeFrom((SuffixText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SuffixText other) {
      if (other == SuffixText.getDefaultInstance()) return this;
      if (other.getBizType() != 0L) {
        setBizType(other.getBizType());
      }
      if (other.hasText()) {
        mergeText(other.getText());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bizType_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getTextFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private long bizType_ ;
    /**
     * <code>uint64 biz_type = 1;</code>
     * @return The bizType.
     */
    @Override
    public long getBizType() {
      return bizType_;
    }
    /**
     * <code>uint64 biz_type = 1;</code>
     * @param value The bizType to set.
     * @return This builder for chaining.
     */
    public Builder setBizType(long value) {

      bizType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 biz_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBizType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bizType_ = 0L;
      onChanged();
      return this;
    }

    private Text text_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Text, Text.Builder, TextOrBuilder> textBuilder_;
    /**
     * <code>.Text text = 2;</code>
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.Text text = 2;</code>
     * @return The text.
     */
    public Text getText() {
      if (textBuilder_ == null) {
        return text_ == null ? Text.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     * <code>.Text text = 2;</code>
     */
    public Builder setText(Text value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
      } else {
        textBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.Text text = 2;</code>
     */
    public Builder setText(
        Text.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.Text text = 2;</code>
     */
    public Builder mergeText(Text value) {
      if (textBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          text_ != null &&
          text_ != Text.getDefaultInstance()) {
          getTextBuilder().mergeFrom(value);
        } else {
          text_ = value;
        }
      } else {
        textBuilder_.mergeFrom(value);
      }
      if (text_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.Text text = 2;</code>
     */
    public Builder clearText() {
      bitField0_ = (bitField0_ & ~0x00000002);
      text_ = null;
      if (textBuilder_ != null) {
        textBuilder_.dispose();
        textBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Text text = 2;</code>
     */
    public Text.Builder getTextBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <code>.Text text = 2;</code>
     */
    public TextOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ?
            Text.getDefaultInstance() : text_;
      }
    }
    /**
     * <code>.Text text = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Text, Text.Builder, TextOrBuilder>
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Text, Text.Builder, TextOrBuilder>(
                getText(),
                getParentForChildren(),
                isClean());
        text_ = null;
      }
      return textBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SuffixText)
  }

  // @@protoc_insertion_point(class_scope:SuffixText)
  private static final SuffixText DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SuffixText();
  }

  public static SuffixText getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuffixText>
      PARSER = new com.google.protobuf.AbstractParser<SuffixText>() {
    @Override
    public SuffixText parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuffixText> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SuffixText> getParserForType() {
    return PARSER;
  }

  @Override
  public SuffixText getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
