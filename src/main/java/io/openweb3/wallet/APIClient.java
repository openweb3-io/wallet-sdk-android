package io.openweb3.wallet;

import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.ApiCallback;
import io.openweb3.wallet.internal.Configuration;
import io.openweb3.wallet.internal.ProgressResponseBody;
import io.openweb3.wallet.models.AuthResult;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import okhttp3.Interceptor;
import okhttp3.Response;
import io.openweb3.wallet.exceptions.ApiException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class APIClient {
    public static final String VERSION = "0.0.3";

    private final AccountsAPI account;
    private final CurrenciesAPI currency;
    private final WalletsAPI wallet;

    public APIClient(final String verifier, final String idToken) throws Exception {
        this(new APIClientOptions().verifier(verifier).idToken(idToken));
    }

    public APIClient(final APIClientOptions options) throws Exception {
        if (options.getVerifier() == null || options.getIdToken() == null) {
            throw new IllegalArgumentException("Verifier and IdToken are required");
        }

        String authorization = getAuthorization(options);

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.readTimeout(300, TimeUnit.SECONDS)
                .writeTimeout(300, TimeUnit.SECONDS)
                .connectTimeout(300, TimeUnit.SECONDS)
                .addNetworkInterceptor(getProgressInterceptor())
                .addInterceptor(new Interceptor() {
                    @NotNull
                    @Override
                    public Response intercept(@NotNull Chain chain) throws IOException {
                        Request originalRequest = chain.request();
                        Request.Builder builder = originalRequest.newBuilder();
                        
                        builder.header("Authorization", authorization);

                        Request newRequest = builder.build();
                        return chain.proceed(newRequest);
                    }
                });

        ApiClient apiClient = new ApiClient(httpClientBuilder.build());
        apiClient.setDebugging(options.getDebug());
        apiClient.setBasePath(options.getServerUrl());
        apiClient.setUserAgent(String.format("wallet-libs/%s/java", VERSION));

        Configuration.setDefaultApiClient(apiClient);

        this.account = new AccountsAPI();
        this.currency = new CurrenciesAPI();
        this.wallet = new WalletsAPI();
    }

    private String getAuthorization(APIClientOptions options) throws ApiException {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        ApiClient apiClient = new ApiClient(httpClientBuilder.build());
        apiClient.setBasePath(options.getServerUrl());

        UserAPI userApi = new UserAPI(apiClient);
        AuthResult authResult = userApi.auth(options.getVerifier(), options.getIdToken());
        return authResult.getAccessToken();
    }

    private Interceptor getProgressInterceptor() {
        return new Interceptor() {
            @NotNull
            @Override
            public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
                final Request request = chain.request();
                final Response originalResponse = chain.proceed(request);
                if (request.tag() instanceof ApiCallback) {
                    final ApiCallback callback = (ApiCallback) request.tag();
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), callback))
                            .build();
                }
                return originalResponse;
            }
        };
    }

    public AccountsAPI getAccount() {
        return account;
    }

    public CurrenciesAPI getCurrency() {
        return currency;
    }

    public WalletsAPI getWallet() {
        return wallet;
    }
}
