package array;

import java.util.Arrays;

public class LabElectricityBills {
    public static void main(String[] args) {

        // Step 1 – Create Data (5 years × 6 billing periods)
        int[][] bills = new int[5][6];


        // Fill the first year with stable bills 200 using Arrays.fill()
        Arrays.fill(bills[0], 200);
        // Fill for other years
        for (int year = 1; year < bills.length; year++) {
            for(int term=0; term< bills[year].length; term++) {
                bills[year][term] = (int) (100 + year*100*Math.random() + term*50);
            }
        }

        // Step 2 – Display Bills Per Year
        for (int year = 0; year < bills.length; year++) {
            System.out.printf("Year %d: %s", year+1, Arrays.toString(bills[year]));
            System.out.println();
        }
        System.out.println();

        // Step 3 – Sort Each Year's Bills
        for (int year = 0; year < bills.length; year++) {
            Arrays.sort(bills[year]);
            System.out.printf("Year %d sorted: %s", year+1, Arrays.toString(bills[year]));
            System.out.println();
        }
        System.out.println();

        // Step 4 – Peak Billing Periods
        for (int year = 0; year < bills.length; year++) {
            int highest = bills[year][bills[year].length - 1];
            int[] top2 = Arrays.copyOfRange(bills[year], bills[year].length - 2, bills[year].length);
            System.out.printf("Year %d Highest: %s", year+1, highest);
            System.out.println();
            System.out.println("Top 2: " + Arrays.toString(top2));
        }
        System.out.println();

        // Step 5 – High Bill Detection (Above $300)
        for (int year = 0; year < bills.length; year++) {
            // Arrays.binarySearch requires sorted array
            int index = Arrays.binarySearch(bills[year], 300);
            String result = (index >= 0 || bills[year][bills[year].length-1] > 300) ? "Yes" : "No";
            System.out.println("Year " + (year+1) + " Above $300? " + result);
        }
        System.out.println();

        // Step 6 – Compare Year 1 & Year 2
        boolean equal = Arrays.equals(bills[0], bills[1]);
        System.out.println("Year 1 & Year 2 is " + (equal ? "Equal" : "Not equal"));
        System.out.println();

        // Step 7 – Average Cost Per Year
        for (int year = 0; year < bills.length; year++) {
            int sum = 0;
            for (int bill : bills[year]) {
                sum += bill;
            }
            double avg = (double) sum / bills[year].length;
            System.out.printf("Year %d average: %.2f", year+1, avg);
            System.out.println();
        }
        System.out.println();


        // Step 8 – Multi-Year Analysis: Combine all bills
        int totalBills = bills.length * bills[0].length;
        int[] allBills = new int[totalBills];
        int index = 0;
        for (int[] yearBills : bills) {
            for (int bill : yearBills) {
                allBills[index++] = bill;
            }
        }

        Arrays.sort(allBills);
        int[] top5 = Arrays.copyOfRange(allBills, allBills.length - 5, allBills.length);
        System.out.println("Top 5 Bills Overall: " + Arrays.toString(top5));
    }
}
