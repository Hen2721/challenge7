package com.hen.data.data

import com.hen.data.data.source.remote.datasource.RemoteDataSourceImpl
import com.hen.data.domain.model.PlayerRemote
import com.hen.data.domain.model.toPlayerRemote
import com.hen.data.domain.repository.IPlayerRepository
import com.hen.data.utils.ResultWrapper
import com.hen.data.utils.proceedFlow
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlayerRepository @Inject constructor(
    private val playerRemoteDataSource: RemoteDataSourceImpl
) : IPlayerRepository {

    override fun getAllRemotePlayer(): Flow<ResultWrapper<List<PlayerRemote>>> {
        return proceedFlow {
            playerRemoteDataSource.getPlayers().data.toPlayerRemote()
        }
    }

}