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
import io.swagger.client.model.MavenAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MavenHostedRepositoryApiRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class MavenHostedRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private HostedStorageAttributes storage = null;

  @SerializedName("cleanup")
  private CleanupPolicyAttributes cleanup = null;

  @SerializedName("maven")
  private MavenAttributes maven = null;

  public MavenHostedRepositoryApiRequest name(String name) {
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

  public MavenHostedRepositoryApiRequest online(Boolean online) {
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

  public MavenHostedRepositoryApiRequest storage(HostedStorageAttributes storage) {
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

  public MavenHostedRepositoryApiRequest cleanup(CleanupPolicyAttributes cleanup) {
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

  public MavenHostedRepositoryApiRequest maven(MavenAttributes maven) {
    this.maven = maven;
    return this;
  }

   /**
   * Get maven
   * @return maven
  **/
  @Schema(required = true, description = "")
  public MavenAttributes getMaven() {
    return maven;
  }

  public void setMaven(MavenAttributes maven) {
    this.maven = maven;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MavenHostedRepositoryApiRequest mavenHostedRepositoryApiRequest = (MavenHostedRepositoryApiRequest) o;
    return Objects.equals(this.name, mavenHostedRepositoryApiRequest.name) &&
        Objects.equals(this.online, mavenHostedRepositoryApiRequest.online) &&
        Objects.equals(this.storage, mavenHostedRepositoryApiRequest.storage) &&
        Objects.equals(this.cleanup, mavenHostedRepositoryApiRequest.cleanup) &&
        Objects.equals(this.maven, mavenHostedRepositoryApiRequest.maven);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, cleanup, maven);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MavenHostedRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
    sb.append("    maven: ").append(toIndentedString(maven)).append("\n");
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
