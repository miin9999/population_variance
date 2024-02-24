package diy.population_variance.data.services

import diy.population_variance.BuildConfig
import diy.population_variance.data.models.Data_etc
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PopulationSerivce {


    @GET("getCountryPopulationList2?serviceKey=${BuildConfig.api_key}" +
            "&pageNo=1" +
            "&numOfRows=10")
    suspend fun getDataEtc(
        @Query("cond[country_nm::EQ]") ctyName:String,
        @Query("cond[country_iso_alp2::EQ]") iso_Code:String,
        @Query("returnType") returnType:String,
    ):Response<Data_etc>

}