package com.emboava.auth.domain

import com.emboava.core.domain.util.DataError
import com.emboava.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun login(email: String, password: String): EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}