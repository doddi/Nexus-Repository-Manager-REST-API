# ProductLicensingApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLicenseStatus**](ProductLicensingApi.md#getLicenseStatus) | **GET** /v1/system/license | Get the current license status.
[**removeLicense**](ProductLicensingApi.md#removeLicense) | **DELETE** /v1/system/license | Uninstall license if present.
[**setLicense**](ProductLicensingApi.md#setLicense) | **POST** /v1/system/license | Upload a new license file.

<a name="getLicenseStatus"></a>
# **getLicenseStatus**
> ApiLicenseDetailsXO getLicenseStatus()

Get the current license status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductLicensingApi;


ProductLicensingApi apiInstance = new ProductLicensingApi();
try {
    ApiLicenseDetailsXO result = apiInstance.getLicenseStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductLicensingApi#getLicenseStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiLicenseDetailsXO**](ApiLicenseDetailsXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeLicense"></a>
# **removeLicense**
> removeLicense()

Uninstall license if present.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductLicensingApi;


ProductLicensingApi apiInstance = new ProductLicensingApi();
try {
    apiInstance.removeLicense();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductLicensingApi#removeLicense");
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

<a name="setLicense"></a>
# **setLicense**
> ApiLicenseDetailsXO setLicense(body)

Upload a new license file.

Server must be restarted to take effect

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductLicensingApi;


ProductLicensingApi apiInstance = new ProductLicensingApi();
InputStream body = new InputStream(); // InputStream | 
try {
    ApiLicenseDetailsXO result = apiInstance.setLicense(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductLicensingApi#setLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InputStream**](InputStream.md)|  | [optional]

### Return type

[**ApiLicenseDetailsXO**](ApiLicenseDetailsXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

