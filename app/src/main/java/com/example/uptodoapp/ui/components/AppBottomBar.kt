package com.example.uptodoapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uptodoapp.R
import com.example.uptodoapp.ui.navgraph.Routes


@Composable
fun AppBottomBar(
    visibilityProvider: () -> Boolean,
    selectedIconProvider: () -> Int,
    onBottomBarItemClicked: (routeName: String) -> Unit

) {
    val selectedIcon = selectedIconProvider()
    if (visibilityProvider()) {
        Box(modifier = Modifier.fillMaxWidth()) {
            BottomAppBar(
                modifier = Modifier.padding(top = 48.dp),
                containerColor = MaterialTheme.colorScheme.primary
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        Modifier
                            .wrapContentSize()
                            .padding(bottom = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        TextButton(
                            onClick = {
                                onBottomBarItemClicked(Routes.INDEX)
                            },
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.home),
                                contentDescription = "Home",
                                Modifier.size(26.dp),
                            )
                        }
                        Text(
                            text = "Home",
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.roboto_medium)),
                            color = colorResource(id = R.color.bar_color)
                        )
                    }

                    Column(
                        Modifier
                            .wrapContentSize()
                            .padding(bottom = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        TextButton(
                            onClick = {
                                onBottomBarItemClicked(Routes.CALENDER)
                            },
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.calendar),
                                contentDescription = "Calender",
                                Modifier.size(26.dp),
                            )
                        }
                        Text(
                            text = "Calender",
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.roboto_medium)),
                            color = colorResource(id = R.color.bar_color)
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .width(90.dp)
                    )

                    Column(
                        Modifier
                            .wrapContentSize()
                            .padding(bottom = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        TextButton(
                            onClick = {
                                onBottomBarItemClicked(Routes.FOCUS)
                            },
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.clock),
                                contentDescription = "Focus",
                                Modifier.size(26.dp),
                            )
                        }
                        Text(
                            text = "Focus",
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.roboto_medium)),
                            color = colorResource(id = R.color.bar_color)
                        )
                    }

                    Column(
                        Modifier
                            .wrapContentSize()
                            .padding(bottom = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        IconButton(
                            onClick = {
                                onBottomBarItemClicked(Routes.PROFILE)
                            },
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.user),
                                contentDescription = "Profile",
                                Modifier.size(26.dp),
                            )
                        }
                        Text(
                            text = "Profile",
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.roboto_medium)),
                            color = colorResource(id = R.color.bar_color)
                        )
                    }
                }
            }

            LargeFloatingActionButton(
                modifier = Modifier
                    .align(Alignment.TopCenter),
                containerColor = MaterialTheme.colorScheme.primary,
                onClick = { },
                shape = CircleShape,
            ) {
                Icon(
                    Icons.Filled.Add,
                    "Large floating action button",
                    tint = MaterialTheme.colorScheme.background
                )
            }
        }
    }
}

@Preview
@Composable
private fun AppBottomBarPreview() {
    AppBottomBar(
        visibilityProvider = { true },
        selectedIconProvider = { R.drawable.home }
    ) {

    }
}