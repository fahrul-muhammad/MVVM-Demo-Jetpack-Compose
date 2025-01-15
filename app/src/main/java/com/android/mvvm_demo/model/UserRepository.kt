package com.android.mvvm_demo.model

import kotlinx.coroutines.delay

class UserRepository{
    suspend fun fetchUserData(): UserData {
        delay(2000)
        return UserData("Fahrul", 22)
    }
}