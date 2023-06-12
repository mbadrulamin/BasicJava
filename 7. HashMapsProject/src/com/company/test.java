package com.company;

import java.util.Scanner;

public class test {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg: ");
        double weight =input.nextDouble();
        System.out.println("Enter your height in m: ");
        double height = input.nextDouble();

        double BMI = weight / Math.pow(height, 2.0);

        System.out.println("Your BMI is: " + BMI);

        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("Normal");
        }
        else if(BMI >= 25.1 && BMI <= 30){
            System.out.println("Overweight");
        }
        else if(BMI >= 30.1 && BMI <= 40){
            System.out.println("Obesity");
        }
        else if(BMI > 40){
            System.out.println("Morbid Obesity");
        }
    }
}
