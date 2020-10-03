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
        return calculateSum(purchases) / purchases.length;
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMaxMonth(long[] purchases) {
        long maxMonth = 1;
        int index = 0;
        long maxPurchases = findMax(purchases);
        for (long purchase : purchases) {
            index++;
            if (purchase == maxPurchases) {
                maxMonth = index;
            }
        }
        return maxMonth;
    }

    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public long findMinMonth(long[] purchases) {
        long minMonth = 1;
        int index = 0;
        long minPurchases = findMin(purchases);
        for (long purchase : purchases) {
            index++;
            if (purchase == minPurchases) {
                minMonth = index;
            }
        }
        return minMonth;
    }

    public long findMonthLessMiddleSum(long[] purchases) {
        int month = 0;
        long middlePurchases = middleSum(purchases);
        for (long purchase : purchases) {
            if (purchase < middlePurchases) {
                month++;
            }
        }
        return month;
    }

    public long findMonthMoreMiddleSum(long[] purchases) {
        long month = 0;
        long middlePurchases = middleSum(purchases);
        for (long purchase : purchases) {
            if (purchase > middlePurchases) {
                month++;
            }
        }
        return month;
    }
}