package com.example.uptodoapp.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.uptodoapp.R
import com.example.uptodoapp.ui.theme.LightPurple


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommonPasswordTextField(
    modifier: Modifier,
    labelValue: String,
) {
    var password by remember { mutableStateOf("") }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(4.dp)),
        value = password,
        onValueChange = {
            password = it
        },
        trailingIcon = {
            TextButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                Text(
                    text = if (isPasswordVisible) "Hide" else "Show",
                    color = colorResource(id = R.color.text_medium)
                )
            }
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = LightPurple,
            focusedLabelColor = LightPurple,
            cursorColor = LightPurple,
        ),
        singleLine = true,
        label = {
            Text(text = labelValue)
        },
        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            autoCorrect = false,
            imeAction = ImeAction.Done,
        ),
    )
}