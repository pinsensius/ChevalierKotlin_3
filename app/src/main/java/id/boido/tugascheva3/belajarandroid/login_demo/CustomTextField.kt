package id.boido.tugascheva3.belajarandroid.login_demo

import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    label : String,
    value : String,
    hint : String,
    onValueChange: (String) -> Unit,
    leadingIcon : @Composable (() -> Unit)
){
    Column(
        modifier = modifier
    ){
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge
        )
        OutlinedTextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            leadingIcon = leadingIcon,
            placeholder = {
                Text(text = hint)
            }
        )
    }
}

@Composable
fun CustomTextFieldWithTrailingIcon(
    modifier: Modifier = Modifier,
    label : String,
    value : String,
    hint : String,
    onValueChange: (String) -> Unit,
    leadingIcon : @Composable (() -> Unit),
    trailingIcon: @Composable (() -> Unit),
    visualTransformation: Any = if (value.isNotEmpty()) VisualTransformation.None else PasswordVisualTransformation(),
){
    Column(
        modifier = modifier
    ){
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge
        )
        OutlinedTextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            leadingIcon = leadingIcon,
            placeholder = {
                Text(text = hint)
            },
            trailingIcon = trailingIcon
        )

    }
}