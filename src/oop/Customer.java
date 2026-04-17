package oop;

public class Customer {
    private String name;
    private String email;

    public Customer(){
        this.name = "default";
        this.email = "default_customer@email.com";
    }

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayCustomer() {
        System.out.println("Customer: "+name+", email: "+email);
    }
}
