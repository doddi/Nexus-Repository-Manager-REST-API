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
 * CleanupPolicyAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class CleanupPolicyAttributes {
  @SerializedName("policyNames")
  private List<String> policyNames = null;

  public CleanupPolicyAttributes policyNames(List<String> policyNames) {
    this.policyNames = policyNames;
    return this;
  }

  public CleanupPolicyAttributes addPolicyNamesItem(String policyNamesItem) {
    if (this.policyNames == null) {
      this.policyNames = new ArrayList<String>();
    }
    this.policyNames.add(policyNamesItem);
    return this;
  }

   /**
   * Components that match any of the applied policies will be deleted
   * @return policyNames
  **/
  @Schema(description = "Components that match any of the applied policies will be deleted")
  public List<String> getPolicyNames() {
    return policyNames;
  }

  public void setPolicyNames(List<String> policyNames) {
    this.policyNames = policyNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanupPolicyAttributes cleanupPolicyAttributes = (CleanupPolicyAttributes) o;
    return Objects.equals(this.policyNames, cleanupPolicyAttributes.policyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanupPolicyAttributes {\n");
    
    sb.append("    policyNames: ").append(toIndentedString(policyNames)).append("\n");
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
