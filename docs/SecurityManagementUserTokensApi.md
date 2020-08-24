# SecurityManagementUserTokensApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetAllUserTokens**](SecurityManagementUserTokensApi.md#resetAllUserTokens) | **DELETE** /v1/security/user-tokens | Invalidate all existing user tokens.
[**serviceStatus**](SecurityManagementUserTokensApi.md#serviceStatus) | **GET** /v1/security/user-tokens | Show if the user token capability is enabled or not.
[**setServiceStatus**](SecurityManagementUserTokensApi.md#setServiceStatus) | **PUT** /v1/security/user-tokens | Enable/Disable the user token capability

<a name="resetAllUserTokens"></a>
# **resetAllUserTokens**
> resetAllUserTokens()

Invalidate all existing user tokens.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUserTokensApi;


SecurityManagementUserTokensApi apiInstance = new SecurityManagementUserTokensApi();
try {
    apiInstance.resetAllUserTokens();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUserTokensApi#resetAllUserTokens");
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

<a name="serviceStatus"></a>
# **serviceStatus**
> UserTokensApiModel serviceStatus()

Show if the user token capability is enabled or not.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUserTokensApi;


SecurityManagementUserTokensApi apiInstance = new SecurityManagementUserTokensApi();
try {
    UserTokensApiModel result = apiInstance.serviceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUserTokensApi#serviceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserTokensApiModel**](UserTokensApiModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setServiceStatus"></a>
# **setServiceStatus**
> UserTokensApiModel setServiceStatus(body)

Enable/Disable the user token capability

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUserTokensApi;


SecurityManagementUserTokensApi apiInstance = new SecurityManagementUserTokensApi();
UserTokensApiModel body = new UserTokensApiModel(); // UserTokensApiModel | 
try {
    UserTokensApiModel result = apiInstance.setServiceStatus(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUserTokensApi#setServiceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserTokensApiModel**](UserTokensApiModel.md)|  | [optional]

### Return type

[**UserTokensApiModel**](UserTokensApiModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

