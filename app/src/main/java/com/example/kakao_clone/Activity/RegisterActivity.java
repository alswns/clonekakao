package com.example.kakao_clone.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kakao_clone.R;
import com.example.kakao_clone.RetrofitHellper;
import com.google.gson.JsonObject;

import androidx.annotation.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegisterActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        final TextView email=findViewById(R.id.email);
        final TextView password=findViewById(R.id.pw);
        final TextView repassword=findViewById(R.id.repw);

        Button regist=findViewById(R.id.register);
        Button login=findViewById(R.id.login);

        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=email.getText().toString();
                String pw=password.getText().toString();
                String repw=repassword.getText().toString();
                Retrofit retrofit=getRetrofit();
                RetrofitHellper retrofitHellper=retrofit.create(RetrofitHellper.class);

                JsonObject jsonObject=new JsonObject();
                jsonObject.addProperty("id",id);
                jsonObject.addProperty("pw",pw);
                jsonObject.addProperty("repw",repw);
                System.out.println(jsonObject);
                retrofitHellper.Regist(jsonObject).enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        System.out.println("성공");
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        System.out.println("실패");
                        System.out.println(t);
                    }
                });


            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://218.144.188.3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
}
