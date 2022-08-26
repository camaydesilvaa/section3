import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.

        String input = JOptionPane.showInputDialog("Type Something");
        System.out.println(input);

        //Parse the input as an int.
        //Print its value +1

        String par = "1";
        int num = Integer.parseInt(par);
        System.out.println(num+1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        int words = Integer.parseInt(JOptionPane.showInputDialog("Say Something"));
        System.out.println(words);
    }
}
