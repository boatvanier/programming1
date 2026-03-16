package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ForLoops {
    public static void examples() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number: ");
//        int n = sc.nextInt();
////        int n = 7;
//        for(int i = 1; i <= n ; i++)
//        {
//            System.out.println(n + " * " + i + " = " + n*i );
//        }
//        sc.close();


        //nested loop
//       for(int i=1; i<=3; i++){
//            for(int j=1; j<=4; j++) {
//                System.out.println(i + "  " +j);
//            }
//            System.out.println();
//        }

//1 * 1 = 1
//2 * 1 = 2
//2 * 2 = 4
//3 * 1 = 3
//3 * 2 = 6
//3 * 3 = 9
//
//
//9 * 9 = 81

        for(int n=1; n<=9; n++) {
            for (int i = 1; i <= n; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }

    }
    public static void labQ1() {
        String correctPassword = "java123";
        Scanner sc = new Scanner(System.in);
        boolean isGranted = false;
        String userInput;
        for(int i=1; i<=3; i++) {
            System.out.println("Attempt " + i + " Enter the password: ");
            userInput = sc.nextLine();

            if (userInput.equals(correctPassword)){
                System.out.println("Access Granted");
                isGranted = true;
                break;
            }
        }

        if (!isGranted) {
            System.out.println("Access denied");
        }
        sc.close();

    }
    public static void labQ2() {
        Scanner sc = new Scanner(System.in);
        double temperature;
        try{
            for(int day=1; day<=7; day++) {
                System.out.print("enter the temperature for day "+ day + ":");
                temperature = sc.nextDouble();
                if (temperature > 30) {
                    System.out.println("Hot");
                } else if (temperature>=20) {
                    System.out.println("Warm");
                } else {
                    System.out.println("Cold");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        sc.close();

    }
    public static void labQ3() {
        for(int row=1; row<=5; row++) {
            System.out.print("Row"+row+":");
            for(int spot=1; spot<=8; spot++){
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
