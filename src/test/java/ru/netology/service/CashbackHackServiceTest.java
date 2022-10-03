package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int result = service.remain(amount);

        assertEquals(result, expected);
    }

    @Test
    public void testRemain700() {
        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int amount = 700;
        int result = service.remain(amount);

        assertEquals(result, expected);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int result = service.remain(amount);

        assertEquals(result, expected);
    }

    @Test
    public void testRemain1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1001;
        int result = service.remain(amount);

        assertEquals(result, expected);
    }

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1;
        int result = service.remain(amount);

        assertEquals(result, expected);
    }

}
