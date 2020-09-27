package ru.netology.stats;

public class ServiceSum {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long middleSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long middle = sum / 12;
        return middle;
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if(currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMaxMonth(long[] purchases) {
        long month = 0;
        for (long purchase : purchases) {
            if (purchase > 19) {
                month += 1;
            }
        }
        return month;
    }

}