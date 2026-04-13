public class Book {
    String title;
    String author;
    double price;

    //default
    Book() {
    }

    //Parameterized Constructor
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Book Title: "+title
                + ", author: " + author + ", current price: " + price);
    }
    void applyDiscount(double percentage) {
        price = price * (1-percentage);
    }
}
