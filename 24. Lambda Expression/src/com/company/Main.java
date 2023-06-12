package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Drawable drawable = () -> System.out.println("Drawing");
        drawable.draw();
    }
//      Drawable drawable = new Drawable() {
//      @Override
//          public void draw() {
//                System.out.println("Drawing");
//          }
//      };
//      drawable.draw();
//    }
}

interface Drawable {
    public void draw();
}