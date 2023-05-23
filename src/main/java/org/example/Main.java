package org.example;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("First Book","William",1994, 240, "Novel");
        Book book2 = new Book("Second Book","Sam",1980, 112, "Non-Fiction");
        Book book3 = new Book("Third Book","Rachel",2014, 302, "Self-Help");
        Book book4 = new Book("Fourth Book","Taylor",2001, 54, "Novel");
        Book book5 = new Book("Fifth Book","Ben",1856, 96, "Fiction");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.removeByTitle("First Book");
        library.printAllTitlesSorted();

        library.findByYear(2001);

        library.findByAuthor("Sam");

        library.findMostPages();

        library.findPageCount(65);


    }
}
