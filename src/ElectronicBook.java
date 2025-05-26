import java.util.Scanner;

public class ElectronicBook extends Book {
    private String source;
    private String format;

    public ElectronicBook() {
        super();
        this.source = "N/A";
        this.format = "N/A";
    }

    public ElectronicBook(String title, String author, String status, double rating, String source, String format) {
        super(title, author, status, rating);
        this.source = source;
        this.format = format;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(("Source: " + getSource()));
        System.out.println("Format: " + getFormat());
    }

    @Override
    public void editDetails(Scanner sc) {
        super.editDetails(sc);
        System.out.println("Please enter the new source or press ENTER to leave it unchanged: ");
        String newSource = sc.nextLine();
        if (! newSource.equals("")) {
            setSource(newSource);
        }

        System.out.println("Please enter the new format or press ENTER to leave it unchanged: ");
        String newFormat = sc.nextLine();
        if (! newFormat.equals("")) {
            setFormat(newFormat);
        }

    }

}
