package com.skaiblue.skaijsonexample.data;


import com.skaiblue.skaijson.JSONField;

import java.util.List;

public class JRandomUser {
    // It must need default initializer for use this library.
    public JRandomUser() { }

    @JSONField
    // If you want to inject data to field, You have to use this annotation.
    public List<JUser> results;


    @Override
    public String toString() {
        return "JRandomUser{" +
                "results=" + results +
                '}';
    }
}
