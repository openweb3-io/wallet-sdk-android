# CurrenciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1CurrenciesList**](CurrenciesApi.md#v1CurrenciesList) | **GET** /api/v1/currencies | List currencies |


<a id="v1CurrenciesList"></a>
# **v1CurrenciesList**
> CursorPageCurrency v1CurrenciesList(limit, cursor, rated)

List currencies

List currencies

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Credentials
    ApiKeyAuth Credentials = (ApiKeyAuth) defaultClient.getAuthentication("Credentials");
    Credentials.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Credentials.setApiKeyPrefix("Token");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    Integer limit = 56; // Integer | The number of items to return per page.
    String cursor = "cursor_example"; // String | The cursor to use for pagination.
    Boolean rated = true; // Boolean | 
    try {
      CursorPageCurrency result = apiInstance.v1CurrenciesList(limit, cursor, rated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#v1CurrenciesList");
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
| **limit** | **Integer**| The number of items to return per page. | |
| **cursor** | **String**| The cursor to use for pagination. | [optional] |
| **rated** | **Boolean**|  | [optional] |

### Return type

[**CursorPageCurrency**](CursorPageCurrency.md)

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

