package oop;

public class Order {
    private Product product;
    private Customer customer;
    private int quantity;

    private static int totalOrders = 0;

    public Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        totalOrders++;
    }

    public Order(Product product){
        this.product = product;
        this.customer = new Customer();
        this.quantity = 1;
        totalOrders++;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    double calculateTotal() {
        return product.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("Customer " + customer.getName()
                + " ordered " + quantity + " " + product.getName());
        System.out.println("The total price is "+ calculateTotal());
    }

    public static void displaySystemStats() {
        System.out.println("Total Orders: " + totalOrders);
    }

}
