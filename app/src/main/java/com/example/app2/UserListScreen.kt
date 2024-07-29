package com.example.app2

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.collectAsState

@Composable
fun UserListScreen(userViewModel: UserViewModel = viewModel()) {
    val users by userViewModel.users.collectAsState()

    LazyColumn {
        items(users) { user ->
            Text(text = "${user.name} - ${user.email}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserListScreenPreview() {
    UserListScreen(UserViewModel(MockUserService()))
}