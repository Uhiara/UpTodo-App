package com.example.uptodoapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uptodoapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(visibilityProvider: () -> Boolean) {
    val appBarColors = TopAppBarDefaults.smallTopAppBarColors(
        containerColor = MaterialTheme.colorScheme.background
    )
    if (visibilityProvider()) {
        TopAppBar(
            colors = appBarColors,
            title = {
                Box(
                    Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Index", color = colorResource(id = R.color.display_small))
                }
            },
            navigationIcon = {
                IconButton(onClick = { }) {
                    Image(
                        painter = painterResource(id = R.drawable.sort),
                        contentDescription = "Menu"
                    )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Image(
                        modifier = Modifier.clip(RoundedCornerShape(30.dp)),
                        painter = painterResource(id = R.drawable.myimage),
                        contentDescription = "Menu"
                    )
                }
            },
        )
    }
}
