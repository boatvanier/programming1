public class Customer {
    String name;
    String email;

    Customer(){
        this.name = "default";
        this.email = "default_customer@email.com";
    }

    Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    void displayCustomer() {
        System.out.println("Customer: "+name+", email: "+email);
    }
}
