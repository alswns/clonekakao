package com.example.kakao_clone.apis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getRetrofit {
    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://218.144.188.3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
}
