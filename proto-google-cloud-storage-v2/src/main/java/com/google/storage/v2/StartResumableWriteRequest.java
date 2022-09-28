/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

package com.google.storage.v2;

/**
 *
 *
 * <pre>
 * Request message StartResumableWrite.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.StartResumableWriteRequest}
 */
public final class StartResumableWriteRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.StartResumableWriteRequest)
    StartResumableWriteRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StartResumableWriteRequest.newBuilder() to construct.
  private StartResumableWriteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StartResumableWriteRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StartResumableWriteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StartResumableWriteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.storage.v2.WriteObjectSpec.Builder subBuilder = null;
              if (writeObjectSpec_ != null) {
                subBuilder = writeObjectSpec_.toBuilder();
              }
              writeObjectSpec_ =
                  input.readMessage(
                      com.google.storage.v2.WriteObjectSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(writeObjectSpec_);
                writeObjectSpec_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.storage.v2.CommonObjectRequestParams.Builder subBuilder = null;
              if (commonObjectRequestParams_ != null) {
                subBuilder = commonObjectRequestParams_.toBuilder();
              }
              commonObjectRequestParams_ =
                  input.readMessage(
                      com.google.storage.v2.CommonObjectRequestParams.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(commonObjectRequestParams_);
                commonObjectRequestParams_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_StartResumableWriteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_StartResumableWriteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.StartResumableWriteRequest.class,
            com.google.storage.v2.StartResumableWriteRequest.Builder.class);
  }

  public static final int WRITE_OBJECT_SPEC_FIELD_NUMBER = 1;
  private com.google.storage.v2.WriteObjectSpec writeObjectSpec_;
  /**
   *
   *
   * <pre>
   * Required. The destination bucket, object, and metadata, as well as any preconditions.
   * </pre>
   *
   * <code>
   * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the writeObjectSpec field is set.
   */
  @java.lang.Override
  public boolean hasWriteObjectSpec() {
    return writeObjectSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The destination bucket, object, and metadata, as well as any preconditions.
   * </pre>
   *
   * <code>
   * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The writeObjectSpec.
   */
  @java.lang.Override
  public com.google.storage.v2.WriteObjectSpec getWriteObjectSpec() {
    return writeObjectSpec_ == null
        ? com.google.storage.v2.WriteObjectSpec.getDefaultInstance()
        : writeObjectSpec_;
  }
  /**
   *
   *
   * <pre>
   * Required. The destination bucket, object, and metadata, as well as any preconditions.
   * </pre>
   *
   * <code>
   * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.storage.v2.WriteObjectSpecOrBuilder getWriteObjectSpecOrBuilder() {
    return getWriteObjectSpec();
  }

  public static final int COMMON_OBJECT_REQUEST_PARAMS_FIELD_NUMBER = 3;
  private com.google.storage.v2.CommonObjectRequestParams commonObjectRequestParams_;
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
   *
   * @return Whether the commonObjectRequestParams field is set.
   */
  @java.lang.Override
  public boolean hasCommonObjectRequestParams() {
    return commonObjectRequestParams_ != null;
  }
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
   *
   * @return The commonObjectRequestParams.
   */
  @java.lang.Override
  public com.google.storage.v2.CommonObjectRequestParams getCommonObjectRequestParams() {
    return commonObjectRequestParams_ == null
        ? com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()
        : commonObjectRequestParams_;
  }
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
   */
  @java.lang.Override
  public com.google.storage.v2.CommonObjectRequestParamsOrBuilder
      getCommonObjectRequestParamsOrBuilder() {
    return getCommonObjectRequestParams();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (writeObjectSpec_ != null) {
      output.writeMessage(1, getWriteObjectSpec());
    }
    if (commonObjectRequestParams_ != null) {
      output.writeMessage(3, getCommonObjectRequestParams());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (writeObjectSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWriteObjectSpec());
    }
    if (commonObjectRequestParams_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, getCommonObjectRequestParams());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.storage.v2.StartResumableWriteRequest)) {
      return super.equals(obj);
    }
    com.google.storage.v2.StartResumableWriteRequest other =
        (com.google.storage.v2.StartResumableWriteRequest) obj;

    if (hasWriteObjectSpec() != other.hasWriteObjectSpec()) return false;
    if (hasWriteObjectSpec()) {
      if (!getWriteObjectSpec().equals(other.getWriteObjectSpec())) return false;
    }
    if (hasCommonObjectRequestParams() != other.hasCommonObjectRequestParams()) return false;
    if (hasCommonObjectRequestParams()) {
      if (!getCommonObjectRequestParams().equals(other.getCommonObjectRequestParams()))
        return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasWriteObjectSpec()) {
      hash = (37 * hash) + WRITE_OBJECT_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getWriteObjectSpec().hashCode();
    }
    if (hasCommonObjectRequestParams()) {
      hash = (37 * hash) + COMMON_OBJECT_REQUEST_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonObjectRequestParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.StartResumableWriteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.storage.v2.StartResumableWriteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message StartResumableWrite.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.StartResumableWriteRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.StartResumableWriteRequest)
      com.google.storage.v2.StartResumableWriteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_StartResumableWriteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_StartResumableWriteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.StartResumableWriteRequest.class,
              com.google.storage.v2.StartResumableWriteRequest.Builder.class);
    }

    // Construct using com.google.storage.v2.StartResumableWriteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (writeObjectSpecBuilder_ == null) {
        writeObjectSpec_ = null;
      } else {
        writeObjectSpec_ = null;
        writeObjectSpecBuilder_ = null;
      }
      if (commonObjectRequestParamsBuilder_ == null) {
        commonObjectRequestParams_ = null;
      } else {
        commonObjectRequestParams_ = null;
        commonObjectRequestParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_StartResumableWriteRequest_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.StartResumableWriteRequest getDefaultInstanceForType() {
      return com.google.storage.v2.StartResumableWriteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.StartResumableWriteRequest build() {
      com.google.storage.v2.StartResumableWriteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.StartResumableWriteRequest buildPartial() {
      com.google.storage.v2.StartResumableWriteRequest result =
          new com.google.storage.v2.StartResumableWriteRequest(this);
      if (writeObjectSpecBuilder_ == null) {
        result.writeObjectSpec_ = writeObjectSpec_;
      } else {
        result.writeObjectSpec_ = writeObjectSpecBuilder_.build();
      }
      if (commonObjectRequestParamsBuilder_ == null) {
        result.commonObjectRequestParams_ = commonObjectRequestParams_;
      } else {
        result.commonObjectRequestParams_ = commonObjectRequestParamsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.storage.v2.StartResumableWriteRequest) {
        return mergeFrom((com.google.storage.v2.StartResumableWriteRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.StartResumableWriteRequest other) {
      if (other == com.google.storage.v2.StartResumableWriteRequest.getDefaultInstance())
        return this;
      if (other.hasWriteObjectSpec()) {
        mergeWriteObjectSpec(other.getWriteObjectSpec());
      }
      if (other.hasCommonObjectRequestParams()) {
        mergeCommonObjectRequestParams(other.getCommonObjectRequestParams());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.storage.v2.StartResumableWriteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.storage.v2.StartResumableWriteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.storage.v2.WriteObjectSpec writeObjectSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.WriteObjectSpec,
            com.google.storage.v2.WriteObjectSpec.Builder,
            com.google.storage.v2.WriteObjectSpecOrBuilder>
        writeObjectSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the writeObjectSpec field is set.
     */
    public boolean hasWriteObjectSpec() {
      return writeObjectSpecBuilder_ != null || writeObjectSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The writeObjectSpec.
     */
    public com.google.storage.v2.WriteObjectSpec getWriteObjectSpec() {
      if (writeObjectSpecBuilder_ == null) {
        return writeObjectSpec_ == null
            ? com.google.storage.v2.WriteObjectSpec.getDefaultInstance()
            : writeObjectSpec_;
      } else {
        return writeObjectSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWriteObjectSpec(com.google.storage.v2.WriteObjectSpec value) {
      if (writeObjectSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        writeObjectSpec_ = value;
        onChanged();
      } else {
        writeObjectSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWriteObjectSpec(
        com.google.storage.v2.WriteObjectSpec.Builder builderForValue) {
      if (writeObjectSpecBuilder_ == null) {
        writeObjectSpec_ = builderForValue.build();
        onChanged();
      } else {
        writeObjectSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWriteObjectSpec(com.google.storage.v2.WriteObjectSpec value) {
      if (writeObjectSpecBuilder_ == null) {
        if (writeObjectSpec_ != null) {
          writeObjectSpec_ =
              com.google.storage.v2.WriteObjectSpec.newBuilder(writeObjectSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          writeObjectSpec_ = value;
        }
        onChanged();
      } else {
        writeObjectSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWriteObjectSpec() {
      if (writeObjectSpecBuilder_ == null) {
        writeObjectSpec_ = null;
        onChanged();
      } else {
        writeObjectSpec_ = null;
        writeObjectSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.storage.v2.WriteObjectSpec.Builder getWriteObjectSpecBuilder() {

      onChanged();
      return getWriteObjectSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.storage.v2.WriteObjectSpecOrBuilder getWriteObjectSpecOrBuilder() {
      if (writeObjectSpecBuilder_ != null) {
        return writeObjectSpecBuilder_.getMessageOrBuilder();
      } else {
        return writeObjectSpec_ == null
            ? com.google.storage.v2.WriteObjectSpec.getDefaultInstance()
            : writeObjectSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The destination bucket, object, and metadata, as well as any preconditions.
     * </pre>
     *
     * <code>
     * .google.storage.v2.WriteObjectSpec write_object_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.WriteObjectSpec,
            com.google.storage.v2.WriteObjectSpec.Builder,
            com.google.storage.v2.WriteObjectSpecOrBuilder>
        getWriteObjectSpecFieldBuilder() {
      if (writeObjectSpecBuilder_ == null) {
        writeObjectSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.storage.v2.WriteObjectSpec,
                com.google.storage.v2.WriteObjectSpec.Builder,
                com.google.storage.v2.WriteObjectSpecOrBuilder>(
                getWriteObjectSpec(), getParentForChildren(), isClean());
        writeObjectSpec_ = null;
      }
      return writeObjectSpecBuilder_;
    }

    private com.google.storage.v2.CommonObjectRequestParams commonObjectRequestParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.CommonObjectRequestParams,
            com.google.storage.v2.CommonObjectRequestParams.Builder,
            com.google.storage.v2.CommonObjectRequestParamsOrBuilder>
        commonObjectRequestParamsBuilder_;
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     *
     * @return Whether the commonObjectRequestParams field is set.
     */
    public boolean hasCommonObjectRequestParams() {
      return commonObjectRequestParamsBuilder_ != null || commonObjectRequestParams_ != null;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     *
     * @return The commonObjectRequestParams.
     */
    public com.google.storage.v2.CommonObjectRequestParams getCommonObjectRequestParams() {
      if (commonObjectRequestParamsBuilder_ == null) {
        return commonObjectRequestParams_ == null
            ? com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()
            : commonObjectRequestParams_;
      } else {
        return commonObjectRequestParamsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     */
    public Builder setCommonObjectRequestParams(
        com.google.storage.v2.CommonObjectRequestParams value) {
      if (commonObjectRequestParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonObjectRequestParams_ = value;
        onChanged();
      } else {
        commonObjectRequestParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     */
    public Builder setCommonObjectRequestParams(
        com.google.storage.v2.CommonObjectRequestParams.Builder builderForValue) {
      if (commonObjectRequestParamsBuilder_ == null) {
        commonObjectRequestParams_ = builderForValue.build();
        onChanged();
      } else {
        commonObjectRequestParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     */
    public Builder mergeCommonObjectRequestParams(
        com.google.storage.v2.CommonObjectRequestParams value) {
      if (commonObjectRequestParamsBuilder_ == null) {
        if (commonObjectRequestParams_ != null) {
          commonObjectRequestParams_ =
              com.google.storage.v2.CommonObjectRequestParams.newBuilder(commonObjectRequestParams_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          commonObjectRequestParams_ = value;
        }
        onChanged();
      } else {
        commonObjectRequestParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     */
    public Builder clearCommonObjectRequestParams() {
      if (commonObjectRequestParamsBuilder_ == null) {
        commonObjectRequestParams_ = null;
        onChanged();
      } else {
        commonObjectRequestParams_ = null;
        commonObjectRequestParamsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     */
    public com.google.storage.v2.CommonObjectRequestParams.Builder
        getCommonObjectRequestParamsBuilder() {

      onChanged();
      return getCommonObjectRequestParamsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     */
    public com.google.storage.v2.CommonObjectRequestParamsOrBuilder
        getCommonObjectRequestParamsOrBuilder() {
      if (commonObjectRequestParamsBuilder_ != null) {
        return commonObjectRequestParamsBuilder_.getMessageOrBuilder();
      } else {
        return commonObjectRequestParams_ == null
            ? com.google.storage.v2.CommonObjectRequestParams.getDefaultInstance()
            : commonObjectRequestParams_;
      }
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to Storage API requests concerning an object.
     * </pre>
     *
     * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.CommonObjectRequestParams,
            com.google.storage.v2.CommonObjectRequestParams.Builder,
            com.google.storage.v2.CommonObjectRequestParamsOrBuilder>
        getCommonObjectRequestParamsFieldBuilder() {
      if (commonObjectRequestParamsBuilder_ == null) {
        commonObjectRequestParamsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.storage.v2.CommonObjectRequestParams,
                com.google.storage.v2.CommonObjectRequestParams.Builder,
                com.google.storage.v2.CommonObjectRequestParamsOrBuilder>(
                getCommonObjectRequestParams(), getParentForChildren(), isClean());
        commonObjectRequestParams_ = null;
      }
      return commonObjectRequestParamsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.storage.v2.StartResumableWriteRequest)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.StartResumableWriteRequest)
  private static final com.google.storage.v2.StartResumableWriteRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.StartResumableWriteRequest();
  }

  public static com.google.storage.v2.StartResumableWriteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartResumableWriteRequest> PARSER =
      new com.google.protobuf.AbstractParser<StartResumableWriteRequest>() {
        @java.lang.Override
        public StartResumableWriteRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StartResumableWriteRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StartResumableWriteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartResumableWriteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.StartResumableWriteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
