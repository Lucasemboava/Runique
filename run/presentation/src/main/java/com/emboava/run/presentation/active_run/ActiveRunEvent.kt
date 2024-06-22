package com.emboava.run.presentation.active_run

import com.emboava.core.presentation.ui.UiText

interface ActiveRunEvent {
    data class Error(val error: UiText) : ActiveRunEvent
    data object RunSaved : ActiveRunEvent
}
