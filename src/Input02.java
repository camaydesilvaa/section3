import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Incorrect Login",
                "Warning",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "How are you today?",
                "Q&A",
                2,
                null,
                null,
                "Answer here");
        
        
        String[] acceptableValues = {"yes", "no", "not sure"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Do you like cereal?",
                "Survey",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

        System.out.println(input1);
        System.out.println(input2);
    }
}
