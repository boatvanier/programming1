package oop;

public class Product {
    private String name;
    private double price;

    private static int totalProducts = 0;

    public Product() {
        name = "default";
        price = 0;
        totalProducts++;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        totalProducts++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if ( price > 0) {
            this.price = price;
        }
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public void displayProduct() {
        System.out.println("Product: " + this.name + ", price: " + this.price );
    }
}
