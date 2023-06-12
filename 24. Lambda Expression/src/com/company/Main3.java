package com.company;

public class Main3 {
    public static void main(String[] args){

        Speakable speakable = message -> {
            String message1 = "Hello World";
            String message2 = message + message1 + " Another Message";

            return message2;
        };
        System.out.println(speakable.speak("Here it goes.."));

    }
}

interface Speakable{
    String speak (String message);
}