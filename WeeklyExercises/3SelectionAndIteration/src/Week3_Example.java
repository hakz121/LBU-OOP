import java.util.Random;
public class Week3_Example {
    public static void main(String[] args) {
        System.out.println("Rolling a Dice... ");

        Dice myDice = new Dice(6);
        myDice.rollDice();

        int currentNumber = myDice.getCurrentNumber();
        System.out.println("The number rolled is " + currentNumber);
        }
}

