import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        // JPanel = A GUI component that functions as a container to hold other components

        ImageIcon redIcon = new ImageIcon("lighning.png");
        ImageIcon greenIcon = new ImageIcon("4sided star.png");
        ImageIcon blueIcon = new ImageIcon("star.png");

        JLabel redlabel = new JLabel();
        redlabel.setText("Hi");
        redlabel.setIcon(redIcon);
        redlabel.setVerticalAlignment(JLabel.CENTER);
        redlabel.setHorizontalAlignment(JLabel.CENTER);
        // redlabel.setBounds(x, y, width, height); // setting a null or custom layout for each panel will require to set bounds for each label
        
        JLabel bluelabel = new JLabel();
        bluelabel.setText("Hi");
        bluelabel.setIcon(blueIcon);
        bluelabel.setVerticalAlignment(JLabel.CENTER); 
        bluelabel.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel greenLabel = new JLabel();
        greenLabel.setText("Hi");
        greenLabel.setIcon(greenIcon);
        greenLabel.setVerticalAlignment(JLabel.CENTER);
        greenLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());
       // redPanel.setLayout(null); This removes the default layout for the redPanel


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(new BorderLayout());
        // bluePanel.setLayout(null); 

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());
        // greenPanel.setLayout(null);
        
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(650, 650);
        frame.setVisible(true);

        redPanel.add(redlabel);
        bluePanel.add(bluelabel);
        greenPanel.add(greenLabel);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    } 
}