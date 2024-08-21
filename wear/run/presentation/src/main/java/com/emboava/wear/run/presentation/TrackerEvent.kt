package com.emboava.wear.run.presentation

import com.emboava.core.presentation.ui.UiText

sealed interface TrackerEvent {
    data object RunFinished : TrackerEvent
    data class Error(val message: UiText) : TrackerEvent
}
