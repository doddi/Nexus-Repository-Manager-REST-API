# GroupBlobStoreApiModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**softQuota** | [**BlobStoreApiSoftQuota**](BlobStoreApiSoftQuota.md) |  |  [optional]
**members** | **List&lt;String&gt;** | List of the names of blob stores that are members of this group |  [optional]
**fillPolicy** | [**FillPolicyEnum**](#FillPolicyEnum) |  |  [optional]

<a name="FillPolicyEnum"></a>
## Enum: FillPolicyEnum
Name | Value
---- | -----
ROUNDROBIN | &quot;roundRobin&quot;
WRITETOFIRST | &quot;writeToFirst&quot;
