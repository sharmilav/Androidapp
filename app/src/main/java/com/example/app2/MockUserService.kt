package com.example.app2



class MockUserService : UserService {
    override suspend fun getUsers(): List<User> {
        // Return mock data
        return listOf(
            User(1, "Alice", "alice@example.com"),
            User(2, "Bob", "bob@example.com"),
            User(3, "Charlie", "charlie@example.com")
        )
    }
}