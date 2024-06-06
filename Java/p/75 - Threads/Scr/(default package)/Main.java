
public class Main {
    
    public static void main(String[] args) {

        // System.out.println(Thread.activeCount());
        // Thread.currentThread().setName("My main thread");
        // System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setPriority(10); // threads have priority from 1 to 10 with 1 being the lowest and 10 the highest
        // System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().isAlive());

        // for(int i = 3; i > 0; i--) {
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        // System.out.println("Done!");

        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        thread2.start();

        // System.out.println(thread2.isAlive());
        // thread2.setName("2nd thread");
        // System.out.println(thread2.getName());

        // thread2.setPriority(2);
        // System.out.println(thread2.getPriority());
        // System.out.println(Thread.activeCount());
    }
}
