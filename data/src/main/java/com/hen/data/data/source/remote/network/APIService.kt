package com.hen.data.data.source.remote.network

import com.hen.data.data.source.remote.response.PlayerResponse
import retrofit2.http.GET

interface APIService {

    @GET("players")
    suspend fun getPlayers(): PlayerResponse

}