package org.example;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeByTitle(String title){
        books.removeIf(b -> b.getTitle().equals(title));
    }

    public List<Book> findByYear(int year) {
        return books.stream()
                .filter(b -> b.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public Book findMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    public List<Book> findPageCount(int pageCount) {
        return books.stream()
                .filter(book -> book.getPages() > pageCount)
                .collect(Collectors.toList());
    }

    public void printAllTitlesSorted() {
        List<String> sortedTitles = books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());

        sortedTitles.forEach(System.out::println);
    }

    public List<Book> findByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public void loanBook(User user, Book book) {
        if(!book.isOnLoan()){
            book.setIsOnLoan(true);
            user.getLoanedBooks().add(book);
        }
    }

    public void returnBook(User user, Book book) {
        if(user.getLoanedBooks().contains(book)){
            book.setIsOnLoan(false);
            user.getLoanedBooks().remove(book);
        }
    }
}