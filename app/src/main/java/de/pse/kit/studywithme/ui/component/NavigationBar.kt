package de.pse.kit.studywithme.ui.component


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.material3.NavigationBar as NavigationBar_
import androidx.compose.ui.tooling.preview.Preview
import de.pse.kit.myapplication.ui.theme.MyApplicationTheme3
import androidx.compose.ui.text.font.FontWeight


/**
 * Composable pattern used in the view
 *
 * @param selectedItem
 * @param clickLeft
 * @param clickMiddle
 * @param clickRight
 * @receiver
 * @receiver
 * @receiver
 */
@Composable
fun NavigationBar(
    selectedItem: MutableState<Int> = remember { mutableStateOf(0) },
    clickLeft: () -> Unit = { selectedItem.value = 0 },
    clickMiddle: () -> Unit = { selectedItem.value = 1 },
    clickRight: () -> Unit = { selectedItem.value = 2 }
) {
    var item by selectedItem

    MyApplicationTheme3 {
        NavigationBar_(containerColor = MaterialTheme.colorScheme.primary) {
            NavigationBarItem(
                icon = {
                    Icon(
                        if (item == 0) Icons.Rounded.Group else Icons.Outlined.Group,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                },
                label = {
                    Text(
                        " Meine Gruppen",
                        fontWeight = if (item == 0) FontWeight.Bold else FontWeight.Medium
                    )
                },
                selected = item == 0,
                onClick = {
                    clickLeft()
                }
            )
            NavigationBarItem(
                icon = {
                    Icon(
                        if (item == 1) Icons.Rounded.Groups else Icons.Outlined.Groups,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                },
                label = {
                    Text(
                        "Weitere Gruppen",
                        fontWeight = if (item == 1) FontWeight.Bold else FontWeight.Medium
                    )
                },
                selected = item == 1,
                onClick = {
                    clickMiddle()
                }
            )
            NavigationBarItem(
                icon = {
                    Icon(
                        if (item == 2) Icons.Rounded.Person else Icons.Outlined.Person,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                },
                label = {
                    Text(
                        "Profil",
                        fontWeight = if (item == 2) FontWeight.Bold else FontWeight.Medium
                    )
                },
                selected = item == 2,
                onClick = {
                    item = 2
                    clickRight()
                }
            )
        }
    }
}


@Preview
@Composable
fun NavigationBarPreview() {
    NavigationBar(selectedItem = remember { mutableStateOf(0) })
}