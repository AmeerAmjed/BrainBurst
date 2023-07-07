package com.pancake.brainburst

import android.annotation.SuppressLint
import android.app.GameManager
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.pancake.brainburst.ui.screens.GameScreen
import com.pancake.brainburst.ui.theme.BrainBurstTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BrainBurstApp() {
    BrainBurstTheme(){
        Scaffold {
            GameScreen()
        }
    }

}