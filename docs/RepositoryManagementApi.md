# RepositoryManagementApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRepository**](RepositoryManagementApi.md#createRepository) | **POST** /v1/repositories/maven/group | Create Maven group repository
[**createRepository1**](RepositoryManagementApi.md#createRepository1) | **POST** /v1/repositories/maven/hosted | Create Maven hosted repository
[**createRepository10**](RepositoryManagementApi.md#createRepository10) | **POST** /v1/repositories/nuget/proxy | Create NuGet proxy repository
[**createRepository11**](RepositoryManagementApi.md#createRepository11) | **POST** /v1/repositories/npm/group | Create npm group repository
[**createRepository12**](RepositoryManagementApi.md#createRepository12) | **POST** /v1/repositories/npm/hosted | Create npm hosted repository
[**createRepository13**](RepositoryManagementApi.md#createRepository13) | **POST** /v1/repositories/npm/proxy | Create npm proxy repository
[**createRepository14**](RepositoryManagementApi.md#createRepository14) | **POST** /v1/repositories/rubygems/group | Create RubyGems group repository
[**createRepository15**](RepositoryManagementApi.md#createRepository15) | **POST** /v1/repositories/rubygems/hosted | Create RubyGems hosted repository
[**createRepository16**](RepositoryManagementApi.md#createRepository16) | **POST** /v1/repositories/rubygems/proxy | Create RubyGems proxy repository
[**createRepository17**](RepositoryManagementApi.md#createRepository17) | **POST** /v1/repositories/apt/hosted | Create APT hosted repository
[**createRepository18**](RepositoryManagementApi.md#createRepository18) | **POST** /v1/repositories/apt/proxy | Create APT proxy repository
[**createRepository19**](RepositoryManagementApi.md#createRepository19) | **POST** /v1/repositories/cocoapods/proxy | Create Cocoapods proxy repository
[**createRepository2**](RepositoryManagementApi.md#createRepository2) | **POST** /v1/repositories/maven/proxy | Create Maven proxy repository
[**createRepository20**](RepositoryManagementApi.md#createRepository20) | **POST** /v1/repositories/go/group | Create a Go group repository
[**createRepository21**](RepositoryManagementApi.md#createRepository21) | **POST** /v1/repositories/go/proxy | Create a Go proxy repository
[**createRepository22**](RepositoryManagementApi.md#createRepository22) | **POST** /v1/repositories/pypi/group | Create PyPI group repository
[**createRepository23**](RepositoryManagementApi.md#createRepository23) | **POST** /v1/repositories/pypi/hosted | Create PyPI hosted repository
[**createRepository24**](RepositoryManagementApi.md#createRepository24) | **POST** /v1/repositories/pypi/proxy | Create PyPI proxy repository
[**createRepository25**](RepositoryManagementApi.md#createRepository25) | **POST** /v1/repositories/conan/proxy | Create Conan proxy repository
[**createRepository26**](RepositoryManagementApi.md#createRepository26) | **POST** /v1/repositories/p2/proxy | Create p2 proxy repository
[**createRepository27**](RepositoryManagementApi.md#createRepository27) | **POST** /v1/repositories/r/group | Create R group repository
[**createRepository28**](RepositoryManagementApi.md#createRepository28) | **POST** /v1/repositories/r/hosted | Create R hosted repository
[**createRepository29**](RepositoryManagementApi.md#createRepository29) | **POST** /v1/repositories/r/proxy | Create R proxy repository
[**createRepository3**](RepositoryManagementApi.md#createRepository3) | **POST** /v1/repositories/raw/group | Create raw group repository
[**createRepository30**](RepositoryManagementApi.md#createRepository30) | **POST** /v1/repositories/bower/group | Create Bower group repository
[**createRepository31**](RepositoryManagementApi.md#createRepository31) | **POST** /v1/repositories/bower/hosted | Create Bower hosted repository
[**createRepository32**](RepositoryManagementApi.md#createRepository32) | **POST** /v1/repositories/bower/proxy | Create Bower proxy repository
[**createRepository33**](RepositoryManagementApi.md#createRepository33) | **POST** /v1/repositories/docker/group | Create Docker group repository
[**createRepository34**](RepositoryManagementApi.md#createRepository34) | **POST** /v1/repositories/docker/hosted | Create Docker hosted repository
[**createRepository35**](RepositoryManagementApi.md#createRepository35) | **POST** /v1/repositories/docker/proxy | Create Docker proxy repository
[**createRepository36**](RepositoryManagementApi.md#createRepository36) | **POST** /v1/repositories/gitlfs/hosted | Create Git LFS hosted repository
[**createRepository37**](RepositoryManagementApi.md#createRepository37) | **POST** /v1/repositories/yum/group | Create Yum group repository
[**createRepository38**](RepositoryManagementApi.md#createRepository38) | **POST** /v1/repositories/yum/hosted | Create Yum hosted repository
[**createRepository39**](RepositoryManagementApi.md#createRepository39) | **POST** /v1/repositories/yum/proxy | Create Yum proxy repository
[**createRepository4**](RepositoryManagementApi.md#createRepository4) | **POST** /v1/repositories/raw/hosted | Create raw hosted repository
[**createRepository5**](RepositoryManagementApi.md#createRepository5) | **POST** /v1/repositories/raw/proxy | Create raw proxy repository
[**createRepository6**](RepositoryManagementApi.md#createRepository6) | **POST** /v1/repositories/helm/hosted | Create Helm hosted repository
[**createRepository7**](RepositoryManagementApi.md#createRepository7) | **POST** /v1/repositories/helm/proxy | Create Helm proxy repository
[**createRepository8**](RepositoryManagementApi.md#createRepository8) | **POST** /v1/repositories/nuget/group | Create NuGet group repository
[**createRepository9**](RepositoryManagementApi.md#createRepository9) | **POST** /v1/repositories/nuget/hosted | Create NuGet hosted repository
[**deleteRepository**](RepositoryManagementApi.md#deleteRepository) | **DELETE** /v1/repositories/{repositoryName} | Delete repository of any format
[**disableRepositoryHealthCheck**](RepositoryManagementApi.md#disableRepositoryHealthCheck) | **DELETE** /v1/repositories/{repositoryName}/health-check | Disable repository health check. Proxy repositories only.
[**enableRepositoryHealthCheck**](RepositoryManagementApi.md#enableRepositoryHealthCheck) | **POST** /v1/repositories/{repositoryName}/health-check | Enable repository health check. Proxy repositories only.
[**getRepositories**](RepositoryManagementApi.md#getRepositories) | **GET** /v1/repositorySettings | List repositories
[**invalidateCache**](RepositoryManagementApi.md#invalidateCache) | **POST** /v1/repositories/{repositoryName}/invalidate-cache | Invalidate repository cache. Proxy or group repositories only.
[**rebuildIndex**](RepositoryManagementApi.md#rebuildIndex) | **POST** /v1/repositories/{repositoryName}/rebuild-index | Schedule a &#x27;Repair - Rebuild repository search&#x27; Task. Hosted or proxy repositories only.
[**updateRepository**](RepositoryManagementApi.md#updateRepository) | **PUT** /v1/repositories/maven/group/{repositoryName} | Update Maven group repository
[**updateRepository1**](RepositoryManagementApi.md#updateRepository1) | **PUT** /v1/repositories/maven/hosted/{repositoryName} | Update Maven hosted repository
[**updateRepository10**](RepositoryManagementApi.md#updateRepository10) | **PUT** /v1/repositories/nuget/proxy/{repositoryName} | Update NuGet proxy repository
[**updateRepository11**](RepositoryManagementApi.md#updateRepository11) | **PUT** /v1/repositories/npm/group/{repositoryName} | Update npm group repository
[**updateRepository12**](RepositoryManagementApi.md#updateRepository12) | **PUT** /v1/repositories/npm/hosted/{repositoryName} | Update npm hosted repository
[**updateRepository13**](RepositoryManagementApi.md#updateRepository13) | **PUT** /v1/repositories/npm/proxy/{repositoryName} | Update npm proxy repository
[**updateRepository14**](RepositoryManagementApi.md#updateRepository14) | **PUT** /v1/repositories/rubygems/group/{repositoryName} | Update RubyGems group repository
[**updateRepository15**](RepositoryManagementApi.md#updateRepository15) | **PUT** /v1/repositories/rubygems/hosted/{repositoryName} | Update RubyGems hosted repository
[**updateRepository16**](RepositoryManagementApi.md#updateRepository16) | **PUT** /v1/repositories/rubygems/proxy/{repositoryName} | Update RubyGems proxy repository
[**updateRepository17**](RepositoryManagementApi.md#updateRepository17) | **PUT** /v1/repositories/apt/hosted/{repositoryName} | Update APT hosted repository
[**updateRepository18**](RepositoryManagementApi.md#updateRepository18) | **PUT** /v1/repositories/apt/proxy/{repositoryName} | Update APT proxy repository
[**updateRepository19**](RepositoryManagementApi.md#updateRepository19) | **PUT** /v1/repositories/cocoapods/proxy/{repositoryName} | Update Cocoapods proxy repository
[**updateRepository2**](RepositoryManagementApi.md#updateRepository2) | **PUT** /v1/repositories/maven/proxy/{repositoryName} | Update Maven proxy repository
[**updateRepository20**](RepositoryManagementApi.md#updateRepository20) | **PUT** /v1/repositories/go/group/{repositoryName} | Update a Go group repository
[**updateRepository21**](RepositoryManagementApi.md#updateRepository21) | **PUT** /v1/repositories/go/proxy/{repositoryName} | Update a Go proxy repository
[**updateRepository22**](RepositoryManagementApi.md#updateRepository22) | **PUT** /v1/repositories/pypi/group/{repositoryName} | Update PyPI group repository
[**updateRepository23**](RepositoryManagementApi.md#updateRepository23) | **PUT** /v1/repositories/pypi/hosted/{repositoryName} | Update PyPI hosted repository
[**updateRepository24**](RepositoryManagementApi.md#updateRepository24) | **PUT** /v1/repositories/pypi/proxy/{repositoryName} | Update PyPI proxy repository
[**updateRepository25**](RepositoryManagementApi.md#updateRepository25) | **PUT** /v1/repositories/conan/proxy/{repositoryName} | Update Conan proxy repository
[**updateRepository26**](RepositoryManagementApi.md#updateRepository26) | **PUT** /v1/repositories/p2/proxy/{repositoryName} | Update p2 proxy repository
[**updateRepository27**](RepositoryManagementApi.md#updateRepository27) | **PUT** /v1/repositories/r/group/{repositoryName} | Update R group repository
[**updateRepository28**](RepositoryManagementApi.md#updateRepository28) | **PUT** /v1/repositories/r/hosted/{repositoryName} | Update R hosted repository
[**updateRepository29**](RepositoryManagementApi.md#updateRepository29) | **PUT** /v1/repositories/r/proxy/{repositoryName} | Update R proxy repository
[**updateRepository3**](RepositoryManagementApi.md#updateRepository3) | **PUT** /v1/repositories/raw/group/{repositoryName} | Update raw group repository
[**updateRepository30**](RepositoryManagementApi.md#updateRepository30) | **PUT** /v1/repositories/bower/group/{repositoryName} | Update Bower group repository
[**updateRepository31**](RepositoryManagementApi.md#updateRepository31) | **PUT** /v1/repositories/bower/hosted/{repositoryName} | Update Bower hosted repository
[**updateRepository32**](RepositoryManagementApi.md#updateRepository32) | **PUT** /v1/repositories/bower/proxy/{repositoryName} | Update Bower proxy repository
[**updateRepository33**](RepositoryManagementApi.md#updateRepository33) | **PUT** /v1/repositories/docker/group/{repositoryName} | Update Docker group repository
[**updateRepository34**](RepositoryManagementApi.md#updateRepository34) | **PUT** /v1/repositories/docker/hosted/{repositoryName} | Update Docker hosted repository
[**updateRepository35**](RepositoryManagementApi.md#updateRepository35) | **PUT** /v1/repositories/docker/proxy/{repositoryName} | Update Docker group repository
[**updateRepository36**](RepositoryManagementApi.md#updateRepository36) | **PUT** /v1/repositories/gitlfs/hosted/{repositoryName} | Update Git LFS hosted repository
[**updateRepository37**](RepositoryManagementApi.md#updateRepository37) | **PUT** /v1/repositories/yum/group/{repositoryName} | Update Yum group repository
[**updateRepository38**](RepositoryManagementApi.md#updateRepository38) | **PUT** /v1/repositories/yum/hosted/{repositoryName} | Update Yum hosted repository
[**updateRepository39**](RepositoryManagementApi.md#updateRepository39) | **PUT** /v1/repositories/yum/proxy/{repositoryName} | Update Yum proxy repository
[**updateRepository4**](RepositoryManagementApi.md#updateRepository4) | **PUT** /v1/repositories/raw/hosted/{repositoryName} | Update raw hosted repository
[**updateRepository5**](RepositoryManagementApi.md#updateRepository5) | **PUT** /v1/repositories/raw/proxy/{repositoryName} | Update raw proxy repository
[**updateRepository6**](RepositoryManagementApi.md#updateRepository6) | **PUT** /v1/repositories/helm/hosted/{repositoryName} | Update Helm hosted repository
[**updateRepository7**](RepositoryManagementApi.md#updateRepository7) | **PUT** /v1/repositories/helm/proxy/{repositoryName} | Update Helm proxy repository
[**updateRepository8**](RepositoryManagementApi.md#updateRepository8) | **PUT** /v1/repositories/nuget/group/{repositoryName} | Update NuGet group repository
[**updateRepository9**](RepositoryManagementApi.md#updateRepository9) | **PUT** /v1/repositories/nuget/hosted/{repositoryName} | Update NuGet hosted repository

<a name="createRepository"></a>
# **createRepository**
> createRepository(body)

Create Maven group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
MavenGroupRepositoryApiRequest body = new MavenGroupRepositoryApiRequest(); // MavenGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MavenGroupRepositoryApiRequest**](MavenGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository1"></a>
# **createRepository1**
> createRepository1(body)

Create Maven hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
MavenHostedRepositoryApiRequest body = new MavenHostedRepositoryApiRequest(); // MavenHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MavenHostedRepositoryApiRequest**](MavenHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository10"></a>
# **createRepository10**
> createRepository10(body)

Create NuGet proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NugetProxyRepositoryApiRequest body = new NugetProxyRepositoryApiRequest(); // NugetProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository10(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NugetProxyRepositoryApiRequest**](NugetProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository11"></a>
# **createRepository11**
> createRepository11(body)

Create npm group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NpmGroupRepositoryApiRequest body = new NpmGroupRepositoryApiRequest(); // NpmGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository11(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NpmGroupRepositoryApiRequest**](NpmGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository12"></a>
# **createRepository12**
> createRepository12(body)

Create npm hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NpmHostedRepositoryApiRequest body = new NpmHostedRepositoryApiRequest(); // NpmHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository12(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NpmHostedRepositoryApiRequest**](NpmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository13"></a>
# **createRepository13**
> createRepository13(body)

Create npm proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NpmProxyRepositoryApiRequest body = new NpmProxyRepositoryApiRequest(); // NpmProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository13(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NpmProxyRepositoryApiRequest**](NpmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository14"></a>
# **createRepository14**
> createRepository14(body)

Create RubyGems group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RubyGemsGroupRepositoryApiRequest body = new RubyGemsGroupRepositoryApiRequest(); // RubyGemsGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository14(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RubyGemsGroupRepositoryApiRequest**](RubyGemsGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository15"></a>
# **createRepository15**
> createRepository15(body)

Create RubyGems hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RubyGemsHostedRepositoryApiRequest body = new RubyGemsHostedRepositoryApiRequest(); // RubyGemsHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository15(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository15");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RubyGemsHostedRepositoryApiRequest**](RubyGemsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository16"></a>
# **createRepository16**
> createRepository16(body)

Create RubyGems proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RubyGemsProxyRepositoryApiRequest body = new RubyGemsProxyRepositoryApiRequest(); // RubyGemsProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository16(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RubyGemsProxyRepositoryApiRequest**](RubyGemsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository17"></a>
# **createRepository17**
> createRepository17(body)

Create APT hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
AptHostedRepositoryApiRequest body = new AptHostedRepositoryApiRequest(); // AptHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository17(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository17");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AptHostedRepositoryApiRequest**](AptHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository18"></a>
# **createRepository18**
> createRepository18(body)

Create APT proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
AptProxyRepositoryApiRequest body = new AptProxyRepositoryApiRequest(); // AptProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository18(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository18");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AptProxyRepositoryApiRequest**](AptProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository19"></a>
# **createRepository19**
> createRepository19(body)

Create Cocoapods proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
CocoapodsProxyRepositoryApiRequest body = new CocoapodsProxyRepositoryApiRequest(); // CocoapodsProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository19(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository19");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CocoapodsProxyRepositoryApiRequest**](CocoapodsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository2"></a>
# **createRepository2**
> createRepository2(body)

Create Maven proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
MavenProxyRepositoryApiRequest body = new MavenProxyRepositoryApiRequest(); // MavenProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository2(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MavenProxyRepositoryApiRequest**](MavenProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository20"></a>
# **createRepository20**
> createRepository20(body)

Create a Go group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
GolangGroupRepositoryApiRequest body = new GolangGroupRepositoryApiRequest(); // GolangGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository20(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository20");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GolangGroupRepositoryApiRequest**](GolangGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository21"></a>
# **createRepository21**
> createRepository21(body)

Create a Go proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
GolangProxyRepositoryApiRequest body = new GolangProxyRepositoryApiRequest(); // GolangProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository21(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository21");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GolangProxyRepositoryApiRequest**](GolangProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository22"></a>
# **createRepository22**
> createRepository22(body)

Create PyPI group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
PypiGroupRepositoryApiRequest body = new PypiGroupRepositoryApiRequest(); // PypiGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository22(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository22");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PypiGroupRepositoryApiRequest**](PypiGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository23"></a>
# **createRepository23**
> createRepository23(body)

Create PyPI hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
PypiHostedRepositoryApiRequest body = new PypiHostedRepositoryApiRequest(); // PypiHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository23(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository23");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PypiHostedRepositoryApiRequest**](PypiHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository24"></a>
# **createRepository24**
> createRepository24(body)

Create PyPI proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
PypiProxyRepositoryApiRequest body = new PypiProxyRepositoryApiRequest(); // PypiProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository24(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository24");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PypiProxyRepositoryApiRequest**](PypiProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository25"></a>
# **createRepository25**
> createRepository25(body)

Create Conan proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
ConanProxyRepositoryApiRequest body = new ConanProxyRepositoryApiRequest(); // ConanProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository25(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository25");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConanProxyRepositoryApiRequest**](ConanProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository26"></a>
# **createRepository26**
> createRepository26(body)

Create p2 proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
P2ProxyRepositoryApiRequest body = new P2ProxyRepositoryApiRequest(); // P2ProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository26(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository26");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**P2ProxyRepositoryApiRequest**](P2ProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository27"></a>
# **createRepository27**
> createRepository27(body)

Create R group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RGroupRepositoryApiRequest body = new RGroupRepositoryApiRequest(); // RGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository27(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository27");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RGroupRepositoryApiRequest**](RGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository28"></a>
# **createRepository28**
> createRepository28(body)

Create R hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RHostedRepositoryApiRequest body = new RHostedRepositoryApiRequest(); // RHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository28(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository28");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RHostedRepositoryApiRequest**](RHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository29"></a>
# **createRepository29**
> createRepository29(body)

Create R proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RProxyRepositoryApiRequest body = new RProxyRepositoryApiRequest(); // RProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository29(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository29");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RProxyRepositoryApiRequest**](RProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository3"></a>
# **createRepository3**
> createRepository3(body)

Create raw group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RawGroupRepositoryApiRequest body = new RawGroupRepositoryApiRequest(); // RawGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository3(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RawGroupRepositoryApiRequest**](RawGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository30"></a>
# **createRepository30**
> createRepository30(body)

Create Bower group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
BowerGroupRepositoryApiRequest body = new BowerGroupRepositoryApiRequest(); // BowerGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository30(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository30");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BowerGroupRepositoryApiRequest**](BowerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository31"></a>
# **createRepository31**
> createRepository31(body)

Create Bower hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
BowerHostedRepositoryApiRequest body = new BowerHostedRepositoryApiRequest(); // BowerHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository31(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository31");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BowerHostedRepositoryApiRequest**](BowerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository32"></a>
# **createRepository32**
> createRepository32(body)

Create Bower proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
BowerProxyRepositoryApiRequest body = new BowerProxyRepositoryApiRequest(); // BowerProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository32(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository32");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BowerProxyRepositoryApiRequest**](BowerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository33"></a>
# **createRepository33**
> createRepository33(body)

Create Docker group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
DockerGroupRepositoryApiRequest body = new DockerGroupRepositoryApiRequest(); // DockerGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository33(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository33");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DockerGroupRepositoryApiRequest**](DockerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository34"></a>
# **createRepository34**
> createRepository34(body)

Create Docker hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
DockerHostedRepositoryApiRequest body = new DockerHostedRepositoryApiRequest(); // DockerHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository34(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository34");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DockerHostedRepositoryApiRequest**](DockerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository35"></a>
# **createRepository35**
> createRepository35(body)

Create Docker proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
DockerProxyRepositoryApiRequest body = new DockerProxyRepositoryApiRequest(); // DockerProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository35(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository35");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DockerProxyRepositoryApiRequest**](DockerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository36"></a>
# **createRepository36**
> createRepository36(body)

Create Git LFS hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
GitLfsHostedRepositoryApiRequest body = new GitLfsHostedRepositoryApiRequest(); // GitLfsHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository36(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository36");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitLfsHostedRepositoryApiRequest**](GitLfsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository37"></a>
# **createRepository37**
> createRepository37(body)

Create Yum group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
YumGroupRepositoryApiRequest body = new YumGroupRepositoryApiRequest(); // YumGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository37(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository37");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**YumGroupRepositoryApiRequest**](YumGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository38"></a>
# **createRepository38**
> createRepository38(body)

Create Yum hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
YumHostedRepositoryApiRequest body = new YumHostedRepositoryApiRequest(); // YumHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository38(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository38");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**YumHostedRepositoryApiRequest**](YumHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository39"></a>
# **createRepository39**
> createRepository39(body)

Create Yum proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
YumProxyRepositoryApiRequest body = new YumProxyRepositoryApiRequest(); // YumProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository39(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository39");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**YumProxyRepositoryApiRequest**](YumProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository4"></a>
# **createRepository4**
> createRepository4(body)

Create raw hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RawHostedRepositoryApiRequest body = new RawHostedRepositoryApiRequest(); // RawHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository4(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RawHostedRepositoryApiRequest**](RawHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository5"></a>
# **createRepository5**
> createRepository5(body)

Create raw proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RawProxyRepositoryApiRequest body = new RawProxyRepositoryApiRequest(); // RawProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository5(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RawProxyRepositoryApiRequest**](RawProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository6"></a>
# **createRepository6**
> createRepository6(body)

Create Helm hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
HelmHostedRepositoryApiRequest body = new HelmHostedRepositoryApiRequest(); // HelmHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository6(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HelmHostedRepositoryApiRequest**](HelmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository7"></a>
# **createRepository7**
> createRepository7(body)

Create Helm proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
HelmProxyRepositoryApiRequest body = new HelmProxyRepositoryApiRequest(); // HelmProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository7(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HelmProxyRepositoryApiRequest**](HelmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository8"></a>
# **createRepository8**
> createRepository8(body)

Create NuGet group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NugetGroupRepositoryApiRequest body = new NugetGroupRepositoryApiRequest(); // NugetGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository8(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NugetGroupRepositoryApiRequest**](NugetGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepository9"></a>
# **createRepository9**
> createRepository9(body)

Create NuGet hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NugetHostedRepositoryApiRequest body = new NugetHostedRepositoryApiRequest(); // NugetHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository9(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NugetHostedRepositoryApiRequest**](NugetHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteRepository"></a>
# **deleteRepository**
> deleteRepository(repositoryName)

Delete repository of any format

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to delete
try {
    apiInstance.deleteRepository(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#deleteRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="disableRepositoryHealthCheck"></a>
# **disableRepositoryHealthCheck**
> disableRepositoryHealthCheck(repositoryName)

Disable repository health check. Proxy repositories only.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to disable Repository Health Check for
try {
    apiInstance.disableRepositoryHealthCheck(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#disableRepositoryHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to disable Repository Health Check for |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="enableRepositoryHealthCheck"></a>
# **enableRepositoryHealthCheck**
> enableRepositoryHealthCheck(repositoryName)

Enable repository health check. Proxy repositories only.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to enable Repository Health Check for
try {
    apiInstance.enableRepositoryHealthCheck(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#enableRepositoryHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to enable Repository Health Check for |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRepositories"></a>
# **getRepositories**
> List&lt;AbstractApiRepository&gt; getRepositories()

List repositories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
try {
    List<AbstractApiRepository> result = apiInstance.getRepositories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepositories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AbstractApiRepository&gt;**](AbstractApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invalidateCache"></a>
# **invalidateCache**
> invalidateCache(repositoryName)

Invalidate repository cache. Proxy or group repositories only.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to invalidate cache
try {
    apiInstance.invalidateCache(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#invalidateCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to invalidate cache |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="rebuildIndex"></a>
# **rebuildIndex**
> rebuildIndex(repositoryName)

Schedule a &#x27;Repair - Rebuild repository search&#x27; Task. Hosted or proxy repositories only.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to rebuild index
try {
    apiInstance.rebuildIndex(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#rebuildIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to rebuild index |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateRepository"></a>
# **updateRepository**
> updateRepository(repositoryName, body)

Update Maven group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
MavenGroupRepositoryApiRequest body = new MavenGroupRepositoryApiRequest(); // MavenGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**MavenGroupRepositoryApiRequest**](MavenGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository1"></a>
# **updateRepository1**
> updateRepository1(repositoryName, body)

Update Maven hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
MavenHostedRepositoryApiRequest body = new MavenHostedRepositoryApiRequest(); // MavenHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository1(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**MavenHostedRepositoryApiRequest**](MavenHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository10"></a>
# **updateRepository10**
> updateRepository10(repositoryName, body)

Update NuGet proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NugetProxyRepositoryApiRequest body = new NugetProxyRepositoryApiRequest(); // NugetProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository10(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NugetProxyRepositoryApiRequest**](NugetProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository11"></a>
# **updateRepository11**
> updateRepository11(repositoryName, body)

Update npm group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NpmGroupRepositoryApiRequest body = new NpmGroupRepositoryApiRequest(); // NpmGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository11(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NpmGroupRepositoryApiRequest**](NpmGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository12"></a>
# **updateRepository12**
> updateRepository12(repositoryName, body)

Update npm hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NpmHostedRepositoryApiRequest body = new NpmHostedRepositoryApiRequest(); // NpmHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository12(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NpmHostedRepositoryApiRequest**](NpmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository13"></a>
# **updateRepository13**
> updateRepository13(repositoryName, body)

Update npm proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NpmProxyRepositoryApiRequest body = new NpmProxyRepositoryApiRequest(); // NpmProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository13(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NpmProxyRepositoryApiRequest**](NpmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository14"></a>
# **updateRepository14**
> updateRepository14(repositoryName, body)

Update RubyGems group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RubyGemsGroupRepositoryApiRequest body = new RubyGemsGroupRepositoryApiRequest(); // RubyGemsGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository14(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RubyGemsGroupRepositoryApiRequest**](RubyGemsGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository15"></a>
# **updateRepository15**
> updateRepository15(repositoryName, body)

Update RubyGems hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RubyGemsHostedRepositoryApiRequest body = new RubyGemsHostedRepositoryApiRequest(); // RubyGemsHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository15(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository15");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RubyGemsHostedRepositoryApiRequest**](RubyGemsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository16"></a>
# **updateRepository16**
> updateRepository16(repositoryName, body)

Update RubyGems proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RubyGemsProxyRepositoryApiRequest body = new RubyGemsProxyRepositoryApiRequest(); // RubyGemsProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository16(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RubyGemsProxyRepositoryApiRequest**](RubyGemsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository17"></a>
# **updateRepository17**
> updateRepository17(repositoryName, body)

Update APT hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
AptHostedRepositoryApiRequest body = new AptHostedRepositoryApiRequest(); // AptHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository17(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository17");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**AptHostedRepositoryApiRequest**](AptHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository18"></a>
# **updateRepository18**
> updateRepository18(repositoryName, body)

Update APT proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
AptProxyRepositoryApiRequest body = new AptProxyRepositoryApiRequest(); // AptProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository18(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository18");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**AptProxyRepositoryApiRequest**](AptProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository19"></a>
# **updateRepository19**
> updateRepository19(repositoryName, body)

Update Cocoapods proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
CocoapodsProxyRepositoryApiRequest body = new CocoapodsProxyRepositoryApiRequest(); // CocoapodsProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository19(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository19");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**CocoapodsProxyRepositoryApiRequest**](CocoapodsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository2"></a>
# **updateRepository2**
> updateRepository2(repositoryName, body)

Update Maven proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
MavenProxyRepositoryApiRequest body = new MavenProxyRepositoryApiRequest(); // MavenProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository2(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**MavenProxyRepositoryApiRequest**](MavenProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository20"></a>
# **updateRepository20**
> updateRepository20(repositoryName, body)

Update a Go group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
GolangGroupRepositoryApiRequest body = new GolangGroupRepositoryApiRequest(); // GolangGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository20(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository20");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**GolangGroupRepositoryApiRequest**](GolangGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository21"></a>
# **updateRepository21**
> updateRepository21(repositoryName, body)

Update a Go proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
GolangProxyRepositoryApiRequest body = new GolangProxyRepositoryApiRequest(); // GolangProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository21(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository21");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**GolangProxyRepositoryApiRequest**](GolangProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository22"></a>
# **updateRepository22**
> updateRepository22(repositoryName, body)

Update PyPI group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
PypiGroupRepositoryApiRequest body = new PypiGroupRepositoryApiRequest(); // PypiGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository22(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository22");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**PypiGroupRepositoryApiRequest**](PypiGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository23"></a>
# **updateRepository23**
> updateRepository23(repositoryName, body)

Update PyPI hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
PypiHostedRepositoryApiRequest body = new PypiHostedRepositoryApiRequest(); // PypiHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository23(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository23");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**PypiHostedRepositoryApiRequest**](PypiHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository24"></a>
# **updateRepository24**
> updateRepository24(repositoryName, body)

Update PyPI proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
PypiProxyRepositoryApiRequest body = new PypiProxyRepositoryApiRequest(); // PypiProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository24(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository24");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**PypiProxyRepositoryApiRequest**](PypiProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository25"></a>
# **updateRepository25**
> updateRepository25(repositoryName, body)

Update Conan proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
ConanProxyRepositoryApiRequest body = new ConanProxyRepositoryApiRequest(); // ConanProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository25(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository25");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**ConanProxyRepositoryApiRequest**](ConanProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository26"></a>
# **updateRepository26**
> updateRepository26(repositoryName, body)

Update p2 proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
P2ProxyRepositoryApiRequest body = new P2ProxyRepositoryApiRequest(); // P2ProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository26(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository26");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**P2ProxyRepositoryApiRequest**](P2ProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository27"></a>
# **updateRepository27**
> updateRepository27(repositoryName, body)

Update R group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RGroupRepositoryApiRequest body = new RGroupRepositoryApiRequest(); // RGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository27(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository27");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RGroupRepositoryApiRequest**](RGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository28"></a>
# **updateRepository28**
> updateRepository28(repositoryName, body)

Update R hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RHostedRepositoryApiRequest body = new RHostedRepositoryApiRequest(); // RHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository28(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository28");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RHostedRepositoryApiRequest**](RHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository29"></a>
# **updateRepository29**
> updateRepository29(repositoryName, body)

Update R proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RProxyRepositoryApiRequest body = new RProxyRepositoryApiRequest(); // RProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository29(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository29");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RProxyRepositoryApiRequest**](RProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository3"></a>
# **updateRepository3**
> updateRepository3(repositoryName, body)

Update raw group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RawGroupRepositoryApiRequest body = new RawGroupRepositoryApiRequest(); // RawGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository3(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RawGroupRepositoryApiRequest**](RawGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository30"></a>
# **updateRepository30**
> updateRepository30(repositoryName, body)

Update Bower group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
BowerGroupRepositoryApiRequest body = new BowerGroupRepositoryApiRequest(); // BowerGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository30(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository30");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**BowerGroupRepositoryApiRequest**](BowerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository31"></a>
# **updateRepository31**
> updateRepository31(repositoryName, body)

Update Bower hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
BowerHostedRepositoryApiRequest body = new BowerHostedRepositoryApiRequest(); // BowerHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository31(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository31");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**BowerHostedRepositoryApiRequest**](BowerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository32"></a>
# **updateRepository32**
> updateRepository32(repositoryName, body)

Update Bower proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
BowerProxyRepositoryApiRequest body = new BowerProxyRepositoryApiRequest(); // BowerProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository32(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository32");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**BowerProxyRepositoryApiRequest**](BowerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository33"></a>
# **updateRepository33**
> updateRepository33(repositoryName, body)

Update Docker group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
DockerGroupRepositoryApiRequest body = new DockerGroupRepositoryApiRequest(); // DockerGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository33(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository33");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**DockerGroupRepositoryApiRequest**](DockerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository34"></a>
# **updateRepository34**
> updateRepository34(repositoryName, body)

Update Docker hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
DockerHostedRepositoryApiRequest body = new DockerHostedRepositoryApiRequest(); // DockerHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository34(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository34");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**DockerHostedRepositoryApiRequest**](DockerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository35"></a>
# **updateRepository35**
> updateRepository35(repositoryName, body)

Update Docker group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
DockerProxyRepositoryApiRequest body = new DockerProxyRepositoryApiRequest(); // DockerProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository35(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository35");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**DockerProxyRepositoryApiRequest**](DockerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository36"></a>
# **updateRepository36**
> updateRepository36(repositoryName, body)

Update Git LFS hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
GitLfsHostedRepositoryApiRequest body = new GitLfsHostedRepositoryApiRequest(); // GitLfsHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository36(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository36");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**GitLfsHostedRepositoryApiRequest**](GitLfsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository37"></a>
# **updateRepository37**
> updateRepository37(repositoryName, body)

Update Yum group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
YumGroupRepositoryApiRequest body = new YumGroupRepositoryApiRequest(); // YumGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository37(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository37");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**YumGroupRepositoryApiRequest**](YumGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository38"></a>
# **updateRepository38**
> updateRepository38(repositoryName, body)

Update Yum hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
YumHostedRepositoryApiRequest body = new YumHostedRepositoryApiRequest(); // YumHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository38(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository38");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**YumHostedRepositoryApiRequest**](YumHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository39"></a>
# **updateRepository39**
> updateRepository39(repositoryName, body)

Update Yum proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
YumProxyRepositoryApiRequest body = new YumProxyRepositoryApiRequest(); // YumProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository39(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository39");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**YumProxyRepositoryApiRequest**](YumProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository4"></a>
# **updateRepository4**
> updateRepository4(repositoryName, body)

Update raw hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RawHostedRepositoryApiRequest body = new RawHostedRepositoryApiRequest(); // RawHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository4(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RawHostedRepositoryApiRequest**](RawHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository5"></a>
# **updateRepository5**
> updateRepository5(repositoryName, body)

Update raw proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RawProxyRepositoryApiRequest body = new RawProxyRepositoryApiRequest(); // RawProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository5(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RawProxyRepositoryApiRequest**](RawProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository6"></a>
# **updateRepository6**
> updateRepository6(repositoryName, body)

Update Helm hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
HelmHostedRepositoryApiRequest body = new HelmHostedRepositoryApiRequest(); // HelmHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository6(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**HelmHostedRepositoryApiRequest**](HelmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository7"></a>
# **updateRepository7**
> updateRepository7(repositoryName, body)

Update Helm proxy repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
HelmProxyRepositoryApiRequest body = new HelmProxyRepositoryApiRequest(); // HelmProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository7(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**HelmProxyRepositoryApiRequest**](HelmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository8"></a>
# **updateRepository8**
> updateRepository8(repositoryName, body)

Update NuGet group repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NugetGroupRepositoryApiRequest body = new NugetGroupRepositoryApiRequest(); // NugetGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository8(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NugetGroupRepositoryApiRequest**](NugetGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRepository9"></a>
# **updateRepository9**
> updateRepository9(repositoryName, body)

Update NuGet hosted repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NugetHostedRepositoryApiRequest body = new NugetHostedRepositoryApiRequest(); // NugetHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository9(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NugetHostedRepositoryApiRequest**](NugetHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

