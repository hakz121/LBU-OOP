import java.util.Scanner;

public class MyInputExample2 {

    public static void main(String[] args) {
        System.out.println("Please enter you name: "); //prompts user input
        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine(); //reads the users input and calls it a string
        System.out.println("Hello " + personName); //prints users input, in this case their name
        if (personName.length() < 6 ) {
            System.out.println(personName + " is a short name."); //added 'if' identifying lengths of strings
        }
        else {
            System.out.println(personName + " is a long name.");

        }
        scan.close();
    }
}
