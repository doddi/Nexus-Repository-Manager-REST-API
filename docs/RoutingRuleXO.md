# RoutingRuleXO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Determines what should be done with requests when their path matches any of the matchers |  [optional]
**matchers** | **List&lt;String&gt;** | Regular expressions used to identify request paths that are allowed or blocked (depending on mode) |  [optional]

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
BLOCK | &quot;BLOCK&quot;
ALLOW | &quot;ALLOW&quot;
