package com.example.uptodoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.uptodoapp.ui.theme.UpTodoAppTheme
import com.example.uptodoapp.ui.navgraph.TodoNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UpTodoAppTheme {
                UpTodoApp()
            }
        }
    }
}

@Composable
fun UpTodoApp() {
    TodoNavGraph()
}