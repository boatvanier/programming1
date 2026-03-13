package conditional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoreLabs {
    public static void temperatureAdvisor() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter temperature: ");
            double temp = sc.nextDouble();

            if (temp < 0) {
                System.out.println("Wear a heavy coat");
            } else if (temp <= 15) {
                System.out.println("Wear a jacket");
            } else if (temp <= 25) {
                System.out.println("Light clothing");
            } else {
                System.out.println("Very hot");
            }
        }catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        sc.close();
    }

    public static void usernameValidator() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (username.trim().matches("[A-Za-z][A-Za-z0-9]{4,11}")) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }

    public static void parkingFee() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Hours parked: ");
            double hours = sc.nextDouble();
            double fee;

            if (hours <= 2) {
                fee = hours * 5;
            } else if (hours <= 5) {
                fee = (2 * 5) + (hours - 2) * 4;
            } else {
                fee = (2 * 5) + (3 * 4) + (hours - 5) * 3;
            }

            if (fee > 30) {
                fee = 30;
            }

            System.out.println("Parking fee: $" + fee);
        }catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        sc.close();
    }
    public static void onlineOrder() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Amount: ");
            double amount = sc.nextDouble();

            System.out.print("Membership (G/S/N): ");
            char membership = sc.next().charAt(0);

            double discount = 0;

            switch (membership) {
                case 'G':
                    if (amount >= 100) {
                        discount = 0.20;
                    }
                    break;

                case 'S':
                    if (amount >= 100) {
                        discount = 0.10;
                    }
                    break;

                case 'N':
                    if (amount >= 100) {
                        discount = 0.05;
                    }
                    break;
            }

            double finalPrice = amount - (amount * discount);
            System.out.println("Final price: " + finalPrice);
        }catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("invalid input");
        }

        sc.close();
    }
    public static void phoneFormat() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        String cleaned = phone.replaceAll("[ -]", "");

        System.out.println("After cleaning: " + cleaned);

        if (cleaned.matches("\\d{10}")) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }

        sc.close();
    }
}
