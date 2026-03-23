import conditional.Lab;
import loops.ForLoops;
import loops.WhileLoops;
import scanner.ScannerExamples;
import scanner.ScannerLab;
import varaibles.*;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
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


            printStars();
            sayHello("Bo");
            System.out.println("today is a good day");

            for(int i=0; i<3; i++) {
                printStars();
            }

            int x = 1;
            int y = 2;
            int result = sum(x,y);
            System.out.println(result);

            System.out.println(isEven(x));
            System.out.println(isEven(y));
        }

        public static boolean isEven(int a) {
//        if (a % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
            return a % 2 == 0;

        }
        public static int sum(int a, int b) {
            int c = a+b;
            return c;
        }
        // wordWord camel case
        public static void printStars() {
            System.out.println("**********");
        }

        public static void sayHello(String name) {
            System.out.println("hello!");
            System.out.println("my name is " +name);
        }
    }