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
import io.swagger.client.model.DockerAttributes;
import io.swagger.client.model.GroupAttributes;
import io.swagger.client.model.StorageAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DockerGroupRepositoryApiRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class DockerGroupRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private StorageAttributes storage = null;

  @SerializedName("group")
  private GroupAttributes group = null;

  @SerializedName("docker")
  private DockerAttributes docker = null;

  public DockerGroupRepositoryApiRequest name(String name) {
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

  public DockerGroupRepositoryApiRequest online(Boolean online) {
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

  public DockerGroupRepositoryApiRequest storage(StorageAttributes storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @Schema(required = true, description = "")
  public StorageAttributes getStorage() {
    return storage;
  }

  public void setStorage(StorageAttributes storage) {
    this.storage = storage;
  }

  public DockerGroupRepositoryApiRequest group(GroupAttributes group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(required = true, description = "")
  public GroupAttributes getGroup() {
    return group;
  }

  public void setGroup(GroupAttributes group) {
    this.group = group;
  }

  public DockerGroupRepositoryApiRequest docker(DockerAttributes docker) {
    this.docker = docker;
    return this;
  }

   /**
   * Get docker
   * @return docker
  **/
  @Schema(required = true, description = "")
  public DockerAttributes getDocker() {
    return docker;
  }

  public void setDocker(DockerAttributes docker) {
    this.docker = docker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerGroupRepositoryApiRequest dockerGroupRepositoryApiRequest = (DockerGroupRepositoryApiRequest) o;
    return Objects.equals(this.name, dockerGroupRepositoryApiRequest.name) &&
        Objects.equals(this.online, dockerGroupRepositoryApiRequest.online) &&
        Objects.equals(this.storage, dockerGroupRepositoryApiRequest.storage) &&
        Objects.equals(this.group, dockerGroupRepositoryApiRequest.group) &&
        Objects.equals(this.docker, dockerGroupRepositoryApiRequest.docker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, group, docker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerGroupRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    docker: ").append(toIndentedString(docker)).append("\n");
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
