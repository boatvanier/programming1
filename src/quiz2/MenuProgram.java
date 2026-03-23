package quiz2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Choose option (1-3):");
        int choice = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter confirmation word YES:");
        String confirm = sc.nextLine();
        //int passcode;
        if (confirm.equals("YES")) {
            switch (choice) {
                case 1:
                    System.out.println(name + " setup your pin: ");
                    //passcode = sc.nextInt();
                    break;
                case 2:
//                    if (checkPin(passcode)) {
//                        searchProduct();
//                    }else {
//                        exit;
//                    }

                    System.out.println(name + " selected option 2");
                    break;
                case 3:
                    System.out.println(name + " selected option 3");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } else {
            System.out.println("Confirmation failed");
        }
    }catch (InputMismatchException e){
        System.out.println("invalid input");
    }
    sc.close();
    }
}