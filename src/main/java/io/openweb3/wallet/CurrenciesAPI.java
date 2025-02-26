package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.CurrenciesApi;
import io.openweb3.wallet.models.CursorPageCurrency;

public final class CurrenciesAPI {
    private final CurrenciesApi api;

    CurrenciesAPI() {
        api = new CurrenciesApi();
    }

    public CursorPageCurrency list(Integer limit, String cursor, Boolean rated) throws ApiException {
        try {
            return api.v1CurrenciesList(limit, cursor, rated);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }
}
