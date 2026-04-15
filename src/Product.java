public class Product {
    String name;
    double price;

    static int totalProducts = 0;

    Product() {
        name = "default";
        price = 0;
        totalProducts++;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        totalProducts++;
    }

    void displayProduct() {
        System.out.println("Product: " + this.name + ", price: " + this.price );
    }
}
