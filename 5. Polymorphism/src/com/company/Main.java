package com.company;

public class Main {

    public static void main(String[] args) {
        //Polymorphic Argument//
        Vet myVet = new Vet();
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myVet.giveShot(myCat);
        myVet.giveShot(myDog);


        


//        Dog myDog = new Dog();

//        myDog.makeSound();
//        myDog.makeSound("Woof");
//        myDog.makeSound("Arghh", "very loud");

//        myDog.makeSound();
//        myDog.makeSound("Another Woof!!!");

    }
}
