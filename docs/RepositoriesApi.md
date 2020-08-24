# RepositoriesApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositories1**](RepositoriesApi.md#getRepositories1) | **GET** /v1/repositories | List repositories

<a name="getRepositories1"></a>
# **getRepositories1**
> List&lt;RepositoryXO&gt; getRepositories1()

List repositories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoriesApi;


RepositoriesApi apiInstance = new RepositoriesApi();
try {
    List<RepositoryXO> result = apiInstance.getRepositories1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#getRepositories1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RepositoryXO&gt;**](RepositoryXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

