# SamlConfigurationXO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | SAML Service Provider&#x27;s unique identifying URI |  [optional]
**idpMetadata** | **String** | SAML Identity Provider Metadata XML | 
**usernameAttribute** | **String** | SAML attribute name for the username | 
**firstNameAttribute** | **String** | SAML attribute name for the first name |  [optional]
**lastNameAttribute** | **String** | SAML attribute name for the last name |  [optional]
**emailAttribute** | **String** | SAML attribute name for email |  [optional]
**groupsAttribute** | **String** | SAML attribute name for groups which maps the Identity Provider groups to a Nexus Repository Manager role |  [optional]
**validateResponseSignature** | **Boolean** | Validate signatures on responses from Identity Provider |  [optional]
**validateAssertionSignature** | **Boolean** | Validate signatures on assertions from Identity Provider |  [optional]
