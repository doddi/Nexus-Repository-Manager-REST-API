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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * S3BlobStoreApiBucket
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class S3BlobStoreApiBucket {
  @SerializedName("region")
  private String region = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("expiration")
  private Integer expiration = null;

  public S3BlobStoreApiBucket region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The AWS region to create a new S3 bucket in or an existing S3 bucket&#x27;s region
   * @return region
  **/
  @Schema(required = true, description = "The AWS region to create a new S3 bucket in or an existing S3 bucket's region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public S3BlobStoreApiBucket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the S3 bucket
   * @return name
  **/
  @Schema(required = true, description = "The name of the S3 bucket")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public S3BlobStoreApiBucket prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * The S3 blob store (i.e S3 object) key prefix
   * @return prefix
  **/
  @Schema(description = "The S3 blob store (i.e S3 object) key prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public S3BlobStoreApiBucket expiration(Integer expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * How many days until deleted blobs are finally removed from the S3 bucket (-1 to disable)
   * @return expiration
  **/
  @Schema(required = true, description = "How many days until deleted blobs are finally removed from the S3 bucket (-1 to disable)")
  public Integer getExpiration() {
    return expiration;
  }

  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3BlobStoreApiBucket s3BlobStoreApiBucket = (S3BlobStoreApiBucket) o;
    return Objects.equals(this.region, s3BlobStoreApiBucket.region) &&
        Objects.equals(this.name, s3BlobStoreApiBucket.name) &&
        Objects.equals(this.prefix, s3BlobStoreApiBucket.prefix) &&
        Objects.equals(this.expiration, s3BlobStoreApiBucket.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, name, prefix, expiration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3BlobStoreApiBucket {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
