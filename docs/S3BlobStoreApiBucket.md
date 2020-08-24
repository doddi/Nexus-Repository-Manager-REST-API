# S3BlobStoreApiBucket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region** | **String** | The AWS region to create a new S3 bucket in or an existing S3 bucket&#x27;s region | 
**name** | **String** | The name of the S3 bucket | 
**prefix** | **String** | The S3 blob store (i.e S3 object) key prefix |  [optional]
**expiration** | **Integer** | How many days until deleted blobs are finally removed from the S3 bucket (-1 to disable) | 
