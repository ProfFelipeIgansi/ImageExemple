package com.example.imageexemple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imageexemple.ui.theme.ImageExempleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageExempleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowImage(innerPadding)
                }
            }
        }
    }

    @Composable
    private fun ShowImage(innerPadding: PaddingValues) {
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.login_avatar),
                contentDescription = "",
                contentScale = ContentScale.Inside
            )
          /*  Icon(
                painter = painterResource(id = R.drawable.jetpack_compose_image),
                contentDescription = "",
                tint = Color.Blue,
                modifier = Modifier.size(500.dp)
            )*/
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun ShowImagePreview() {
        ShowImage(innerPadding = PaddingValues())
    }
}
