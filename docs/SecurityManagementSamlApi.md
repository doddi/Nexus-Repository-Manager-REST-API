# SecurityManagementSamlApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSamlConfiguration**](SecurityManagementSamlApi.md#deleteSamlConfiguration) | **DELETE** /v1/security/saml | Delete SAML configuration
[**getMetadata**](SecurityManagementSamlApi.md#getMetadata) | **GET** /v1/security/saml/metadata | Get service provider metadata XML document
[**getPublicCertificateInPemFormat**](SecurityManagementSamlApi.md#getPublicCertificateInPemFormat) | **GET** /v1/security/saml/pem | Get service provider signing certificate in PEM format
[**getSamlConfiguration**](SecurityManagementSamlApi.md#getSamlConfiguration) | **GET** /v1/security/saml | Get SAML configuration
[**putSamlConfiguration**](SecurityManagementSamlApi.md#putSamlConfiguration) | **PUT** /v1/security/saml | Create or update SAML configuration

<a name="deleteSamlConfiguration"></a>
# **deleteSamlConfiguration**
> deleteSamlConfiguration()

Delete SAML configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementSamlApi;


SecurityManagementSamlApi apiInstance = new SecurityManagementSamlApi();
try {
    apiInstance.deleteSamlConfiguration();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementSamlApi#deleteSamlConfiguration");
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

<a name="getMetadata"></a>
# **getMetadata**
> getMetadata()

Get service provider metadata XML document

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementSamlApi;


SecurityManagementSamlApi apiInstance = new SecurityManagementSamlApi();
try {
    apiInstance.getMetadata();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementSamlApi#getMetadata");
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

<a name="getPublicCertificateInPemFormat"></a>
# **getPublicCertificateInPemFormat**
> getPublicCertificateInPemFormat()

Get service provider signing certificate in PEM format

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementSamlApi;


SecurityManagementSamlApi apiInstance = new SecurityManagementSamlApi();
try {
    apiInstance.getPublicCertificateInPemFormat();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementSamlApi#getPublicCertificateInPemFormat");
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

<a name="getSamlConfiguration"></a>
# **getSamlConfiguration**
> getSamlConfiguration()

Get SAML configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementSamlApi;


SecurityManagementSamlApi apiInstance = new SecurityManagementSamlApi();
try {
    apiInstance.getSamlConfiguration();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementSamlApi#getSamlConfiguration");
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

<a name="putSamlConfiguration"></a>
# **putSamlConfiguration**
> putSamlConfiguration(body)

Create or update SAML configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementSamlApi;


SecurityManagementSamlApi apiInstance = new SecurityManagementSamlApi();
SamlConfigurationXO body = new SamlConfigurationXO(); // SamlConfigurationXO | 
try {
    apiInstance.putSamlConfiguration(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementSamlApi#putSamlConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SamlConfigurationXO**](SamlConfigurationXO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

