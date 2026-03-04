package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerLab {
    public static void showQ1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.println("\nAge: " + age);
        System.out.println("Height: " + height);
        System.out.println("City: " + city);

        sc.close();
    }

    public static void showQ2() {
        String input = "John 20 3.8 true";
        Scanner sc = new Scanner(input);

        String name = "";
        int age = 0;
        double gpa = 0.0;
        boolean status = false;

        if (sc.hasNext()) {
            name = sc.next();
        }

        if (sc.hasNextInt()) {
            age = sc.nextInt();
        }

        if (sc.hasNextDouble()) {
            gpa = sc.nextDouble();
        }

        if (sc.hasNextBoolean()) {
            status = sc.nextBoolean();
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Student: " + status);

        sc.close();
    }
    public static void showQ3() {
        String data = "User:Tom,Age:30,GPA:3.9";
        Scanner sc = new Scanner(data);

        sc.useDelimiter(",");

        sc.skip("User:");
        String name = sc.next();

        sc.skip("Age:");
        int age = 0;
        if (sc.hasNextInt()) {
            age = sc.nextInt();
        }

        sc.skip("GPA:");
        double gpa = 0.0;
        if (sc.hasNextDouble()) {
            gpa = sc.nextDouble();
        }

        System.out.println(name + " is " + age + " years old with GPA " + gpa);

        sc.close();
    }
    public static void showQ4() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();

            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
    public static void showQ5() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("students.txt"));
            String firstLine = sc.nextLine();
            //String[] arr = firstLine.split(",");
            sc = new Scanner(firstLine);
            sc.useDelimiter(",");

            String name = sc.next();
            int age = sc.nextInt();
            double gpa = sc.nextDouble();
            System.out.println("Student: " + name);
            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (InputMismatchException e) {
            System.out.println("input invalid");
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("finally");
        }
    }
}
