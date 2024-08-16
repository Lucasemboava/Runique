package com.emboava.run.domain

import com.emboava.core.connectivity.domain.DeviceNode
import kotlinx.coroutines.flow.StateFlow

interface WatchConnector {
    val connectedDevice: StateFlow<DeviceNode?>
    fun setIsTrackable(isTrackable: Boolean)
}
