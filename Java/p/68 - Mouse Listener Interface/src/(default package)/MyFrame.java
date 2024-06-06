import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon one;
    ImageIcon two;
    ImageIcon three;
    ImageIcon four;

    MyFrame () {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        one = new ImageIcon("4sided star.png");
        two = new ImageIcon("lighning.png");
        three = new ImageIcon("multipoint start.png");
        four = new ImageIcon("star.png");

        label = new JLabel();
        label.addMouseListener(this);

        label.setIcon(one);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (presed and released) on a component
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        label.setIcon(three);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a componnent
        label.setIcon(four);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        label.setIcon(two);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Ivoked when the mouse exits a component
        label.setIcon(one);
    }

    

}
