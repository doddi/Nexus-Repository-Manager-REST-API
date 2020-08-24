# AssetsApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAsset**](AssetsApi.md#deleteAsset) | **DELETE** /v1/assets/{id} | Delete a single asset
[**getAssetById**](AssetsApi.md#getAssetById) | **GET** /v1/assets/{id} | Get a single asset
[**getAssets**](AssetsApi.md#getAssets) | **GET** /v1/assets | List assets

<a name="deleteAsset"></a>
# **deleteAsset**
> deleteAsset(id)

Delete a single asset

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
String id = "id_example"; // String | Id of the asset to delete
try {
    apiInstance.deleteAsset(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#deleteAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the asset to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAssetById"></a>
# **getAssetById**
> AssetXO getAssetById(id)

Get a single asset

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
String id = "id_example"; // String | Id of the asset to get
try {
    AssetXO result = apiInstance.getAssetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getAssetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the asset to get |

### Return type

[**AssetXO**](AssetXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssets"></a>
# **getAssets**
> PageAssetXO getAssets(repository, continuationToken)

List assets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
String repository = "repository_example"; // String | Repository from which you would like to retrieve assets.
String continuationToken = "continuationToken_example"; // String | A token returned by a prior request. If present, the next page of results are returned
try {
    PageAssetXO result = apiInstance.getAssets(repository, continuationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| Repository from which you would like to retrieve assets. |
 **continuationToken** | **String**| A token returned by a prior request. If present, the next page of results are returned | [optional]

### Return type

[**PageAssetXO**](PageAssetXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

