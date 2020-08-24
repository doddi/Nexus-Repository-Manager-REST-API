# ContentSelectorsApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContentSelector**](ContentSelectorsApi.md#createContentSelector) | **POST** /v1/security/content-selectors | Create a new content selector
[**deleteContentSelector**](ContentSelectorsApi.md#deleteContentSelector) | **DELETE** /v1/security/content-selectors/{name} | Delete a content selector
[**getContentSelector**](ContentSelectorsApi.md#getContentSelector) | **GET** /v1/security/content-selectors/{name} | Get a content selector by name
[**getContentSelectors**](ContentSelectorsApi.md#getContentSelectors) | **GET** /v1/security/content-selectors | List content selectors
[**updateContentSelector**](ContentSelectorsApi.md#updateContentSelector) | **PUT** /v1/security/content-selectors/{name} | Update a content selector

<a name="createContentSelector"></a>
# **createContentSelector**
> createContentSelector(body)

Create a new content selector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentSelectorsApi;


ContentSelectorsApi apiInstance = new ContentSelectorsApi();
ContentSelectorApiCreateRequest body = new ContentSelectorApiCreateRequest(); // ContentSelectorApiCreateRequest | 
try {
    apiInstance.createContentSelector(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSelectorsApi#createContentSelector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentSelectorApiCreateRequest**](ContentSelectorApiCreateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteContentSelector"></a>
# **deleteContentSelector**
> deleteContentSelector(name)

Delete a content selector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentSelectorsApi;


ContentSelectorsApi apiInstance = new ContentSelectorsApi();
String name = "name_example"; // String | 
try {
    apiInstance.deleteContentSelector(name);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSelectorsApi#deleteContentSelector");
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

<a name="getContentSelector"></a>
# **getContentSelector**
> ContentSelectorApiResponse getContentSelector(name)

Get a content selector by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentSelectorsApi;


ContentSelectorsApi apiInstance = new ContentSelectorsApi();
String name = "name_example"; // String | The content selector name
try {
    ContentSelectorApiResponse result = apiInstance.getContentSelector(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSelectorsApi#getContentSelector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The content selector name |

### Return type

[**ContentSelectorApiResponse**](ContentSelectorApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentSelectors"></a>
# **getContentSelectors**
> List&lt;ContentSelectorApiResponse&gt; getContentSelectors()

List content selectors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentSelectorsApi;


ContentSelectorsApi apiInstance = new ContentSelectorsApi();
try {
    List<ContentSelectorApiResponse> result = apiInstance.getContentSelectors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSelectorsApi#getContentSelectors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ContentSelectorApiResponse&gt;**](ContentSelectorApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateContentSelector"></a>
# **updateContentSelector**
> updateContentSelector(name, body)

Update a content selector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentSelectorsApi;


ContentSelectorsApi apiInstance = new ContentSelectorsApi();
String name = "name_example"; // String | The content selector name
ContentSelectorApiUpdateRequest body = new ContentSelectorApiUpdateRequest(); // ContentSelectorApiUpdateRequest | 
try {
    apiInstance.updateContentSelector(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSelectorsApi#updateContentSelector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The content selector name |
 **body** | [**ContentSelectorApiUpdateRequest**](ContentSelectorApiUpdateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

