package ru.netology.stats;

public class StatsService {
    public int getTotalSales(int[] sales) {
        int totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];

        }
        return totalSales;
    }

    public int getAverageSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;

    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getSalesBelowAverage(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int averageSales = sum / sales.length;

        int salesBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                salesBelowAverage++;
            }
        }
        return salesBelowAverage;

    }

    public int getSalesAboveAverage(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int averageSales = sum / sales.length;

        int salesAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                salesAboveAverage++;
            }
        }
        return salesAboveAverage;
    }


}

