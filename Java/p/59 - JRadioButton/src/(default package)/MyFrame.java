import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyFrame extends JFrame implements ActionListener {

    JRadioButton riceButton;
    JRadioButton ndoleButton;
    JRadioButton eruButton;
    // You can set custom image icons for each button using ImageIcon just as in JTextField.

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        riceButton = new JRadioButton("Rice and Stew");
        ndoleButton = new JRadioButton("Ndole and ripe plantain");
        eruButton = new JRadioButton("Water fufu and eru");

        ButtonGroup group = new ButtonGroup();
        group.add(riceButton);
        group.add(ndoleButton);
        group.add(eruButton);

        riceButton.addActionListener(this);
        ndoleButton.addActionListener(this);
        eruButton.addActionListener(this);

        this.add(riceButton);
        this.add(ndoleButton);
        this.add(eruButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == riceButton) {
            System.out.println("You ordered " + riceButton.getText());
        }
        else if(e.getSource() == ndoleButton) {
            System.out.println("You ordered Ndole and Plantain");
        }
        else if(e.getSource() == eruButton) {
            System.out.println("You ordered Water fufu and Eru");
        }
        
    }
    
}
