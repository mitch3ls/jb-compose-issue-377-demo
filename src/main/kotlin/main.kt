import androidx.compose.desktop.Window
import androidx.compose.material.Text
import java.util.logging.Level
import java.util.logging.Logger

/*
    here it's all about seeing the app crash
    1. run `gradle run` to see the app running normally
    2. run `gradle packageAppImage` to build the packaged app
    3. start app in build\compose\binaries\main\app-image\example\example.exe
    4. see it crash
 */

val logger = Logger.getLogger("Example")

fun main() {
    logger.log(Level.ALL, "App started")

    Window {
        Text("dummy")
    }
}