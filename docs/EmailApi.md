# EmailApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEmailConfiguration**](EmailApi.md#deleteEmailConfiguration) | **DELETE** /v1/email | Disable and clear the email configuration
[**getEmailConfiguration**](EmailApi.md#getEmailConfiguration) | **GET** /v1/email | Retrieve the current email configuration
[**setEmailConfiguration**](EmailApi.md#setEmailConfiguration) | **PUT** /v1/email | Set the current email configuration
[**testEmailConfiguration**](EmailApi.md#testEmailConfiguration) | **POST** /v1/email/verify | Send a test email to the email address provided in the request body

<a name="deleteEmailConfiguration"></a>
# **deleteEmailConfiguration**
> deleteEmailConfiguration()

Disable and clear the email configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmailApi;


EmailApi apiInstance = new EmailApi();
try {
    apiInstance.deleteEmailConfiguration();
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#deleteEmailConfiguration");
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

<a name="getEmailConfiguration"></a>
# **getEmailConfiguration**
> ApiEmailConfiguration getEmailConfiguration()

Retrieve the current email configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmailApi;


EmailApi apiInstance = new EmailApi();
try {
    ApiEmailConfiguration result = apiInstance.getEmailConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#getEmailConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiEmailConfiguration**](ApiEmailConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setEmailConfiguration"></a>
# **setEmailConfiguration**
> setEmailConfiguration(body)

Set the current email configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmailApi;


EmailApi apiInstance = new EmailApi();
ApiEmailConfiguration body = new ApiEmailConfiguration(); // ApiEmailConfiguration | 
try {
    apiInstance.setEmailConfiguration(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#setEmailConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiEmailConfiguration**](ApiEmailConfiguration.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="testEmailConfiguration"></a>
# **testEmailConfiguration**
> ApiEmailValidation testEmailConfiguration(body)

Send a test email to the email address provided in the request body

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmailApi;


EmailApi apiInstance = new EmailApi();
String body = "body_example"; // String | An email address to send a test email to
try {
    ApiEmailValidation result = apiInstance.testEmailConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#testEmailConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| An email address to send a test email to |

### Return type

[**ApiEmailValidation**](ApiEmailValidation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

