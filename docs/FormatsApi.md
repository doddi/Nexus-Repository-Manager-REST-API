# FormatsApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get1**](FormatsApi.md#get1) | **GET** /v1/formats/upload-specs | Get upload field requirements for each supported format
[**get2**](FormatsApi.md#get2) | **GET** /v1/formats/{format}/upload-specs | Get upload field requirements for the desired format

<a name="get1"></a>
# **get1**
> List&lt;UploadDefinitionXO&gt; get1()

Get upload field requirements for each supported format

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FormatsApi;


FormatsApi apiInstance = new FormatsApi();
try {
    List<UploadDefinitionXO> result = apiInstance.get1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormatsApi#get1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UploadDefinitionXO&gt;**](UploadDefinitionXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="get2"></a>
# **get2**
> UploadDefinitionXO get2(format)

Get upload field requirements for the desired format

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FormatsApi;


FormatsApi apiInstance = new FormatsApi();
String format = "format_example"; // String | The desired repository format
try {
    UploadDefinitionXO result = apiInstance.get2(format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormatsApi#get2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| The desired repository format |

### Return type

[**UploadDefinitionXO**](UploadDefinitionXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

