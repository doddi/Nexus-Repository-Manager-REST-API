# SecurityManagementLdapApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeOrder**](SecurityManagementLdapApi.md#changeOrder) | **POST** /v1/security/ldap/change-order | Change LDAP server order
[**createLdapServer**](SecurityManagementLdapApi.md#createLdapServer) | **POST** /v1/security/ldap | Create LDAP server
[**deleteLdapServer**](SecurityManagementLdapApi.md#deleteLdapServer) | **DELETE** /v1/security/ldap/{name} | Delete LDAP server
[**getLdapServer**](SecurityManagementLdapApi.md#getLdapServer) | **GET** /v1/security/ldap/{name} | Get LDAP server
[**getLdapServers**](SecurityManagementLdapApi.md#getLdapServers) | **GET** /v1/security/ldap | List LDAP servers
[**updateLdapServer**](SecurityManagementLdapApi.md#updateLdapServer) | **PUT** /v1/security/ldap/{name} | Update LDAP server

<a name="changeOrder"></a>
# **changeOrder**
> changeOrder(body)

Change LDAP server order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementLdapApi;


SecurityManagementLdapApi apiInstance = new SecurityManagementLdapApi();
List<String> body = Arrays.asList("body_example"); // List<String> | Ordered list of LDAP server names
try {
    apiInstance.changeOrder(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementLdapApi#changeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)| Ordered list of LDAP server names | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createLdapServer"></a>
# **createLdapServer**
> createLdapServer(body)

Create LDAP server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementLdapApi;


SecurityManagementLdapApi apiInstance = new SecurityManagementLdapApi();
CreateLdapServerXo body = new CreateLdapServerXo(); // CreateLdapServerXo | 
try {
    apiInstance.createLdapServer(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementLdapApi#createLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLdapServerXo**](CreateLdapServerXo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteLdapServer"></a>
# **deleteLdapServer**
> deleteLdapServer(name)

Delete LDAP server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementLdapApi;


SecurityManagementLdapApi apiInstance = new SecurityManagementLdapApi();
String name = "name_example"; // String | Name of the LDAP server to delete
try {
    apiInstance.deleteLdapServer(name);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementLdapApi#deleteLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the LDAP server to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLdapServer"></a>
# **getLdapServer**
> getLdapServer(name)

Get LDAP server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementLdapApi;


SecurityManagementLdapApi apiInstance = new SecurityManagementLdapApi();
String name = "name_example"; // String | Name of the LDAP server to retrieve
try {
    apiInstance.getLdapServer(name);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementLdapApi#getLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the LDAP server to retrieve |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLdapServers"></a>
# **getLdapServers**
> getLdapServers()

List LDAP servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementLdapApi;


SecurityManagementLdapApi apiInstance = new SecurityManagementLdapApi();
try {
    apiInstance.getLdapServers();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementLdapApi#getLdapServers");
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

<a name="updateLdapServer"></a>
# **updateLdapServer**
> updateLdapServer(name, body)

Update LDAP server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementLdapApi;


SecurityManagementLdapApi apiInstance = new SecurityManagementLdapApi();
String name = "name_example"; // String | Name of the LDAP server to update
UpdateLdapServerXo body = new UpdateLdapServerXo(); // UpdateLdapServerXo | Updated values of LDAP server
try {
    apiInstance.updateLdapServer(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementLdapApi#updateLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the LDAP server to update |
 **body** | [**UpdateLdapServerXo**](UpdateLdapServerXo.md)| Updated values of LDAP server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

