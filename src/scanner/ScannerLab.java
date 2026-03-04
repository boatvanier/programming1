package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerLab {
    public void show() {
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
