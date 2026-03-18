package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void examples(){

//        String correctPassword = "java123";
//        Scanner sc = new Scanner(System.in);
//        String userInput = "";
//        while(!userInput.equals(correctPassword)) {
//            System.out.println(" Enter the password: ");
//            userInput = sc.nextLine();
//        }
//
//        sc.close();
        int i = 5;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }

        do
        {
            System.out.println(i);
            i++;
        }while(i < 5);

    }

    public static void labQ1(){
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while(i >= 1);
        System.out.println("Lift off!");
    }
    public static void labQ2(){
        Scanner sc = new Scanner(System.in);
        String correctPin = "1234";
        int attempts = 3;
        boolean isGranted = false;
        while (!isGranted && attempts > 0) {
            System.out.println("Enter Pin: ");
            String pin = sc.nextLine();
            if (pin.equals(correctPin)) {
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
    public static void labQ3(){
        Scanner sc = new Scanner(System.in);
        String password="";
        while(password.length()<6) {
            System.out.println("Enter Password: ");
            password = sc.nextLine();

            if (password.length()<6) {
                System.out.println("too short");
            }
        }
        System.out.println("Accepted");
        sc.close();
    }
    public static void labQ4(){
        Scanner sc = new Scanner(System.in);
        String secret = "7";
        String guess="";
        while(!secret.equals(guess)) {
            System.out.println("Guess number: ");
            guess = sc.nextLine();

            if (!secret.equals(guess)) {
                System.out.println("Wrong");
            }
        }
        System.out.println("Correct");
        sc.close();
    }
    public static void labQ5(){
        Scanner sc = new Scanner(System.in);
        String input;
        do{
            System.out.println("1. Start Game ");
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    // play game
                    break;
                case "2":
                    // introduce the game
                    break;
                case "3":
                    break;
                default:
            }
        }while(!"3".equals(input));
        sc.close();
    }
    public static void labQ6(){
        int i=0;
        while(i<50){
            if (i%3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
