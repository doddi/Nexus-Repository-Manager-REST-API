# BlobStoreApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBlobStore**](BlobStoreApi.md#createBlobStore) | **POST** /v1/blobstores/s3 | Create an S3 blob store
[**createFileBlobStore**](BlobStoreApi.md#createFileBlobStore) | **POST** /v1/blobstores/file | Create a file blob store
[**createGroupBlobStore**](BlobStoreApi.md#createGroupBlobStore) | **POST** /v1/blobstores/group | Create a group blob store
[**deleteBlobStore**](BlobStoreApi.md#deleteBlobStore) | **DELETE** /v1/blobstores/{name} | Delete a blob store by name
[**getBlobStore**](BlobStoreApi.md#getBlobStore) | **GET** /v1/blobstores/s3/{name} | Fetch a S3 blob store configuration
[**getFileBlobStoreConfiguration**](BlobStoreApi.md#getFileBlobStoreConfiguration) | **GET** /v1/blobstores/file/{name} | Get a file blob store configuration by name
[**getGroupBlobStoreConfiguration**](BlobStoreApi.md#getGroupBlobStoreConfiguration) | **GET** /v1/blobstores/group/{name} | Get a group blob store configuration by name
[**listBlobStores**](BlobStoreApi.md#listBlobStores) | **GET** /v1/blobstores | List the blob stores
[**promoteBlobStoreToGroup**](BlobStoreApi.md#promoteBlobStoreToGroup) | **POST** /v1/blobstores/group/promote/{name} | Promote a blob store to a group blob store
[**quotaStatus**](BlobStoreApi.md#quotaStatus) | **GET** /v1/blobstores/{name}/quota-status | Get quota status for a given blob store
[**updateBlobStore**](BlobStoreApi.md#updateBlobStore) | **PUT** /v1/blobstores/s3/{name} | Update an S3 blob store configuration
[**updateFileBlobStore**](BlobStoreApi.md#updateFileBlobStore) | **PUT** /v1/blobstores/file/{name} | Update a file blob store configuration by name
[**updateGroupBlobStore**](BlobStoreApi.md#updateGroupBlobStore) | **PUT** /v1/blobstores/group/{name} | Update a group blob store configuration by name

<a name="createBlobStore"></a>
# **createBlobStore**
> createBlobStore(body)

Create an S3 blob store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
S3BlobStoreApiModel body = new S3BlobStoreApiModel(); // S3BlobStoreApiModel | 
try {
    apiInstance.createBlobStore(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#createBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3BlobStoreApiModel**](S3BlobStoreApiModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createFileBlobStore"></a>
# **createFileBlobStore**
> createFileBlobStore(body)

Create a file blob store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
FileBlobStoreApiCreateRequest body = new FileBlobStoreApiCreateRequest(); // FileBlobStoreApiCreateRequest | 
try {
    apiInstance.createFileBlobStore(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#createFileBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileBlobStoreApiCreateRequest**](FileBlobStoreApiCreateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createGroupBlobStore"></a>
# **createGroupBlobStore**
> createGroupBlobStore(body)

Create a group blob store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
GroupBlobStoreApiCreateRequest body = new GroupBlobStoreApiCreateRequest(); // GroupBlobStoreApiCreateRequest | 
try {
    apiInstance.createGroupBlobStore(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#createGroupBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupBlobStoreApiCreateRequest**](GroupBlobStoreApiCreateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteBlobStore"></a>
# **deleteBlobStore**
> deleteBlobStore(name)

Delete a blob store by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the blob store to delete
try {
    apiInstance.deleteBlobStore(name);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#deleteBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the blob store to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBlobStore"></a>
# **getBlobStore**
> getBlobStore(name)

Fetch a S3 blob store configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | Name of the blob store configuration to fetch
try {
    apiInstance.getBlobStore(name);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#getBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the blob store configuration to fetch |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getFileBlobStoreConfiguration"></a>
# **getFileBlobStoreConfiguration**
> FileBlobStoreApiModel getFileBlobStoreConfiguration(name)

Get a file blob store configuration by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the file blob store to read
try {
    FileBlobStoreApiModel result = apiInstance.getFileBlobStoreConfiguration(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#getFileBlobStoreConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the file blob store to read |

### Return type

[**FileBlobStoreApiModel**](FileBlobStoreApiModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupBlobStoreConfiguration"></a>
# **getGroupBlobStoreConfiguration**
> GroupBlobStoreApiModel getGroupBlobStoreConfiguration(name)

Get a group blob store configuration by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the group blob store
try {
    GroupBlobStoreApiModel result = apiInstance.getGroupBlobStoreConfiguration(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#getGroupBlobStoreConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the group blob store |

### Return type

[**GroupBlobStoreApiModel**](GroupBlobStoreApiModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlobStores"></a>
# **listBlobStores**
> List&lt;GenericBlobStoreApiResponse&gt; listBlobStores()

List the blob stores

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
try {
    List<GenericBlobStoreApiResponse> result = apiInstance.listBlobStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#listBlobStores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GenericBlobStoreApiResponse&gt;**](GenericBlobStoreApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="promoteBlobStoreToGroup"></a>
# **promoteBlobStoreToGroup**
> GroupBlobStoreApiResponse promoteBlobStoreToGroup(name)

Promote a blob store to a group blob store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the group blob store
try {
    GroupBlobStoreApiResponse result = apiInstance.promoteBlobStoreToGroup(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#promoteBlobStoreToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the group blob store |

### Return type

[**GroupBlobStoreApiResponse**](GroupBlobStoreApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quotaStatus"></a>
# **quotaStatus**
> BlobStoreQuotaResultXO quotaStatus(name)

Get quota status for a given blob store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | 
try {
    BlobStoreQuotaResultXO result = apiInstance.quotaStatus(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#quotaStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**BlobStoreQuotaResultXO**](BlobStoreQuotaResultXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBlobStore"></a>
# **updateBlobStore**
> updateBlobStore(name, body)

Update an S3 blob store configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | Name of the blob store to update
S3BlobStoreApiModel body = new S3BlobStoreApiModel(); // S3BlobStoreApiModel | 
try {
    apiInstance.updateBlobStore(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#updateBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the blob store to update |
 **body** | [**S3BlobStoreApiModel**](S3BlobStoreApiModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateFileBlobStore"></a>
# **updateFileBlobStore**
> updateFileBlobStore(name, body)

Update a file blob store configuration by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the file blob store to update
FileBlobStoreApiUpdateRequest body = new FileBlobStoreApiUpdateRequest(); // FileBlobStoreApiUpdateRequest | 
try {
    apiInstance.updateFileBlobStore(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#updateFileBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the file blob store to update |
 **body** | [**FileBlobStoreApiUpdateRequest**](FileBlobStoreApiUpdateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateGroupBlobStore"></a>
# **updateGroupBlobStore**
> updateGroupBlobStore(name, body)

Update a group blob store configuration by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the blob store to update
GroupBlobStoreApiUpdateRequest body = new GroupBlobStoreApiUpdateRequest(); // GroupBlobStoreApiUpdateRequest | 
try {
    apiInstance.updateGroupBlobStore(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#updateGroupBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the blob store to update |
 **body** | [**GroupBlobStoreApiUpdateRequest**](GroupBlobStoreApiUpdateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

