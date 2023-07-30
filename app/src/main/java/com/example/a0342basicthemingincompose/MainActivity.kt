package com.example.a0342basicthemingincompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.a0342basicthemingincompose.HomeScreen.HomeScreen
import com.example.a0342basicthemingincompose.ui.theme.a0342basicthemingincomposeUI

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            a0342basicthemingincomposeUI{
                Scaffold (
                topBar = {
                    TopAppBar(
                        title = { Text(text = "TopAppBar Title")},
                        colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue)
                    )
                },
                content = {
                    PaddingValues -> Box(modifier = Modifier.padding(PaddingValues)) {
                        HomeScreen()
                }
                }
                    )}
        }
    }
}
