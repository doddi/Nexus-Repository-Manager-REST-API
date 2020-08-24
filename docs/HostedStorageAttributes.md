# HostedStorageAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blobStoreName** | **String** | Blob store used to store repository contents |  [optional]
**strictContentTypeValidation** | **Boolean** | Whether to validate uploaded content&#x27;s MIME type appropriate for the repository format | 
**writePolicy** | [**WritePolicyEnum**](#WritePolicyEnum) | Controls if deployments of and updates to assets are allowed | 

<a name="WritePolicyEnum"></a>
## Enum: WritePolicyEnum
Name | Value
---- | -----
ALLOW | &quot;allow&quot;
ALLOW_ONCE | &quot;allow_once&quot;
DENY | &quot;deny&quot;
