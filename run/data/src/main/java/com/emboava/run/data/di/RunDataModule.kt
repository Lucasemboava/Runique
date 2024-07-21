package com.emboava.run.data.di

import com.emboava.core.domain.run.SyncRunScheduler
import com.emboava.run.data.CreateRunWorker
import com.emboava.run.data.DeleteRunWorker
import com.emboava.run.data.FetchRunsWorker
import com.emboava.run.data.SyncRunWorkerScheduler
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)

    singleOf(::SyncRunWorkerScheduler).bind<SyncRunScheduler>()
}
