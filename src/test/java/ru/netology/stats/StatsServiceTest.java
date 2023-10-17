package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateTotalSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
    }

    @Test
    void shouldFindMaxSalesMonth() {
    }

    @Test
    void shouldFindMinSalesMonth() {
    }

    @Test
    void shouldCountMonthsBelowAverage() {
    }

    @Test
    void shouldCountMonthsAboveAverage() {
    }
}
