# SupportApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**supportzip**](SupportApi.md#supportzip) | **POST** /v1/support/supportzip | Creates and downloads a support zip
[**supportzippath**](SupportApi.md#supportzippath) | **POST** /v1/support/supportzippath | Creates a support zip and returns the path

<a name="supportzip"></a>
# **supportzip**
> supportzip(body)

Creates and downloads a support zip

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SupportApi;


SupportApi apiInstance = new SupportApi();
Request body = new Request(); // Request | 
try {
    apiInstance.supportzip(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#supportzip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Request**](Request.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="supportzippath"></a>
# **supportzippath**
> SupportZipXO supportzippath(body)

Creates a support zip and returns the path

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SupportApi;


SupportApi apiInstance = new SupportApi();
Request body = new Request(); // Request | 
try {
    SupportZipXO result = apiInstance.supportzippath(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#supportzippath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Request**](Request.md)|  | [optional]

### Return type

[**SupportZipXO**](SupportZipXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

