package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //int expected = 180;
        //int actual = (int) service.calculateSum(months);
        //assertEquals(expected, actual);
        int monthsSum = (int) service.calculateSum(months);
        System.out.println("Сумма всех продаж равна: " + monthsSum);
    }

    @Test
    void calculateAvg() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthsAvg = (int) service.calculateAvg(months);
        System.out.println("Средняя сумма продаж в месяц равна: " + monthsAvg);
    }


    @Test
    void findMax() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthMax = (int) service.findMax(months);
        System.out.println(monthMax);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthMin = (int) service.findMin(months);
        System.out.println(monthMin);
    }
}
