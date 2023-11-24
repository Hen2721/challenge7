package com.hen.data.domain.usecase

import com.hen.data.domain.model.PlayerRemote
import com.hen.data.domain.repository.IPlayerRepository
import com.hen.data.utils.ResultWrapper
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PlayerInteractor @Inject constructor(private val playerRepository: IPlayerRepository) : PlayerUseCase {

    override fun getAllRemotePlayer(): Flow<ResultWrapper<List<PlayerRemote>>> =
        playerRepository.getAllRemotePlayer()

}