import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // JOptionPane = Pop up a standard dailog box that prompts users for a value
        //               or informs then of something.

        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Here is more useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "What's up?", "Title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Your computer has a virus!!!", "Title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Call tech support!", "Title", JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "Yo, do you even code?", "My title", JOptionPane.YES_NO_CANCEL_OPTION);

        // String Name = JOptionPane.showInputDialog(null, "What is your name");

        // System.out.println("Hello " + Name);

        String[] responses = {"No, you're awesome!", "Thank you", "*blush*"};

        ImageIcon icon = new ImageIcon("lighning.png");

        JOptionPane.showOptionDialog(null, "You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}