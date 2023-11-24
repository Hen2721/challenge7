package com.hen.book.activity.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hen.data.domain.model.User
import com.hen.data.domain.usecase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val userUseCase: UserUseCase) : ViewModel() {

    fun getUserByEmailAndPassword(email: String, password: String): LiveData<User?> {
        return userUseCase.getUserByEmailAndPassword(email, password)
    }
}