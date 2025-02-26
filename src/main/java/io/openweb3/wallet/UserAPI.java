package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.ApiClient;
import io.openweb3.wallet.internal.api.UserApi;
import io.openweb3.wallet.models.AuthResult;
import io.openweb3.wallet.models.Credentials;

public final class UserAPI {
    private final UserApi api;

    UserAPI() {
        api = new UserApi();
    }

    UserAPI(ApiClient apiClient) {
        api = new UserApi(apiClient);
    }

    public AuthResult auth(final String verifier, final String idToken) throws ApiException {
        Credentials credentials = new Credentials();
        credentials.setVerifier(verifier);
        credentials.putOptionsItem("id_token", idToken);

        try {
            return api.v1UsersAuth(credentials);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }
}
