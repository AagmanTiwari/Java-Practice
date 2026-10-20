package Assignment_3;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String positiveNumbers = "";
        String negativeNumbers = "";

        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positiveNumbers += arr[i] + " ";
            } else if (arr[i] < 0) {
                negativeNumbers += arr[i] + " ";
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveNumbers.trim());
        System.out.println("Negative numbers: " + negativeNumbers.trim());
        System.out.println("Zero values: " + zeroCount);

        sc.close();
    }
}
