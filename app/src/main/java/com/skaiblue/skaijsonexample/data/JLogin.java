package com.skaiblue.skaijsonexample.data;


import com.skaiblue.skaijson.JSONField;

public class JLogin {
    public JLogin() {
    }

    @JSONField
    public String username;

    @JSONField
    public String password;


    @Override
    public String toString() {
        return "JLogin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
