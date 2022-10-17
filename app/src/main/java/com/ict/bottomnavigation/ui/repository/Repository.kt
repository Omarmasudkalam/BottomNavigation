package com.ict.bottomnavigation.ui.repository


import com.ict.bottomnavigation.data.model.PincodeData.Pincode
import retrofit2.Response

interface Repository {
    suspend fun  getPincode(): Response<Pincode>
}