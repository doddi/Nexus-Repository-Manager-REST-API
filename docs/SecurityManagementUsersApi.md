# SecurityManagementUsersApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](SecurityManagementUsersApi.md#changePassword) | **PUT** /v1/security/users/{userId}/change-password | Change a user&#x27;s password.
[**createUser**](SecurityManagementUsersApi.md#createUser) | **POST** /v1/security/users | Create a new user in the default source.
[**deleteUser**](SecurityManagementUsersApi.md#deleteUser) | **DELETE** /v1/security/users/{userId} | Delete a user.
[**getUsers**](SecurityManagementUsersApi.md#getUsers) | **GET** /v1/security/users | Retrieve a list of users. Note if the source is not &#x27;default&#x27; the response is limited to 100 users.
[**reset**](SecurityManagementUsersApi.md#reset) | **DELETE** /v1/security/users/{userId}/user-token | Reset the user token
[**updateUser**](SecurityManagementUsersApi.md#updateUser) | **PUT** /v1/security/users/{userId} | Update an existing user.

<a name="changePassword"></a>
# **changePassword**
> changePassword(userId, body)

Change a user&#x27;s password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUsersApi;


SecurityManagementUsersApi apiInstance = new SecurityManagementUsersApi();
String userId = "userId_example"; // String | The userid the request should apply to.
String body = "body_example"; // String | The new password to use.
try {
    apiInstance.changePassword(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUsersApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userid the request should apply to. |
 **body** | [**String**](String.md)| The new password to use. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

<a name="createUser"></a>
# **createUser**
> ApiUser createUser(body)

Create a new user in the default source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUsersApi;


SecurityManagementUsersApi apiInstance = new SecurityManagementUsersApi();
ApiCreateUser body = new ApiCreateUser(); // ApiCreateUser | A representation of the user to create.
try {
    ApiUser result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUsersApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiCreateUser**](ApiCreateUser.md)| A representation of the user to create. | [optional]

### Return type

[**ApiUser**](ApiUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)

Delete a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUsersApi;


SecurityManagementUsersApi apiInstance = new SecurityManagementUsersApi();
String userId = "userId_example"; // String | The userid the request should apply to.
try {
    apiInstance.deleteUser(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userid the request should apply to. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUsers"></a>
# **getUsers**
> List&lt;ApiUser&gt; getUsers(userId, source)

Retrieve a list of users. Note if the source is not &#x27;default&#x27; the response is limited to 100 users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUsersApi;


SecurityManagementUsersApi apiInstance = new SecurityManagementUsersApi();
String userId = "userId_example"; // String | An optional term to search userids for.
String source = "source_example"; // String | An optional user source to restrict the search to.
try {
    List<ApiUser> result = apiInstance.getUsers(userId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| An optional term to search userids for. | [optional]
 **source** | **String**| An optional user source to restrict the search to. | [optional]

### Return type

[**List&lt;ApiUser&gt;**](ApiUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reset"></a>
# **reset**
> reset(userId)

Reset the user token

Resetting the user token will invalidate the current token and force a new token to be created the next time it is accessed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUsersApi;


SecurityManagementUsersApi apiInstance = new SecurityManagementUsersApi();
String userId = "userId_example"; // String | The userId of the user to reset the token for
try {
    apiInstance.reset(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUsersApi#reset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId of the user to reset the token for |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(userId, body)

Update an existing user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementUsersApi;


SecurityManagementUsersApi apiInstance = new SecurityManagementUsersApi();
String userId = "userId_example"; // String | The userid the request should apply to.
ApiUser body = new ApiUser(); // ApiUser | A representation of the user to update.
try {
    apiInstance.updateUser(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementUsersApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userid the request should apply to. |
 **body** | [**ApiUser**](ApiUser.md)| A representation of the user to update. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

