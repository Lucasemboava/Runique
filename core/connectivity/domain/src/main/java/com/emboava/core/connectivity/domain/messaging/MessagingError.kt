package com.emboava.core.connectivity.domain.messaging

import com.emboava.core.domain.util.Error

enum class MessagingError : Error {
    CONNECTION_INTERRUPTED,
    DISCONNECTED,
    UNKNOWN
}
