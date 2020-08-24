# ContentSelectorApiResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The content selector name cannot be changed after creation |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of content selector the backend is using |  [optional]
**description** | **String** | A human-readable description |  [optional]
**expression** | **String** | The expression used to identify content |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CSEL | &quot;csel&quot;
JEXL | &quot;jexl&quot;
