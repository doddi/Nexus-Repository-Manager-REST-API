# ApiUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The userid which is required for login. This value cannot be changed. |  [optional]
**firstName** | **String** | The first name of the user. |  [optional]
**lastName** | **String** | The last name of the user. |  [optional]
**emailAddress** | **String** | The email address associated with the user. |  [optional]
**source** | **String** | The user source which is the origin of this user. This value cannot be changed. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The user&#x27;s status, e.g. active or disabled. | 
**readOnly** | **Boolean** | Indicates whether the user&#x27;s properties could be modified by the Nexus Repository Manager. When false only roles are considered during update. |  [optional]
**roles** | **List&lt;String&gt;** | The roles which the user has been assigned within Nexus. |  [optional]
**externalRoles** | **List&lt;String&gt;** | The roles which the user has been assigned in an external source, e.g. LDAP group. These cannot be changed within the Nexus Repository Manager. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
LOCKED | &quot;locked&quot;
DISABLED | &quot;disabled&quot;
CHANGEPASSWORD | &quot;changepassword&quot;
