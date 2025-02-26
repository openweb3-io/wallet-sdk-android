package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.AccountsApi;
import io.openweb3.wallet.models.PageAccount;

public final class AccountsAPI {
    private final AccountsApi api;

    AccountsAPI() {
        api = new AccountsApi();
    }

    public PageAccount list(Integer page, Integer size) throws ApiException {
        try {
            return api.v1AccountsList(page, size);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }
}
