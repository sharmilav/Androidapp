package com.example.app2

interface UserService {
    suspend fun getUsers(): List<User>
}