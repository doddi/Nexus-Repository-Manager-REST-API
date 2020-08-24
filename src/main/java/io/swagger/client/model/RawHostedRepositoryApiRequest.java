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
import io.swagger.client.model.CleanupPolicyAttributes;
import io.swagger.client.model.HostedStorageAttributes;
import io.swagger.client.model.RawAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RawHostedRepositoryApiRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class RawHostedRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private HostedStorageAttributes storage = null;

  @SerializedName("cleanup")
  private CleanupPolicyAttributes cleanup = null;

  @SerializedName("raw")
  private RawAttributes raw = null;

  public RawHostedRepositoryApiRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique identifier for this repository
   * @return name
  **/
  @Schema(example = "internal", required = true, description = "A unique identifier for this repository")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RawHostedRepositoryApiRequest online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Whether this repository accepts incoming requests
   * @return online
  **/
  @Schema(example = "true", required = true, description = "Whether this repository accepts incoming requests")
  public Boolean isOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public RawHostedRepositoryApiRequest storage(HostedStorageAttributes storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @Schema(required = true, description = "")
  public HostedStorageAttributes getStorage() {
    return storage;
  }

  public void setStorage(HostedStorageAttributes storage) {
    this.storage = storage;
  }

  public RawHostedRepositoryApiRequest cleanup(CleanupPolicyAttributes cleanup) {
    this.cleanup = cleanup;
    return this;
  }

   /**
   * Get cleanup
   * @return cleanup
  **/
  @Schema(description = "")
  public CleanupPolicyAttributes getCleanup() {
    return cleanup;
  }

  public void setCleanup(CleanupPolicyAttributes cleanup) {
    this.cleanup = cleanup;
  }

  public RawHostedRepositoryApiRequest raw(RawAttributes raw) {
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @Schema(description = "")
  public RawAttributes getRaw() {
    return raw;
  }

  public void setRaw(RawAttributes raw) {
    this.raw = raw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawHostedRepositoryApiRequest rawHostedRepositoryApiRequest = (RawHostedRepositoryApiRequest) o;
    return Objects.equals(this.name, rawHostedRepositoryApiRequest.name) &&
        Objects.equals(this.online, rawHostedRepositoryApiRequest.online) &&
        Objects.equals(this.storage, rawHostedRepositoryApiRequest.storage) &&
        Objects.equals(this.cleanup, rawHostedRepositoryApiRequest.cleanup) &&
        Objects.equals(this.raw, rawHostedRepositoryApiRequest.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, cleanup, raw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawHostedRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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
