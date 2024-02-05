import java.util.Scanner;

public class MyInputExample3 {

    public static void main(String[] args) {
        System.out.println("Please enter you name: "); //prompts user input
        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine(); //reads the users input and calls it a string
        for (int i=0;i<personName.length();i++) {
            System.out.println(personName.charAt(i));
        }

        scan.close();
    }
}
