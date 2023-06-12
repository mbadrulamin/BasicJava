package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tub myTub = new Tub(13);
        myTub.setSize(12);
        myTub.getBubbleColor();
        System.out.println(myTub.getSize() + " " + myTub.getBubbleColor());
        System.out.println(myTub.getBubbleRadius());


        Bathroom bathroom = new Bathroom();
        System.out.println(bathroom.getTubSize());
    }
}
