package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSum(months);
        int expected = 180;
        int actual = service.calculateSum(months);
        assertEquals(expected, actual);
//        int expected = 180;
//        int actual = service.calculateSum(months);
//        boolean passed = actual == expected;
//        System.out.println(passed);
    }

    @Test
    void calculateAvg() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int avg = service.calculateAvg(months);
        int expected = 15;
        int actual = service.calculateAvg(months);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxInMonth() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxInMonth = service.findMaxInMonth(months);
        int expected = 8;
        int actual = service.findMaxInMonth(months);
        assertEquals(expected, actual);
    }

    @Test
    void findMinInMonth() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minInMonth = service.findMinInMonth(months);
        int expected = 9;
        int actual = service.findMinInMonth(months);
        assertEquals(expected, actual);
    }

    @Test
    void amountMonthsLessThanAvg() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amounts = service.amountMonthsLessThanAvg(months);
        int expected = 5;
        int actual = service.amountMonthsLessThanAvg(months);
        assertEquals(expected, actual);
    }

    @Test
    void amountMonthsMoreThanAvg() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amounts = service.amountMonthsMoreThanAvg(months);
        int expected = 5;
        int actual = service.amountMonthsMoreThanAvg(months);
        assertEquals(expected, actual);
    }
}

