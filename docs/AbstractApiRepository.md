# AbstractApiRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A unique identifier for this repository |  [optional]
**format** | **String** | Component format held in this repository |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Controls if deployments of and updates to artifacts are allowed |  [optional]
**url** | **String** | URL to the repository |  [optional]
**online** | **Boolean** | Whether this repository accepts incoming requests | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HOSTED | &quot;hosted&quot;
PROXY | &quot;proxy&quot;
GROUP | &quot;group&quot;
