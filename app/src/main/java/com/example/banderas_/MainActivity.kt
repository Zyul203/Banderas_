package com.example.banderas_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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

class MainActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaChile(modifier = Modifier.padding(innerPadding))
            }

        }
    }
}

@Composable
fun BanderaChile(modifier: Modifier = Modifier)
{
    Row (modifier = modifier.fillMaxSize())
    {
        Column(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(.66f)
                    .fillMaxHeight()
                    .background(Color.White)
            )
            Box(
                modifier = Modifier
                    .weight(.33f)
                    .fillMaxWidth()
                    .background(Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Star, //Se usa imageVector en los iconos
                    contentDescription = "Estrella de Chile",
                    tint = Color.White, // tint es usado para cambiar color del icono
                    modifier = Modifier.size(150.dp).rotate(200f)
                )
                //Icons.Default. Para ver los iconos disponibles
            }
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
fun BanderaChilePreview() {
    Surface {
        BanderaChile()
    }
}

/* NOTA: Agregar estas dependencias en la seccion de Gradle Scripts (build.gradle.kts) y darle "Sync Now"
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended") //Mas iconos
 */