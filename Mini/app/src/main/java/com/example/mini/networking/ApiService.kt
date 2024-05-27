package com.example.mini.networking

import com.example.mini.model.User
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

public interface ApiService {
    @GET("users/list")
    fun getUserList(): Observable<List<User>>
}