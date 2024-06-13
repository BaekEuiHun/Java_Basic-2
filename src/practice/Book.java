package practice;

public class Book {
    String author;
    String title;
    int page;


    public Book(String author, String title, int page) {
        this.author = author;
        this.title = title;
        this.page = page;


    }

    public Book(String author, String title) {
        this(author, title, 0);

    }

    public Book() {
        this("", "", 0);


    }

    void displayInfo() {
        System.out.println("Author: " + author + "\nTitle: " + title + "\nPage: " + page);
    }
}
