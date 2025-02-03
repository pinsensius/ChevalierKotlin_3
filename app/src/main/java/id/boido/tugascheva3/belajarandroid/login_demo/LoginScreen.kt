package id.boido.tugascheva3.belajarandroid.login_demo

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var passwordVisible by remember {
         mutableStateOf(false)
    }

    val context = LocalContext.current

    Surface {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text = "Login",
                fontSize = 24.sp
            )
            Text(
                text = "Login menggunakan username dan password anda."
            )
            CustomTextField(
                modifier = Modifier.fillMaxWidth(),
                label = "Username",
                value = username,
                hint = "Masukan username anda",
                onValueChange = {
                        text -> username = text
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Username"
                    )
                }
            )
            CustomTextField(
                modifier = Modifier.fillMaxWidth(),
                label = "E-mail",
                value = password,
                hint = "Masukan e-mail anda",
                onValueChange = {
                        text -> password = text
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "E-mail"
                    )
                }
            )

            CustomTextFieldWithTrailingIcon(
                modifier = Modifier.fillMaxWidth(),
                label = "Password",
                value = if(passwordVisible) "*".repeat(password.length) else password,
                hint = "Masukan password anda",
                onValueChange = {
                    if (!passwordVisible) password = it
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Password"
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = if(passwordVisible) Icons.Default.Lock else Icons.Default.Face,
                        contentDescription = if(passwordVisible) "Hide Password" else "Show Password",
                        modifier = modifier.clickable {
                            passwordVisible = !passwordVisible

                            Toast.makeText(context, if (passwordVisible) "Hide Password!" else "Show Password!", Toast.LENGTH_SHORT).show()
                        }

                    )
                }
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    Toast.makeText(context, "404 Server Not Found!", Toast.LENGTH_SHORT).show()
                }
            ) {
                Text(
                    text = "Login"
                )
            }

        }
    }

}

@Preview
@Composable
private fun LoginScreenPrev(){
    LoginScreen()
}