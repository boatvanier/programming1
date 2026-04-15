public class Order {
    Product product;
    Customer customer;
    int quantity;

    Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    Order(Product product){
        this.product = product;
        this.customer = new Customer();
        this.quantity = 1;
    }

    double calculateTotal() {
        return product.price * quantity;
    }

    void displayOrder() {
        System.out.println("Customer " + customer.name
                + " ordered " + quantity + " " + product.name);
        System.out.println("The total price is "+ calculateTotal());
    }
}
