# ApiCreateUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The userid which is required for login. This value cannot be changed. |  [optional]
**firstName** | **String** | The first name of the user. |  [optional]
**lastName** | **String** | The last name of the user. |  [optional]
**emailAddress** | **String** | The email address associated with the user. |  [optional]
**password** | **String** | The password for the new user. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The user&#x27;s status, e.g. active or disabled. | 
**roles** | **List&lt;String&gt;** | The roles which the user has been assigned within Nexus. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
LOCKED | &quot;locked&quot;
DISABLED | &quot;disabled&quot;
CHANGEPASSWORD | &quot;changepassword&quot;
