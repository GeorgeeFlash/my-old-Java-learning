import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // JLabel = A GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("ben 15.jpg");

        JLabel label = new JLabel(); // Create a label
        label.setText("Do you even know how to code?"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(0);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
    } 
}