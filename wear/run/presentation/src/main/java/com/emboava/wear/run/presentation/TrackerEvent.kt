package com.emboava.wear.run.presentation

sealed interface TrackerEvent {
    data object RunFinished: TrackerEvent
}