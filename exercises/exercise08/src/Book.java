import java.util.ArrayList;

public class Book {
    private String title;
    private int publishedYear;
    private int numberOfPages;
    private ArrayList<String> authors;

    public Book(String title, int publishedYear, int numberOfPages, ArrayList<String> authors) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }
    public String getTitle() {
        return title;
    }
    public int getPublishedYear() {
        return publishedYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Title: ").append(title).append("\n");
        builder.append("Published Year: ").append(publishedYear).append("\n");
        builder.append("Number of Pages: ").append(numberOfPages).append("\n");
        builder.append("Authors: ");
        for (int i = 0; i < authors.size(); i++) {
            builder.append(authors.get(i));
            if (i != authors.size() - 1) {
                builder.append(", ");
            }
        }
        builder.append("\n");
        return builder.toString();
    }
}
