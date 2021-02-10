package com.example.myjsonretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("posts")
    Call<List<User>> getUserJson();
}
