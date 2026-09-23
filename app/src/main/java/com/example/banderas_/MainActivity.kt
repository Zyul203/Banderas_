package com.example.banderas_
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment //ALIGN
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip //CLIP


class MainActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaJapon(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}

@Composable
fun BanderaJapon(modifier: Modifier = Modifier)
{
    Box (modifier = modifier.fillMaxSize())
    {
        Box( //Box del fondo
            modifier = Modifier
                .fillMaxSize() //Para que ocupe tdo el espacio del BOX principal
                .background(Color.White)
        )
        {
            Box( //Box del circulo
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(200.dp)
                    .clip(CircleShape)
                    .background(Color.Red)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaJaponPreview() {
    Surface {
        BanderaJapon()
    }
}