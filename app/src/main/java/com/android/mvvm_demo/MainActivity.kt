package com.android.mvvm_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.android.mvvm_demo.ui.theme.MVVM_DemoTheme
import com.android.mvvm_demo.view.HomeScreen
import com.android.mvvm_demo.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class]

        setContent {
            MVVM_DemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding),homeViewModel )
                }
            }
        }
    }
}
