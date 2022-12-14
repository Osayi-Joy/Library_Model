package models;
import Enums.TypeOfUser;

import java.text.MessageFormat;
import java.util.Comparator;
import java.util.Objects;


public class User {
    private String name;
    private String userID;
    private TypeOfUser typeOfUser;
    private static boolean hasCollectedABook;
    private String bookName;


    public User(String name, String userID, TypeOfUser typeOfUser, String bookName) {
        this.name = name;
        this.userID = userID;
        this.typeOfUser = typeOfUser;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public TypeOfUser getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(TypeOfUser typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public static boolean isHasCollectedABook() {
        return hasCollectedABook;
    }

    public static void setHasCollectedABook(boolean hasCollectedABook) {
        User.hasCollectedABook = hasCollectedABook;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s\n", this.getUserID(), this.getName(), this.getTypeOfUser(), this.getBookName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getName().equals(user.getName()) && getUserID().equals(user.getUserID()) && getTypeOfUser() == user.getTypeOfUser() && getBookName().equals(user.getBookName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getUserID(), getTypeOfUser(), getBookName());
    }
}