package com.skaiblue.skaijsonexample.data;


import com.skaiblue.skaijson.JSONField;

public class JUser {

    // It must need default initializer for use this library.
    public JUser() { }

    @JSONField
    public String gender;              // gender is String

    @JSONField
    public JUserName name;             // name is JSONObject so you have to create class for it.

    @JSONField
    public JLocation location;         // location is JSONObject so you have to create class for it.

    @JSONField
    public String email;               // email is String

    @JSONField
    public JLogin login;                // login is JSONObject so you have to create class for it.

    @JSONField
    public String dob;

    @JSONField
    public String registered;

    @JSONField
    public String phone;

    @JSONField
    public String cell;

    @JSONField
    public JPicture picture;

    @JSONField
    public String nat;

    @Override
    public String toString() {
        return "JUser{" +
                "gender='" + gender + '\'' +
                ", name=" + name +
                ", location=" + location +
                ", email='" + email + '\'' +
                ", login=" + login +
                ", dob='" + dob + '\'' +
                ", registered='" + registered + '\'' +
                ", phone='" + phone + '\'' +
                ", cell='" + cell + '\'' +
                ", picture=" + picture +
                ", net='" + nat + '\'' +
                '}';
    }

}
