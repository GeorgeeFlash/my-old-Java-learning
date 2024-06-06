import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) {
        
        // JLabel = A GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("ben 15.jpg");
        Border border = BorderFactory.createLineBorder(Color.red, 3);

        JLabel label = new JLabel(); // Create a label
        label.setText("Do you even know how to code?"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text position
        label.setVerticalTextPosition(JLabel.TOP); 
        label.setForeground(new Color(234, 50, 50)); // Set font of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 30)); // Set font color of text
        label.setIconTextGap(25); // Set gap of text to image
        label.setBackground(Color.black); // Set background color
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // Set Vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // Set Horizontal position of icon + text within label
        // label.setBounds(100, 100, 350, 350); // Set x and y positon within frame as well as dimentions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    } 
}