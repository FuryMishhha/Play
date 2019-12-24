package com.company;

public class Situation {
    Situation[] direction;
    String subject,text;
    int s, a, z;
    public Situation (String subject, String text, int variants, int s,int a,int z) {
        this.subject=subject;
        this.text=text;
        this.s=s;
        this.a=a;
        this.z=z;
        direction=new Situation[variants];
    }
}