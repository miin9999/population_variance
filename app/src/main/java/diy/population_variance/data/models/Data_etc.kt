package diy.population_variance.data.models


import com.google.gson.annotations.SerializedName

data class Data_etc(
    @SerializedName("currentCount")
    var currentCount: Int?,
    @SerializedName("data")
    var data222: List<Data_core?>?,
    @SerializedName("numOfRows")
    var numOfRows: Int?,
    @SerializedName("pageNo")
    var pageNo: Int?,
    @SerializedName("resultCode")
    var resultCode: Int?,
    @SerializedName("resultMsg")
    var resultMsg: String?,
    @SerializedName("totalCount")
    var totalCount: Int?
)