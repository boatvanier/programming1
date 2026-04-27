package oop;

public class Book {
    private String title;
    private String author;
    private double price;

    //default
    public Book() {
    }

    //Parameterized Constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("oop.Book Title: "+title
                + ", author: " + author + ", current price: " + price);
    }
    public void applyDiscount(double percentage) {
        price = price * (1-percentage);
    }
}
