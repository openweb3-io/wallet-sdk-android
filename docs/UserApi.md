# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1UsersAuth**](UserApi.md#v1UsersAuth) | **POST** /api/v1/users/auth | User auth |


<a id="v1UsersAuth"></a>
# **v1UsersAuth**
> AuthResult v1UsersAuth(request)

User auth

User auth

### Example
```java
// Import classes:
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.models.*;
import io.openweb3.wallet.internal.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserApi apiInstance = new UserApi(defaultClient);
    Credentials request = new Credentials(); // Credentials | Request body
    try {
      AuthResult result = apiInstance.v1UsersAuth(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#v1UsersAuth");
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
| **request** | [**Credentials**](Credentials.md)| Request body | |

### Return type

[**AuthResult**](AuthResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

