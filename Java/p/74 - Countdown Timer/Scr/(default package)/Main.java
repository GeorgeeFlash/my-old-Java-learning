import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        // Timer: A facility for threads to schedule tasks
        //         for future execution in a background thread

        // TimerTask: A task that can be scheduled for one-time
        //            or repeated execution by a Timer

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 10;

            @Override
            public void run() {
                if(counter > 0) {
                    System.out.println(counter + " Seconds");
                    counter--;
                }
                else {
                    System.out.println("The Timer Ended!");
                    timer.cancel();
                }
            }
            
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.OCTOBER);
        date.set(Calendar.DAY_OF_MONTH, 9);
        date.set(Calendar.HOUR_OF_DAY, 15);
        date.set(Calendar.MINUTE, 33);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        // timer.schedule(task, 3000);
        // timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);

    }
}
