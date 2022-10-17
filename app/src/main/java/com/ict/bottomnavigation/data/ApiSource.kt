package com.ict.bottomnavigation.data

import com.ict.bottomnavigation.data.model.BrachData.branch
import com.ict.bottomnavigation.data.model.PincodeData.Pincode
import retrofit2.Response
import retrofit2.http.GET

interface ApiSource {//we do not have to any implementation

    @GET(ApiDetails.BRANCH) //to define type of request GET, POST, PUT etc
    suspend fun getBranch(): Response<branch>  // should return data class

    @GET(ApiDetails.PINCODE) //to define type of request GET, POST, PUT etc
    suspend fun getPincode(): Response<Pincode>  // should return data class
}