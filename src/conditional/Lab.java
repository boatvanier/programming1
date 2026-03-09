package conditional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab {
    public static void q1() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }

        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        sc.close();
    }

    public static void q2() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double firstNum = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double secondNum = sc.nextDouble();

            System.out.println("Enter operation (+ - * /): ");
            String op = sc.next();

            double result;
            switch (op.trim()){
                case "+":
                    result = firstNum+secondNum;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = firstNum-secondNum;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = firstNum*secondNum;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    if (secondNum == 0) {
                        System.out.println("cannot divide by zero");
                    } else {
                        result = firstNum+secondNum;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        sc.close();

    }

    public static void q4() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter a numeric grade (0–100): ");
            int grade = sc.nextInt();

            if (grade<0 || grade>100) {
                System.out.println("invalid grade");
            }else if (grade >= 90) {
                System.out.println("Grade: A");
            }else if (grade >= 80) {
                System.out.println("Grade: B");
            }else if (grade >= 70) {
                System.out.println("Grade: C");
            }else if (grade >= 60) {
                System.out.println("Grade: D");
            }else {
                System.out.println("failed.");
            }
        }catch (InputMismatchException e){
            System.out.println("invalid input");
        }
        sc.close();

    }

    public static void q5() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter product code:");
            String code = sc.nextLine();
            String first = code.substring(0,1).toUpperCase();
            switch(first){
                case "E":
                    System.out.println("Electronics");
                    break;
                case "F":
                    System.out.println("Food");
                    break;
                case "L":
                    System.out.println("Luxury");
                    break;
                default:
                    System.out.println("unknow category");
            }
        }catch (Exception e) {
            System.out.println("invalid product code");
        }
        sc.close();
    }
}
