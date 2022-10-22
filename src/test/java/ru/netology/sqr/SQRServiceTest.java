package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calculateTest() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void first() {
        SQRService service = new SQRService();
        int actual = service.calculate(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void second() {
        SQRService service = new SQRService();
        int actual = service.calculate(10, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void third() {
        SQRService service = new SQRService();
        int actual = service.calculate(-200, -300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fourth() {
        SQRService service = new SQRService();
        int actual = service.calculate(199, 299);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fifth() {
        SQRService service = new SQRService();
        int actual = service.calculate(201, 301);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

}