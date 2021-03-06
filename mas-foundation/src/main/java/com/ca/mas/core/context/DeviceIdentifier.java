/*
 * Copyright (c) 2016 CA. All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 *
 */
package com.ca.mas.core.context;

import android.content.Context;

import java.security.InvalidAlgorithmParameterException;

public class DeviceIdentifier extends UniqueIdentifier {

    /**
     * Generates a set of asymmetric keys in the Android keystore and builds the device identifier off of the public key.
     * Apps built with the same sharedUserId value in AndroidManifest.xml will reuse the same identifier.
     * @param context
     */
    public DeviceIdentifier(Context context) throws
            InvalidAlgorithmParameterException, java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException,
            java.security.NoSuchProviderException, java.security.cert.CertificateException, java.security.UnrecoverableKeyException {
        super(context);
    }

    @Override
    protected String getIdentifierKey() {
        return "com.ca.mas.foundation.msso.DEVICE_IDENTIFIER";
    }

}
