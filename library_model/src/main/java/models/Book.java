package models;

import java.text.MessageFormat;
import java.util.Objects;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private static boolean isAvailable;


    public Book() {
    }

    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static boolean isIsAvailable() {
        return isAvailable;
    }

    public static void setIsAvailable(boolean isAvailable) {
        Book.isAvailable = isAvailable;
    }


    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s", this.getBookID(), this.getTitle(), this.getAuthor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getBookID().equals(book.getBookID()) && getTitle().equals(book.getTitle()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookID(), getTitle(), getAuthor());
    }
}
