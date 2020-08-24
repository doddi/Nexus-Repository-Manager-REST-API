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
import java.util.ArrayList;
import java.util.List;
/**
 * ApiPrivilegeRepositoryAdminRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class ApiPrivilegeRepositoryAdminRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    READ("READ"),
    BROWSE("BROWSE"),
    EDIT("EDIT"),
    ADD("ADD"),
    DELETE("DELETE"),
    RUN("RUN"),
    ASSOCIATE("ASSOCIATE"),
    DISASSOCIATE("DISASSOCIATE"),
    ALL("ALL");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionsEnum fromValue(String text) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("repository")
  private String repository = null;

  public ApiPrivilegeRepositoryAdminRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the privilege.  This value cannot be changed.
   * @return name
  **/
  @Schema(description = "The name of the privilege.  This value cannot be changed.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiPrivilegeRepositoryAdminRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApiPrivilegeRepositoryAdminRequest actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public ApiPrivilegeRepositoryAdminRequest addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * A collection of actions to associate with the privilege, using BREAD syntax (browse,read,edit,add,delete,all) as well as &#x27;run&#x27; for script privileges.
   * @return actions
  **/
  @Schema(description = "A collection of actions to associate with the privilege, using BREAD syntax (browse,read,edit,add,delete,all) as well as 'run' for script privileges.")
  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }

  public ApiPrivilegeRepositoryAdminRequest format(String format) {
    this.format = format;
    return this;
  }

   /**
   * The repository format (i.e &#x27;nuget&#x27;, &#x27;npm&#x27;) this privilege will grant access to (or * for all).
   * @return format
  **/
  @Schema(description = "The repository format (i.e 'nuget', 'npm') this privilege will grant access to (or * for all).")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ApiPrivilegeRepositoryAdminRequest repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * The name of the repository this privilege will grant access to (or * for all).
   * @return repository
  **/
  @Schema(description = "The name of the repository this privilege will grant access to (or * for all).")
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPrivilegeRepositoryAdminRequest apiPrivilegeRepositoryAdminRequest = (ApiPrivilegeRepositoryAdminRequest) o;
    return Objects.equals(this.name, apiPrivilegeRepositoryAdminRequest.name) &&
        Objects.equals(this.description, apiPrivilegeRepositoryAdminRequest.description) &&
        Objects.equals(this.actions, apiPrivilegeRepositoryAdminRequest.actions) &&
        Objects.equals(this.format, apiPrivilegeRepositoryAdminRequest.format) &&
        Objects.equals(this.repository, apiPrivilegeRepositoryAdminRequest.repository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, actions, format, repository);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPrivilegeRepositoryAdminRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
