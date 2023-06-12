package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
public class Main4 {
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        //Add product
        list.add(new Product(1, "MacBookPro", 2200));
        list.add(new Product(2, "iPhone 7", 700));
        list.add(new Product(3, "Google Pixel Phone", 700));
        list.add(new Product(4, "TV", 7000));

        System.out.println("Before filter applied");
        list.forEach(product -> System.out.println(product.name + " " + product.price));
        System.out.println("========================");

        Stream<Product> filteredData = list.stream().filter(product -> product.price > 1000);

        System.out.println("After filter applied");

        filteredData.forEach(product -> System.out.println(product.name + " " + product.price));


//        for (Product p : list){
//            System.out.println(p.id + " " + p.name + " " + p.price);
//        }
//        System.out.println("============================");
//
//        System.out.println("Sorting on the basis of name...");
//
//        //Implement lambda expression
//        Collections.sort(list, Comparator.comparing(p -> p.name));
//
//        for (Product p : list){
//            System.out.println(p.id + " " + p.name + " " + p.price);
//        }

    }
}
