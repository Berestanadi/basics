package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldtestRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldtestRemainEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldtestRemainOverBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1599);
        int expected = 401;

        org.junit.Assert.assertEquals(expected,actual);
    }
}