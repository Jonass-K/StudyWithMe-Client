package de.pse.kit.studywithme.ui.view.auth

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import de.pse.kit.myapplication.ui.theme.MyApplicationTheme3
import de.pse.kit.studywithme.viewModel.auth.SignUpViewModel

@ExperimentalMaterial3Api
@Composable
fun SignUpView(viewModel: SignUpViewModel) {
    MyApplicationTheme3 {
        Scaffold(
            containerColor = MaterialTheme.colorScheme.surface
        ) {

        }
    }
}

@ExperimentalMaterial3Api
@Preview
@Composable
fun SignUpViewPreview() {
    SignUpView(SignUpViewModel(rememberNavController()))
}