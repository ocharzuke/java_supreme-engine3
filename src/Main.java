public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Great Expectations");
        book1.setAuthor("Charles Dickens");
        book1.setStatus("Reading");
        book1.setRating(3.5);

        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Status: " + book1.getStatus());
        System.out.println("Rating: " + book1.getRating());

    }
}
