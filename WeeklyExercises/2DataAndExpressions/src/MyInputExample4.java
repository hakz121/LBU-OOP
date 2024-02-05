import java.util.Scanner;

public class MyInputExample4 {

    public static void main(String[] args) {
        System.out.println("Please enter you name: "); //prompts user input
        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine(); //reads the users input and calls it a string
        for (int i=0;i<personName.length();i++) {
            if(personName.charAt(i) == 'a') { //identifies if 'a' is in the name
                System.out.println("Found an A"); //prints saying 'a' is found
            }
            else {
                System.out.println(personName.charAt(i)); //if no 'a' found, prints as normal
            }

        }

        scan.close();
    }
}
