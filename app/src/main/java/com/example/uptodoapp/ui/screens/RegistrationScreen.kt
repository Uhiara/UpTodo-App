package com.example.uptodoapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.uptodoapp.R
import com.example.uptodoapp.ui.common.CommonButton
import com.example.uptodoapp.ui.common.CommonPasswordTextField
import com.example.uptodoapp.ui.common.CommonText
import com.example.uptodoapp.ui.common.CommonTextField
import com.example.uptodoapp.ui.common.SocialMediaButton
import com.example.uptodoapp.ui.navgraph.Routes


@Composable
fun RegistrationScreen(
    navController: NavHostController,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Spacer(modifier = Modifier.weight(0.2f))

            TextButton(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Routes.WELCOME_SCREEN)
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow_back),
                    contentDescription = "back"
                )
            }

            Spacer(modifier = Modifier.weight(0.4f))

            CommonText(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                textValue = "Register",
                textSize = 32.sp,
                lineHeight = 38.sp,
                fontWeight = FontWeight(700),
                colorValue = colorResource(id = R.color.text_medium),
                fontFamily = FontFamily(Font(R.font.roboto_bold)),
                textAlign = TextAlign.Start,
            )

            Spacer(modifier = Modifier.weight(0.6f))

            CommonText(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                textValue = "Username",
                textSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(400),
                colorValue = colorResource(id = R.color.text_medium),
                fontFamily = FontFamily(Font(R.font.roboto_regular)),
                textAlign = TextAlign.Start
            )

            CommonTextField(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                labelValue = "Enter your username"
            )

            Spacer(modifier = Modifier.weight(0.3f))

            CommonText(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                textValue = "Password",
                textSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(400),
                colorValue = colorResource(id = R.color.text_medium),
                fontFamily = FontFamily(Font(R.font.roboto_regular)),
                textAlign = TextAlign.Start
            )

            CommonPasswordTextField(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                labelValue = "Password",
            )

            Spacer(modifier = Modifier.weight(0.3f))

            CommonPasswordTextField(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                labelValue = "Confirm Password",
            )

            Spacer(modifier = Modifier.weight(0.65f))

            CommonButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                text = "Register",
                onClick = {
                    //TODO: Navigate to
                }
            )

            Spacer(modifier = Modifier.weight(0.35f))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Divider(
                    color = colorResource(id = R.color.text_medium),
                    thickness = 1.dp,
                    modifier = Modifier.weight(0.5f)
                )

                Text(text = "or", modifier = Modifier.padding(start = 1.dp, end = 1.dp))

                Divider(
                    color = colorResource(id = R.color.text_medium),
                    thickness = 1.dp,
                    modifier = Modifier.weight(0.5f)
                )
            }

            Spacer(modifier = Modifier.weight(0.35f))

            SocialMediaButton(
                icon = R.drawable.google_logo,
                text = "Register with Google",
                onClick = {
                })

            Spacer(modifier = Modifier.weight(0.2f))

            SocialMediaButton(
                icon = R.drawable.apple,
                text = "Register with Apple",
                onClick = {
                    // TODO:
                }
            )

            Spacer(modifier = Modifier.weight(0.5f))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Already have an account?",
                    color = colorResource(id = R.color.text_medium),
                    fontSize = 14.sp,
                )

                TextButton(onClick = {
                    navController.popBackStack()
                    navController.navigate(Routes.LOGIN_SCREEN)
                }) {
                    Text(
                        text = "Login",
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 14.sp,
                    )
                }
            }

            Spacer(modifier = Modifier.weight(0.25f))
        }
    }
}

@Preview
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen(rememberNavController())
}