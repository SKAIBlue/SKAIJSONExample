package com.skaiblue.skaijsonexample.data;


import com.skaiblue.skaijson.JSONField;

public class JPicture {
    public JPicture() {
    }

    @JSONField
    public String large;

    @JSONField
    public String medium;

    @JSONField
    public String thumbnail;


    @Override
    public String toString() {
        return "JPicture{" +
                "large='" + large + '\'' +
                ", medium='" + medium + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
