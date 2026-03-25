package method;

import java.util.Scanner;

public class Labs {
    public static boolean isCorrectPin(int pin) {
        return pin == 1234;
    }
    //        Correct PIN = 1234
//        The user has 3 attempts using a loop.
//        If correct → print Access Granted
//        If not → print Card Blocked
    public static void checkPin(int pin) {
        Scanner sc = new Scanner(System.in);
        String correctPin = String.valueOf(pin);
        int attempts = 3;
        boolean isGranted = false;
        while (!isGranted && attempts > 0) {
            System.out.println("Enter Pin: ");
            String input = sc.nextLine();
            if (input.equals(correctPin)) {
                System.out.println("Access Granted");
                isGranted = true;
            } else {
                attempts --;
            }
        }

        if ( !isGranted ) {
            System.out.println("Card Blocked");
        }
        sc.close();
    }
    //        at least 8 characters
//        must contain a number
//        must contain a capital letter
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasNumber = false;
        boolean hasCapitalLetter = false;
        //"abcdefg"
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasNumber = true;
            }

            if (Character.isUpperCase(ch)) {
                hasCapitalLetter = true;
            }
        }
//            if (hasNumber && hasCapitalLetter) {
//                return true;
//            } else {
//                return false;
//            }
        return hasNumber && hasCapitalLetter;
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
    public static int countDigit(int number) {
        int count = 0;
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }

        while (number > 0) {
            number = number /10;
            count ++;
        }
        return count;
    }
    public static int countDigitWithString(int number) {
        number = Math.abs(number);
        return String.valueOf(number).length();
    }


}
