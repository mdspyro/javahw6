package ru.netology.stats;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long calculateAverageSales(long[] sales) {
        long totalSales = calculateTotalSales(sales);
        return totalSales / sales.length;
    }

    public int findMaxSalesMonth(long[] sales) {
        long maxSales = sales[0];
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findMinSalesMonth(long[] sales) {
        long minSales = sales[0];
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthsBelowAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsAboveAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
