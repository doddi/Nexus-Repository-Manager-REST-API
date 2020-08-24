# SecurityManagementRealmsApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActiveRealms**](SecurityManagementRealmsApi.md#getActiveRealms) | **GET** /v1/security/realms/active | List the active realm IDs in order
[**getRealms**](SecurityManagementRealmsApi.md#getRealms) | **GET** /v1/security/realms/available | List the available realms
[**setActiveRealms**](SecurityManagementRealmsApi.md#setActiveRealms) | **PUT** /v1/security/realms/active | Set the active security realms in the order they should be used

<a name="getActiveRealms"></a>
# **getActiveRealms**
> List&lt;String&gt; getActiveRealms()

List the active realm IDs in order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRealmsApi;


SecurityManagementRealmsApi apiInstance = new SecurityManagementRealmsApi();
try {
    List<String> result = apiInstance.getActiveRealms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRealmsApi#getActiveRealms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRealms"></a>
# **getRealms**
> List&lt;RealmApiXO&gt; getRealms()

List the available realms

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRealmsApi;


SecurityManagementRealmsApi apiInstance = new SecurityManagementRealmsApi();
try {
    List<RealmApiXO> result = apiInstance.getRealms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRealmsApi#getRealms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RealmApiXO&gt;**](RealmApiXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setActiveRealms"></a>
# **setActiveRealms**
> setActiveRealms(body)

Set the active security realms in the order they should be used

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRealmsApi;


SecurityManagementRealmsApi apiInstance = new SecurityManagementRealmsApi();
List<String> body = Arrays.asList("body_example"); // List<String> | The realm IDs
try {
    apiInstance.setActiveRealms(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRealmsApi#setActiveRealms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)| The realm IDs | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

