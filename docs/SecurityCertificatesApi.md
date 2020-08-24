# SecurityCertificatesApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCertificate**](SecurityCertificatesApi.md#addCertificate) | **POST** /v1/security/ssl/truststore | Add a certificate to the trust store.
[**getTrustStoreCertificates**](SecurityCertificatesApi.md#getTrustStoreCertificates) | **GET** /v1/security/ssl/truststore | Retrieve a list of certificates added to the trust store.
[**removeCertificate**](SecurityCertificatesApi.md#removeCertificate) | **DELETE** /v1/security/ssl/truststore/{id} | Remove a certificate in the trust store.
[**retrieveCertificate**](SecurityCertificatesApi.md#retrieveCertificate) | **GET** /v1/security/ssl | Helper method to retrieve certificate details from a remote system.

<a name="addCertificate"></a>
# **addCertificate**
> ApiCertificate addCertificate(body)

Add a certificate to the trust store.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityCertificatesApi;


SecurityCertificatesApi apiInstance = new SecurityCertificatesApi();
String body = "body_example"; // String | The certificate to add encoded in PEM format
try {
    ApiCertificate result = apiInstance.addCertificate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityCertificatesApi#addCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The certificate to add encoded in PEM format | [optional]

### Return type

[**ApiCertificate**](ApiCertificate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getTrustStoreCertificates"></a>
# **getTrustStoreCertificates**
> List&lt;ApiCertificate&gt; getTrustStoreCertificates()

Retrieve a list of certificates added to the trust store.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityCertificatesApi;


SecurityCertificatesApi apiInstance = new SecurityCertificatesApi();
try {
    List<ApiCertificate> result = apiInstance.getTrustStoreCertificates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityCertificatesApi#getTrustStoreCertificates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ApiCertificate&gt;**](ApiCertificate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCertificate"></a>
# **removeCertificate**
> removeCertificate(id)

Remove a certificate in the trust store.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityCertificatesApi;


SecurityCertificatesApi apiInstance = new SecurityCertificatesApi();
String id = "id_example"; // String | The id of the certificate that should be removed.
try {
    apiInstance.removeCertificate(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityCertificatesApi#removeCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the certificate that should be removed. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveCertificate"></a>
# **retrieveCertificate**
> ApiCertificate retrieveCertificate(host, port, protocolHint)

Helper method to retrieve certificate details from a remote system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityCertificatesApi;


SecurityCertificatesApi apiInstance = new SecurityCertificatesApi();
String host = "host_example"; // String | The remote system's host name
Integer port = 443; // Integer | The port on the remote system to connect to
String protocolHint = "protocolHint_example"; // String | An optional hint of the protocol to try for the connection
try {
    ApiCertificate result = apiInstance.retrieveCertificate(host, port, protocolHint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityCertificatesApi#retrieveCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **host** | **String**| The remote system&#x27;s host name |
 **port** | **Integer**| The port on the remote system to connect to | [optional] [default to 443]
 **protocolHint** | **String**| An optional hint of the protocol to try for the connection | [optional]

### Return type

[**ApiCertificate**](ApiCertificate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

