# LifecycleApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bounce**](LifecycleApi.md#bounce) | **PUT** /v1/lifecycle/bounce | Bounce lifecycle phase
[**getPhase**](LifecycleApi.md#getPhase) | **GET** /v1/lifecycle/phase | Get current lifecycle phase
[**setPhase**](LifecycleApi.md#setPhase) | **PUT** /v1/lifecycle/phase | Move to new lifecycle phase

<a name="bounce"></a>
# **bounce**
> bounce(body)

Bounce lifecycle phase

Re-runs all phases from the given phase to the current phase

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LifecycleApi;


LifecycleApi apiInstance = new LifecycleApi();
String body = "body_example"; // String | The phase to bounce
try {
    apiInstance.bounce(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LifecycleApi#bounce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The phase to bounce | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

<a name="getPhase"></a>
# **getPhase**
> String getPhase()

Get current lifecycle phase

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LifecycleApi;


LifecycleApi apiInstance = new LifecycleApi();
try {
    String result = apiInstance.getPhase();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LifecycleApi#getPhase");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="setPhase"></a>
# **setPhase**
> setPhase(body)

Move to new lifecycle phase

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LifecycleApi;


LifecycleApi apiInstance = new LifecycleApi();
String body = "body_example"; // String | The phase to move to
try {
    apiInstance.setPhase(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LifecycleApi#setPhase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The phase to move to | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

