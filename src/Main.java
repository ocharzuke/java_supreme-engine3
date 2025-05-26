import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc;
    private static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        testBookCollection();
        while (true) {
            sc = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. Show book collection");
            System.out.println("2. Add a new book");
            System.out.println("3. Update a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Quit");
            int choice = sc.nextInt();
            sc.nextLine(); // clear input buffer
            if (choice == 1) {
                showBookCollection();
            }
            if (choice == 2) {
                addNewBook();
            }
            if (choice == 3) {
                updateBook();
            }
            if (choice == 4) {
                deleteBook();
            }
            if (choice == 5) {
                break;
            }
        }
    }

    public static void showBookCollection() {
        System.out.println("List of Books in Collection");
        System.out.println("Total Number: " + bookList.size());
        System.out.println();
        for (Book book : bookList) {
            book.display();
            System.out.println();
        }
    }

    public static void addNewBook() {

        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter name of author: ");
        String author = sc.nextLine();
        System.out.print("Enter status (To Read/Reading/Finished): ");
        String status = sc.nextLine();
        System.out.print("Enter rating (between 0 to 5): ");
        double rating = sc.nextDouble();
        sc.nextLine();
        System.out.println("Type of Book? P=Physical, E=Electronic");
        String productType = sc.next();
        sc.nextLine(); // clear

        // check if adding a physical or electronic book
        if (productType.toLowerCase().equals("e")) {
            // adding a new electronic book
            System.out.println("Enter the source (Kindle/OverDrive/Kobo/Others)");
            String source = sc.nextLine();
            System.out.println("Enter the format (.epub or .pdf)");
            String format = sc.nextLine();

            ElectronicBook book = new ElectronicBook(title, author, status, rating, source, format);
            bookList.add(book);
            System.out.println("eBook added to collection successfully!");

        } else {
            // adding a new physical book
            System.out.println("Enter its location: ");
            String location = sc.nextLine();
            System.out.println("Enter the number of pages: ");
            int pages = sc.nextInt();

            PhysicalBook book = new PhysicalBook(title, author, status, rating, location, pages);
            bookList.add(book);
            System.out.println("Hardcopy book added to collection successfully!");

        }

    }

    public static void updateBook() {
        System.out.println();
        System.out.println("Update a Book");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Index: " + i);
            Book book = bookList.get(i);
            book.display();
            System.out.println();
        }

        System.out.print("Enter the index of the book that you want to edit: ");
        int index = sc.nextInt();
        sc.nextLine();

        Book bookToEdit = bookList.get(index);
        bookToEdit.editDetails(sc);
    }

    public static void deleteBook() {
        System.out.println();
        System.out.println("Remove a Book");
        for (int i = 0; i < bookList.size(); i++ ) {
            System.out.println("Index: " + i);
            Book book = bookList.get(i);
            book.display();
            System.out.println();
        }

        System.out.print("Enter the index no. of the book that you want to remove: ");
        int index = sc.nextInt();
        sc.nextLine();
        bookList.remove(index);
    }

    public static void testBookCollection() {
        
        PhysicalBook physicalBook1 = new PhysicalBook("Dare To Lead", "Brené Brown", "Reading", 0.0, "Home", 300);
        System.out.println(physicalBook1);
        bookList.add(physicalBook1);

        ElectronicBook electronicBook1 = new ElectronicBook("Great Expectations", "Charles Dickens", "Finished", 5, "NLB Overdrive", "Kobo eBook");
        System.out.println(electronicBook1);
        bookList.add(electronicBook1);
    }



}


