/*
 * Copyright (c) 2016 CA. All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 *
 */

package com.ca.mas.core.datasource;

import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SecureAccountManagerStoreDataSourceTest extends AccountManagerStoreDataSourceTest{

    @Override
    protected DataSource<?, ?> getDataSource(DataConverter dataConverter) {
        return DataSourceFactory.getStorage(getContext(),
                SecureAccountManagerStoreDataSource.class, param, dataConverter);
    }
}
