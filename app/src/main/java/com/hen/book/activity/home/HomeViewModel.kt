package com.hen.book.activity.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hen.data.domain.usecase.PlayerUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val playerUseCase: PlayerUseCase) : ViewModel() {

    val book = playerUseCase.getAllRemotePlayer().asLiveData(Dispatchers.IO)

}