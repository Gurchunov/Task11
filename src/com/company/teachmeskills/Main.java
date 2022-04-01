package com.company.teachmeskills;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        Thread t3 = new Thread(new T3());

        t3.start();
        try {
            t3.join(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        t2.start();
        try {
            t2.join(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        t1.start();
    }
}
