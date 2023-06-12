package com.company;

public class Basketball extends Ball {
    //Properties
    public boolean isNBA;
    public int capacity;

    //Behavior
    public boolean isNBA(){
        if(isNBA == true){
            return  true;
        }else{
            return false;
        }

    }

    //Override
    public void bounce(){
        System.out.println("Basketball bouncing");
    }


}
