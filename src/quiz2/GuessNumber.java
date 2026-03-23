package quiz2;

import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int secret = 8;
        int guess = 0;
        int attempts = 0;

        while (attempts < 5) //use while loop(do not change this line)
        {
            System.out.println("Enter your guess:");

            while(!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("invalid input, enter your guess:");
            }
            guess = sc.nextInt();
            sc.nextLine();

            if (guess > secret) {
                System.out.println("Too big");
            } else if (guess < secret) {
                System.out.println("Too small");
            } else {
                System.out.println("Correct!");
                break;
            }
            attempts++;
        }

        sc.close();
    }
}