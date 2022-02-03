package de.pse.kit.studywithme.viewModel.session

import androidx.navigation.NavController
import de.pse.kit.studywithme.viewModel.SignedInViewModel
import de.pse.kit.studywithme.viewModel.ViewModel

class EditSessionViewModel(
    navController: NavController,
    val sessionID: Int
) : SignedInViewModel(navController) {
}