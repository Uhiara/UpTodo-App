package com.example.uptodoapp.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.uptodoapp.ui.theme.LightPurple


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommonTextField(
    modifier: Modifier,
    labelValue: String,
) {
    val focusManager = LocalFocusManager.current

    var username by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(4.dp)),
        value = username,
        onValueChange = {
            username = it
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
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next,
        ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Down) }
        ),
    )
}