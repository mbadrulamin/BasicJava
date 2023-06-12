package com.company;

public class Ball { //blueprint

    /*
    Public - anyone can access
    Private - only access within the class
     */

    //Children classes
    //Properties or instance variable
    private String color;
    private String name;
    private int bounceRate;
    private int capacity;

//***********************************//
    public Ball(){
        //default
    }
//***********Constructor************//
    public Ball(String mColor, String mName, int mBounceRate, int mCapacity) {
        color = mColor;
        name = mName;
        bounceRate = mBounceRate;
        capacity = mCapacity;
    }
//**********************************//
    public Ball(String mColor, String mName){
        color = mColor;
        name = mName;
    }
//**********************************//
    public Ball(String mColor, String mName, int mCapacity){
        color = mColor;
        name = mName;
        capacity = mCapacity;
    }

//***********Getter and Setter***************//
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    //Behaviors
    public void showColor(){
        System.out.println(color);
    }

    public void showName(){
        System.out.println(name);
    }

    public void bounce(){
        System.out.println("Bouncing...");
    }

    public void deflate(){
        System.out.println("Deflating...");
    }

    public void inflate(){
        System.out.println("Inflating...");
    }

}
