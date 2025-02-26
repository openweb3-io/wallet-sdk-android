package io.openweb3.wallet;

import io.openweb3.wallet.internal.ApiException;
import io.openweb3.wallet.models.Balance;
import io.openweb3.wallet.models.CursorPageCurrency;
import io.openweb3.wallet.models.ListBalanceHistoryResponse;
import io.openweb3.wallet.models.PageAccount;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Date;

@ExtendWith(ApiTestExtension.class)
public class APIClientTest {

    private static APIClient api;

    @BeforeAll
    static void setUp() throws Exception {
        String serverUrl = System.getenv("SERVER_URL");
        String verifier = System.getenv("VERIFIER");
        String idToken = System.getenv("ID_TOKEN");

        APIClientOptions options = new APIClientOptions();
        options.debug(true);
        options.serverUrl(serverUrl);
        options.verifier(verifier);
        options.idToken(idToken);
        try {
            api = new APIClient(options);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get wallet balance
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1WalletsGetBalanceTest() throws ApiException {
        Balance response = api.getWallet().getBalance();
        assert response != null;
        System.out.println(response);
    }

    /**
     * Get wallet balance
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1WalletsListBalanceHistoryTest() throws ApiException {
        Date after = new java.util.Date();
        Date before = new java.util.Date();
        ListBalanceHistoryResponse response = api.getWallet().listBalanceHistory(after, before);
        assert response != null;
        System.out.println(response);
    }

    /**
     * Get accounts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AccountsListTest() throws ApiException {
        PageAccount response = api.getAccount().list(0, 20);
        assert response != null;
        System.out.println(response);
    }

    /**
     * Get accounts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1CurrenciesListTest() throws ApiException {
        CursorPageCurrency response = api.getCurrency().list(100, "", true);
        assert response != null;
        System.out.println(response);
    }
}
