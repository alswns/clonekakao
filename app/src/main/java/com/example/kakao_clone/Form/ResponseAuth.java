package com.example.kakao_clone.Form;

import com.google.gson.annotations.SerializedName;

public class ResponseAuth{
    private String id;
    private String pw;
    public ResponseAuth(String id,String pw){
        setId(id);
        setPw(pw);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}