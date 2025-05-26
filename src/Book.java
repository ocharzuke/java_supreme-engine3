import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String status;
    private double rating;

    public Book() {
        // default constructor
        this.title = "N/A";
        this.author = "N/A";
        this.status = "To Read";
        this.rating = 0.0;

    }

    public Book(String title, String author, String status, double rating) {
        // overloaded constructor
        this.title = title;
        this.author = author;
        this.status = status;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid book title. Please provide a non-empty string.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author != null & !author.isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Invalid author name. Please provide a non-empty string.");
        }
    }

    public String getStatus() {
        return status;

    }

    public void setStatus(String status) throws IllegalArgumentException {
        if (status != null & !status.isEmpty()) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status. Please state either To Read/Reading/Finished.");
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) throws IllegalArgumentException {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Invalid rating. Please provide a value between 0 and 5.");
        }
    }

    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Status: " + getStatus());
        System.out.println("Rating: " + getRating());
    }

    public void editDetails(Scanner sc) {
        System.out.println("Please enter the new title or press ENTER to leave it unchanged: ");
        String newTitle = sc.nextLine();
        if (!newTitle.equals("")) { // if user enters a string that is not empty
            setTitle(newTitle); // then update the string name to that of user input
        }

        System.out.println("Please enter the new author or press ENTER to leave it unchanged: ");
        String newAuthor = sc.nextLine();
        if (!newAuthor.equals("")) {
            setAuthor(newAuthor);
        }

        System.out.println("Please enter the new status or press ENTER to leave it unchanged: ");
        String newStatus = sc.nextLine();
        if (!newStatus.equals("")) {
            setStatus(newStatus);
        }

        System.out.println("Please enter the new rating or press ENTER to leave it unchanged: ");
        String tempRating = sc.nextLine();
        if (!tempRating.equals("")) {
            double newRating = Double.parseDouble(tempRating);
            setRating(newRating);

        }
    }
}


