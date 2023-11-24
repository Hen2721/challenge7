package com.hen.data.domain.repository

import com.hen.data.domain.model.PlayerRemote
import com.hen.data.utils.ResultWrapper
import kotlinx.coroutines.flow.Flow

interface IPlayerRepository {

    fun getAllRemotePlayer(): Flow<ResultWrapper<List<PlayerRemote>>>

}