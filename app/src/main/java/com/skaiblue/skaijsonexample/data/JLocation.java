package com.skaiblue.skaijsonexample.data;


import com.skaiblue.skaijson.JSONField;

public class JLocation {

    public JLocation() {
    }

    @JSONField
    public String street;

    @JSONField
    public String city;

    @JSONField
    public String state;

    @JSONField
    public Integer postcode;

    @Override
    public String toString() {
        return "JLocation{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}
