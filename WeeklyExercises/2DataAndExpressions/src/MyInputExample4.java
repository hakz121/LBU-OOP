import java.util.Scanner;

public class MyInputExample4 {

    public static void main(String[] args) {
        System.out.println("Please enter you name: "); //prompts user input
        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine(); //reads the users input and calls it a string

        int count = 0;
        while (count<personName.length()){
            System.out.println(personName.charAt(count));
            count++;
        }

        scan.close();
    }
}
