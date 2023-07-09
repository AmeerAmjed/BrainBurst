package com.pancake.brainburst.ui.screens.gameOver

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.pancake.brainburst.AppDestination

private const val ROUT = "gameOverRoute"
fun NavController.navigateToGameOverScreen(score: Int, isWin: Boolean) {
    navigate("$ROUT/${score}/${isWin}")
}


fun NavController.navToHome() {
    navigate(AppDestination.HomeScreen.screen)
}

fun NavController.navToGame() {
    navigate(AppDestination.GameScreen.screen)

}


fun NavGraphBuilder.gameOverRoute(navController: NavController) {
    composable(
        "$ROUT/{${WinArgs.SCORE_ARG}}/{${WinArgs.IS_WIN}}",
        arguments = listOf(
            navArgument(WinArgs.SCORE_ARG) { NavType.IntType },
            navArgument(WinArgs.IS_WIN) { NavType.BoolType },
        )
    ) { GameOverScreen(navController = navController) }
}


class WinArgs(savedStateHandle: SavedStateHandle) {
    val score: String = savedStateHandle[SCORE_ARG] ?: "0"
    val isWin: String = savedStateHandle[IS_WIN] ?: "false"

    companion object{
        const val SCORE_ARG = "score"
        const val IS_WIN = "is_win"
    }
}