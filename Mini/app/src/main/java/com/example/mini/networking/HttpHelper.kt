package com.example.mini.networking

import android.util.Log
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory

object HttpHelper {
    private val BASE_URL = "https://your-api-url.com/"

    val instance:ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)
    }

    public fun getUser(){
        val request = HttpHelper.instance
            .getUserList()
            .subscribe({respon->
                Log.i("aa", "respon")
            },{error->
                Log.i("aa", "respon")
            })
    }
}