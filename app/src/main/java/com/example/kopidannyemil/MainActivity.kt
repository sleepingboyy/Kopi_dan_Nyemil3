package com.example.kopidannyemil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.kopidannyemil.ui.navigation.AppNavGraph
import com.example.kopidannyemil.ui.theme.KopiDanNyemilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KopiDanNyemilTheme {
                AppNavGraph()
            }
        }
    }
}