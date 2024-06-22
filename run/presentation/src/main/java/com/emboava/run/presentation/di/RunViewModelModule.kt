package com.emboava.run.presentation.di

import com.emboava.run.presentation.active_run.ActiveRunViewModel
import com.emboava.run.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val runViewModelModule = module {
    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}
