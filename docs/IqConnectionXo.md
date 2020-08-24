# IqConnectionXo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Whether to use IQ Server |  [optional]
**showLink** | **Boolean** | Show IQ Server link in Browse menu when server is enabled |  [optional]
**url** | **String** | The address of your IQ Server |  [optional]
**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) | Authentication method | 
**username** | **String** | User with access to IQ Server |  [optional]
**password** | **String** | Credentials for the IQ Server User |  [optional]
**useTrustStoreForUrl** | **Boolean** | Use certificates stored in the Nexus Repository Manager truststore to connect to IQ Server |  [optional]
**timeoutSeconds** | **Integer** | Seconds to wait for activity before stopping and retrying the connection. Leave blank to use the globally defined HTTP timeout. |  [optional]
**properties** | **String** | Additional properties to configure for IQ Server |  [optional]

<a name="AuthenticationTypeEnum"></a>
## Enum: AuthenticationTypeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
PKI | &quot;PKI&quot;
