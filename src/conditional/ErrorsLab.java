package conditional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorsLab {
    public static void q1() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            sc.nextLine(); // consume next line
            System.out.println("Enter operation (+, -, *, /): ");
            String op = sc.nextLine();
            int result = 0;
            if ("+".equals(op)) {// use "equals"
                result = num1 + num2;
            } else if ("-".equals(op)) {
                result = num1 - num2;
            } else if ("*".equals(op)) {
                result = num1 * num2;
            } else if ("/".equals(op)) {
                result = num1 / num2;
            } else {
                System.out.println("Invalid operation");
            }
            System.out.println("Result = " + result);
        }catch (InputMismatchException | ArithmeticException e) { //manage input and math errors
            System.out.println("invalid input");
        }
        sc.close(); // don't forget to close the scanner
    }

    public static void q2() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter weight in kg: ");
            double weight = sc.nextDouble();
            if (weight <= 0 ) {// valid input, manually throw an exception
                throw new Exception("The weight should be a positive number.");
            }
            System.out.println("Enter height in meters: ");
            double height = sc.nextDouble();
            if (height <= 0) {// valid input, manually throw an exception
                throw new Exception("The heigh should be a positive number.");
            }
            double bmi = weight / (height * height);//make sure the calculation is good
            System.out.println("Your BMI is: " + bmi);
            if (bmi < 18.5){
                System.out.println("Underweight");
            }else if (bmi < 25){
                System.out.println("Normal weight");
            }else if (bmi < 30){
                System.out.println("Overweight");
            }else{
                System.out.println("Obese");
            }
        }catch (InputMismatchException e){ // handle exceptions
            System.out.println("invalid input");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();// don't forget to close scanner
    }
    public static void q3() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter ticket type (adult/child): ");
            String type = sc.nextLine();
            System.out.println("Enter number of tickets: ");
            int count = sc.nextInt();
            if(count < 0) {// input validation
                throw new Exception("the ticket number can not be negative.");
            }
            double price = 0;
            if ("adult".equals(type)) { // use "equals"
                price = 20;
            } else if ("child".equals(type)) {
                price = 10;
            } else {
                throw new Exception("invalid ticket type");
            }
            double total = price * count;
            System.out.println("Total price: $" + total);
        }catch (InputMismatchException e) {//handle the exceptions
            System.out.println("invalid input");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        sc.close(); // don't forget to close the scanner
    }
}
