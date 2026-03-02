import scanner.ScannerExamples;
import varaibles.*;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


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

        //int x = 10/0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter your name: ");
            String name = sc.next();
            System.out.print("enter your age: ");
            int age = sc.nextInt();
            System.out.print("enter your height: ");
            double height = sc.nextDouble();
            System.out.print("enter your country: ");
            //sc.skip("country:");
            String country = sc.next();

            System.out.println(String.format("Welcome %s, you are %d yrs-old, " +
                            "your height is %.2f, you are from %s"
            , name, age, height, country));
        } catch (InputMismatchException e){
            System.out.println("Invalid input!");
        } catch (NoSuchElementException e){
            System.out.println("");
        }
        System.out.println("program ends");
        sc.close();
    }
}