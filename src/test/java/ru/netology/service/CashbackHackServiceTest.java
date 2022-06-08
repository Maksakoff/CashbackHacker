package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIf999() {
        int actual = service.remain(999);
        int expected = 1;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIf4200() {
        int actual = service.remain(4200);
        int expected = 800;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIf1000() {
        int actual = service.remain(1000);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain1000If0() {
        int actual = service.remain(0);
        int expected = 1000;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldIfIncorrect() { //лямбда
        Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-100);
        });
    }
}