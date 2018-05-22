package com.skaiblue.skaijsonexample.data;


import com.skaiblue.skaijson.JSONField;

public class JUserName {
    public JUserName() {}

    @JSONField
    public String title;

    @JSONField
    public String first;

    @JSONField
    public String last;


    @Override
    public String toString() {
        return "JUserName{" +
                "title='" + title + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
