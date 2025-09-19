package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface {
                TaskManagerTheme {
                    Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                        TaskManagerPage()
                    }
                }
            }
        }
    }
}

@Composable
fun TaskManagerPage(modifier: Modifier = Modifier) {
 Column (
     modifier = modifier,
     horizontalAlignment = Alignment.CenterHorizontally,
     verticalArrangement = Arrangement.Center
 ) {
     val checkmarkImage = painterResource(R.drawable.ic_task_completed)
     Image(
         painter = checkmarkImage,
         contentDescription = null
     )
     Text(
         text = stringResource(R.string.completed),
         fontWeight = FontWeight.Bold,
         modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
     )
     Text(
         text = stringResource(R.string.compliment),
         fontSize = 16.sp
     )
 }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPagePreview() {
    TaskManagerTheme {
        TaskManagerPage()
    }
}