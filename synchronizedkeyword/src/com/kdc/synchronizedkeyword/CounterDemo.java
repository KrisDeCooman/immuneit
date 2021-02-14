package com.kdc.synchronizedkeyword;

public class CounterDemo {


    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

       /* c.incrementNumb();

        System.out.println("The value of our number is " + c.myNumb);*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 1000; i++) {
                    c.incrementNumb();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 1000; i++) {
                    c.incrementNumb();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The value of our number is " + c.myNumb);
    }
}
