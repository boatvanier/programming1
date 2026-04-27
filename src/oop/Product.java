package oop;

public class Product {
    private String name;
    private double price;
    private Category category;

    private static int totalProducts = 0;

    public Product() {
        name = "default";
        price = 0;
        totalProducts++;
    }

    public Product(String name, double price, Category category) {
        if (isNameValid(name)) {
            this.name = name;
        } else {
            this.name = "unknow";
        }
        this.price = price;
        this.category = category;
        totalProducts++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){

        if(isNameValid(name)) {
            this.name = name;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if ( price > 0) {
            this.price = price;
        }
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public void displayProduct() {
        System.out.println("Product: " + this.name
                + ", price: " + this.price
        + ", category: " + this.category);
        System.out.println("currently there are totally " + totalProducts + " products");
    }

    private boolean isNameValid(String name){
        if (name != null && !name.isBlank()) {
            return true;
        }
        return false;
    }
}
