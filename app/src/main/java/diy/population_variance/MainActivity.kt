package diy.population_variance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import diy.population_variance.data.Repository
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    private val scope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        executeApi()

    }

    private fun executeApi(){

        scope.launch {

            try{
                val dataC = Repository.getDataCoreFromRepository("일본","JP","JSON")
                Log.d("tadstdas",dataC!!)
            }catch(e : Exception){
                Log.d("tadstdas",e.toString())
            }finally {

            }

        }
    }
}