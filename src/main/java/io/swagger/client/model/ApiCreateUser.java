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
 * ApiCreateUser
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class ApiCreateUser {
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("password")
  private String password = null;

  /**
   * The user&#x27;s status, e.g. active or disabled.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    LOCKED("locked"),
    DISABLED("disabled"),
    CHANGEPASSWORD("changepassword");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("roles")
  private List<String> roles = null;

  public ApiCreateUser userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The userid which is required for login. This value cannot be changed.
   * @return userId
  **/
  @Schema(description = "The userid which is required for login. This value cannot be changed.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ApiCreateUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the user.
   * @return firstName
  **/
  @Schema(description = "The first name of the user.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ApiCreateUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the user.
   * @return lastName
  **/
  @Schema(description = "The last name of the user.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ApiCreateUser emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address associated with the user.
   * @return emailAddress
  **/
  @Schema(description = "The email address associated with the user.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ApiCreateUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for the new user.
   * @return password
  **/
  @Schema(description = "The password for the new user.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ApiCreateUser status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The user&#x27;s status, e.g. active or disabled.
   * @return status
  **/
  @Schema(required = true, description = "The user's status, e.g. active or disabled.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ApiCreateUser roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public ApiCreateUser addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The roles which the user has been assigned within Nexus.
   * @return roles
  **/
  @Schema(description = "The roles which the user has been assigned within Nexus.")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCreateUser apiCreateUser = (ApiCreateUser) o;
    return Objects.equals(this.userId, apiCreateUser.userId) &&
        Objects.equals(this.firstName, apiCreateUser.firstName) &&
        Objects.equals(this.lastName, apiCreateUser.lastName) &&
        Objects.equals(this.emailAddress, apiCreateUser.emailAddress) &&
        Objects.equals(this.password, apiCreateUser.password) &&
        Objects.equals(this.status, apiCreateUser.status) &&
        Objects.equals(this.roles, apiCreateUser.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, lastName, emailAddress, password, status, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCreateUser {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
