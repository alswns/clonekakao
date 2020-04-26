package com.example.kakao_clone.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kakao_clone.Form.ResponseAuth;
import com.example.kakao_clone.R;
import com.example.kakao_clone.RetrofitHellper;
import com.google.gson.JsonObject;

import androidx.annotation.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button login = findViewById(R.id.login);
        Button register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email = findViewById(R.id.email);
                EditText pw = findViewById(R.id.pw);
                TextView text = findViewById(R.id.text);
                System.out.println("" + email.getText() + pw.getText());
                Retrofit retrofit=getRetrofit();
                RetrofitHellper retrofitHellper = retrofit.create(RetrofitHellper.class);

                String id = email.getText().toString();
                String password = pw.getText().toString();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("id", id);
                jsonObject.addProperty("pw", password);



                ResponseAuth responseAuth = new ResponseAuth(id,password);
//                responseAuth.setReq(jsonObject);

                retrofitHellper.Auth(jsonObject).enqueue(new Callback<String>() {

                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {

                        System.out.println(response.code());

                        System.out.println("성공");
                        if(response.isSuccessful()) {
                            String res = response.body();
                            System.out.println(res);
                            if(res.equals("true")){
                                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                            System.out.println("실패");
                            System.out.println(t);
                    }
                });
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


