package net.matsudamper.calendar.tools.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import net.matsudamper.calendar.tools.feature.move.ui.MoveScreen
import net.matsudamper.calendar.tools.ui.home.HomeScreen

@Composable
internal fun CalendarNavDisplay(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    NavDisplay(
        modifier = modifier,
        backStack = navController.backStack,
        entryProvider = { navigation ->
            when (navigation) {
                Navigations.Home -> NavEntry(navigation) {
                    HomeScreen(
                        navController = navController,
                    )
                }

                Navigations.Move -> NavEntry(navigation) {
                    MoveScreen()
                }

                Navigations.Register -> NavEntry(navigation) {
                    Text("Register Screen - Navigation3")
                }
            }
        },
    )
}
