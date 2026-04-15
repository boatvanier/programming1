public class Order {
    Product product;
    Customer customer;
    int quantity;

    static int totalOrders = 0;

    Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        totalOrders++;
    }

    Order(Product product){
        this.product = product;
        this.customer = new Customer();
        this.quantity = 1;
        totalOrders++;
    }

    double calculateTotal() {
        return product.price * quantity;
    }

    void displayOrder() {
        System.out.println("Customer " + customer.name
                + " ordered " + quantity + " " + product.name);
        System.out.println("The total price is "+ calculateTotal());
    }

    static void displaySystemStats() {
        System.out.println("Total Orders: " + totalOrders);
    }

}
