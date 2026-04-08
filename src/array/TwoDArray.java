package array;

import java.util.Arrays;

public class TwoDArray {
    public static void example(){
                String[][] seats = {
                {"Alice", " Bob", "Charles"},
                {"Danny", "Zoe", " Bo"}
        };
        int[][] matrix = {
                {1,2,3}, // row 0
                {4,5,6}, // row 1
                {7,8,9},  // row 2
                {10,11,12},  // row 3
        };
        System.out.println(matrix[2][1]);
        printOutArray(seats);

    }
    public static void rowColumnNestedLoop(){
        int[][] sales = {
                {100, 200, 150},
                {90,120,80},
                {160, 200, 300}
        };

        // storeTotals[0]: store0 's total
        int[] storeTotals = new int[sales.length];
        int[] monthTotals = new int[sales[0].length];
        // i: rows, j: columns
        for(int i = 0; i<sales.length; i++) {
            for (int j=0; j<sales[i].length; j++) {
                storeTotals[i] += sales[i][j]; // sales[i][0-2]
                //monthTotals[j] += sales[i][j]; //sales[0-2][j]
            }
        }
        // i: rows, j: columns
        for (int j=0; j< sales[0].length; j++) {
            for (int i =0; i< sales.length; i++) {
                monthTotals[j] += sales[i][j]; //sales[0-2][j]
            }
        }
        System.out.println(Arrays.toString(storeTotals));
        System.out.println(Arrays.toString(monthTotals));
    }

    public static void addMatrix(){
        int[][] matrixA = {
                {1,2},
                {3,4}
        };
        int[][] matrixB= {
                {5,6},
                {7,8}
        };
        int[][] result = new int[2][2];
        for(int i=0; i<result.length; i++) {
            for(int j =0; j<result[i].length; j++) {
                result[i][j] = matrixA[i][j]+matrixB[i][j];
            }
        }
    }

    public static void jaggedArray(){
        int[][] jagged = {
                {1,2},
                {3,4,5},
                {6}
        };
        for(int i=0; i<jagged.length; i++) {
            for(int j =0; j<jagged[i].length; j++) {
                System.out.print(jagged[i][j]);
            }
            System.out.println();
        }

    }
    public static void printOutArray(String[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
