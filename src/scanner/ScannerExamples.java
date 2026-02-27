package scanner;

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

        Scanner sc = new Scanner("10,20,30");
        sc.useDelimiter(",");

        if (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
        if (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
        if (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }

        sc.close();
    }
}
