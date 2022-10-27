package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRamainBeforeBoundary() {

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRamainOnBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRamainAfterBoundary() {

        int expected = 500;
        int actual = service.remain(1500);

        Assert.assertEquals(actual, expected);
    }
}