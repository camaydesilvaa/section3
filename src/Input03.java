import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scan = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int add = (x+y+z);

        System.out.println(add);
        
        //Remember to close the Scanner
        scan.close();
    }
}
