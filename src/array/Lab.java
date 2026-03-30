package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab {
    public static void show() {
        int[] numbers = {1,2,3,4,5};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i=1; i< numbers.length; i ++) {
            System.out.println(numbers[i]);
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("largest number is " + largest);
        System.out.println("smallest number is " + smallest);



        //Q2
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        boolean isFound = false;
        try {
            int input = sc.nextInt();
            for (int number: numbers) {
                if (number == input) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }

        } catch (InputMismatchException e){
            System.out.println("invalid input");
        }

        //Q3
        int[] reversed = new int[5];
        int j=0;
        for(int i= numbers.length -1; i>=0; i--) {
            reversed[j] = numbers[i];
            j++;
            System.out.println(numbers[i]);
        }

        //Q4
        System.out.println("Enter a number: ");
        int count = 0;
        try {
            int input = sc.nextInt();
            for (int number: numbers) {
                if (number == input) {
                    count++;
                }
            }

            System.out.println("Occurrences: " + count);
        } catch (InputMismatchException e){
            System.out.println("invalid input");
        }

        //Q5
        String[] names = new String[5];
        //sc.nextLine();
        for(int i =0; i<names.length; i++){
            System.out.println("Enter a name:");
            names[i] = sc.nextLine();
        }

        System.out.println("All the names start with A: ");
        for (String name: names){
            if(name.startsWith("A")){
                System.out.println(name);
            }
        }

        sc.close();
    }
}
