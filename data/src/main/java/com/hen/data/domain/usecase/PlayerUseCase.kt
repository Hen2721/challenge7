package com.hen.data.domain.usecase

import com.hen.data.domain.model.PlayerRemote
import com.hen.data.utils.ResultWrapper
import kotlinx.coroutines.flow.Flow

interface PlayerUseCase {

    fun getAllRemotePlayer(): Flow<ResultWrapper<List<PlayerRemote>>>

}