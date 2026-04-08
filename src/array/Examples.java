package array;

import java.util.Arrays;

public class Examples {
    public static void show() {
        int[] numberss;
        numberss = new int[]{1, 2, 3, 4};
        numberss = new int[5];

        int[] numbers = {1,2,3,4,5};
        numbers[0] = 10;

        for(int i =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int sum = 0;
        //enhanced for loop / foreach
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("sum= " + sum);
        System.out.println("average= " + (double)sum/numbers.length);
    }

    public static void arraysMethods() {
        String[][] seats = {
                {"Alice", " Bob", "Charles"},
                {"Danny", "Zoe", " Bo"}
        };

        System.out.println(Arrays.deepToString(seats));

        int[] numbers;

        numbers = new int[]{101,60,30,40,50};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        numbers = new int[6];
        System.out.println(Arrays.toString(numbers));
        Arrays.fill(numbers, 20);
        System.out.println(Arrays.toString(numbers));
        Arrays.fill(numbers, 0,5,10);
        System.out.println(Arrays.toString(numbers));

        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(Arrays.equals(a, b));

        int[] copied = Arrays.copyOf(numbers,numbers.length);
        System.out.println(Arrays.toString(copied));
        int[] partCopied = Arrays.copyOfRange(numbers, 1,4);
        System.out.println(Arrays.toString(partCopied));

        numbers = new int[]{1,3,5,7,9};
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("index: "+index);

    }
}
