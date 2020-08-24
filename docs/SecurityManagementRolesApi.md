# SecurityManagementRolesApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SecurityManagementRolesApi.md#create) | **POST** /v1/security/roles | Create role
[**delete**](SecurityManagementRolesApi.md#delete) | **DELETE** /v1/security/roles/{id} | Delete role
[**getRole**](SecurityManagementRolesApi.md#getRole) | **GET** /v1/security/roles/{id} | Get role
[**getRoles**](SecurityManagementRolesApi.md#getRoles) | **GET** /v1/security/roles | List roles
[**update1**](SecurityManagementRolesApi.md#update1) | **PUT** /v1/security/roles/{id} | Update role

<a name="create"></a>
# **create**
> RoleXOResponse create(body)

Create role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRolesApi;


SecurityManagementRolesApi apiInstance = new SecurityManagementRolesApi();
RoleXORequest body = new RoleXORequest(); // RoleXORequest | A role configuration
try {
    RoleXOResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRolesApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleXORequest**](RoleXORequest.md)| A role configuration |

### Return type

[**RoleXOResponse**](RoleXOResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(id)

Delete role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRolesApi;


SecurityManagementRolesApi apiInstance = new SecurityManagementRolesApi();
String id = "id_example"; // String | The id of the role to delete
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRolesApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the role to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRole"></a>
# **getRole**
> RoleXOResponse getRole(id, source)

Get role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRolesApi;


SecurityManagementRolesApi apiInstance = new SecurityManagementRolesApi();
String id = "id_example"; // String | The id of the role to get
String source = "default"; // String | The id of the user source to filter the roles by. Available sources can be fetched using the 'User Sources' endpoint.
try {
    RoleXOResponse result = apiInstance.getRole(id, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRolesApi#getRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the role to get |
 **source** | **String**| The id of the user source to filter the roles by. Available sources can be fetched using the &#x27;User Sources&#x27; endpoint. | [optional] [default to default]

### Return type

[**RoleXOResponse**](RoleXOResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoles"></a>
# **getRoles**
> List&lt;RoleXOResponse&gt; getRoles(source)

List roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRolesApi;


SecurityManagementRolesApi apiInstance = new SecurityManagementRolesApi();
String source = "source_example"; // String | The id of the user source to filter the roles by, if supplied. Otherwise roles from all user sources will be returned.
try {
    List<RoleXOResponse> result = apiInstance.getRoles(source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRolesApi#getRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| The id of the user source to filter the roles by, if supplied. Otherwise roles from all user sources will be returned. | [optional]

### Return type

[**List&lt;RoleXOResponse&gt;**](RoleXOResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update1"></a>
# **update1**
> update1(body, id)

Update role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementRolesApi;


SecurityManagementRolesApi apiInstance = new SecurityManagementRolesApi();
RoleXORequest body = new RoleXORequest(); // RoleXORequest | A role configuration
String id = "id_example"; // String | The id of the role to update
try {
    apiInstance.update1(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementRolesApi#update1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleXORequest**](RoleXORequest.md)| A role configuration |
 **id** | **String**| The id of the role to update |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

