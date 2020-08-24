# StatusApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemStatusChecks**](StatusApi.md#getSystemStatusChecks) | **GET** /v1/status/check | Health check endpoint that returns the results of the system status checks
[**isAvailable**](StatusApi.md#isAvailable) | **GET** /v1/status | Health check endpoint that validates server can respond to read requests
[**isWritable**](StatusApi.md#isWritable) | **GET** /v1/status/writable | Health check endpoint that validates server can respond to read and write requests

<a name="getSystemStatusChecks"></a>
# **getSystemStatusChecks**
> Map&lt;String, Result&gt; getSystemStatusChecks()

Health check endpoint that returns the results of the system status checks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    Map<String, Result> result = apiInstance.getSystemStatusChecks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#getSystemStatusChecks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Result&gt;**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="isAvailable"></a>
# **isAvailable**
> isAvailable()

Health check endpoint that validates server can respond to read requests

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    apiInstance.isAvailable();
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#isAvailable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="isWritable"></a>
# **isWritable**
> isWritable()

Health check endpoint that validates server can respond to read and write requests

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    apiInstance.isWritable();
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#isWritable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

