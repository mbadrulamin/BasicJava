package com.company;

public class Main {

    public static void main(String[] args) {

        int number[] = {4, 8, 16 ,32, 64, 128, 256, 512};
        int denum[] = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < number.length; i++){
            try{
                System.out.println(number[i] + "/" + denum[i] + " is " + number[i]/denum[i]);
            }
            catch (ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No matching element found");
            }
            finally {
                //will always run!
                System.out.println("Running!!!");
            }
        }


//        float sum = 0;
//
//        for(String argument: args){
//            try {
//                sum = sum + Float.parseFloat(argument);
//            }
//            catch (NumberFormatException e){
//                //System.out.println("Exception message: " + e.getMessage());
//                System.out.println(argument + " is not a number");
//            }
//
//        }
//
//        System.out.println("Sum is: " + sum);
    }
}
