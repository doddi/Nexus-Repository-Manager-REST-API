# ReadOnlyApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forceRelease**](ReadOnlyApi.md#forceRelease) | **POST** /v1/read-only/force-release | Forcibly release read-only
[**freeze**](ReadOnlyApi.md#freeze) | **POST** /v1/read-only/freeze | Enable read-only
[**get**](ReadOnlyApi.md#get) | **GET** /v1/read-only | Get read-only state
[**release**](ReadOnlyApi.md#release) | **POST** /v1/read-only/release | Release read-only

<a name="forceRelease"></a>
# **forceRelease**
> forceRelease()

Forcibly release read-only

Forcibly release read-only status, including System initiated tasks. Warning: may result in data loss.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReadOnlyApi;


ReadOnlyApi apiInstance = new ReadOnlyApi();
try {
    apiInstance.forceRelease();
} catch (ApiException e) {
    System.err.println("Exception when calling ReadOnlyApi#forceRelease");
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

<a name="freeze"></a>
# **freeze**
> freeze()

Enable read-only

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReadOnlyApi;


ReadOnlyApi apiInstance = new ReadOnlyApi();
try {
    apiInstance.freeze();
} catch (ApiException e) {
    System.err.println("Exception when calling ReadOnlyApi#freeze");
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

<a name="get"></a>
# **get**
> ReadOnlyState get()

Get read-only state

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReadOnlyApi;


ReadOnlyApi apiInstance = new ReadOnlyApi();
try {
    ReadOnlyState result = apiInstance.get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReadOnlyApi#get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReadOnlyState**](ReadOnlyState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="release"></a>
# **release**
> release()

Release read-only

Release administrator initiated read-only status. Will not release read-only caused by system tasks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReadOnlyApi;


ReadOnlyApi apiInstance = new ReadOnlyApi();
try {
    apiInstance.release();
} catch (ApiException e) {
    System.err.println("Exception when calling ReadOnlyApi#release");
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

