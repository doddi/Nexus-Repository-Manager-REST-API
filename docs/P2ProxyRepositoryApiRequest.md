# P2ProxyRepositoryApiRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A unique identifier for this repository | 
**online** | **Boolean** | Whether this repository accepts incoming requests | 
**storage** | [**StorageAttributes**](StorageAttributes.md) |  | 
**cleanup** | [**CleanupPolicyAttributes**](CleanupPolicyAttributes.md) |  |  [optional]
**proxy** | [**ProxyAttributes**](ProxyAttributes.md) |  | 
**negativeCache** | [**NegativeCacheAttributes**](NegativeCacheAttributes.md) |  | 
**httpClient** | [**HttpClientAttributes**](HttpClientAttributes.md) |  | 
**routingRule** | **String** |  |  [optional]
