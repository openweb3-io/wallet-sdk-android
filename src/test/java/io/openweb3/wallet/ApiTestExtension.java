package io.openweb3.wallet;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.opentest4j.TestAbortedException;

import java.lang.reflect.Field;

public class ApiTestExtension implements BeforeEachCallback {
    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        Object testInstance = context.getRequiredTestInstance();
        Field apiField = testInstance.getClass().getDeclaredField("api");
        apiField.setAccessible(true);

        APIClient api = (APIClient) apiField.get(testInstance);
        if (api == null) {
            throw new TestAbortedException("Skipping test because API client is not initialized");
        }
    }
}
