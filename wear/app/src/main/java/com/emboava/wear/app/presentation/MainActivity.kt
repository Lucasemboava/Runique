package com.emboava.wear.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.emboava.core.notification.ActiveRunService
import com.emboava.core.presentation.designsystem_wear.RuniqueTheme
import com.emboava.wear.run.presentation.TrackerScreenRoot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        setContent {
            RuniqueTheme {
                TrackerScreenRoot(
                    onServiceToggle = { shouldStartRunning ->
                        if(shouldStartRunning) {
                            startService(
                                ActiveRunService.createStartIntent(
                                    applicationContext, this::class.java
                                )
                            )
                        } else {
                            startService(
                                ActiveRunService.createStopIntent(applicationContext)
                            )
                        }
                    }
                )
            }
        }
    }
}