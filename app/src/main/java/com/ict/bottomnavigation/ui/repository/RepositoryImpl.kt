package com.ict.bottomnavigation.ui.repository

import com.ict.bottomnavigation.data.ApiSource

import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiSource: ApiSource
) : Repository {
    override suspend fun getPincode()= apiSource.getPincode()
}