package Collections;

import javax.swing.plaf.PanelUI;

class C extends Thread{
    public void run() {
       System.out.println("Extended by Thread");
    }
}
class D implements Runnable{

    @Override
    public void run() {
            System.out.println("Implemented by Runnable");
        }
    }

public class ThreadCreationDemo {
public static void main (String [] args){
    Thread obj1= new C();
    D obj2=new D();
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start(); // Start method creates a new thread and executes the run() method which supports multithreading concept
    t2.start();
t1.run(); //run method directly run the code on the same thread without creeating a new thread where multthreadin concept is not involved
t2.run();
}
}