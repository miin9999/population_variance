package diy.population_variance.data.models


import com.google.gson.annotations.SerializedName

data class Data_core(
    @SerializedName("country_eng_nm")
    var countryEngNm: String?,
    @SerializedName("country_iso_alp2")
    var countryIsoAlp2: String?,
    @SerializedName("country_nm")
    var countryNm: String?,
    @SerializedName("popltn_cn")
    var popltnCn: Any?,
    @SerializedName("popltn_cnt")
    var popltnCnt: Int?,
    @SerializedName("popltn_cnt_src")
    var popltnCntSrc: String?,
    @SerializedName("popltn_growth")
    var popltnGrowth: Double?,
    @SerializedName("popltn_growth_src")
    var popltnGrowthSrc: String?,
    @SerializedName("popltn_month")
    var popltnMonth: Any?,
    @SerializedName("popltn_year")
    var popltnYear: Int?
)