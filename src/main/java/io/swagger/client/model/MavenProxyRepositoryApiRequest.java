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
import io.swagger.client.model.HttpClientAttributes;
import io.swagger.client.model.MavenAttributes;
import io.swagger.client.model.NegativeCacheAttributes;
import io.swagger.client.model.ProxyAttributes;
import io.swagger.client.model.StorageAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MavenProxyRepositoryApiRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class MavenProxyRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private StorageAttributes storage = null;

  @SerializedName("cleanup")
  private CleanupPolicyAttributes cleanup = null;

  @SerializedName("proxy")
  private ProxyAttributes proxy = null;

  @SerializedName("negativeCache")
  private NegativeCacheAttributes negativeCache = null;

  @SerializedName("httpClient")
  private HttpClientAttributes httpClient = null;

  @SerializedName("routingRule")
  private String routingRule = null;

  @SerializedName("maven")
  private MavenAttributes maven = null;

  public MavenProxyRepositoryApiRequest name(String name) {
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

  public MavenProxyRepositoryApiRequest online(Boolean online) {
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

  public MavenProxyRepositoryApiRequest storage(StorageAttributes storage) {
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

  public MavenProxyRepositoryApiRequest cleanup(CleanupPolicyAttributes cleanup) {
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

  public MavenProxyRepositoryApiRequest proxy(ProxyAttributes proxy) {
    this.proxy = proxy;
    return this;
  }

   /**
   * Get proxy
   * @return proxy
  **/
  @Schema(required = true, description = "")
  public ProxyAttributes getProxy() {
    return proxy;
  }

  public void setProxy(ProxyAttributes proxy) {
    this.proxy = proxy;
  }

  public MavenProxyRepositoryApiRequest negativeCache(NegativeCacheAttributes negativeCache) {
    this.negativeCache = negativeCache;
    return this;
  }

   /**
   * Get negativeCache
   * @return negativeCache
  **/
  @Schema(required = true, description = "")
  public NegativeCacheAttributes getNegativeCache() {
    return negativeCache;
  }

  public void setNegativeCache(NegativeCacheAttributes negativeCache) {
    this.negativeCache = negativeCache;
  }

  public MavenProxyRepositoryApiRequest httpClient(HttpClientAttributes httpClient) {
    this.httpClient = httpClient;
    return this;
  }

   /**
   * Get httpClient
   * @return httpClient
  **/
  @Schema(required = true, description = "")
  public HttpClientAttributes getHttpClient() {
    return httpClient;
  }

  public void setHttpClient(HttpClientAttributes httpClient) {
    this.httpClient = httpClient;
  }

  public MavenProxyRepositoryApiRequest routingRule(String routingRule) {
    this.routingRule = routingRule;
    return this;
  }

   /**
   * Get routingRule
   * @return routingRule
  **/
  @Schema(description = "")
  public String getRoutingRule() {
    return routingRule;
  }

  public void setRoutingRule(String routingRule) {
    this.routingRule = routingRule;
  }

  public MavenProxyRepositoryApiRequest maven(MavenAttributes maven) {
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
    MavenProxyRepositoryApiRequest mavenProxyRepositoryApiRequest = (MavenProxyRepositoryApiRequest) o;
    return Objects.equals(this.name, mavenProxyRepositoryApiRequest.name) &&
        Objects.equals(this.online, mavenProxyRepositoryApiRequest.online) &&
        Objects.equals(this.storage, mavenProxyRepositoryApiRequest.storage) &&
        Objects.equals(this.cleanup, mavenProxyRepositoryApiRequest.cleanup) &&
        Objects.equals(this.proxy, mavenProxyRepositoryApiRequest.proxy) &&
        Objects.equals(this.negativeCache, mavenProxyRepositoryApiRequest.negativeCache) &&
        Objects.equals(this.httpClient, mavenProxyRepositoryApiRequest.httpClient) &&
        Objects.equals(this.routingRule, mavenProxyRepositoryApiRequest.routingRule) &&
        Objects.equals(this.maven, mavenProxyRepositoryApiRequest.maven);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, cleanup, proxy, negativeCache, httpClient, routingRule, maven);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MavenProxyRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    negativeCache: ").append(toIndentedString(negativeCache)).append("\n");
    sb.append("    httpClient: ").append(toIndentedString(httpClient)).append("\n");
    sb.append("    routingRule: ").append(toIndentedString(routingRule)).append("\n");
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
