package services;

import models.Book;
import models.User;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public interface LibraryServices {
    public String addBooks(HashMap<Book, Integer> booksList, Book book, Integer noOfCopies);
    public String giveBookToUser(Queue<User> userPriorityQueue);
    public String displayAllBooks(HashMap<Book, Integer> booksAvailable);
    public String checkAvailability(HashMap<Book, Integer> booksAvailable, Book book);
}

