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
 * YumAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class YumAttributes {
  @SerializedName("repodataDepth")
  private Integer repodataDepth = null;

  /**
   * Validate that all paths are RPMs or yum metadata
   */
  @JsonAdapter(DeployPolicyEnum.Adapter.class)
  public enum DeployPolicyEnum {
    PERMISSIVE("PERMISSIVE"),
    STRICT("STRICT");

    private String value;

    DeployPolicyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeployPolicyEnum fromValue(String text) {
      for (DeployPolicyEnum b : DeployPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeployPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeployPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeployPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeployPolicyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("deployPolicy")
  private DeployPolicyEnum deployPolicy = null;

  public YumAttributes repodataDepth(Integer repodataDepth) {
    this.repodataDepth = repodataDepth;
    return this;
  }

   /**
   * Specifies the repository depth where repodata folder(s) are created
   * @return repodataDepth
  **/
  @Schema(example = "5", required = true, description = "Specifies the repository depth where repodata folder(s) are created")
  public Integer getRepodataDepth() {
    return repodataDepth;
  }

  public void setRepodataDepth(Integer repodataDepth) {
    this.repodataDepth = repodataDepth;
  }

  public YumAttributes deployPolicy(DeployPolicyEnum deployPolicy) {
    this.deployPolicy = deployPolicy;
    return this;
  }

   /**
   * Validate that all paths are RPMs or yum metadata
   * @return deployPolicy
  **/
  @Schema(example = "STRICT", description = "Validate that all paths are RPMs or yum metadata")
  public DeployPolicyEnum getDeployPolicy() {
    return deployPolicy;
  }

  public void setDeployPolicy(DeployPolicyEnum deployPolicy) {
    this.deployPolicy = deployPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YumAttributes yumAttributes = (YumAttributes) o;
    return Objects.equals(this.repodataDepth, yumAttributes.repodataDepth) &&
        Objects.equals(this.deployPolicy, yumAttributes.deployPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repodataDepth, deployPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YumAttributes {\n");
    
    sb.append("    repodataDepth: ").append(toIndentedString(repodataDepth)).append("\n");
    sb.append("    deployPolicy: ").append(toIndentedString(deployPolicy)).append("\n");
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
