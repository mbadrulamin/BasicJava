package com.company;

public class InterfaceTest {
    public static void main(String[] args){

        Dog myDog = new Dog();

        myDog.setName("Pyro");
        System.out.println(myDog.getName());

        myDog.play();
        myDog.beFriendly();
        myDog.setName("Doggy");
        myDog.getName();

    }
}
