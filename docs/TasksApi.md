# TasksApi

All URIs are relative to */service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTaskById**](TasksApi.md#getTaskById) | **GET** /v1/tasks/{id} | Get a single task by id
[**getTasks**](TasksApi.md#getTasks) | **GET** /v1/tasks | List tasks
[**run**](TasksApi.md#run) | **POST** /v1/tasks/{id}/run | Run task
[**stop**](TasksApi.md#stop) | **POST** /v1/tasks/{id}/stop | Stop task

<a name="getTaskById"></a>
# **getTaskById**
> TaskXO getTaskById(id)

Get a single task by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TasksApi;


TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | Id of the task to get
try {
    TaskXO result = apiInstance.getTaskById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the task to get |

### Return type

[**TaskXO**](TaskXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTasks"></a>
# **getTasks**
> PageTaskXO getTasks(type)

List tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TasksApi;


TasksApi apiInstance = new TasksApi();
String type = "type_example"; // String | Type of the tasks to get
try {
    PageTaskXO result = apiInstance.getTasks(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Type of the tasks to get | [optional]

### Return type

[**PageTaskXO**](PageTaskXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="run"></a>
# **run**
> run(id)

Run task

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TasksApi;


TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | Id of the task to run
try {
    apiInstance.run(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#run");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the task to run |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stop"></a>
# **stop**
> stop(id)

Stop task

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TasksApi;


TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | Id of the task to stop
try {
    apiInstance.stop(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#stop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the task to stop |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

