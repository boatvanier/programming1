import conditional.Lab;
import loops.ForLoops;
import loops.WhileLoops;
import method.Examples;
import scanner.ScannerExamples;
import scanner.ScannerLab;
import varaibles.*;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Toyota";
        car1.color = "White";
        car1.speed = 100;
        car2.brand = "Honda";
        car2.color = "Black";
        car2.speed = 120;
        Car car3 = new Car("Mazda","red");
        Car car4 = new Car("Ford", "Blue", 130);

        System.out.println(car1.speed);
        System.out.println(car2.speed);
        car1.speed = 110;

        System.out.println(car1.speed);
        System.out.println(car2.speed);

        car1.displayInfo();
        car1.accelerate();
        car1.displayInfo();

        System.out.println(Car.counter);
        Car.showCounter();

//            Product p1 = new Product();
//            p1.displayProduct();
//            Product p2 = new Product("Camera", 3000);
//            p2.displayProduct();
//
//            Customer c1 = new Customer("Jack", "jack@email.com");
//            c1.displayCustomer();
//            Customer c2 = new Customer();
//            c2.displayCustomer();
//            c2.name = "Rose";
//            c2.email="rose@email.com";
//            c2.displayCustomer();
//
//            Order o1= new Order(p2,c2,2);
//            o1.displayOrder();
//            Order o2 = new Order(p2);
//            o2.displayOrder();
//            Order o3 = new Order(p1, c2, 1);

    }

}