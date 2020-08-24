# SecurityAtlassianCrowdApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearCache**](SecurityAtlassianCrowdApi.md#clearCache) | **POST** /v1/security/atlassian-crowd/clear-cache | Clear Atlassian Crowd cache
[**readSettings**](SecurityAtlassianCrowdApi.md#readSettings) | **GET** /v1/security/atlassian-crowd | Retrieve Atlassian Crowd settings configured in Nexus Repository Manager
[**updateSettings**](SecurityAtlassianCrowdApi.md#updateSettings) | **PUT** /v1/security/atlassian-crowd | Update Atlassian Crowd settings configured in Nexus Repository Manager
[**verifyConnection1**](SecurityAtlassianCrowdApi.md#verifyConnection1) | **POST** /v1/security/atlassian-crowd/verify-connection | Verify connection using supplied Atlassian Crowd settings

<a name="clearCache"></a>
# **clearCache**
> clearCache()

Clear Atlassian Crowd cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityAtlassianCrowdApi;


SecurityAtlassianCrowdApi apiInstance = new SecurityAtlassianCrowdApi();
try {
    apiInstance.clearCache();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityAtlassianCrowdApi#clearCache");
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

<a name="readSettings"></a>
# **readSettings**
> readSettings()

Retrieve Atlassian Crowd settings configured in Nexus Repository Manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityAtlassianCrowdApi;


SecurityAtlassianCrowdApi apiInstance = new SecurityAtlassianCrowdApi();
try {
    apiInstance.readSettings();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityAtlassianCrowdApi#readSettings");
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

<a name="updateSettings"></a>
# **updateSettings**
> updateSettings(body)

Update Atlassian Crowd settings configured in Nexus Repository Manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityAtlassianCrowdApi;


SecurityAtlassianCrowdApi apiInstance = new SecurityAtlassianCrowdApi();
CrowdApiXO body = new CrowdApiXO(); // CrowdApiXO | 
try {
    apiInstance.updateSettings(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityAtlassianCrowdApi#updateSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrowdApiXO**](CrowdApiXO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="verifyConnection1"></a>
# **verifyConnection1**
> verifyConnection1(body)

Verify connection using supplied Atlassian Crowd settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityAtlassianCrowdApi;


SecurityAtlassianCrowdApi apiInstance = new SecurityAtlassianCrowdApi();
CrowdApiXO body = new CrowdApiXO(); // CrowdApiXO | 
try {
    apiInstance.verifyConnection1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityAtlassianCrowdApi#verifyConnection1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrowdApiXO**](CrowdApiXO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

