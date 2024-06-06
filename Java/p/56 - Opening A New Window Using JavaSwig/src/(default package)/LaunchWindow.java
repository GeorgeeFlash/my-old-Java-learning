import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton;

    LaunchWindow() {

        myButton = new JButton("Open new window");

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == myButton) {
            System.out.println("Button Clicked");
            frame.dispose(); // Closes out of the frame
            new NewWindow();
        }
    }
}