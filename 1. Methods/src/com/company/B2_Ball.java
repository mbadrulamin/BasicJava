package com.company;

public class B2_Ball { //blueprint


    //Children classes
    //Properties or instance variable
    public String color;
    public String name;
    public int bounceRate;
    public int capacity;

    //Behaviors
    public void bounce(){
        System.out.println("Bouncing...");
    }

    public void deflate(){
        System.out.println("Deflating...");
    }

    public void inflate(){
        System.out.println("Inflating...");;
    }
}
