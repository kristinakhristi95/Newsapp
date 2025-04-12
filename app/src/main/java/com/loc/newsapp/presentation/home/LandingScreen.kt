//Kristina Khristi 301483429
//Rajan Boudel
//Harikrisnan Parmeswaran
//Maziar Hassanzadeh Moghaddam
package com.loc.newsapp.presentation.home

import android.widget.TextView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier // Corrected import
import androidx.compose.ui.unit.dp
import com.google.firebase.database.ktx.database



@Composable
fun LandingScreen() {

    // Firebase Realtime Database reference
    val database = Firebase.database
    val myRef = database.getReference("message")

    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = text,
            onValueChange = { newText -> text = newText },
            label = { Text(text = "Enter your name") }
        )
        Button(
            onClick = { myRef.setValue(text) },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Submit")
        }
    }
}