package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSum(months);
        System.out.println("Сумма всех продаж равна: " + sum);
    }

    @Test
    void calculateAvg() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int avg = service.calculateAvg(months);
        System.out.println("Средняя сумма продаж в месяц равна: " + avg);
    }

    @Test
    void findMaxInMonth() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxInMonth = service.findMaxInMonth(months);
        System.out.println("Номер месяца с максимальной продажей: " + maxInMonth);
    }

    @Test
    void findMinInMonth() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minInMonth = service.findMinInMonth(months);
        System.out.println("Номер месяца с минимальной продажей: " + minInMonth);
    }

    @Test
    void amountMonthsLessThanAvg() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amounts = service.amountMonthsLessThanAvg(months);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + amounts);
    }

    @Test
    void amountMonthsMoreThanAvg() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amounts = service.amountMonthsMoreThanAvg(months);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + amounts);
    }
}

