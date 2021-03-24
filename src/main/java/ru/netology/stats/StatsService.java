package ru.netology.stats;

public class StatsService {
    public long calculateSum(int[] months) {
        long sum = 0;
        for (int month : months) {
            sum += month;
        }
        return sum;
    }

    public long calculateAvg(int[] months) {
        long sum = 0;
        for (int month : months) {
            sum += month;
        }
        int avg = (int) sum / 12;
        return avg;
    }

    public int findMax(int[] months) {
        int month = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] >= months[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int findMin(int[] months) {
        int month = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] < months[month]) {
                month = i;
            }
        }
        return month + 1;
    }

}


