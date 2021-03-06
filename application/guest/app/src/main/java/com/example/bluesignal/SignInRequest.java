package com.example.bluesignal;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SignInRequest extends StringRequest {
    //서버 url 설정(php파일 연동)
    final static  private String URL="http://seatrea.dothome.co.kr/Login2.php";
    private Map<String,String> map;

    public SignInRequest(String userID, String userPassword, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
