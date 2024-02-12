import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to determine
                            //computers play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string

        personPlay = scan.nextLine();
        computerInt = generator.nextInt(3);

        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                computerPlay = "R";
        }
        //Print computer's play
        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");

        else if (personPlay.equals("R")) {
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You Win!");
                else System.out.println("Paper suffocates Rock. You Lose.");
        }
        else if (personPlay.equals("S")) {
            if (computerPlay.equals("P"))
                System.out.println("Scissors cuts Paper. You Win!!");
            else System.out.println("Rock crushes scissors. You Lose.");
        }
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("R"))
                System.out.println("Paper suffocates Rock. You Win!");
            else System.out.println("Scissors crushes scissors. You Lose.");
        }

        System.out.println("Person chose: " + personPlay + " Computer chose: " + computerPlay);
    }
}