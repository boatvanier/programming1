import animal.Animal;
import animal.Species;
import oop.Bank;
import oop.BankAccount;
import oop.Category;
import oop.Product;

import java.util.ArrayList;
import java.util.List;


public class Main {
    //everything inside belongs to the Main class

    public static void main(String[] args) {
        //everything inside belongs to the main method
        //StringExample.show();
        //StringLab.show();
        //VariableExample.show();
        //VariableLab.show();
        //OperatorsExample.show();

        //ScannerExamples.show();
        //ScannerLab.showQ1();
        //ScannerLab.showQ2();
        //ScannerLab.showQ3();
        //ScannerLab.showQ4();
        //ScannerLab.showQ5();

        //Conditional Statement lab
        //Lab.q1();
        //Lab.q2();
        //Lab.q4();
        //Lab.q5();


//        printStars();
//        sayHello("Bo");
//        System.out.println("today is a good day");
//
//        for(int i=0; i<3; i++) {
//            printStars();
//        }
//
//        int x = 1;
//        int y = 2;
//        int result = sum(x,y);
//        System.out.println(result);
//
//        System.out.println(isEven(x));
//        System.out.println(isEven(y));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your password: ");
//        String password = sc.nextLine();
//
//        if (isStrongPassword(password)) {
//            System.out.println("This is a strong password.");
//        }else{
//            System.out.println("This is not a strong password");
//        }
//        sc.close();
//
//        int correctPin =1234;
//        checkPin(correctPin);

//        //pass by value
//        Examples.passByValue();
//
//        //pass by reference
//        Examples.passByReference();
//
//        //method overloading
//        Examples.methodOverloading();
//        int[] numbers = {1,9,3,10,5,8};
//        System.out.println(numbers[3]);
//

//        oop.Car car1 = new oop.Car();
//        oop.Car car2 = new oop.Car();
//        car1.brand = "Toyota";
//        car1.color = "White";
//        car1.speed = 100;
//        car2.brand = "Honda";
//        car2.color = "Black";
//        car2.speed = 120;
//        oop.Car car3 = new oop.Car("Mazda","red");
//        oop.Car car4 = new oop.Car("Ford", "Blue", 130);
//
//        System.out.println(car1.speed);
//        System.out.println(car2.speed);
//        car1.speed = 110;
//
//        System.out.println(car1.speed);
//        System.out.println(car2.speed);
//
//        car1.displayInfo();
//        car1.accelerate();
//        car1.displayInfo();
//
//        System.out.println(oop.Car.counter);
//        oop.Car.showCounter();

//        Product p1 = new Product();
//        p1.setCategory(Category.HOME);
//        p1.displayProduct();
//        Product p2 = new Product("Camera", 3000, Category.ELECTRONICS);
//        p2.displayProduct();
//        Product p3 = new Product("shirt", 50, Category.CLOTHING);
//        p3.displayProduct();
//
//
//        Customer c1 = new Customer("Jack", "jack@email.com");
//        c1.displayCustomer();
//        Customer c2 = new Customer();
//        c2.displayCustomer();
//        c2.setName("Rose");
//        c2.setEmail("rose@gmail.com");
////        c2.name = "Rose";
////        c2.email="rose@email.com";
//        System.out.println(c2.getName());
//        c2.displayCustomer();
//
//        Order o1= new Order(p2,c2,2);
//        o1.displayOrder();
//        Order o2 = new Order(p2);
//        o2.displayOrder();
//        Order o3 = new Order(p1, c2, 1);
//
//        Order.displaySystemStats();

//        Animal dog = new Animal(30, Species.DOG, "Doggy", "A001");
//        Animal cat = new Animal(20, Species.CAT, "Meow", "A002");
//        dog.displayInfo();
//        dog.loseWeightByPercentage(20);
//        dog.displayInfo();
//        System.out.println("total animals: " +Animal.getAnimalCount());

        BankAccount account1 = new BankAccount("000001", 0);
        BankAccount account2 = new BankAccount("000002", 10);
        BankAccount account3 = new BankAccount("000003", 15);

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;

        double total = 0;
        for (BankAccount account : accounts) {
            account.deposit(100);
            total += accounts[0].getBalance();
        }
        System.out.println(total);

        try {
            account3.deposit(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        Bank bank = new Bank(accounts);
        bank.transferMoney(account1, account2, 2);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        System.out.println(Product.getTotalProducts());
        Product p= new Product();
        p.setCategory(Category.HOME);
        p.setName("decoration");
        p.setPrice(20);
        p.displayProduct();
    }

}