# WalletsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1WalletsGetBalance**](WalletsApi.md#v1WalletsGetBalance) | **GET** /api/v1/wallets/balance | Get wallet balance history |
| [**v1WalletsListBalanceHistory**](WalletsApi.md#v1WalletsListBalanceHistory) | **GET** /api/v1/wallets/balance_history | List wallet balance history |


<a id="v1WalletsGetBalance"></a>
# **v1WalletsGetBalance**
> Balance v1WalletsGetBalance()

Get wallet balance history

Get wallet balance history

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Credentials
    ApiKeyAuth Credentials = (ApiKeyAuth) defaultClient.getAuthentication("Credentials");
    Credentials.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Credentials.setApiKeyPrefix("Token");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    try {
      Balance result = apiInstance.v1WalletsGetBalance();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#v1WalletsGetBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Balance**](Balance.md)

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
| **500** | Internal Server Error |  -  |

<a id="v1WalletsListBalanceHistory"></a>
# **v1WalletsListBalanceHistory**
> ListBalanceHistoryResponse v1WalletsListBalanceHistory(beginAt, endAt)

List wallet balance history

List wallet balance history

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.auth.*;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Credentials
    ApiKeyAuth Credentials = (ApiKeyAuth) defaultClient.getAuthentication("Credentials");
    Credentials.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Credentials.setApiKeyPrefix("Token");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    String beginAt = "beginAt_example"; // String | RFC 3339
    String endAt = "endAt_example"; // String | RFC 3339
    try {
      ListBalanceHistoryResponse result = apiInstance.v1WalletsListBalanceHistory(beginAt, endAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#v1WalletsListBalanceHistory");
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
| **beginAt** | **String**| RFC 3339 | |
| **endAt** | **String**| RFC 3339 | |

### Return type

[**ListBalanceHistoryResponse**](ListBalanceHistoryResponse.md)

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

