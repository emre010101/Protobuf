// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: televison.proto

package com.emrek.models;

public final class TelevisonOuterClass {
  private TelevisonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Televison_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Televison_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017televison.proto\032\024common/address.proto\032" +
      "\020common/car.proto\"(\n\tTelevison\022\r\n\005brand\030" +
      "\001 \001(\t\022\014\n\004year\030\002 \001(\005B\024\n\020com.emrek.modelsP" +
      "\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.emrek.models.AddressOuterClass.getDescriptor(),
          com.emrek.models.CarOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Televison_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Televison_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Televison_descriptor,
        new java.lang.String[] { "Brand", "Year", });
    com.emrek.models.AddressOuterClass.getDescriptor();
    com.emrek.models.CarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
