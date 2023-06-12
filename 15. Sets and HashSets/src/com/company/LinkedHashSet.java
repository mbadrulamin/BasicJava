package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args){


        Set<Object> set = new HashSet<>();

        try{

            //LinkedHashSet
            java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet();

            linkedHashSet.add("Movies");
            linkedHashSet.add("Potatoes");
            linkedHashSet.add("James");
            linkedHashSet.add("Java");

            Iterator<String> iterator = linkedHashSet.iterator();

            while(iterator.hasNext()){
                System.out.println("Items " + iterator.next());
            }


        }catch (Exception e){}



    }
}
