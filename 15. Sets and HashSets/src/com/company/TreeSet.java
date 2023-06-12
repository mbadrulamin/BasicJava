package com.company;

import java.util.HashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args){

        int count[] = {15, 45, 23, 12, 65, 423};
        //TreeSet
        Set<Object> set = new HashSet<>();

        try{

            set.add("Potatoes");
            set.add("Mango");
            set.add("Bananas");
            set.add("Pumpkin");
//            for(int i = 0; i < count.length; i++){
//                set.add(count[i]);
//            }

            java.util.TreeSet sortedSet = new java.util.TreeSet(set);

            System.out.println(sortedSet);

        }catch (Exception e){

        }

    }
}
