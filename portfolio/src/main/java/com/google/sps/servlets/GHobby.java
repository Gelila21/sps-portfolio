package com.google.sps.servlets;

public class GHobby {

    private String H1;
    private String H2;
    private String H3;

    GHobby(String a, String b, String c){
        this.H1=a;
        this.H2=b;
        this.H3=c;
    }
public String getH1(){
    return H1;
}
public String getH2(){
    return H2;
}
public String getH3(){
    return H3;
}
}
