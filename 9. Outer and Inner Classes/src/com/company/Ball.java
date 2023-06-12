package com.company;

public class Ball {//Outer Class
    private String ballName;
    private int ballSize;

    public void setUpBall(){
        new OrangeBall().setUpOrangeBall();

    }

    //Inner Class
    class OrangeBall{
        public void setUpOrangeBall(){
            ballName = "Inside Inner Class Ball";
            ballSize = 23;

            System.out.println(ballName + ", " + ballSize);
        }
    }
}
