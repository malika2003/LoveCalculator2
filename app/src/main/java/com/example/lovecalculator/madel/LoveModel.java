package com.example.lovecalculator.madel;

import com.google.gson.annotations.SerializedName;

public class LoveModel {
    @SerializedName("fname")
    String firstName;
    @SerializedName("sname")
    String secondName;
    String percentage;
    String result;
}
