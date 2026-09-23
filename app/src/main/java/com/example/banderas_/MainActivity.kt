package com.example.banderas_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.ui.res.colorResource


class MainActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaMexico(modifier = Modifier.padding(innerPadding),)
                }
            }
        }
    }

@Composable
fun BanderaMexico(modifier: Modifier = Modifier)
{
    Row (modifier = modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f) //Como el el Row hay 3 cajas 1f indica que cada caja tomara el valor de 1 (osea en 3 partes iguales)
                .fillMaxHeight()
                .background(colorResource(id = R.color.verde_bandera))
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.White),
            contentAlignment = Alignment.Center //Alinear el texto/Imagen en el centro
        ) {
            Image(
                painter = painterResource(id = R.drawable.mexico_escudo), //Los nombres de las imagenes siempre deben ser escritos en minusculas
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(80.dp)
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun BanderaPreview() {
    BanderaMexico()
}