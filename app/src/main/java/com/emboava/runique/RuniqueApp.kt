package com.emboava.runique

import android.app.Application
import android.content.Context
import com.emboava.auth.data.di.authDataModule
import com.emboava.auth.presentation.di.authViewModelModule
import com.emboava.core.data.di.coreDataModule
import com.emboava.core.database.di.databaseModule
import com.emboava.run.data.di.runDataModule
import com.emboava.run.location.di.locationModule
import com.emboava.run.network.di.networkModule
import com.emboava.run.presentation.di.runPresentationModule
import com.emboava.runique.di.appModule
import com.google.android.play.core.splitcompat.SplitCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            workManagerFactory()
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule,
                databaseModule,
                networkModule,
                runDataModule
            )
        }
    }
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        SplitCompat.install(this)
    }
}
