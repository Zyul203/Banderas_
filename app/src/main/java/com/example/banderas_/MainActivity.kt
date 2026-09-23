package com.example.banderas_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                BanderaEspana(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}


@Composable
fun BanderaEspana(modifier: Modifier = Modifier)
{
    Row(modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxHeight().background(colorResource(id = R.color.azul_argentina)))
        Box(Modifier.weight(1f).fillMaxHeight().background(Color.White), contentAlignment = Alignment.Center)
        {
            Image(
                painter = painterResource(id = R.drawable.escudo_argentina),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(150.dp).rotate(270f)
            )
        }
        Box(Modifier.weight(1f).fillMaxHeight().background(colorResource(id = R.color.azul_argentina)))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    Surface {
        BanderaEspana()
    }
}