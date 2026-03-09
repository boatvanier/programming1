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
}
