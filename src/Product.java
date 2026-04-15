public class Product {
    String name;
    double price;

    Product() {
        name = "default";
        price = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product: " + this.name + ", price: " + this.price );
    }
}
