package net.matsudamper.calendar.tools.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import net.matsudamper.calendar.tools.navigation.Navigations
import net.matsudamper.calendar.tools.ui.home.HomeScreen

@Composable
internal fun CalendarNavDisplay(
    backStack: SnapshotStateList<Navigations>,
    modifier: Modifier = Modifier,
) {
    NavDisplay(
        modifier = modifier,
        backStack = backStack,
        entryProvider = { navigation ->
            when (navigation) {
                Navigations.Home -> NavEntry(navigation) {
                    HomeScreen()
                }

                Navigations.Move -> NavEntry(navigation) {
                    Text("Move Screen - Navigation3")
                }

                Navigations.Register -> NavEntry(navigation) {
                    Text("Register Screen - Navigation3")
                }
            }
        },
    )
}
