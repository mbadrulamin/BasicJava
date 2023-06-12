package com.company;

public class A2_Method_and_Return_Type {

    public static void main(String args[]) {

        int area = getArea(10, 10);
        System.out.println("Area = " + area);
        System.out.println("My Truth: " + isTrue(true, true));
        System.out.println("The area is: " + getArea(10, 10));


    }

    public static int getArea(int width, int height) { 

        return width * height;
    }

    public static String fullName(String firstName, String lastName) {

        return firstName + " " + lastName;
    }

    public static boolean isTrue(boolean a, boolean b) {
        if (a != b)
            return a;
        else
            return b;
    }

    public static void addNumber(int a, int b) {

        System.out.println(a + b);
    }

}
