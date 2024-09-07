package com.emboava.android_test

import com.emboava.core.domain.AuthInfo
import com.emboava.core.domain.SessionStorage

class SessionStorageFake: SessionStorage {

    private var authInfo: AuthInfo? = null

    override suspend fun get(): AuthInfo? {
        return authInfo
    }

    override suspend fun set(info: AuthInfo?) {
        authInfo = info
    }
}
