package net.matsudamper.calendar.tools

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation3.runtime.rememberNavBackStack
import net.matsudamper.calendar.tools.navigation.Navigations
import net.matsudamper.calendar.tools.ui.CalendarNavDisplay
import net.matsudamper.calendar.tools.ui.theme.CalendarToolsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalendarToolsTheme {
                @Suppress("UNCHECKED_CAST")
                val backStack = rememberNavBackStack<Navigations>(Navigations.Home)
                        as SnapshotStateList<Navigations>
                CalendarNavDisplay(
                    backStack = backStack
                )
            }
        }
    }
}
