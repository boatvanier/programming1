package array;

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
}
