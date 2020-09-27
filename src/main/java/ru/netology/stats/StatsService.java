package ru.netology.stats;

import ru.netology.stats.ServiceSum;

public class StatsService {
    public static void main(String[] args) {
        ServiceSum service = new ServiceSum();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        for (long purchase : purchases) {
        System.out.println(purchase);
        }
    }
}