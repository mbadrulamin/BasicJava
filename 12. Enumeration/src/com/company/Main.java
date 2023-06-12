package com.company;

public class Main {

    public enum Members{JERRY, BOBBY, LARRY}
    public static Members selectedPerson;

    public static final int JERRY = 1;
    public static final int BOBBY = 2;
    public static final int LARRY = 3;


    public static void main(String[] args) {

        if(selectedPerson.equals(Members.BOBBY)){
            System.out.println("Bobby!!!");
        }
        if(selectedPerson.equals(Members.JERRY)){
            System.out.println("Jerry!!!");
        }

//        int selectedPerson = 1;
//
//        if(selectedPerson == JERRY){
//            System.out.println("Jerry!!!");
//        }

    }
}
