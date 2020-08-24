# S3BlobStoreApiEncryption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryptionType** | [**EncryptionTypeEnum**](#EncryptionTypeEnum) | The type of S3 server side encryption to use. |  [optional]
**encryptionKey** | **String** | The encryption key. |  [optional]

<a name="EncryptionTypeEnum"></a>
## Enum: EncryptionTypeEnum
Name | Value
---- | -----
S3MANAGEDENCRYPTION | &quot;s3ManagedEncryption&quot;
KMSMANAGEDENCRYPTION | &quot;kmsManagedEncryption&quot;
