package com.emboava.analytics.data.di

import com.emboava.analytics.data.RoomAnalyticsRepository
import com.emboava.analytics.domain.AnalyticsRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val analyticsModule = module {
    singleOf(::RoomAnalyticsRepository).bind<AnalyticsRepository>()
}
