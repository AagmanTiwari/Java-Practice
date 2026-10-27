package Collections.BookInventory;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Book Inventory Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Update Book Price");
            System.out.println("5. Delete Book");
            System.out.println("6. Total Number of Books");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean duplicate = false;

                    for (Book b : books) {
                        if (b.bookId == id) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Book ID already exists");
                        break;
                    }

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Book book = new Book(id, title, author, price);
                    books.add(book);

                    System.out.println("Book added successfully");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available");
                    } else {
                        System.out.println("--- Book Inventory ---");

                        for (Book b : books) {
                            b.displayBook();
                            System.out.println("---------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {
                        if (b.bookId == searchId) {
                            b.displayBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to update: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (Book b : books) {
                        if (b.bookId == updateId) {
                            System.out.print("Enter New Price: ");
                            double newPrice = sc.nextDouble();

                            b.price = newPrice;
                            updated = true;

                            System.out.println("Price updated successfully");
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Book not found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).bookId == deleteId) {
                            books.remove(i);
                            deleted = true;

                            System.out.println("Book deleted successfully");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Book not found");
                    }
                    break;

                case 6:
                    System.out.println("Total Books: " + books.size());
                    break;

                case 7:
                    System.out.println("Exiting Book Inventory");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}
