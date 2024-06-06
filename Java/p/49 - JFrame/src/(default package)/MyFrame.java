import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("My Cool Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // Prevents frame from being resized
        this.setSize(420, 420); // Sets the x-dimention and y-dimention of frame
        this.setVisible(true); // make frame visible

        ImageIcon logo = new ImageIcon("cool image.jpg");

        this.setIconImage(logo.getImage()); // This will change icon of frame
        this.getContentPane().setBackground(new Color(234, 50, 80)); // Change color of background. Can use hex as well e.g. 0x123467, 234, 50, 80
    }

}