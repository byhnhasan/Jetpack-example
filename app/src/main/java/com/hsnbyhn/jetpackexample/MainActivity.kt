package com.hsnbyhn.jetpackexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Spacing
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                    newStory()


            }
        }
    }
}

@Composable
fun newStory() {

    Container(height = 100.dp) {
        DrawImage(
            +imageResource(R.drawable.download)
        )
    }

    Column(Spacing(16.dp, 16.dp,0.dp,0.dp)) {

        Text(text = "Hello Android")
        Text(text = "How Are You?")
        Text(text = "Why so serious?")
        Button(text = "Button")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        newStory()
    }
}