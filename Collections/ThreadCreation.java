package Collections;

public class ThreadCreation {


    class ThreadCreationByThread extends Thread{
      ThreadCreationByThread threadCreationByThread = new ThreadCreationByThread();
    }

    class ThreadCreationByRunnable implements Runnable{
        @Override
        public void run() {

        }
    }
}
