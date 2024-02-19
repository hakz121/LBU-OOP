import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the diamond (odd number): ");
        int size = scanner.nextInt();

        if (size % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= mid) {
                    if (j >= mid - i && j <= mid + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - mid && j <= size - 1 - (i - mid)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

