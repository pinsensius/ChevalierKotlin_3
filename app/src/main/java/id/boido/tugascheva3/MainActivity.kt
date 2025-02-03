package id.boido.tugascheva3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.boido.tugascheva3.belajarandroid.login_demo.LoginScreen
import id.boido.tugascheva3.ui.theme.TugasCheva3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasCheva3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    LoginScreen()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasCheva3Theme {
        LoginScreen()
    }
}