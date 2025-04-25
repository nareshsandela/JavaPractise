package org.example;

public class DeadLockClass {
    class A implements Runnable {
        public void run() {
            synchronized (String.class) {
                System.out.println("Thread has aquired lock on String class Object" + Thread.currentThread().getName() + "and waiting to aquire object of Object class");
                Thread.sleep(1000);
                synchronized (Object.class)
                {
                System.out.println("Thread has aquired lock on Object class Object" + Thread.currentThread().getName() + "and waiting to aquire object of String class");
            }
        }
    }

    class B extends Thread {
        public void run() {
            synchronized (Object.class) {
                Thread.sleep(1000);
            }
            synchronized (String.class) ;
        }
    }

    public static void main(String args[]){
        Thread thread1= new Thread(new A,"thread-1");
        Thread thread2 = new Thread(new B,"thread-2");
        thread1.start();
        thread2.start();
    }
}
