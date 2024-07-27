package com.emboava.analytics.presentation

sealed interface AnalyticsAction {
    data object OnBackClick: AnalyticsAction
}
