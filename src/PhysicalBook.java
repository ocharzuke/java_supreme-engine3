import java.util.Scanner;

public class PhysicalBook extends Book {
    private String location;
    private int pages;

    public PhysicalBook() {
        super();
        this.location = "N/A";
        this.pages = 0;
    }

    public PhysicalBook(String title, String author, String status, double rating, String location, int pages) {
        super(title, author, status, rating);
        this.location = location;
        this.pages = pages;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", PhysicalBook [location=" + location + ", pages=" + pages + "]";
//    }

    @Override
    public void display() {
        super.display();
        System.out.println(("Location: " + getLocation()));
        System.out.println("Pages: " + getPages());
    }

    @Override
    public void editDetails(Scanner sc) {
        super.editDetails(sc);
        System.out.println("Please enter the new location or press ENTER to leave it unchanged: ");
        String newLocation = sc.nextLine();
        if (! newLocation.equals("")) {
            setLocation(newLocation);
        }


        System.out.println("Please enter the new number of pages or press ENTER to leave unchanged: ");
        String tempPages = sc.nextLine();
        if (!tempPages.equals("")) {
            int newPages = Integer.parseInt(tempPages);
            setPages(newPages);
        }
    }

}

