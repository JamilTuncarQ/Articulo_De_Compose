package com.example.articulodecompose

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulodecompose.ui.theme.ArticuloDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            ArticuloDeComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.onBackground
                ) {
                    GreetingArticulo(
                        message1 = stringResource(R.string.jetpack_compose_tutorial),
                        message2 = stringResource(R.string.texto_2),
                        message3 = stringResource(R.string.texto_3)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingArticulo(message1: String, message2:String, message3: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column (
        //verticalArrangement = Arrangement.Center,
        modifier = modifier
            //.fillMaxSize()
            //.fillMaxHeight()
    ){
        Image(painter = image,
            contentDescription = null,
            //contentScale = ContentScale.Fit,
            modifier = Modifier
                //.fillMaxWidth()

        )
        Text(
            text = message1,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)

        )
        Text(
            text = message2,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = message3,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArticuloDeComposeTheme {
        GreetingArticulo(
            message1 = stringResource(R.string.jetpack_compose_tutorial),
            message2 = stringResource(R.string.texto_2),
            message3 = stringResource(R.string.texto_3)
        )
    }
}