# UpdateLdapServerXo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | LDAP server name | 
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | LDAP server connection Protocol to use | 
**useTrustStore** | **Boolean** | Whether to use certificates stored in Nexus Repository Manager&#x27;s truststore |  [optional]
**host** | **String** | LDAP server connection hostname | 
**port** | **Integer** | LDAP server connection port to use | 
**searchBase** | **String** | LDAP location to be added to the connection URL | 
**authScheme** | [**AuthSchemeEnum**](#AuthSchemeEnum) | Authentication scheme used for connecting to LDAP server | 
**authRealm** | **String** | The SASL realm to bind to. Required if authScheme is CRAM_MD5 or DIGEST_MD5 |  [optional]
**authUsername** | **String** | This must be a fully qualified username if simple authentication is used. Required if authScheme other than none. |  [optional]
**connectionTimeoutSeconds** | **Integer** | How long to wait before timeout | 
**connectionRetryDelaySeconds** | **Integer** | How long to wait before retrying | 
**maxIncidentsCount** | **Integer** | How many retry attempts | 
**userBaseDn** | **String** | The relative DN where user objects are found (e.g. ou&#x3D;people). This value will have the Search base DN value appended to form the full User search base DN. |  [optional]
**userSubtree** | **Boolean** | Are users located in structures below the user base DN? |  [optional]
**userObjectClass** | **String** | LDAP class for user objects |  [optional]
**userLdapFilter** | **String** | LDAP search filter to limit user search |  [optional]
**userIdAttribute** | **String** | This is used to find a user given its user ID |  [optional]
**userRealNameAttribute** | **String** | This is used to find a real name given the user ID |  [optional]
**userEmailAddressAttribute** | **String** | This is used to find an email address given the user ID |  [optional]
**userPasswordAttribute** | **String** | If this field is blank the user will be authenticated against a bind with the LDAP server |  [optional]
**ldapGroupsAsRoles** | **Boolean** | Denotes whether LDAP assigned roles are used as Nexus Repository Manager roles |  [optional]
**groupType** | [**GroupTypeEnum**](#GroupTypeEnum) | Defines a type of groups used: static (a group contains a list of users) or dynamic (a user contains a list of groups). Required if ldapGroupsAsRoles is true. | 
**groupBaseDn** | **String** | The relative DN where group objects are found (e.g. ou&#x3D;Group). This value will have the Search base DN value appended to form the full Group search base DN. |  [optional]
**groupSubtree** | **Boolean** | Are groups located in structures below the group base DN |  [optional]
**groupObjectClass** | **String** | LDAP class for group objects. Required if groupType is static |  [optional]
**groupIdAttribute** | **String** | This field specifies the attribute of the Object class that defines the Group ID. Required if groupType is static |  [optional]
**groupMemberAttribute** | **String** | LDAP attribute containing the usernames for the group. Required if groupType is static |  [optional]
**groupMemberFormat** | **String** | The format of user ID stored in the group member attribute. Required if groupType is static |  [optional]
**userMemberOfAttribute** | **String** | Set this to the attribute used to store the attribute which holds groups DN in the user object. Required if groupType is dynamic |  [optional]
**authPassword** | **String** | The password to bind with. Required if authScheme other than none. | 
**id** | **String** | LDAP server ID |  [optional]

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
LDAP | &quot;ldap&quot;
LDAPS | &quot;ldaps&quot;

<a name="AuthSchemeEnum"></a>
## Enum: AuthSchemeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
SIMPLE | &quot;SIMPLE&quot;
DIGEST_MD5 | &quot;DIGEST_MD5&quot;
CRAM_MD5 | &quot;CRAM_MD5&quot;

<a name="GroupTypeEnum"></a>
## Enum: GroupTypeEnum
Name | Value
---- | -----
STATIC | &quot;static&quot;
DYNAMIC | &quot;dynamic&quot;
