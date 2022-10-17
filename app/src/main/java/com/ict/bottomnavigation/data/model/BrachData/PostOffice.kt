package com.ict.bottomnavigation.data.model.BrachData


import com.google.gson.annotations.SerializedName

data class PostOffice(
    @SerializedName("BranchType")
    val branchTypeModel: String = "",
    @SerializedName("Circle")
    val circleModel: String = "",
    @SerializedName("Country")
    val countryModel: String = "",
    @SerializedName("DeliveryStatus")
    val deliveryStatusModel: String = "",
    @SerializedName("Description")
    val descriptionModel: Any = Any(),
    @SerializedName("District")
    val districtModel: String = "",
    @SerializedName("Division")
    val divisionModel: String = "",
    @SerializedName("Name")
    val nameModel: String = "",
    @SerializedName("Pincode")
    val pincodeModel: String = "",
    @SerializedName("Region")
    val regionModel: String = "",
    @SerializedName("State")
    val stateModel: String = ""
)