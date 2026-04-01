package method;

import java.util.Scanner;

public class PassByReferenceLab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- Q1 ----------------
        int[] numbers1 = userInput(6, sc);

        printOutArray(numbers1);
        changeEven(numbers1);
        printOutArray(numbers1);

        // ---------------- Q2 ----------------
        int[] numbers2 = userInput(5, sc);

        printOutArray(numbers2);
        int[] newNums = doubleArray(numbers2);
        printOutArray(newNums);

        // ---------------- Q3 ----------------
        int[] numbers3 = userInput(5, sc);

        printOutArray(numbers3);
        swapFirstLast(numbers3);
        printOutArray(numbers3);

        // ---------------- Q4 ----------------
        //ask user numbers
        int[] numbers = userInput(6, sc);

        //change negative numbers to 0
        int changed = changeNegative(numbers);

        //print out the array and changed number
        printOutArray(numbers);
        System.out.println(changed + " changed");

        sc.close();
    }
    public static void printOutArray(int[] arr) {
        for (int num: arr) {
            System.out.println(num);
        }
    }
    public static int[] userInput(int times, Scanner sc){
        int[] arr = new int[times];
        for(int i=0; i<times; i++) {
            System.out.print("Enter an integer: ");
            while(!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Invalid input, Enter an integer:");
            }
            arr[i] = sc.nextInt();
            sc.nextLine();

        }
        return arr;
    }
    public static void changeEven(int[] arr){
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2== 0) {
                arr[i] = arr[i]*2;
            }
        }
    }
    public static int[] doubleArray(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            newArr[i] = arr[i]*2;
        }
        return newArr;
    }

    public static void swapFirstLast(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static int changeNegative(int[] arr){
        int count = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
                count++;
            }
        }
        return count;
    }
}