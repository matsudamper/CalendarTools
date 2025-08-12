package net.matsudamper.calendar.tools

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import net.matsudamper.calendar.tools.navigation.Navigations
import net.matsudamper.calendar.tools.navigation.CalendarNavDisplay
import net.matsudamper.calendar.tools.navigation.rememberNavController
import net.matsudamper.calendar.tools.ui.theme.CalendarToolsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalendarToolsTheme {
                CalendarNavDisplay(
                    navController = rememberNavController(Navigations.Home),
                )
            }
        }
    }
}
