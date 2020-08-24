# ApiPrivilegeScriptRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the privilege.  This value cannot be changed. |  [optional]
**description** | **String** |  |  [optional]
**actions** | [**List&lt;ActionsEnum&gt;**](#List&lt;ActionsEnum&gt;) | A collection of actions to associate with the privilege, using BREAD syntax (browse,read,edit,add,delete,all) as well as &#x27;run&#x27; for script privileges. |  [optional]
**scriptName** | **String** | The name of a script to give access to. |  [optional]

<a name="List<ActionsEnum>"></a>
## Enum: List&lt;ActionsEnum&gt;
Name | Value
---- | -----
READ | &quot;READ&quot;
BROWSE | &quot;BROWSE&quot;
EDIT | &quot;EDIT&quot;
ADD | &quot;ADD&quot;
DELETE | &quot;DELETE&quot;
RUN | &quot;RUN&quot;
ASSOCIATE | &quot;ASSOCIATE&quot;
DISASSOCIATE | &quot;DISASSOCIATE&quot;
ALL | &quot;ALL&quot;
