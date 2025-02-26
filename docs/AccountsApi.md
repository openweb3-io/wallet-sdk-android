# AccountsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AccountsList**](AccountsApi.md#v1AccountsList) | **GET** /api/v1/accounts | List accounts |


<a id="v1AccountsList"></a>
# **v1AccountsList**
> PageAccount v1AccountsList(page, size)

List accounts

List accounts

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Credentials
    ApiKeyAuth Credentials = (ApiKeyAuth) defaultClient.getAuthentication("Credentials");
    Credentials.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Credentials.setApiKeyPrefix("Token");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer size = 56; // Integer | 
    try {
      PageAccount result = apiInstance.v1AccountsList(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#v1AccountsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] |
| **size** | **Integer**|  | [optional] |

### Return type

[**PageAccount**](PageAccount.md)

### Authorization

[Credentials](../README.md#Credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **102** | Processing |  -  |
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

