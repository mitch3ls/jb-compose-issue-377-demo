import androidx.compose.desktop.Window
import androidx.compose.material.Text
import androidx.compose.material.Button

/*
the easiest way to reproduce this bug is:
 1. run `gradle packageAppImage`
 2. start app in build\compose\binaries\main\app-image\example\example.exe
 3. attach "Debug Packaged Application" configuration in debug mode
 -> continued in onClick callback below
 */

fun main() = Window {
    Button(onClick = { // 4. set breakpoint here
        // 5. click button in app
        // 6. evaluate `java.util.logging.Logger("foo")
        // works with `gradle run`
        // fails in packaged app
    }) {
        Text("click me")
    }
}