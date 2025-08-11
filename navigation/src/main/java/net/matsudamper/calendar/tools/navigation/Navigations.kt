package net.matsudamper.calendar.tools.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Navigations : NavKey {
    @Serializable
    data object Home : Navigations

    @Serializable
    data object Move : Navigations

    @Serializable
    data object Register : Navigations
}
