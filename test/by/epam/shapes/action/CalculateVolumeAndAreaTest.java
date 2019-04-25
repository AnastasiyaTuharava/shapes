package by.epam.shapes.action;

import by.epam.shapes.entity.impl.Point;
import by.epam.shapes.entity.impl.Pyramid;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculateVolumeAndAreaTest {
    private Pyramid pyramid;
    private CalculateVolumeAndArea calc;
    @BeforeClass
    public void setUp() {
        pyramid = new Pyramid(new Point(5, -5, 0), new Point(-5, -5, 0),
                new Point(-5, 5, 0), new Point(5,5,0), new Point(0,0,10));
        calc = new CalculateVolumeAndArea();
    }
    @AfterClass
    public void tearDown(){
        pyramid = null;
        calc = null;
    }
    @Test
    public void calculateVolumeTest () {
        double expected = 333.333333d;
        double actual = calc.calculateVolume(pyramid);
        double delta = 0.000001;
        Assert.assertEquals(actual, expected, delta);
    }
    @Test
    public void calculateAreaTest () {
        double expected = 423.6067977d;
        double actual = calc.calculateArea(pyramid);
        double delta = 0.000001;
        Assert.assertEquals(actual, expected, delta);
    }
}
