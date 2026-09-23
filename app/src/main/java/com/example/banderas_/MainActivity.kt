package com.example.banderas_
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment //ALIGN
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip //CLIP
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.draw.rotate //Rotar imagen
import androidx.compose.ui.res.colorResource


class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaBrasil(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}



val RombosShape = GenericShape { size, _ ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height / 2f)
    lineTo(size.width / 2f, size.height)
    lineTo(0f, size.height / 2f)
    close()
}


@Composable
fun BanderaBrasil(modifier: Modifier = Modifier)
{
    Box( modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.verde_brasil)), //Para el contentAlignment se usa coma
        contentAlignment = Alignment.Center //Para centrar tdo el contenido del BOX
    ) {
        Box( modifier = Modifier
            .fillMaxSize(0.75f)
            .clip(RombosShape)
            .background(colorResource(id = R.color.amarillo_brasil)),
            contentAlignment = Alignment.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.escudo_brasil),
                contentDescription = "Escudo Brasil",
                modifier = Modifier.size(500.dp).rotate(270f) //Tamaño y Orientacio
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaBrasilPreview()
{
    Surface{
        BanderaBrasil()
    }
}