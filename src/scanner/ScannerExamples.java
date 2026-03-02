package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerExamples {
    public static void show() {
        //        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = sc.next();// '\n'
//        //sc.nextLine();
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();// '\n'
//        System.out.print("Enter your height: ");
//        double height = sc.nextDouble();// '\n'
//        System.out.print("who is your teacher? ");
//        String teacher = sc.nextLine();
//
//        System.out.println(
//                String.format("Hello, %s , you are %d yrs-old, your height is %f, %s" ,
//                        name, age, height, teacher ));
//        sc.close();

//        Scanner sc = new Scanner("10,20,30");
//        sc.useDelimiter(",");
//
//        if (sc.hasNextInt()) {
//            System.out.println(sc.nextInt());
//        }
//        if (sc.hasNextInt()) {
//            System.out.println(sc.nextInt());
//        }
//        if (sc.hasNextInt()) {
//            System.out.println(sc.nextInt());
//        }
//
//        sc.close();

//        String str = "Name:Alice,Age:25,Height:5.5,Country:CA";
//        Scanner sc = new Scanner(str);
//        try {
//            sc.useDelimiter(",");
//            String name;
//            sc.skip("Name:");
//            name = sc.next();
//
//            sc.skip("Age:");
//            int age = sc.nextInt();
//
//            sc.skip(",Height:");
//            double height = 0.0;
//            if (sc.hasNextDouble()) {
//                height = sc.nextDouble();
//            }
//
//            sc.skip(",Country:");
//            String country = sc.next();
//
//            System.out.println("Name: " + name);
//            System.out.println("Age: " + age);
//            System.out.println("Height: " + height);
//            System.out.println("Country:" + country);
//        }catch (NoSuchElementException e) {
//            System.out.println("the pattern for skip is not found.");
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.print("enter your name: ");
//            String name = sc.next();
//            System.out.print("enter your age: ");
//            int age = sc.nextInt();
//            System.out.print("enter your height: ");
//            double height = sc.nextDouble();
//            System.out.print("enter your country: ");
//            //sc.skip("country:");
//            String country = sc.next();
//
//            System.out.println(String.format("Welcome %s, you are %d yrs-old, " +
//                            "your height is %.2f, you are from %s"
//                    , name, age, height, country));
//        } catch (InputMismatchException e){
//            System.out.println("Invalid input!");
//        }
//        System.out.println("program ends");
//        sc.close();

        Scanner sc = null;
        try {
            sc = new Scanner(new File("test.txt"));
            String file=sc.nextLine();
            System.out.println(file);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file found");
        }

    }
}
