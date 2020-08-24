/*
 * Nexus Repository Manager REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.27.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.S3BlobStoreApiAdvancedBucketConnection;
import io.swagger.client.model.S3BlobStoreApiBucket;
import io.swagger.client.model.S3BlobStoreApiBucketSecurity;
import io.swagger.client.model.S3BlobStoreApiEncryption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * S3BlobStoreApiBucketConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class S3BlobStoreApiBucketConfiguration {
  @SerializedName("bucket")
  private S3BlobStoreApiBucket bucket = null;

  @SerializedName("encryption")
  private S3BlobStoreApiEncryption encryption = null;

  @SerializedName("bucketSecurity")
  private S3BlobStoreApiBucketSecurity bucketSecurity = null;

  @SerializedName("advancedBucketConnection")
  private S3BlobStoreApiAdvancedBucketConnection advancedBucketConnection = null;

  public S3BlobStoreApiBucketConfiguration bucket(S3BlobStoreApiBucket bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @Schema(required = true, description = "")
  public S3BlobStoreApiBucket getBucket() {
    return bucket;
  }

  public void setBucket(S3BlobStoreApiBucket bucket) {
    this.bucket = bucket;
  }

  public S3BlobStoreApiBucketConfiguration encryption(S3BlobStoreApiEncryption encryption) {
    this.encryption = encryption;
    return this;
  }

   /**
   * Get encryption
   * @return encryption
  **/
  @Schema(description = "")
  public S3BlobStoreApiEncryption getEncryption() {
    return encryption;
  }

  public void setEncryption(S3BlobStoreApiEncryption encryption) {
    this.encryption = encryption;
  }

  public S3BlobStoreApiBucketConfiguration bucketSecurity(S3BlobStoreApiBucketSecurity bucketSecurity) {
    this.bucketSecurity = bucketSecurity;
    return this;
  }

   /**
   * Get bucketSecurity
   * @return bucketSecurity
  **/
  @Schema(description = "")
  public S3BlobStoreApiBucketSecurity getBucketSecurity() {
    return bucketSecurity;
  }

  public void setBucketSecurity(S3BlobStoreApiBucketSecurity bucketSecurity) {
    this.bucketSecurity = bucketSecurity;
  }

  public S3BlobStoreApiBucketConfiguration advancedBucketConnection(S3BlobStoreApiAdvancedBucketConnection advancedBucketConnection) {
    this.advancedBucketConnection = advancedBucketConnection;
    return this;
  }

   /**
   * Get advancedBucketConnection
   * @return advancedBucketConnection
  **/
  @Schema(description = "")
  public S3BlobStoreApiAdvancedBucketConnection getAdvancedBucketConnection() {
    return advancedBucketConnection;
  }

  public void setAdvancedBucketConnection(S3BlobStoreApiAdvancedBucketConnection advancedBucketConnection) {
    this.advancedBucketConnection = advancedBucketConnection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3BlobStoreApiBucketConfiguration s3BlobStoreApiBucketConfiguration = (S3BlobStoreApiBucketConfiguration) o;
    return Objects.equals(this.bucket, s3BlobStoreApiBucketConfiguration.bucket) &&
        Objects.equals(this.encryption, s3BlobStoreApiBucketConfiguration.encryption) &&
        Objects.equals(this.bucketSecurity, s3BlobStoreApiBucketConfiguration.bucketSecurity) &&
        Objects.equals(this.advancedBucketConnection, s3BlobStoreApiBucketConfiguration.advancedBucketConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, encryption, bucketSecurity, advancedBucketConnection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3BlobStoreApiBucketConfiguration {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
    sb.append("    bucketSecurity: ").append(toIndentedString(bucketSecurity)).append("\n");
    sb.append("    advancedBucketConnection: ").append(toIndentedString(advancedBucketConnection)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
