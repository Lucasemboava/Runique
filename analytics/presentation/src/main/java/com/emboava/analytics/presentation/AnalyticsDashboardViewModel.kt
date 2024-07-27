package com.emboava.analytics.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.emboava.analytics.domain.AnalyticsRepository
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AnalyticsDashboardViewModel(
    private val analyticsRepository: AnalyticsRepository
) : ViewModel() {
    var state by mutableStateOf<AnalyticsDashboardState?>(null)
        private set

    init {
        viewModelScope.launch {
            state = analyticsRepository.getAnalyticsValues().toAnalyticsDashboardState()
        }
    }
}
