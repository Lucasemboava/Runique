package com.emboava.run.presentation.di

import com.emboava.run.domain.RunningTracker
import com.emboava.run.presentation.active_run.ActiveRunViewModel
import com.emboava.run.presentation.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val runPresentationModule = module {
    singleOf(::RunningTracker)
    single {
        get<RunningTracker>().elapsedTime
    }

    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}
