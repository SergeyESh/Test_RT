package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRamainBeforeBoundary() {

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRamainOnBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRamainAfterBoundary() {

        int expected = 500;
        int actual = service.remain(1500);

        Assert.assertEquals(expected, actual);
    }
}