package Collections;

public class ThreadPrintEvenOddUsing {
    private int n = 10;
    private int count = 1;
    private final Object lock = new Object();
    public static void main(String [] args){
        ThreadPrintEvenOddUsing printer = new ThreadPrintEvenOddUsing();
        new Thread(printer::printOdd).start();
        new Thread(printer::printEven).start();
    }

    public void printOdd(){
        while (count<=n){
            synchronized (lock){
                if(count%2!=0){
                    System.out.println("Odd numbers : " + count);
                    lock.notify();
                }
                else {
                  try{  lock.wait();}
                catch(InterruptedException ignored){
System.out.println("InterruptedException for odd");
                }
                }
            }
        }
    }

    public void printEven(){
        while (count<=n){
           synchronized (lock){
               if(count%2==0){
                  System.out.println("Even numbers : "+count++);
                  lock.notify();
               }
               else {
                   try{
                       lock.wait();
                   }
                   catch (InterruptedException ignored){
                       System.out.println("InterruptedException for Even");
                   }
               }
           }
        }
    }
}
