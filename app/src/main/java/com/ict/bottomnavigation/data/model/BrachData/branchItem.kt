package com.ict.bottomnavigation.data.model.BrachData


import com.google.gson.annotations.SerializedName

data class branchItem(
    @SerializedName("Message")
    val messageModel: String = "",
    @SerializedName("PostOffice")
    val postOfficeModel: List<PostOffice> = listOf(),
    @SerializedName("Status")
    val statusModel: String = ""
)