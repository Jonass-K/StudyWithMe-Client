package de.pse.kit.studywithme.viewModel.session

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavController
import de.pse.kit.studywithme.model.data.Group
import de.pse.kit.studywithme.model.data.Session
import de.pse.kit.studywithme.model.repository.GroupRepositoryInterface
import de.pse.kit.studywithme.model.repository.SessionRepositoryInterface
import de.pse.kit.studywithme.ui.view.navigation.NavGraph
import de.pse.kit.studywithme.viewModel.SignedInViewModel
import de.pse.kit.studywithme.viewModel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*

/**
 * ViewModel of the newsession screen
 *
 * @property sessionRepo
 * @property groupRepo
 * @property groupID
 * @constructor
 *
 * @param navController
 */
class NewSessionViewModel(
    navController: NavController,
    val sessionRepo: SessionRepositoryInterface,
    val groupRepo: GroupRepositoryInterface,
    val groupID: Int
) : SignedInViewModel(navController) {
    val groupState: MutableState<Group?> = mutableStateOf(null)
    val place: MutableStateFlow<String> = MutableStateFlow("")
    val date: MutableStateFlow<Date> = MutableStateFlow(Date())
    val duration: MutableStateFlow<String> = MutableStateFlow("")

    init {
        runBlocking {
            launch {
                groupRepo.getGroup(groupID).collect {
                    groupState.value = it
                }
            }
        }
    }

    /**
     * Saves the session with the given parameters
     *
     */
    fun saveNewSession() {
        val durationInt: Int
        try {
            durationInt = duration.value.toInt()
        } catch (e: NumberFormatException) {
            return
        }
        val saved = sessionRepo.newSession(
            Session(
                sessionID = -1,
                groupID = groupID,
                location = place.value,
                date = date.value,
                duration = durationInt
            )
        )
        if (saved) {
            navBack()
        }
    }
}
