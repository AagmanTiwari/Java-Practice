package Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackUndoOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        int choice;

        do {
            System.out.println("------------Operations in a Text Editor------------");
            System.out.println("1. Add Actions");
            System.out.println("2. Undo Action");
            System.out.println("3. Display Last Action");
            System.out.println("4. Display All Actions");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter action to add:");
                    String action = sc.nextLine();

                    stack.push(action);
                    System.out.println("Action Added Successfully");

                    break;
                case 2:
                    if (stack.isEmpty()) {

                        System.out.println("No action present");

                    } else {
                        System.out.println("Action undo" + stack.pop());
                    }

                    break;
                case 3:
                    if (stack.isEmpty()) {

                        System.out.println("No action present");

                    } else {
                        System.out.println("Last Action is: " + stack.peek());
                    }

                    break;
                case 4:
                    if (stack.isEmpty()) {

                        System.out.println("No action present");

                    } else {
                        System.out.println("All Actions");
                        for (String a : stack) {
                            System.out.println(a);
                        }
                    }

                    break;
                case 5:

                    System.out.println("Exiting");

                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 5);

        sc.close();
    }

}
