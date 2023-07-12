package com.pancake.brainburst.ui.screens.gameScreen

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.pancake.brainburst.ui.navigation.BrainDestination

private const val ROUTE = BrainDestination.Game

fun NavController.navigateToGameScreen(categories: String, difficulty: String) {
    navigate("$ROUTE/$categories/$difficulty")
}

fun NavGraphBuilder.gameScreen(navController: NavHostController) {
    composable(
        "$ROUTE/{${GameArgs.CATEGORIES_ARGS}}/{${GameArgs.DIFFICULTY_ARGS}}",
        arguments = listOf(
            navArgument(GameArgs.CATEGORIES_ARGS) { NavType.StringType },
            navArgument(GameArgs.DIFFICULTY_ARGS) { NavType.StringType }
        )
    ) { GameScreen(navController) }


}


class GameArgs(savedStateHandle: SavedStateHandle) {
    val categories: String? = savedStateHandle[CATEGORIES_ARGS]
    val difficulty: String? = savedStateHandle[DIFFICULTY_ARGS]

    companion object {
        const val CATEGORIES_ARGS = "categories"
        const val DIFFICULTY_ARGS = "difficulty"
    }
}
