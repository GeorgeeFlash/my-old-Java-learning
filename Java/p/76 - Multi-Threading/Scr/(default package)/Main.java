
public class Main {
    
    public static void main(String[] args) throws InterruptedException {

        // There a are two different ways of creating a thread

        // Create a subclass of Tread
        MyThread thread1 = new MyThread();

        // Or

        // Implement a Runnable interface and pass instance as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // thread1.setDaemon(true);
        // thread2.setDaemon(true);
        // System.out.println(1/0); // this will cause an ArithmeticException which will cause all daemon threads to stop

        thread1.start();
        thread1.join(3000); //calling thread (ex. main) waits untill the specified thread dies for x amount of seconds
        thread2.start();

    }
}
