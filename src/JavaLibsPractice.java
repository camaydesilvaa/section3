import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Enter a name");
        int kids = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        double percent = Double.parseDouble(JOptionPane.showInputDialog("Enter a percentage"));
        String emotion = JOptionPane.showInputDialog("How are you feeling today?");
        int marriage = kids*2;
        double salary = percent*5000;
        String husband = JOptionPane.showInputDialog("Enter a male name");
        String pet = JOptionPane.showInputDialog("Enter an animal");
        String car = JOptionPane.showInputDialog("Enter a car (be semi specific)");
        String honeymoon = JOptionPane.showInputDialog("Enter a country");
        String job = JOptionPane.showInputDialog("Enter an occupation (pluralize)");
        String bff = JOptionPane.showInputDialog("Enter another name");

        String message = "Hi " + name + ", you are married to " + husband + ". Together y'all have " + kids + " kids, own a pet " + pet +
                ", and own a " + car + ". You work as " + job + ". You have been married for " + marriage +
                " years and spent your honeymoon in " + honeymoon + ". Working as " + job + ", you make " + percent +
                "% of what your spouse makes, making your salary $" + salary + ". Everytime your childhood bestfriend, " + bff + ", comes over you feel "
                + emotion + ".";
        System.out.println(message);


    }

}