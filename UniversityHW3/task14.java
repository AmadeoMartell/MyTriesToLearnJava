package UniversityHW3;

import java.util.ArrayList;

/*
Library Management: Create Book and Library classes.
Book should contain information about a book (title, author, publication year).
Library should have methods to add a book to the library and display the list of books.
 */
public class task14 {
    public static void main(String[] args) {
        Library library = new Library();
        library.AddBook(new Book("Mainkampf", "Adolf G.", 1924));
        library.AddBook(new Book("Как окончить АЙТУ", "Медеу А.", 2026));
        library.AddBook(new Book("Title1", "Name1", 1111));
        library.List();
    }
}
class Book{
    private String title, author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}
class Library{
    private static ArrayList<Book> Books = new ArrayList<>();
    public void AddBook(Book book){
        Books.add(book);
    }
    public void List(){
        System.out.println("List of books: ");
        for (Book iter: Books) {
            System.out.println(iter);
        }
    }
}
