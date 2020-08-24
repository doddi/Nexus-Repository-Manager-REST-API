# TagsApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associate**](TagsApi.md#associate) | **POST** /v1/tags/associate/{tagName} | Associate components with a tag
[**create1**](TagsApi.md#create1) | **POST** /v1/tags | Create a tag
[**delete2**](TagsApi.md#delete2) | **DELETE** /v1/tags/{name} | Delete a tag
[**disassociate**](TagsApi.md#disassociate) | **DELETE** /v1/tags/associate/{tagName} | Disassociate components from a tag
[**get3**](TagsApi.md#get3) | **GET** /v1/tags/{name} | Get a tag
[**getTags**](TagsApi.md#getTags) | **GET** /v1/tags | List tags
[**replace**](TagsApi.md#replace) | **PUT** /v1/tags/{name} | Update a tags attributes

<a name="associate"></a>
# **associate**
> associate(tagName, wait, q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture)

Associate components with a tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tagName = "tagName_example"; // String | Tag to associate to the matched components
Boolean wait = true; // Boolean | The query waits until the indexing is complete
String q = "q_example"; // String | Query by keyword
String repository = "repository_example"; // String | Repository name
String format = "format_example"; // String | Query by format
String group = "group_example"; // String | Component group
String name = "name_example"; // String | Component name
String version = "version_example"; // String | Component version
String md5 = "md5_example"; // String | Specific MD5 hash of component's asset
String sha1 = "sha1_example"; // String | Specific SHA-1 hash of component's asset
String sha256 = "sha256_example"; // String | Specific SHA-256 hash of component's asset
String sha512 = "sha512_example"; // String | Specific SHA-512 hash of component's asset
String prerelease = "prerelease_example"; // String | Prerelease version flag
String conanBaseVersion = "conanBaseVersion_example"; // String | baseVersion
String conanChannel = "conanChannel_example"; // String | channel
String dockerImageName = "dockerImageName_example"; // String | Docker image name
String dockerImageTag = "dockerImageTag_example"; // String | Docker image tag
String dockerLayerId = "dockerLayerId_example"; // String | Docker layer ID
String dockerContentDigest = "dockerContentDigest_example"; // String | Docker content digest
String mavenGroupId = "mavenGroupId_example"; // String | Maven groupId
String mavenArtifactId = "mavenArtifactId_example"; // String | Maven artifactId
String mavenBaseVersion = "mavenBaseVersion_example"; // String | Maven base version
String mavenExtension = "mavenExtension_example"; // String | Maven extension of component's asset
String mavenClassifier = "mavenClassifier_example"; // String | Maven classifier of component's asset
String npmScope = "npmScope_example"; // String | npm scope
String nugetId = "nugetId_example"; // String | NuGet id
String nugetTags = "nugetTags_example"; // String | NuGet tags
String p2PluginName = "p2PluginName_example"; // String | p2 plugin name
String pypiClassifiers = "pypiClassifiers_example"; // String | PyPI classifiers
String pypiDescription = "pypiDescription_example"; // String | PyPI description
String pypiKeywords = "pypiKeywords_example"; // String | PyPI keywords
String pypiSummary = "pypiSummary_example"; // String | PyPI summary
String rubygemsDescription = "rubygemsDescription_example"; // String | RubyGems description
String rubygemsPlatform = "rubygemsPlatform_example"; // String | RubyGems platform
String rubygemsSummary = "rubygemsSummary_example"; // String | RubyGems summary
String tag = "tag_example"; // String | Component tag
String yumArchitecture = "yumArchitecture_example"; // String | Yum architecture
try {
    apiInstance.associate(tagName, wait, q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#associate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| Tag to associate to the matched components |
 **wait** | **Boolean**| The query waits until the indexing is complete | [optional] [default to true]
 **q** | **String**| Query by keyword | [optional]
 **repository** | **String**| Repository name | [optional]
 **format** | **String**| Query by format | [optional]
 **group** | **String**| Component group | [optional]
 **name** | **String**| Component name | [optional]
 **version** | **String**| Component version | [optional]
 **md5** | **String**| Specific MD5 hash of component&#x27;s asset | [optional]
 **sha1** | **String**| Specific SHA-1 hash of component&#x27;s asset | [optional]
 **sha256** | **String**| Specific SHA-256 hash of component&#x27;s asset | [optional]
 **sha512** | **String**| Specific SHA-512 hash of component&#x27;s asset | [optional]
 **prerelease** | **String**| Prerelease version flag | [optional]
 **conanBaseVersion** | **String**| baseVersion | [optional]
 **conanChannel** | **String**| channel | [optional]
 **dockerImageName** | **String**| Docker image name | [optional]
 **dockerImageTag** | **String**| Docker image tag | [optional]
 **dockerLayerId** | **String**| Docker layer ID | [optional]
 **dockerContentDigest** | **String**| Docker content digest | [optional]
 **mavenGroupId** | **String**| Maven groupId | [optional]
 **mavenArtifactId** | **String**| Maven artifactId | [optional]
 **mavenBaseVersion** | **String**| Maven base version | [optional]
 **mavenExtension** | **String**| Maven extension of component&#x27;s asset | [optional]
 **mavenClassifier** | **String**| Maven classifier of component&#x27;s asset | [optional]
 **npmScope** | **String**| npm scope | [optional]
 **nugetId** | **String**| NuGet id | [optional]
 **nugetTags** | **String**| NuGet tags | [optional]
 **p2PluginName** | **String**| p2 plugin name | [optional]
 **pypiClassifiers** | **String**| PyPI classifiers | [optional]
 **pypiDescription** | **String**| PyPI description | [optional]
 **pypiKeywords** | **String**| PyPI keywords | [optional]
 **pypiSummary** | **String**| PyPI summary | [optional]
 **rubygemsDescription** | **String**| RubyGems description | [optional]
 **rubygemsPlatform** | **String**| RubyGems platform | [optional]
 **rubygemsSummary** | **String**| RubyGems summary | [optional]
 **tag** | **String**| Component tag | [optional]
 **yumArchitecture** | **String**| Yum architecture | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="create1"></a>
# **create1**
> create1(body)

Create a tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
TagXO body = new TagXO(); // TagXO | 
try {
    apiInstance.create1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#create1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagXO**](TagXO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="delete2"></a>
# **delete2**
> delete2(name)

Delete a tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String name = "name_example"; // String | Name of the tag to delete
try {
    apiInstance.delete2(name);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#delete2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the tag to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="disassociate"></a>
# **disassociate**
> disassociate(tagName, q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture)

Disassociate components from a tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tagName = "tagName_example"; // String | Tag to associate to the matched components
String q = "q_example"; // String | Query by keyword
String repository = "repository_example"; // String | Repository name
String format = "format_example"; // String | Query by format
String group = "group_example"; // String | Component group
String name = "name_example"; // String | Component name
String version = "version_example"; // String | Component version
String md5 = "md5_example"; // String | Specific MD5 hash of component's asset
String sha1 = "sha1_example"; // String | Specific SHA-1 hash of component's asset
String sha256 = "sha256_example"; // String | Specific SHA-256 hash of component's asset
String sha512 = "sha512_example"; // String | Specific SHA-512 hash of component's asset
String prerelease = "prerelease_example"; // String | Prerelease version flag
String conanBaseVersion = "conanBaseVersion_example"; // String | baseVersion
String conanChannel = "conanChannel_example"; // String | channel
String dockerImageName = "dockerImageName_example"; // String | Docker image name
String dockerImageTag = "dockerImageTag_example"; // String | Docker image tag
String dockerLayerId = "dockerLayerId_example"; // String | Docker layer ID
String dockerContentDigest = "dockerContentDigest_example"; // String | Docker content digest
String mavenGroupId = "mavenGroupId_example"; // String | Maven groupId
String mavenArtifactId = "mavenArtifactId_example"; // String | Maven artifactId
String mavenBaseVersion = "mavenBaseVersion_example"; // String | Maven base version
String mavenExtension = "mavenExtension_example"; // String | Maven extension of component's asset
String mavenClassifier = "mavenClassifier_example"; // String | Maven classifier of component's asset
String npmScope = "npmScope_example"; // String | npm scope
String nugetId = "nugetId_example"; // String | NuGet id
String nugetTags = "nugetTags_example"; // String | NuGet tags
String p2PluginName = "p2PluginName_example"; // String | p2 plugin name
String pypiClassifiers = "pypiClassifiers_example"; // String | PyPI classifiers
String pypiDescription = "pypiDescription_example"; // String | PyPI description
String pypiKeywords = "pypiKeywords_example"; // String | PyPI keywords
String pypiSummary = "pypiSummary_example"; // String | PyPI summary
String rubygemsDescription = "rubygemsDescription_example"; // String | RubyGems description
String rubygemsPlatform = "rubygemsPlatform_example"; // String | RubyGems platform
String rubygemsSummary = "rubygemsSummary_example"; // String | RubyGems summary
String tag = "tag_example"; // String | Component tag
String yumArchitecture = "yumArchitecture_example"; // String | Yum architecture
try {
    apiInstance.disassociate(tagName, q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#disassociate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| Tag to associate to the matched components |
 **q** | **String**| Query by keyword | [optional]
 **repository** | **String**| Repository name | [optional]
 **format** | **String**| Query by format | [optional]
 **group** | **String**| Component group | [optional]
 **name** | **String**| Component name | [optional]
 **version** | **String**| Component version | [optional]
 **md5** | **String**| Specific MD5 hash of component&#x27;s asset | [optional]
 **sha1** | **String**| Specific SHA-1 hash of component&#x27;s asset | [optional]
 **sha256** | **String**| Specific SHA-256 hash of component&#x27;s asset | [optional]
 **sha512** | **String**| Specific SHA-512 hash of component&#x27;s asset | [optional]
 **prerelease** | **String**| Prerelease version flag | [optional]
 **conanBaseVersion** | **String**| baseVersion | [optional]
 **conanChannel** | **String**| channel | [optional]
 **dockerImageName** | **String**| Docker image name | [optional]
 **dockerImageTag** | **String**| Docker image tag | [optional]
 **dockerLayerId** | **String**| Docker layer ID | [optional]
 **dockerContentDigest** | **String**| Docker content digest | [optional]
 **mavenGroupId** | **String**| Maven groupId | [optional]
 **mavenArtifactId** | **String**| Maven artifactId | [optional]
 **mavenBaseVersion** | **String**| Maven base version | [optional]
 **mavenExtension** | **String**| Maven extension of component&#x27;s asset | [optional]
 **mavenClassifier** | **String**| Maven classifier of component&#x27;s asset | [optional]
 **npmScope** | **String**| npm scope | [optional]
 **nugetId** | **String**| NuGet id | [optional]
 **nugetTags** | **String**| NuGet tags | [optional]
 **p2PluginName** | **String**| p2 plugin name | [optional]
 **pypiClassifiers** | **String**| PyPI classifiers | [optional]
 **pypiDescription** | **String**| PyPI description | [optional]
 **pypiKeywords** | **String**| PyPI keywords | [optional]
 **pypiSummary** | **String**| PyPI summary | [optional]
 **rubygemsDescription** | **String**| RubyGems description | [optional]
 **rubygemsPlatform** | **String**| RubyGems platform | [optional]
 **rubygemsSummary** | **String**| RubyGems summary | [optional]
 **tag** | **String**| Component tag | [optional]
 **yumArchitecture** | **String**| Yum architecture | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get3"></a>
# **get3**
> TagXO get3(name)

Get a tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String name = "name_example"; // String | Name of the tag to retrieve
try {
    TagXO result = apiInstance.get3(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#get3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the tag to retrieve |

### Return type

[**TagXO**](TagXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTags"></a>
# **getTags**
> PageTagXO getTags(continuationToken)

List tags

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String continuationToken = "continuationToken_example"; // String | A token returned by a prior request. If present, the next page of results are returned
try {
    PageTagXO result = apiInstance.getTags(continuationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continuationToken** | **String**| A token returned by a prior request. If present, the next page of results are returned | [optional]

### Return type

[**PageTagXO**](PageTagXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replace"></a>
# **replace**
> TagXO replace(name, body)

Update a tags attributes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String name = "name_example"; // String | 
BaseTagXO body = new BaseTagXO(); // BaseTagXO | 
try {
    TagXO result = apiInstance.replace(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#replace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**BaseTagXO**](BaseTagXO.md)|  | [optional]

### Return type

[**TagXO**](TagXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

