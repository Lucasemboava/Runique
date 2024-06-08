package com.emboava.auth.data

import com.emboava.auth.domain.AuthRepository
import com.emboava.core.data.networking.post
import com.emboava.core.domain.util.DataError
import com.emboava.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {
    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}