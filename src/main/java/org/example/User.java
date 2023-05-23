package org.example;
import java.util.List;

public class User {
    private String name;
    private int libraryCardNumber;
    private List<Book> loanedBooks;

    public User(String name, int libraryCardNumber, List<Book> loanedBooks) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.loanedBooks = loanedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public List<Book> getLoanedBooks() {
        return loanedBooks;
    }

    public void setLoanedBooks(List<Book> loanedBooks) {
        this.loanedBooks = loanedBooks;
    }
}
