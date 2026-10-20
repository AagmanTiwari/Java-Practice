package Assignment_3;

import java.util.Scanner;

public class DuplicateElements {
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

        System.out.println("Duplicate elements:");

        boolean found = false;

        for (int i = 0; i < n; i++) {

            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements");
        }

        sc.close();
    }
}
