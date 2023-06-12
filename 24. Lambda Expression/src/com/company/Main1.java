package com.company;

public class Main1 {

    public static void main(String[] args){


        Addable addable = (a,b)->(a+b);
        System.out.println(addable.add(12,24));

        Addable addable1 = (((int a, int b) -> (a+b)));
        System.out.println(addable1.add(10, 12));

        Drawable1 drawable1 = (width, height) -> System.out.println("Drawing - width: " + width + " Height: " + height);
        drawable1.draw(23, 12);
    }

}
interface Addable{
    int add(int a, int b);
}
interface Drawable1 {
    void draw(int width, int height);

}