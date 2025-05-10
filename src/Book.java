public class Book {
    private String title;
    private String author;
    private String status;
    private double rating;

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
}


