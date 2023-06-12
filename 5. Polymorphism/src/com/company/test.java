package com.company;

public class test {
    public static void main(String args[]) {
        int i,j=0;
        for(i=10;i<0;i--) { j++; }
        switch(j) {
            case (0) :
                j=j+1;
            case(1):
                j=j+2;
                break;
            case (2) :
                j=j+3;
                break;
            case (10) :
                j=j+10;
                break;
            default :
                break;
        }
        System.out.println(j);
    }
}
