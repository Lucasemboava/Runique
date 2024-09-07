package com.emboava.core.data.di

import com.emboava.core.data.auth.EncryptedSessionStorage
import com.emboava.core.data.networking.HttpClientFactory
import com.emboava.core.data.run.OfflineFirstRunRepository
import com.emboava.core.domain.SessionStorage
import com.emboava.core.domain.run.RunRepository
import io.ktor.client.engine.cio.CIO
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory(get()).build(CIO.create())
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()

    singleOf(::OfflineFirstRunRepository).bind<RunRepository>()
}
