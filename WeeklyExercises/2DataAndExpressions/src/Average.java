import java.util.Scanner;
public class Average (
public static void main(String[] args) {
int size = 5;
int[] values = new int[size];
Scanner scan = new Scanner(System.in);
for(int 1-0: i<size: i+) t
System.out.println("please enter value " + (i + 1) + ">");
        if(scan.hasNextInt()) +
values[i] = scan.nextInt();
H
else (
        System.out.println("Please enter a number");
scan.next();
i--;
h
double total = 0;
for(int i=0: i<size: i++) 「
total += values[i]:
a
double calculatedAverage = total/size:
        System.out.println("The average of your numbers is "
                           calculatedAverage).
