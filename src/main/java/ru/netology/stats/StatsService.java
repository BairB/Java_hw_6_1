package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] months) {
        int sum = 0;
        for (int month : months) {
            sum += month;
        }
        return sum;
    }

    public int calculateAvg(int[] months) {
        int sum = calculateSum(months);
        int avg = sum / months.length;
        return avg;
    }

    public int findMaxInMonth(int[] months) {
        int max = months[0];
        for (int month : months) {
            if (month > max) {
                max = month;
            }
        }
        int number = 0;
        int monthNumber = 0;
        for (int month : months) {
            number++;
            if (month == max) {
                monthNumber = number;
            }
        }
        return monthNumber;
    }

    public int findMinInMonth(int[] months) {
        int min = months[0];
        for (int month : months) {
            if (month < min) {
                min = month;
            }
        }
        int number = 0;
        int monthNumber = 0;
        for (int month : months) {
            number++;
            if (month == min) {
                monthNumber = number;
            }
        }
        return monthNumber;
    }

    public int amountMonthsLessThanAvg(int months[]) {
        int amount = 0;
        int avg = calculateAvg(months);
        for (int month : months) {
            if (month < avg) {
                amount++;
            }
        }
        return amount;
    }

    public int amountMonthsMoreThanAvg(int months[]) {
        int amount = 0;
        int avg = calculateAvg(months);
        for (int month : months) {
            if (month > avg) {
                amount++;
            }
        }
        return amount;
    }
}

