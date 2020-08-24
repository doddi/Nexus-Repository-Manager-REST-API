# HttpClientConnectionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retries** | **Integer** | Total retries if the initial connection attempt suffers a timeout |  [optional]
**userAgentSuffix** | **String** | Custom fragment to append to User-Agent header in HTTP requests |  [optional]
**timeout** | **Integer** | Seconds to wait for activity before stopping and retrying the connection |  [optional]
**enableCircularRedirects** | **Boolean** | Whether to enable redirects to the same location (may be required by some servers) |  [optional]
**enableCookies** | **Boolean** | Whether to allow cookies to be stored and used |  [optional]
