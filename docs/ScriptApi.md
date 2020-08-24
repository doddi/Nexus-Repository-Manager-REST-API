# ScriptApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](ScriptApi.md#add) | **POST** /v1/script | Add a new script
[**browse**](ScriptApi.md#browse) | **GET** /v1/script | List all stored scripts
[**delete1**](ScriptApi.md#delete1) | **DELETE** /v1/script/{name} | Delete stored script by name
[**edit**](ScriptApi.md#edit) | **PUT** /v1/script/{name} | Update stored script by name
[**read1**](ScriptApi.md#read1) | **GET** /v1/script/{name} | Read stored script by name
[**run1**](ScriptApi.md#run1) | **POST** /v1/script/{name}/run | Run stored script by name

<a name="add"></a>
# **add**
> add(body)

Add a new script

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScriptApi;


ScriptApi apiInstance = new ScriptApi();
ScriptXO body = new ScriptXO(); // ScriptXO | 
try {
    apiInstance.add(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScriptXO**](ScriptXO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="browse"></a>
# **browse**
> List&lt;ScriptXO&gt; browse()

List all stored scripts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScriptApi;


ScriptApi apiInstance = new ScriptApi();
try {
    List<ScriptXO> result = apiInstance.browse();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptApi#browse");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ScriptXO&gt;**](ScriptXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="delete1"></a>
# **delete1**
> delete1(name)

Delete stored script by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScriptApi;


ScriptApi apiInstance = new ScriptApi();
String name = "name_example"; // String | 
try {
    apiInstance.delete1(name);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptApi#delete1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="edit"></a>
# **edit**
> edit(name, body)

Update stored script by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScriptApi;


ScriptApi apiInstance = new ScriptApi();
String name = "name_example"; // String | 
ScriptXO body = new ScriptXO(); // ScriptXO | 
try {
    apiInstance.edit(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptApi#edit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**ScriptXO**](ScriptXO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="read1"></a>
# **read1**
> ScriptXO read1(name)

Read stored script by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScriptApi;


ScriptApi apiInstance = new ScriptApi();
String name = "name_example"; // String | 
try {
    ScriptXO result = apiInstance.read1(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptApi#read1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**ScriptXO**](ScriptXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="run1"></a>
# **run1**
> ScriptResultXO run1(name, body)

Run stored script by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScriptApi;


ScriptApi apiInstance = new ScriptApi();
String name = "name_example"; // String | 
String body = "body_example"; // String | 
try {
    ScriptResultXO result = apiInstance.run1(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptApi#run1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**ScriptResultXO**](ScriptResultXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, application/json
 - **Accept**: application/json

