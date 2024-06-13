package com.example.unit_converter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unit_converter.ui.theme.Unit_ConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Unit_ConverterTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Unit_Converter()
                }
            }
        }
    }

    @Composable
    private fun Unit_Converter() {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
//            val context = LocalContext.current

            Text(
                text = "Unit Convert",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
            )
            OutlinedTextField(
                value = "",
                onValueChange = {
                })
            Row(
                modifier = Modifier
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box {
                    Button(
                        onClick = {
//                        Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show()
                        }
                    ) {
                        Text(
                            text = "Select",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        Icon(
                            Icons.Default.ArrowDropDown,
                            contentDescription ="Arrow Down"
                        )
                    }
                }
                Box {
                    Button(
                        onClick = {
//                        Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show()
                        }
                    ) {
                        Text(
                            text = "Select",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        Icon(
                            Icons.Default.ArrowDropDown,
                            contentDescription ="Arrow Down"
                        )
                    }
                }
            }
            Text(
                text = "Result",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}
