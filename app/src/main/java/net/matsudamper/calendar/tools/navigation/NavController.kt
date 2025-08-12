package net.matsudamper.calendar.tools.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation3.runtime.rememberNavBackStack

@Composable
fun rememberNavController(
    initialNavigation: Navigations = Navigations.Home,
): NavController {
    @Suppress("UNCHECKED_CAST")
    val backStack = rememberNavBackStack(initialNavigation)
            as SnapshotStateList<Navigations>
    return remember {
        NavController(
            backStack = backStack,
        )
    }
}

@Stable
class NavController(
    val backStack: SnapshotStateList<Navigations>,
) {
    fun navigate(navigation: Navigations) {
        backStack.add(navigation)
    }

    fun popBackStack() {
        if (backStack.isNotEmpty()) {
            backStack.removeAt(backStack.lastIndex)
        } else {
            // TODO アプリを閉じるとかBack
        }
    }
}
