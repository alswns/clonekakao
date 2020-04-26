package com.example.kakao_clone;

import com.example.kakao_clone.Form.ResponseAuth;
import com.google.gson.JsonObject;

import java.util.HashMap;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitHellper {
    final String Base_URL="http://0.0.0.0/";
    @Headers("Content-Type: application/json")
    @POST("/auth")
    Call<String> Auth(@Body JsonObject jsonObject );
    @Headers("Content-Type: application/json")
    @POST("/register")
    Call<String>Regist(@Body JsonObject jsonObject);
}
