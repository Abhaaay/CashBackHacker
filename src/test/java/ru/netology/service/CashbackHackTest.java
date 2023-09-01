package ru.netology.service;
import static org.junit.Assert.assertEquals;

public class CashbackHackTest {
    @org.junit.Test
    public void shouldntRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldAsk100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

}
