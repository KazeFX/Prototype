import javax.swing.JOptionPane;

public class NameDialog {

    public static void main (String[] args){

        String name = JOptionPane.showInputDialog("What is your name?");

        String numb = "1337";
        int testing = Integer.parseInt(numb);
        String message = String.format("Welcome, %s, to Java Programming! %d", name, testing);

        JOptionPane.showMessageDialog(null, message);
    }
}
