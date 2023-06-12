package com.company;

public class B1_Intro_Classes_Main {

    public static void main(String args[]){

        B2_Ball myBall = new B2_Ball();

        myBall.color = "Blue";
        myBall.name = "Basketball";
        myBall.capacity = 10;

        System.out.println(myBall.color);
        System.out.println(myBall.name);
        System.out.println(myBall.capacity);

        myBall.bounce();
    }
}
