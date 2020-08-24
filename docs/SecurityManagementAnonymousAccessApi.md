# SecurityManagementAnonymousAccessApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**read**](SecurityManagementAnonymousAccessApi.md#read) | **GET** /v1/security/anonymous | Get Anonymous Access settings
[**update**](SecurityManagementAnonymousAccessApi.md#update) | **PUT** /v1/security/anonymous | Update Anonymous Access settings

<a name="read"></a>
# **read**
> AnonymousAccessSettingsXO read()

Get Anonymous Access settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementAnonymousAccessApi;


SecurityManagementAnonymousAccessApi apiInstance = new SecurityManagementAnonymousAccessApi();
try {
    AnonymousAccessSettingsXO result = apiInstance.read();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementAnonymousAccessApi#read");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AnonymousAccessSettingsXO**](AnonymousAccessSettingsXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> AnonymousAccessSettingsXO update(body)

Update Anonymous Access settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementAnonymousAccessApi;


SecurityManagementAnonymousAccessApi apiInstance = new SecurityManagementAnonymousAccessApi();
AnonymousAccessSettingsXO body = new AnonymousAccessSettingsXO(); // AnonymousAccessSettingsXO | 
try {
    AnonymousAccessSettingsXO result = apiInstance.update(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementAnonymousAccessApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AnonymousAccessSettingsXO**](AnonymousAccessSettingsXO.md)|  | [optional]

### Return type

[**AnonymousAccessSettingsXO**](AnonymousAccessSettingsXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

