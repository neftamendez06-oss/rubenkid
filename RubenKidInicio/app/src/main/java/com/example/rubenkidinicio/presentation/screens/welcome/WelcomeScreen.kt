package com.example.rubenkidinicio.presentation.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp as sp1
import com.example.rubenkidinicio.R

@Composable
fun WelcomeScreen() {
    val backgroundColor = Color(0xFF1E1E90) // mismo azul

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "Logo Rubén Kid",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Rubén kid",
                fontSize = 32.sp1,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFD700) // dorado
            )

            Text(
                text = "EL LOGO VA AQUÍ",
                fontSize = 14.sp1,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Botón Inicio
            Button(
                onClick = { /* Aquí iría la siguiente pantalla */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFC107), // amarillo
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(200.dp)
                    .height(55.dp)
            ) {
                Text(
                    text = "INICIO",
                    fontSize = 20.sp1,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
