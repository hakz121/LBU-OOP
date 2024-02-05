import java.util.Scanner;

public class MyInputExample {

    public static void main(String[] args) {
        System.out.println("Please enter you name: "); //prompts user input

        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine(); //reads the users input and calls it a string

        System.out.println("Hello " + personName); //prints users input, in this case their name

        scan.close();
    }
}
