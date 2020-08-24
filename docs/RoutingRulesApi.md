# RoutingRulesApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoutingRule**](RoutingRulesApi.md#createRoutingRule) | **POST** /v1/routing-rules | Create a single routing rule
[**deleteRoutingRule**](RoutingRulesApi.md#deleteRoutingRule) | **DELETE** /v1/routing-rules/{name} | Delete a single routing rule
[**getRoutingRule**](RoutingRulesApi.md#getRoutingRule) | **GET** /v1/routing-rules/{name} | Get a single routing rule
[**getRoutingRules**](RoutingRulesApi.md#getRoutingRules) | **GET** /v1/routing-rules | List routing rules
[**updateRoutingRule**](RoutingRulesApi.md#updateRoutingRule) | **PUT** /v1/routing-rules/{name} | Update a single routing rule

<a name="createRoutingRule"></a>
# **createRoutingRule**
> createRoutingRule(body)

Create a single routing rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutingRulesApi;


RoutingRulesApi apiInstance = new RoutingRulesApi();
RoutingRuleXO body = new RoutingRuleXO(); // RoutingRuleXO | A routing rule configuration
try {
    apiInstance.createRoutingRule(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingRulesApi#createRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoutingRuleXO**](RoutingRuleXO.md)| A routing rule configuration |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteRoutingRule"></a>
# **deleteRoutingRule**
> deleteRoutingRule(name)

Delete a single routing rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutingRulesApi;


RoutingRulesApi apiInstance = new RoutingRulesApi();
String name = "name_example"; // String | The name of the routing rule to delete
try {
    apiInstance.deleteRoutingRule(name);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingRulesApi#deleteRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the routing rule to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRoutingRule"></a>
# **getRoutingRule**
> RoutingRuleXO getRoutingRule(name)

Get a single routing rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutingRulesApi;


RoutingRulesApi apiInstance = new RoutingRulesApi();
String name = "name_example"; // String | The name of the routing rule to get
try {
    RoutingRuleXO result = apiInstance.getRoutingRule(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingRulesApi#getRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the routing rule to get |

### Return type

[**RoutingRuleXO**](RoutingRuleXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoutingRules"></a>
# **getRoutingRules**
> List&lt;RoutingRuleXO&gt; getRoutingRules()

List routing rules

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutingRulesApi;


RoutingRulesApi apiInstance = new RoutingRulesApi();
try {
    List<RoutingRuleXO> result = apiInstance.getRoutingRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingRulesApi#getRoutingRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RoutingRuleXO&gt;**](RoutingRuleXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRoutingRule"></a>
# **updateRoutingRule**
> updateRoutingRule(body, name)

Update a single routing rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutingRulesApi;


RoutingRulesApi apiInstance = new RoutingRulesApi();
RoutingRuleXO body = new RoutingRuleXO(); // RoutingRuleXO | A routing rule configuration
String name = "name_example"; // String | The name of the routing rule to update
try {
    apiInstance.updateRoutingRule(body, name);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingRulesApi#updateRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoutingRuleXO**](RoutingRuleXO.md)| A routing rule configuration |
 **name** | **String**| The name of the routing rule to update |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

