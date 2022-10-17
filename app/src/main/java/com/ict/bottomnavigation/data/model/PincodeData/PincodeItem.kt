package com.ict.bottomnavigation.data.model.PincodeData


import com.google.gson.annotations.SerializedName

data class PincodeItem(
    @SerializedName("Message")
    val messageModel: String = "",
    @SerializedName("PostOffice")
    val postOfficeModel: List<PostOffice> = listOf(),
    @SerializedName("Status")
    val statusModel: String = ""
)