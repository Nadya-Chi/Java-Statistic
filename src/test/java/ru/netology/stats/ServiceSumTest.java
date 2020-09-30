package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceSumTest {

    @Test
    void calculateSum() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void middleSum() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.middleSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        long actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxMonth() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMaxMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.findMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMinMonth() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMinMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthLessMiddleSum() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 11;
        long actual = service.findMonthLessMiddleSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthMoreMiddleSum() {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 12;
        long actual = service.findMonthMoreMiddleSum(purchases);
        assertEquals(expected, actual);
    }
}
