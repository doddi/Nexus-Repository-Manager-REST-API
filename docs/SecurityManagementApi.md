# SecurityManagementApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserSources**](SecurityManagementApi.md#getUserSources) | **GET** /v1/security/user-sources | Retrieve a list of the available user sources.

<a name="getUserSources"></a>
# **getUserSources**
> List&lt;ApiUserSource&gt; getUserSources()

Retrieve a list of the available user sources.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementApi;


SecurityManagementApi apiInstance = new SecurityManagementApi();
try {
    List<ApiUserSource> result = apiInstance.getUserSources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementApi#getUserSources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ApiUserSource&gt;**](ApiUserSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

