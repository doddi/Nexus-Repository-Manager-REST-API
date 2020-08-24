# ManageIqServerConfigurationApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableIq**](ManageIqServerConfigurationApi.md#disableIq) | **POST** /v1/iq/disable | Disable IQ server
[**enableIq**](ManageIqServerConfigurationApi.md#enableIq) | **POST** /v1/iq/enable | Enable IQ server
[**getConfiguration**](ManageIqServerConfigurationApi.md#getConfiguration) | **GET** /v1/iq | Get IQ server configuration
[**updateConfiguration**](ManageIqServerConfigurationApi.md#updateConfiguration) | **PUT** /v1/iq | Update IQ server configuration
[**verifyConnection**](ManageIqServerConfigurationApi.md#verifyConnection) | **POST** /v1/iq/verify-connection | Verify IQ server connection

<a name="disableIq"></a>
# **disableIq**
> disableIq()

Disable IQ server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageIqServerConfigurationApi;


ManageIqServerConfigurationApi apiInstance = new ManageIqServerConfigurationApi();
try {
    apiInstance.disableIq();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageIqServerConfigurationApi#disableIq");
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

<a name="enableIq"></a>
# **enableIq**
> enableIq()

Enable IQ server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageIqServerConfigurationApi;


ManageIqServerConfigurationApi apiInstance = new ManageIqServerConfigurationApi();
try {
    apiInstance.enableIq();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageIqServerConfigurationApi#enableIq");
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

<a name="getConfiguration"></a>
# **getConfiguration**
> getConfiguration()

Get IQ server configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageIqServerConfigurationApi;


ManageIqServerConfigurationApi apiInstance = new ManageIqServerConfigurationApi();
try {
    apiInstance.getConfiguration();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageIqServerConfigurationApi#getConfiguration");
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

<a name="updateConfiguration"></a>
# **updateConfiguration**
> updateConfiguration(body)

Update IQ server configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageIqServerConfigurationApi;


ManageIqServerConfigurationApi apiInstance = new ManageIqServerConfigurationApi();
IqConnectionXo body = new IqConnectionXo(); // IqConnectionXo | 
try {
    apiInstance.updateConfiguration(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageIqServerConfigurationApi#updateConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IqConnectionXo**](IqConnectionXo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="verifyConnection"></a>
# **verifyConnection**
> verifyConnection()

Verify IQ server connection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageIqServerConfigurationApi;


ManageIqServerConfigurationApi apiInstance = new ManageIqServerConfigurationApi();
try {
    apiInstance.verifyConnection();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageIqServerConfigurationApi#verifyConnection");
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

