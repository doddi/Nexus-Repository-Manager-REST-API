# ComponentsApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteComponent**](ComponentsApi.md#deleteComponent) | **DELETE** /v1/components/{id} | Delete a single component
[**getComponentById**](ComponentsApi.md#getComponentById) | **GET** /v1/components/{id} | Get a single component
[**getComponents**](ComponentsApi.md#getComponents) | **GET** /v1/components | List components
[**uploadComponent**](ComponentsApi.md#uploadComponent) | **POST** /v1/components | Upload a single component

<a name="deleteComponent"></a>
# **deleteComponent**
> deleteComponent(id)

Delete a single component

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String id = "id_example"; // String | ID of the component to delete
try {
    apiInstance.deleteComponent(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#deleteComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the component to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComponentById"></a>
# **getComponentById**
> ComponentXO getComponentById(id)

Get a single component

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String id = "id_example"; // String | ID of the component to retrieve
try {
    ComponentXO result = apiInstance.getComponentById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#getComponentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the component to retrieve |

### Return type

[**ComponentXO**](ComponentXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComponents"></a>
# **getComponents**
> PageComponentXO getComponents(repository, continuationToken)

List components

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String repository = "repository_example"; // String | Repository from which you would like to retrieve components
String continuationToken = "continuationToken_example"; // String | A token returned by a prior request. If present, the next page of results are returned
try {
    PageComponentXO result = apiInstance.getComponents(repository, continuationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#getComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| Repository from which you would like to retrieve components |
 **continuationToken** | **String**| A token returned by a prior request. If present, the next page of results are returned | [optional]

### Return type

[**PageComponentXO**](PageComponentXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadComponent"></a>
# **uploadComponent**
> uploadComponent(repository, yumDirectory, yumTag, yumAsset, yumAssetFilename, dockerTag, dockerAsset, rTag, rAsset, rAssetPathId, pypiTag, pypiAsset, aptTag, aptAsset, rubygemsTag, rubygemsAsset, npmTag, npmAsset, nugetTag, nugetAsset, helmTag, helmAsset, rawDirectory, rawTag, rawAsset1, rawAsset1Filename, rawAsset2, rawAsset2Filename, rawAsset3, rawAsset3Filename, maven2GroupId, maven2ArtifactId, maven2Version, maven2GeneratePom, maven2Packaging, maven2Tag, maven2Asset1, maven2Asset1Classifier, maven2Asset1Extension, maven2Asset2, maven2Asset2Classifier, maven2Asset2Extension, maven2Asset3, maven2Asset3Classifier, maven2Asset3Extension)

Upload a single component

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String repository = "repository_example"; // String | Name of the repository to which you would like to upload the component
String yumDirectory = "yumDirectory_example"; // String | 
String yumTag = "yumTag_example"; // String | 
File yumAsset = new File("yumAsset_example"); // File | 
String yumAssetFilename = "yumAssetFilename_example"; // String | 
String dockerTag = "dockerTag_example"; // String | 
File dockerAsset = new File("dockerAsset_example"); // File | 
String rTag = "rTag_example"; // String | 
File rAsset = new File("rAsset_example"); // File | 
String rAssetPathId = "rAssetPathId_example"; // String | 
String pypiTag = "pypiTag_example"; // String | 
File pypiAsset = new File("pypiAsset_example"); // File | 
String aptTag = "aptTag_example"; // String | 
File aptAsset = new File("aptAsset_example"); // File | 
String rubygemsTag = "rubygemsTag_example"; // String | 
File rubygemsAsset = new File("rubygemsAsset_example"); // File | 
String npmTag = "npmTag_example"; // String | 
File npmAsset = new File("npmAsset_example"); // File | 
String nugetTag = "nugetTag_example"; // String | 
File nugetAsset = new File("nugetAsset_example"); // File | 
String helmTag = "helmTag_example"; // String | 
File helmAsset = new File("helmAsset_example"); // File | 
String rawDirectory = "rawDirectory_example"; // String | 
String rawTag = "rawTag_example"; // String | 
File rawAsset1 = new File("rawAsset1_example"); // File | 
String rawAsset1Filename = "rawAsset1Filename_example"; // String | 
File rawAsset2 = new File("rawAsset2_example"); // File | 
String rawAsset2Filename = "rawAsset2Filename_example"; // String | 
File rawAsset3 = new File("rawAsset3_example"); // File | 
String rawAsset3Filename = "rawAsset3Filename_example"; // String | 
String maven2GroupId = "maven2GroupId_example"; // String | 
String maven2ArtifactId = "maven2ArtifactId_example"; // String | 
String maven2Version = "maven2Version_example"; // String | 
Boolean maven2GeneratePom = true; // Boolean | 
String maven2Packaging = "maven2Packaging_example"; // String | 
String maven2Tag = "maven2Tag_example"; // String | 
File maven2Asset1 = new File("maven2Asset1_example"); // File | 
String maven2Asset1Classifier = "maven2Asset1Classifier_example"; // String | 
String maven2Asset1Extension = "maven2Asset1Extension_example"; // String | 
File maven2Asset2 = new File("maven2Asset2_example"); // File | 
String maven2Asset2Classifier = "maven2Asset2Classifier_example"; // String | 
String maven2Asset2Extension = "maven2Asset2Extension_example"; // String | 
File maven2Asset3 = new File("maven2Asset3_example"); // File | 
String maven2Asset3Classifier = "maven2Asset3Classifier_example"; // String | 
String maven2Asset3Extension = "maven2Asset3Extension_example"; // String | 
try {
    apiInstance.uploadComponent(repository, yumDirectory, yumTag, yumAsset, yumAssetFilename, dockerTag, dockerAsset, rTag, rAsset, rAssetPathId, pypiTag, pypiAsset, aptTag, aptAsset, rubygemsTag, rubygemsAsset, npmTag, npmAsset, nugetTag, nugetAsset, helmTag, helmAsset, rawDirectory, rawTag, rawAsset1, rawAsset1Filename, rawAsset2, rawAsset2Filename, rawAsset3, rawAsset3Filename, maven2GroupId, maven2ArtifactId, maven2Version, maven2GeneratePom, maven2Packaging, maven2Tag, maven2Asset1, maven2Asset1Classifier, maven2Asset1Extension, maven2Asset2, maven2Asset2Classifier, maven2Asset2Extension, maven2Asset3, maven2Asset3Classifier, maven2Asset3Extension);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#uploadComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| Name of the repository to which you would like to upload the component |
 **yumDirectory** | **String**|  | [optional]
 **yumTag** | **String**|  | [optional]
 **yumAsset** | **File**|  | [optional]
 **yumAssetFilename** | **String**|  | [optional]
 **dockerTag** | **String**|  | [optional]
 **dockerAsset** | **File**|  | [optional]
 **rTag** | **String**|  | [optional]
 **rAsset** | **File**|  | [optional]
 **rAssetPathId** | **String**|  | [optional]
 **pypiTag** | **String**|  | [optional]
 **pypiAsset** | **File**|  | [optional]
 **aptTag** | **String**|  | [optional]
 **aptAsset** | **File**|  | [optional]
 **rubygemsTag** | **String**|  | [optional]
 **rubygemsAsset** | **File**|  | [optional]
 **npmTag** | **String**|  | [optional]
 **npmAsset** | **File**|  | [optional]
 **nugetTag** | **String**|  | [optional]
 **nugetAsset** | **File**|  | [optional]
 **helmTag** | **String**|  | [optional]
 **helmAsset** | **File**|  | [optional]
 **rawDirectory** | **String**|  | [optional]
 **rawTag** | **String**|  | [optional]
 **rawAsset1** | **File**|  | [optional]
 **rawAsset1Filename** | **String**|  | [optional]
 **rawAsset2** | **File**|  | [optional]
 **rawAsset2Filename** | **String**|  | [optional]
 **rawAsset3** | **File**|  | [optional]
 **rawAsset3Filename** | **String**|  | [optional]
 **maven2GroupId** | **String**|  | [optional]
 **maven2ArtifactId** | **String**|  | [optional]
 **maven2Version** | **String**|  | [optional]
 **maven2GeneratePom** | **Boolean**|  | [optional]
 **maven2Packaging** | **String**|  | [optional]
 **maven2Tag** | **String**|  | [optional]
 **maven2Asset1** | **File**|  | [optional]
 **maven2Asset1Classifier** | **String**|  | [optional]
 **maven2Asset1Extension** | **String**|  | [optional]
 **maven2Asset2** | **File**|  | [optional]
 **maven2Asset2Classifier** | **String**|  | [optional]
 **maven2Asset2Extension** | **String**|  | [optional]
 **maven2Asset3** | **File**|  | [optional]
 **maven2Asset3Classifier** | **String**|  | [optional]
 **maven2Asset3Extension** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

