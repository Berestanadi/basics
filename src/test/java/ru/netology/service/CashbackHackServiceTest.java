package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldtestRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldtestRemainEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldtestRemainOverBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1400);
        int expected = 600;

        org.testng.Assert.assertEquals(actual, expected);
    }
}