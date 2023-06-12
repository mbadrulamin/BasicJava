package company.com;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args){


        String[] Player = {"Badrul", "Rafiudin", "Ahmad", "Zikry", "Syafiuddin"};

        Arrays.sort(Player);
        for(int i = 0; i < Player.length; i++){
            System.out.println("Player #" + Player[i]);
        }

        int[] num = {12404, 124, 18, 1897498, 123, 3, 245, 78640, 234, 1, 34};

        Arrays.sort(num);
        for(int i = 0; i < num.length; i++){
            System.out.println("#" + num[i]);
        }


    }
}
