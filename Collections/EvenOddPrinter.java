package Collections;

public class EvenOddPrinter {
    private int n = 10;
    private int count = 1;
    private final Object lock = new Object();

    public void printOdd() {
        while (count <= n) {
            synchronized (lock) {
                if (count % 2 != 0) {
                    System.out.println("Odd: " + count++);
                    lock.notify();
                } else {
                    try { lock.wait(); } catch (InterruptedException ignored) {}
                }
            }
        }
    }

    public void printEven() {
        while (count <= n) {
            synchronized (lock) {
                if (count % 2 == 0) {
                    System.out.println("Even: " + count++);
                    lock.notify();
                } else {
                    try { lock.wait(); } catch (InterruptedException ignored) {}
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();
        new Thread(printer::printOdd).start();
        new Thread(printer::printEven).start();
    }
    }
