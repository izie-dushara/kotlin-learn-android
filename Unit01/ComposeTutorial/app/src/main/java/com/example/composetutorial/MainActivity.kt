package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTutorialTheme {
                Surface (modifier = Modifier.fillMaxSize(), color = Color.White){
                    ComposeTutorialPage()
                }
            }
        }
    }
}

@Composable
fun ComposeTutorialPage(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        val headerImage = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = headerImage,
            contentDescription = null,

        )
        Text(
            text = stringResource(R.string.page_title),
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )


        Text(
            text = stringResource(R.string.paragraph_one),
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )

        Text(
            text = stringResource(R.string.paragraph_two),
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeTutorialPagePreview() {
    ComposeTutorialTheme {
        ComposeTutorialPage()
    }
}