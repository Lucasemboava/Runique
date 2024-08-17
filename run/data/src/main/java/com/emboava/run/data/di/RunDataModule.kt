package com.emboava.run.data.di

import com.emboava.core.domain.run.SyncRunScheduler
import com.emboava.run.data.CreateRunWorker
import com.emboava.run.data.DeleteRunWorker
import com.emboava.run.data.FetchRunsWorker
import com.emboava.run.data.SyncRunWorkerScheduler
import com.emboava.run.data.connectivity.PhoneToWatchConnector
import com.emboava.run.domain.WatchConnector
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)

    singleOf(::SyncRunWorkerScheduler).bind<SyncRunScheduler>()
    singleOf(::PhoneToWatchConnector).bind<WatchConnector>()
}
