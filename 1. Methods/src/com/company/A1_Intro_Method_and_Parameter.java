package com.company;

public class A1_Intro_Method_and_Parameter {

    public static void main(String[] args) {
        myName("Ahmad");
        addNums(4,5);
        anotherMethod();
    }

    //Method
    public static void myName (String mName){
        System.out.println(mName);
    }

    public static void addNums(int a, int b){
        System.out.println("Sum = " + (a + b));
    }

    public static void anotherMethod(){
        System.out.println("Another method.");
    }

}

