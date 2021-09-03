package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when12to34then282() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when56to89then424() {
        double expected = 4.24;
        int x1 = 5;
        int y1 = 6;
        int x2 = 8;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then1063() {
        double expected = 10.63;
        int x1 = 9;
        int y1 = 15;
        int x2 = 17;
        int y2 = 22;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}