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
 * UpdateLdapServerXo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-24T10:46:41.519+01:00[Europe/London]")
public class UpdateLdapServerXo {
  @SerializedName("name")
  private String name = null;

  /**
   * LDAP server connection Protocol to use
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    LDAP("ldap"),
    LDAPS("ldaps");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("protocol")
  private ProtocolEnum protocol = null;

  @SerializedName("useTrustStore")
  private Boolean useTrustStore = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("searchBase")
  private String searchBase = null;

  /**
   * Authentication scheme used for connecting to LDAP server
   */
  @JsonAdapter(AuthSchemeEnum.Adapter.class)
  public enum AuthSchemeEnum {
    NONE("NONE"),
    SIMPLE("SIMPLE"),
    DIGEST_MD5("DIGEST_MD5"),
    CRAM_MD5("CRAM_MD5");

    private String value;

    AuthSchemeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AuthSchemeEnum fromValue(String text) {
      for (AuthSchemeEnum b : AuthSchemeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AuthSchemeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthSchemeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthSchemeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthSchemeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("authScheme")
  private AuthSchemeEnum authScheme = null;

  @SerializedName("authRealm")
  private String authRealm = null;

  @SerializedName("authUsername")
  private String authUsername = null;

  @SerializedName("connectionTimeoutSeconds")
  private Integer connectionTimeoutSeconds = null;

  @SerializedName("connectionRetryDelaySeconds")
  private Integer connectionRetryDelaySeconds = null;

  @SerializedName("maxIncidentsCount")
  private Integer maxIncidentsCount = null;

  @SerializedName("userBaseDn")
  private String userBaseDn = null;

  @SerializedName("userSubtree")
  private Boolean userSubtree = null;

  @SerializedName("userObjectClass")
  private String userObjectClass = null;

  @SerializedName("userLdapFilter")
  private String userLdapFilter = null;

  @SerializedName("userIdAttribute")
  private String userIdAttribute = null;

  @SerializedName("userRealNameAttribute")
  private String userRealNameAttribute = null;

  @SerializedName("userEmailAddressAttribute")
  private String userEmailAddressAttribute = null;

  @SerializedName("userPasswordAttribute")
  private String userPasswordAttribute = null;

  @SerializedName("ldapGroupsAsRoles")
  private Boolean ldapGroupsAsRoles = null;

  /**
   * Defines a type of groups used: static (a group contains a list of users) or dynamic (a user contains a list of groups). Required if ldapGroupsAsRoles is true.
   */
  @JsonAdapter(GroupTypeEnum.Adapter.class)
  public enum GroupTypeEnum {
    STATIC("static"),
    DYNAMIC("dynamic");

    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GroupTypeEnum fromValue(String text) {
      for (GroupTypeEnum b : GroupTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GroupTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GroupTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("groupType")
  private GroupTypeEnum groupType = null;

  @SerializedName("groupBaseDn")
  private String groupBaseDn = null;

  @SerializedName("groupSubtree")
  private Boolean groupSubtree = null;

  @SerializedName("groupObjectClass")
  private String groupObjectClass = null;

  @SerializedName("groupIdAttribute")
  private String groupIdAttribute = null;

  @SerializedName("groupMemberAttribute")
  private String groupMemberAttribute = null;

  @SerializedName("groupMemberFormat")
  private String groupMemberFormat = null;

  @SerializedName("userMemberOfAttribute")
  private String userMemberOfAttribute = null;

  @SerializedName("authPassword")
  private String authPassword = null;

  @SerializedName("id")
  private String id = null;

  public UpdateLdapServerXo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * LDAP server name
   * @return name
  **/
  @Schema(required = true, description = "LDAP server name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateLdapServerXo protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * LDAP server connection Protocol to use
   * @return protocol
  **/
  @Schema(required = true, description = "LDAP server connection Protocol to use")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public UpdateLdapServerXo useTrustStore(Boolean useTrustStore) {
    this.useTrustStore = useTrustStore;
    return this;
  }

   /**
   * Whether to use certificates stored in Nexus Repository Manager&#x27;s truststore
   * @return useTrustStore
  **/
  @Schema(description = "Whether to use certificates stored in Nexus Repository Manager's truststore")
  public Boolean isUseTrustStore() {
    return useTrustStore;
  }

  public void setUseTrustStore(Boolean useTrustStore) {
    this.useTrustStore = useTrustStore;
  }

  public UpdateLdapServerXo host(String host) {
    this.host = host;
    return this;
  }

   /**
   * LDAP server connection hostname
   * @return host
  **/
  @Schema(required = true, description = "LDAP server connection hostname")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public UpdateLdapServerXo port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * LDAP server connection port to use
   * @return port
  **/
  @Schema(example = "636", required = true, description = "LDAP server connection port to use")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public UpdateLdapServerXo searchBase(String searchBase) {
    this.searchBase = searchBase;
    return this;
  }

   /**
   * LDAP location to be added to the connection URL
   * @return searchBase
  **/
  @Schema(example = "dc=example,dc=com", required = true, description = "LDAP location to be added to the connection URL")
  public String getSearchBase() {
    return searchBase;
  }

  public void setSearchBase(String searchBase) {
    this.searchBase = searchBase;
  }

  public UpdateLdapServerXo authScheme(AuthSchemeEnum authScheme) {
    this.authScheme = authScheme;
    return this;
  }

   /**
   * Authentication scheme used for connecting to LDAP server
   * @return authScheme
  **/
  @Schema(required = true, description = "Authentication scheme used for connecting to LDAP server")
  public AuthSchemeEnum getAuthScheme() {
    return authScheme;
  }

  public void setAuthScheme(AuthSchemeEnum authScheme) {
    this.authScheme = authScheme;
  }

  public UpdateLdapServerXo authRealm(String authRealm) {
    this.authRealm = authRealm;
    return this;
  }

   /**
   * The SASL realm to bind to. Required if authScheme is CRAM_MD5 or DIGEST_MD5
   * @return authRealm
  **/
  @Schema(example = "example.com", description = "The SASL realm to bind to. Required if authScheme is CRAM_MD5 or DIGEST_MD5")
  public String getAuthRealm() {
    return authRealm;
  }

  public void setAuthRealm(String authRealm) {
    this.authRealm = authRealm;
  }

  public UpdateLdapServerXo authUsername(String authUsername) {
    this.authUsername = authUsername;
    return this;
  }

   /**
   * This must be a fully qualified username if simple authentication is used. Required if authScheme other than none.
   * @return authUsername
  **/
  @Schema(description = "This must be a fully qualified username if simple authentication is used. Required if authScheme other than none.")
  public String getAuthUsername() {
    return authUsername;
  }

  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  public UpdateLdapServerXo connectionTimeoutSeconds(Integer connectionTimeoutSeconds) {
    this.connectionTimeoutSeconds = connectionTimeoutSeconds;
    return this;
  }

   /**
   * How long to wait before timeout
   * minimum: 1
   * maximum: 3600
   * @return connectionTimeoutSeconds
  **/
  @Schema(example = "1", required = true, description = "How long to wait before timeout")
  public Integer getConnectionTimeoutSeconds() {
    return connectionTimeoutSeconds;
  }

  public void setConnectionTimeoutSeconds(Integer connectionTimeoutSeconds) {
    this.connectionTimeoutSeconds = connectionTimeoutSeconds;
  }

  public UpdateLdapServerXo connectionRetryDelaySeconds(Integer connectionRetryDelaySeconds) {
    this.connectionRetryDelaySeconds = connectionRetryDelaySeconds;
    return this;
  }

   /**
   * How long to wait before retrying
   * minimum: 0
   * @return connectionRetryDelaySeconds
  **/
  @Schema(required = true, description = "How long to wait before retrying")
  public Integer getConnectionRetryDelaySeconds() {
    return connectionRetryDelaySeconds;
  }

  public void setConnectionRetryDelaySeconds(Integer connectionRetryDelaySeconds) {
    this.connectionRetryDelaySeconds = connectionRetryDelaySeconds;
  }

  public UpdateLdapServerXo maxIncidentsCount(Integer maxIncidentsCount) {
    this.maxIncidentsCount = maxIncidentsCount;
    return this;
  }

   /**
   * How many retry attempts
   * minimum: 0
   * @return maxIncidentsCount
  **/
  @Schema(required = true, description = "How many retry attempts")
  public Integer getMaxIncidentsCount() {
    return maxIncidentsCount;
  }

  public void setMaxIncidentsCount(Integer maxIncidentsCount) {
    this.maxIncidentsCount = maxIncidentsCount;
  }

  public UpdateLdapServerXo userBaseDn(String userBaseDn) {
    this.userBaseDn = userBaseDn;
    return this;
  }

   /**
   * The relative DN where user objects are found (e.g. ou&#x3D;people). This value will have the Search base DN value appended to form the full User search base DN.
   * @return userBaseDn
  **/
  @Schema(example = "ou=people", description = "The relative DN where user objects are found (e.g. ou=people). This value will have the Search base DN value appended to form the full User search base DN.")
  public String getUserBaseDn() {
    return userBaseDn;
  }

  public void setUserBaseDn(String userBaseDn) {
    this.userBaseDn = userBaseDn;
  }

  public UpdateLdapServerXo userSubtree(Boolean userSubtree) {
    this.userSubtree = userSubtree;
    return this;
  }

   /**
   * Are users located in structures below the user base DN?
   * @return userSubtree
  **/
  @Schema(description = "Are users located in structures below the user base DN?")
  public Boolean isUserSubtree() {
    return userSubtree;
  }

  public void setUserSubtree(Boolean userSubtree) {
    this.userSubtree = userSubtree;
  }

  public UpdateLdapServerXo userObjectClass(String userObjectClass) {
    this.userObjectClass = userObjectClass;
    return this;
  }

   /**
   * LDAP class for user objects
   * @return userObjectClass
  **/
  @Schema(example = "inetOrgPerson", description = "LDAP class for user objects")
  public String getUserObjectClass() {
    return userObjectClass;
  }

  public void setUserObjectClass(String userObjectClass) {
    this.userObjectClass = userObjectClass;
  }

  public UpdateLdapServerXo userLdapFilter(String userLdapFilter) {
    this.userLdapFilter = userLdapFilter;
    return this;
  }

   /**
   * LDAP search filter to limit user search
   * @return userLdapFilter
  **/
  @Schema(example = "(|(mail=*@example.com)(uid=dom*))", description = "LDAP search filter to limit user search")
  public String getUserLdapFilter() {
    return userLdapFilter;
  }

  public void setUserLdapFilter(String userLdapFilter) {
    this.userLdapFilter = userLdapFilter;
  }

  public UpdateLdapServerXo userIdAttribute(String userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
    return this;
  }

   /**
   * This is used to find a user given its user ID
   * @return userIdAttribute
  **/
  @Schema(example = "uid", description = "This is used to find a user given its user ID")
  public String getUserIdAttribute() {
    return userIdAttribute;
  }

  public void setUserIdAttribute(String userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  public UpdateLdapServerXo userRealNameAttribute(String userRealNameAttribute) {
    this.userRealNameAttribute = userRealNameAttribute;
    return this;
  }

   /**
   * This is used to find a real name given the user ID
   * @return userRealNameAttribute
  **/
  @Schema(example = "cn", description = "This is used to find a real name given the user ID")
  public String getUserRealNameAttribute() {
    return userRealNameAttribute;
  }

  public void setUserRealNameAttribute(String userRealNameAttribute) {
    this.userRealNameAttribute = userRealNameAttribute;
  }

  public UpdateLdapServerXo userEmailAddressAttribute(String userEmailAddressAttribute) {
    this.userEmailAddressAttribute = userEmailAddressAttribute;
    return this;
  }

   /**
   * This is used to find an email address given the user ID
   * @return userEmailAddressAttribute
  **/
  @Schema(example = "mail", description = "This is used to find an email address given the user ID")
  public String getUserEmailAddressAttribute() {
    return userEmailAddressAttribute;
  }

  public void setUserEmailAddressAttribute(String userEmailAddressAttribute) {
    this.userEmailAddressAttribute = userEmailAddressAttribute;
  }

  public UpdateLdapServerXo userPasswordAttribute(String userPasswordAttribute) {
    this.userPasswordAttribute = userPasswordAttribute;
    return this;
  }

   /**
   * If this field is blank the user will be authenticated against a bind with the LDAP server
   * @return userPasswordAttribute
  **/
  @Schema(description = "If this field is blank the user will be authenticated against a bind with the LDAP server")
  public String getUserPasswordAttribute() {
    return userPasswordAttribute;
  }

  public void setUserPasswordAttribute(String userPasswordAttribute) {
    this.userPasswordAttribute = userPasswordAttribute;
  }

  public UpdateLdapServerXo ldapGroupsAsRoles(Boolean ldapGroupsAsRoles) {
    this.ldapGroupsAsRoles = ldapGroupsAsRoles;
    return this;
  }

   /**
   * Denotes whether LDAP assigned roles are used as Nexus Repository Manager roles
   * @return ldapGroupsAsRoles
  **/
  @Schema(description = "Denotes whether LDAP assigned roles are used as Nexus Repository Manager roles")
  public Boolean isLdapGroupsAsRoles() {
    return ldapGroupsAsRoles;
  }

  public void setLdapGroupsAsRoles(Boolean ldapGroupsAsRoles) {
    this.ldapGroupsAsRoles = ldapGroupsAsRoles;
  }

  public UpdateLdapServerXo groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Defines a type of groups used: static (a group contains a list of users) or dynamic (a user contains a list of groups). Required if ldapGroupsAsRoles is true.
   * @return groupType
  **/
  @Schema(required = true, description = "Defines a type of groups used: static (a group contains a list of users) or dynamic (a user contains a list of groups). Required if ldapGroupsAsRoles is true.")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  public UpdateLdapServerXo groupBaseDn(String groupBaseDn) {
    this.groupBaseDn = groupBaseDn;
    return this;
  }

   /**
   * The relative DN where group objects are found (e.g. ou&#x3D;Group). This value will have the Search base DN value appended to form the full Group search base DN.
   * @return groupBaseDn
  **/
  @Schema(example = "ou=Group", description = "The relative DN where group objects are found (e.g. ou=Group). This value will have the Search base DN value appended to form the full Group search base DN.")
  public String getGroupBaseDn() {
    return groupBaseDn;
  }

  public void setGroupBaseDn(String groupBaseDn) {
    this.groupBaseDn = groupBaseDn;
  }

  public UpdateLdapServerXo groupSubtree(Boolean groupSubtree) {
    this.groupSubtree = groupSubtree;
    return this;
  }

   /**
   * Are groups located in structures below the group base DN
   * @return groupSubtree
  **/
  @Schema(description = "Are groups located in structures below the group base DN")
  public Boolean isGroupSubtree() {
    return groupSubtree;
  }

  public void setGroupSubtree(Boolean groupSubtree) {
    this.groupSubtree = groupSubtree;
  }

  public UpdateLdapServerXo groupObjectClass(String groupObjectClass) {
    this.groupObjectClass = groupObjectClass;
    return this;
  }

   /**
   * LDAP class for group objects. Required if groupType is static
   * @return groupObjectClass
  **/
  @Schema(example = "posixGroup", description = "LDAP class for group objects. Required if groupType is static")
  public String getGroupObjectClass() {
    return groupObjectClass;
  }

  public void setGroupObjectClass(String groupObjectClass) {
    this.groupObjectClass = groupObjectClass;
  }

  public UpdateLdapServerXo groupIdAttribute(String groupIdAttribute) {
    this.groupIdAttribute = groupIdAttribute;
    return this;
  }

   /**
   * This field specifies the attribute of the Object class that defines the Group ID. Required if groupType is static
   * @return groupIdAttribute
  **/
  @Schema(example = "cn", description = "This field specifies the attribute of the Object class that defines the Group ID. Required if groupType is static")
  public String getGroupIdAttribute() {
    return groupIdAttribute;
  }

  public void setGroupIdAttribute(String groupIdAttribute) {
    this.groupIdAttribute = groupIdAttribute;
  }

  public UpdateLdapServerXo groupMemberAttribute(String groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
    return this;
  }

   /**
   * LDAP attribute containing the usernames for the group. Required if groupType is static
   * @return groupMemberAttribute
  **/
  @Schema(example = "memberUid", description = "LDAP attribute containing the usernames for the group. Required if groupType is static")
  public String getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  public void setGroupMemberAttribute(String groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  public UpdateLdapServerXo groupMemberFormat(String groupMemberFormat) {
    this.groupMemberFormat = groupMemberFormat;
    return this;
  }

   /**
   * The format of user ID stored in the group member attribute. Required if groupType is static
   * @return groupMemberFormat
  **/
  @Schema(example = "uid=${username},ou=people,dc=example,dc=com", description = "The format of user ID stored in the group member attribute. Required if groupType is static")
  public String getGroupMemberFormat() {
    return groupMemberFormat;
  }

  public void setGroupMemberFormat(String groupMemberFormat) {
    this.groupMemberFormat = groupMemberFormat;
  }

  public UpdateLdapServerXo userMemberOfAttribute(String userMemberOfAttribute) {
    this.userMemberOfAttribute = userMemberOfAttribute;
    return this;
  }

   /**
   * Set this to the attribute used to store the attribute which holds groups DN in the user object. Required if groupType is dynamic
   * @return userMemberOfAttribute
  **/
  @Schema(example = "memberOf", description = "Set this to the attribute used to store the attribute which holds groups DN in the user object. Required if groupType is dynamic")
  public String getUserMemberOfAttribute() {
    return userMemberOfAttribute;
  }

  public void setUserMemberOfAttribute(String userMemberOfAttribute) {
    this.userMemberOfAttribute = userMemberOfAttribute;
  }

  public UpdateLdapServerXo authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }

   /**
   * The password to bind with. Required if authScheme other than none.
   * @return authPassword
  **/
  @Schema(required = true, description = "The password to bind with. Required if authScheme other than none.")
  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  public UpdateLdapServerXo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * LDAP server ID
   * @return id
  **/
  @Schema(description = "LDAP server ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLdapServerXo updateLdapServerXo = (UpdateLdapServerXo) o;
    return Objects.equals(this.name, updateLdapServerXo.name) &&
        Objects.equals(this.protocol, updateLdapServerXo.protocol) &&
        Objects.equals(this.useTrustStore, updateLdapServerXo.useTrustStore) &&
        Objects.equals(this.host, updateLdapServerXo.host) &&
        Objects.equals(this.port, updateLdapServerXo.port) &&
        Objects.equals(this.searchBase, updateLdapServerXo.searchBase) &&
        Objects.equals(this.authScheme, updateLdapServerXo.authScheme) &&
        Objects.equals(this.authRealm, updateLdapServerXo.authRealm) &&
        Objects.equals(this.authUsername, updateLdapServerXo.authUsername) &&
        Objects.equals(this.connectionTimeoutSeconds, updateLdapServerXo.connectionTimeoutSeconds) &&
        Objects.equals(this.connectionRetryDelaySeconds, updateLdapServerXo.connectionRetryDelaySeconds) &&
        Objects.equals(this.maxIncidentsCount, updateLdapServerXo.maxIncidentsCount) &&
        Objects.equals(this.userBaseDn, updateLdapServerXo.userBaseDn) &&
        Objects.equals(this.userSubtree, updateLdapServerXo.userSubtree) &&
        Objects.equals(this.userObjectClass, updateLdapServerXo.userObjectClass) &&
        Objects.equals(this.userLdapFilter, updateLdapServerXo.userLdapFilter) &&
        Objects.equals(this.userIdAttribute, updateLdapServerXo.userIdAttribute) &&
        Objects.equals(this.userRealNameAttribute, updateLdapServerXo.userRealNameAttribute) &&
        Objects.equals(this.userEmailAddressAttribute, updateLdapServerXo.userEmailAddressAttribute) &&
        Objects.equals(this.userPasswordAttribute, updateLdapServerXo.userPasswordAttribute) &&
        Objects.equals(this.ldapGroupsAsRoles, updateLdapServerXo.ldapGroupsAsRoles) &&
        Objects.equals(this.groupType, updateLdapServerXo.groupType) &&
        Objects.equals(this.groupBaseDn, updateLdapServerXo.groupBaseDn) &&
        Objects.equals(this.groupSubtree, updateLdapServerXo.groupSubtree) &&
        Objects.equals(this.groupObjectClass, updateLdapServerXo.groupObjectClass) &&
        Objects.equals(this.groupIdAttribute, updateLdapServerXo.groupIdAttribute) &&
        Objects.equals(this.groupMemberAttribute, updateLdapServerXo.groupMemberAttribute) &&
        Objects.equals(this.groupMemberFormat, updateLdapServerXo.groupMemberFormat) &&
        Objects.equals(this.userMemberOfAttribute, updateLdapServerXo.userMemberOfAttribute) &&
        Objects.equals(this.authPassword, updateLdapServerXo.authPassword) &&
        Objects.equals(this.id, updateLdapServerXo.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, protocol, useTrustStore, host, port, searchBase, authScheme, authRealm, authUsername, connectionTimeoutSeconds, connectionRetryDelaySeconds, maxIncidentsCount, userBaseDn, userSubtree, userObjectClass, userLdapFilter, userIdAttribute, userRealNameAttribute, userEmailAddressAttribute, userPasswordAttribute, ldapGroupsAsRoles, groupType, groupBaseDn, groupSubtree, groupObjectClass, groupIdAttribute, groupMemberAttribute, groupMemberFormat, userMemberOfAttribute, authPassword, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLdapServerXo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    useTrustStore: ").append(toIndentedString(useTrustStore)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    searchBase: ").append(toIndentedString(searchBase)).append("\n");
    sb.append("    authScheme: ").append(toIndentedString(authScheme)).append("\n");
    sb.append("    authRealm: ").append(toIndentedString(authRealm)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    connectionTimeoutSeconds: ").append(toIndentedString(connectionTimeoutSeconds)).append("\n");
    sb.append("    connectionRetryDelaySeconds: ").append(toIndentedString(connectionRetryDelaySeconds)).append("\n");
    sb.append("    maxIncidentsCount: ").append(toIndentedString(maxIncidentsCount)).append("\n");
    sb.append("    userBaseDn: ").append(toIndentedString(userBaseDn)).append("\n");
    sb.append("    userSubtree: ").append(toIndentedString(userSubtree)).append("\n");
    sb.append("    userObjectClass: ").append(toIndentedString(userObjectClass)).append("\n");
    sb.append("    userLdapFilter: ").append(toIndentedString(userLdapFilter)).append("\n");
    sb.append("    userIdAttribute: ").append(toIndentedString(userIdAttribute)).append("\n");
    sb.append("    userRealNameAttribute: ").append(toIndentedString(userRealNameAttribute)).append("\n");
    sb.append("    userEmailAddressAttribute: ").append(toIndentedString(userEmailAddressAttribute)).append("\n");
    sb.append("    userPasswordAttribute: ").append(toIndentedString(userPasswordAttribute)).append("\n");
    sb.append("    ldapGroupsAsRoles: ").append(toIndentedString(ldapGroupsAsRoles)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    groupBaseDn: ").append(toIndentedString(groupBaseDn)).append("\n");
    sb.append("    groupSubtree: ").append(toIndentedString(groupSubtree)).append("\n");
    sb.append("    groupObjectClass: ").append(toIndentedString(groupObjectClass)).append("\n");
    sb.append("    groupIdAttribute: ").append(toIndentedString(groupIdAttribute)).append("\n");
    sb.append("    groupMemberAttribute: ").append(toIndentedString(groupMemberAttribute)).append("\n");
    sb.append("    groupMemberFormat: ").append(toIndentedString(groupMemberFormat)).append("\n");
    sb.append("    userMemberOfAttribute: ").append(toIndentedString(userMemberOfAttribute)).append("\n");
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
