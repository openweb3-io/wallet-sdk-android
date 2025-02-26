package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.WalletsApi;
import io.openweb3.wallet.models.ListBalanceHistoryResponse;
import io.openweb3.wallet.models.Balance;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class WalletsAPI {
    private final WalletsApi api;

    WalletsAPI() {
        api = new WalletsApi();
    }

    public Balance getBalance() throws ApiException {
        try {
            return api.v1WalletsGetBalance();
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }

    // find by code
    public ListBalanceHistoryResponse listBalanceHistory(final Date beginAt, final Date endAt) throws ApiException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneOffset.UTC);
            String beginAtStr = formatter.format(beginAt.toInstant());
            String endAtStr = formatter.format(endAt.toInstant());
            return api.v1WalletsListBalanceHistory(beginAtStr, endAtStr);
        } catch (io.openweb3.wallet.internal.ApiException e) {
            throw Utils.WrapInternalApiException(e);
        }
    }
}
