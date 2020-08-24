# YumAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repodataDepth** | **Integer** | Specifies the repository depth where repodata folder(s) are created | 
**deployPolicy** | [**DeployPolicyEnum**](#DeployPolicyEnum) | Validate that all paths are RPMs or yum metadata |  [optional]

<a name="DeployPolicyEnum"></a>
## Enum: DeployPolicyEnum
Name | Value
---- | -----
PERMISSIVE | &quot;PERMISSIVE&quot;
STRICT | &quot;STRICT&quot;
