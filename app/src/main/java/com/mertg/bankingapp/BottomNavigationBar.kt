package com.mertg.bankingapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mertg.bankingapp.data.BottomNavigation

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Wallet",
        icon = Icons.Rounded.Wallet
    ),
    BottomNavigation(
        title = "Notification",
        icon = Icons.Rounded.Notifications
    ),
    BottomNavigation(
        title = "Account",
        icon = Icons.Rounded.AccountCircle
    ),
)


@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = {  },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }
        }
    }
}