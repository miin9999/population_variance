package diy.population_variance.data

import diy.population_variance.data.models.Data_core
import diy.population_variance.data.services.PopulationSerivce
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Repository {

    //todo 아래 service를 이용한 suspend함수

    suspend fun getDataCoreFromRepository(
        ctyName: String,
        iso_code: String,
        returntype: String
    ): String? =
        populationVarianceService.getDataEtc(
            ctyName = ctyName,
            iso_Code = iso_code,
            returnType = returntype
        )
            .body()
            ?.data222!![0]!!.popltnGrowth.toString()


    //todo service 상속받아서 retrofit 빌드시키기

    private val populationVarianceService: PopulationSerivce by lazy {
        Retrofit.Builder()
            .baseUrl(Url.POPULATION_VARIANCE_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }
}