package com.company;

public class Main {

    public static void main(String[] args) {

        Ball ball = new Ball("blue", "justBall", 12, 45);
      //Using new multiple constructor//
        Ball mBall = new Ball();
        Ball myBall = new Ball("Black", "anotherBall");
        Ball nBall = new Ball("Green","Basketball", 5);


        ball.setName("Hello");
        ball.setColor("Red");
        ball.setBounceRate(435);
        ball.setCapacity(3);


        ball.showColor();
      //ball.showName();
        System.out.println(ball.getName());
        System.out.println(ball.getName() + ", " + ball.getColor() + ", " + ball.getBounceRate() + ", " + ball.getCapacity());

      //Call  the other method//
        Basketball basketball = new Basketball();
        Baseball baseball = new Baseball();

        baseball.setName("Baseball");
        baseball.setColor("Red");
        basketball.setName("Basketball");
        basketball.setColor("Blue");
        basketball.isNBA = true;
        


        System.out.println(baseball.getName() + " is " + baseball.getColor() + " and " + basketball.getName() + " is " + basketball.getColor());
        baseball.bounce();
        basketball.bounce();
        System.out.println(basketball.isNBA());

    }
}
