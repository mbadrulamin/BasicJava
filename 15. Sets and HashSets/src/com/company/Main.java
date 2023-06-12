package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int count [] = {3, 4, 6, 23, 234};
        Set<Integer> set = new HashSet<>();

        try{
            for (int i = 0; i < count.length; i++){
                set.add(count[i]);
            }
            System.out.println("Our set " + set);
            System.out.println("Size " + set.size());
            set.remove(count[0]);
            System.out.println("Our set " + set);
            System.out.println("Size " + set.size());

            if(set.contains(3)){
                System.out.println("Yes");
            }
            else{
                System.out.println("Nope");
            }

        } catch (Exception e){

        }
    }
}
