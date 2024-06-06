import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 500);

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        try {
            fill();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void fill() throws InterruptedException {
        int counter = 0;
        while(counter <= 100) {
            bar.setValue(counter);
            Thread.sleep(50);

            counter += 1;
        }
        bar.setString("Done! :)");

    }
    
}
