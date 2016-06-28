// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

public interface ListClustersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListClustersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   *
   * <pre>
   * The list of requested clusters.
   * </pre>
   */
  java.util.List<com.google.bigtable.admin.v2.Cluster> 
      getClustersList();
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   *
   * <pre>
   * The list of requested clusters.
   * </pre>
   */
  com.google.bigtable.admin.v2.Cluster getClusters(int index);
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   *
   * <pre>
   * The list of requested clusters.
   * </pre>
   */
  int getClustersCount();
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   *
   * <pre>
   * The list of requested clusters.
   * </pre>
   */
  java.util.List<? extends com.google.bigtable.admin.v2.ClusterOrBuilder> 
      getClustersOrBuilderList();
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   *
   * <pre>
   * The list of requested clusters.
   * </pre>
   */
  com.google.bigtable.admin.v2.ClusterOrBuilder getClustersOrBuilder(
      int index);

  /**
   * <code>repeated string failed_locations = 2;</code>
   *
   * <pre>
   * Locations from which Cluster information could not be retrieved,
   * due to an outage or some other transient condition.
   * Clusters from these locations may be missing from 'clusters',
   * or may only have partial information returned.
   * </pre>
   */
  com.google.protobuf.ProtocolStringList
      getFailedLocationsList();
  /**
   * <code>repeated string failed_locations = 2;</code>
   *
   * <pre>
   * Locations from which Cluster information could not be retrieved,
   * due to an outage or some other transient condition.
   * Clusters from these locations may be missing from 'clusters',
   * or may only have partial information returned.
   * </pre>
   */
  int getFailedLocationsCount();
  /**
   * <code>repeated string failed_locations = 2;</code>
   *
   * <pre>
   * Locations from which Cluster information could not be retrieved,
   * due to an outage or some other transient condition.
   * Clusters from these locations may be missing from 'clusters',
   * or may only have partial information returned.
   * </pre>
   */
  java.lang.String getFailedLocations(int index);
  /**
   * <code>repeated string failed_locations = 2;</code>
   *
   * <pre>
   * Locations from which Cluster information could not be retrieved,
   * due to an outage or some other transient condition.
   * Clusters from these locations may be missing from 'clusters',
   * or may only have partial information returned.
   * </pre>
   */
  com.google.protobuf.ByteString
      getFailedLocationsBytes(int index);

  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * Set if not all clusters could be returned in a single response.
   * Pass this value to `page_token` in another request to get the next
   * page of results.
   * </pre>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * Set if not all clusters could be returned in a single response.
   * Pass this value to `page_token` in another request to get the next
   * page of results.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}