package array;

public class LabTemperature {
    public static void main(String[] args) {
        // 7 days × 6 readings per day
        int[][] temps = {
                {10, 12, 15, 18, 20, 22}, // Monday
                {12, 14, 16, 18, 21, 25}, // Tuesday
                {11, 13, 15, 17, 19, 21}, // Wednesday
                {10, 11, 12, 14, 16, 18}, // Thursday
                {9, 10, 12, 15, 17, 20},  // Friday
                {13, 15, 18, 20, 22, 24}, // Saturday
                {14, 16, 19, 21, 23, 28}  // Sunday
        };

        double weekSum = 0;
        int weekCount = 0;
        int overallMin = Integer.MAX_VALUE;
        int overallMax = Integer.MIN_VALUE;

        for (int day = 0; day < temps.length; day++) {
            int dayMin = Integer.MAX_VALUE;
            int dayMax = Integer.MIN_VALUE;
            int daySum = 0;

            for (int t : temps[day]) {
                daySum += t;
                if (t < dayMin) {
                    dayMin = t;
                } else {
                    dayMax = t;
                }

                if (t < overallMin){
                    overallMin = t;
                } else {
                    overallMax = t;
                }
            }

            double dayAvg = (double) daySum / temps[day].length;
            System.out.printf("Day %d → Min: %d  Max: %d  Avg: %.2f%n", day + 1, dayMin, dayMax, dayAvg);

            weekSum += daySum;
            weekCount += temps[day].length;
        }

        double weekAvg = weekSum / weekCount;
        System.out.println("Week Summary:");
        System.out.println("Min: " + overallMin);
        System.out.println("Max: " + overallMax);
        System.out.println("Average: " + String.format("%.2f", weekAvg));
    }
}
