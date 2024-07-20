package com.emboava.run.data.di

import com.emboava.run.data.CreateRunWorker
import com.emboava.run.data.DeleteRunWorker
import com.emboava.run.data.FetchRunsWorker
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)
}
