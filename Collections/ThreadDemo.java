package Collections;
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread created by class A ");
            try {
                Thread.sleep(100);

            }
            catch (InterruptedException e ){
                e.printStackTrace();
            }
        }

    }
}
class B extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread created by class B ");
            try {
                Thread.sleep(100);

            }
            catch (InterruptedException e ){
                e.printStackTrace();
            }
        }

    }
}
public class ThreadDemo{
    public static void main(String [] args) {
        //creating Thread extends Thread class
        A obj1 = new A();
        B obj2 = new B();

        //to get priority of Thread
//        System.out.println(obj1.getPriority());
//        System.out.println(obj2.getPriority());

        //setPriority of Thread to allocate maximum time first, but it doesn't mean that only that Thread will execute
//        obj2.setPriority(10);
//        System.out.println(obj2.getPriority());
//        obj1.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();


        //sleep() in milliseconds


    }
    }

