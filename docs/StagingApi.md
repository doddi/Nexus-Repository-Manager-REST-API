# StagingApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete3**](StagingApi.md#delete3) | **POST** /v1/staging/delete | Delete components
[**move**](StagingApi.md#move) | **POST** /v1/staging/move/{destination} | Move components

<a name="delete3"></a>
# **delete3**
> delete3(q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture)

Delete components

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StagingApi;


StagingApi apiInstance = new StagingApi();
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
    apiInstance.delete3(q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture);
} catch (ApiException e) {
    System.err.println("Exception when calling StagingApi#delete3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="move"></a>
# **move**
> move(destination, q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture)

Move components

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StagingApi;


StagingApi apiInstance = new StagingApi();
String destination = "destination_example"; // String | 
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
    apiInstance.move(destination, q, repository, format, group, name, version, md5, sha1, sha256, sha512, prerelease, conanBaseVersion, conanChannel, dockerImageName, dockerImageTag, dockerLayerId, dockerContentDigest, mavenGroupId, mavenArtifactId, mavenBaseVersion, mavenExtension, mavenClassifier, npmScope, nugetId, nugetTags, p2PluginName, pypiClassifiers, pypiDescription, pypiKeywords, pypiSummary, rubygemsDescription, rubygemsPlatform, rubygemsSummary, tag, yumArchitecture);
} catch (ApiException e) {
    System.err.println("Exception when calling StagingApi#move");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destination** | **String**|  |
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

