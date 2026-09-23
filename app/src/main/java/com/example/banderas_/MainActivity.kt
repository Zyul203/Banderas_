package com.example.banderas_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp

import androidx.compose.material.icons.Icons //Libreria de Iconos
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.draw.rotate // Rotar
import androidx.compose.ui.res.colorResource

class MainActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                BanderaEstadosUnidos(modifier = Modifier.padding(innerPadding))
            }

        }
    }
}


@Composable
fun BanderaEstadosUnidos(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        Row(modifier = Modifier.fillMaxSize()) {
            repeat(13) { index -> //Repeat como si fuera un FOR, index es el contador
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(
                            if (index % 2 == 0) colorResource(id = R.color.rojo_EUA) else Color.White //La operacion es para saber si es par o impar mediante residuo
                        )
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(7f / 13f) // 7/13 de ancho
                .fillMaxHeight(.4f) // 40% de altura
                .background(colorResource(id = R.color.azul_EUA))
                .align(Alignment.BottomStart),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                repeat(9) { index ->

                    if (index % 2 == 0 )
                    C1(modifier = Modifier.weight(1f))
                    else C2(modifier = Modifier.weight(1f))
                }
            }

        }
    }
}

@Composable
fun C1(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            items(6) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Estrella",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Composable
fun C2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            items(5) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Estrella",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEstadosUnidosPreview() {
    Surface {
        BanderaEstadosUnidos()
    }
}