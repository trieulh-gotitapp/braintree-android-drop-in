package com.braintreepayments.api;

import com.braintreepayments.api.internal.BraintreeHttpClient;

public class BraintreeFragmentTestUtils {

    public static void setHttpClient(BraintreeFragment fragment, BraintreeHttpClient httpClient) {
        fragment.mHttpClient = httpClient;
    }

    public static String getIntegrationType(BraintreeFragment fragment) {
        return fragment.mIntegrationType;
    }
}
