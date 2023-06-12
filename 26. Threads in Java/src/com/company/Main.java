package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread starting.");
        //construct myThread object
        MyThread mt = new MyThread("Child #1 ");
        MyThread mt2 = new MyThread("Child #2 ");
        MyThread mt3 = new MyThread("Child #3 ");
        MyThread mt4 = new MyThread("Child #4 ");

        for (int i = 0; i < 50; i++){
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
                e.printStackTrace();
            }
        }
        System.out.println("\nMain thread ending");

        //Construct an actual thread from our previous object
//        Thread newThread = new Thread(mt);
//        newThread.start();

    }
}


class MyThread implements Runnable{
    Thread thread;

    String myThread;
    @Override
    public void run() {
        System.out.println(myThread + "Starting");
        for (int count = 0; count < 10; count++){
            try {
                Thread.sleep(400);
                System.out.println("In " + myThread + " count is " + count);
            } catch (InterruptedException e) {
                System.out.println(myThread + " interrupted");
                e.printStackTrace();
            }
            System.out.println(myThread + " terminated");
        }
    }

    public MyThread(String myThread) {
        thread = new Thread(this, myThread);
        thread.start();

        this.myThread = myThread;
    }
}