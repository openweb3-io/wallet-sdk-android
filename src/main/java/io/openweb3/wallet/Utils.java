package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;

final class Utils {

    public static ApiException WrapInternalApiException(final io.openweb3.wallet.internal.ApiException e) {
        return new ApiException(e.getMessage(), e, e.getCode(), e.getResponseHeaders(), e.getResponseBody());
    }
}
