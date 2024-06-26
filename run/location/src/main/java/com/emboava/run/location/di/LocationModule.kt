package com.emboava.run.location.di

import com.emboava.run.domain.LocationObserver
import com.emboava.run.location.AndroidLocationObserver
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val locationModule = module {
    singleOf(::AndroidLocationObserver).bind<LocationObserver>()
}
