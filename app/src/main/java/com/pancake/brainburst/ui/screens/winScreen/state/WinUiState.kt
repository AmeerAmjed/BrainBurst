package com.pancake.brainburst.ui.screens.winScreen.state

import com.pancake.brainburst.ui.base.BaseUiState

data class WinUiState(
    val score: String = "0",
    val isWin: String = "false"
) : BaseUiState
