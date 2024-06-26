package com.emboava.run.location

import android.location.Location
import com.emboava.core.domain.location.LocationWithAltitude

fun Location.toLocationWithAltitude(): LocationWithAltitude {
    return LocationWithAltitude(
        location = com.emboava.core.domain.location.Location(
            lat = latitude,
            long = longitude
        ),

        altitude = altitude
    )
}
