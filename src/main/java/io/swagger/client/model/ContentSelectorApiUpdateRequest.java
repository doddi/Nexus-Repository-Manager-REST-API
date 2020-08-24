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
 * ContentSelectorApiUpdateRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class ContentSelectorApiUpdateRequest {
  @SerializedName("description")
  private String description = null;

  @SerializedName("expression")
  private String expression = null;

  public ContentSelectorApiUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of this content selector
   * @return description
  **/
  @Schema(description = "An optional description of this content selector")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ContentSelectorApiUpdateRequest expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The expression used to identify content
   * @return expression
  **/
  @Schema(example = "format == \"maven2\" and path =^ \"/org/sonatype/nexus\"", description = "The expression used to identify content")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentSelectorApiUpdateRequest contentSelectorApiUpdateRequest = (ContentSelectorApiUpdateRequest) o;
    return Objects.equals(this.description, contentSelectorApiUpdateRequest.description) &&
        Objects.equals(this.expression, contentSelectorApiUpdateRequest.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSelectorApiUpdateRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
