/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * Represents preferences for sending email notifications for transfer run
 * events.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EmailPreferences}
 */
public final class EmailPreferences extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.EmailPreferences)
    EmailPreferencesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EmailPreferences.newBuilder() to construct.
  private EmailPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EmailPreferences() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EmailPreferences(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8:
            {
              enableFailureEmail_ = input.readBool();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.EmailPreferences.class,
            com.google.cloud.bigquery.datatransfer.v1.EmailPreferences.Builder.class);
  }

  public static final int ENABLE_FAILURE_EMAIL_FIELD_NUMBER = 1;
  private boolean enableFailureEmail_;
  /**
   *
   *
   * <pre>
   * If true, email notifications will be sent on transfer run failures.
   * </pre>
   *
   * <code>bool enable_failure_email = 1;</code>
   */
  public boolean getEnableFailureEmail() {
    return enableFailureEmail_;
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
    if (enableFailureEmail_ != false) {
      output.writeBool(1, enableFailureEmail_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableFailureEmail_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableFailureEmail_);
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.EmailPreferences)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.EmailPreferences other =
        (com.google.cloud.bigquery.datatransfer.v1.EmailPreferences) obj;

    if (getEnableFailureEmail() != other.getEnableFailureEmail()) return false;
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
    hash = (37 * hash) + ENABLE_FAILURE_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableFailureEmail());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.bigquery.datatransfer.v1.EmailPreferences prototype) {
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
   * Represents preferences for sending email notifications for transfer run
   * events.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EmailPreferences}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.EmailPreferences)
      com.google.cloud.bigquery.datatransfer.v1.EmailPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.EmailPreferences.class,
              com.google.cloud.bigquery.datatransfer.v1.EmailPreferences.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.EmailPreferences.newBuilder()
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
      enableFailureEmail_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EmailPreferences getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.EmailPreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EmailPreferences build() {
      com.google.cloud.bigquery.datatransfer.v1.EmailPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EmailPreferences buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.EmailPreferences result =
          new com.google.cloud.bigquery.datatransfer.v1.EmailPreferences(this);
      result.enableFailureEmail_ = enableFailureEmail_;
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
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.EmailPreferences) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.EmailPreferences) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.EmailPreferences other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.EmailPreferences.getDefaultInstance())
        return this;
      if (other.getEnableFailureEmail() != false) {
        setEnableFailureEmail(other.getEnableFailureEmail());
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
      com.google.cloud.bigquery.datatransfer.v1.EmailPreferences parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.datatransfer.v1.EmailPreferences) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableFailureEmail_;
    /**
     *
     *
     * <pre>
     * If true, email notifications will be sent on transfer run failures.
     * </pre>
     *
     * <code>bool enable_failure_email = 1;</code>
     */
    public boolean getEnableFailureEmail() {
      return enableFailureEmail_;
    }
    /**
     *
     *
     * <pre>
     * If true, email notifications will be sent on transfer run failures.
     * </pre>
     *
     * <code>bool enable_failure_email = 1;</code>
     */
    public Builder setEnableFailureEmail(boolean value) {

      enableFailureEmail_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, email notifications will be sent on transfer run failures.
     * </pre>
     *
     * <code>bool enable_failure_email = 1;</code>
     */
    public Builder clearEnableFailureEmail() {

      enableFailureEmail_ = false;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.EmailPreferences)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.EmailPreferences)
  private static final com.google.cloud.bigquery.datatransfer.v1.EmailPreferences DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.EmailPreferences();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EmailPreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmailPreferences> PARSER =
      new com.google.protobuf.AbstractParser<EmailPreferences>() {
        @java.lang.Override
        public EmailPreferences parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EmailPreferences(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EmailPreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmailPreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.EmailPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
