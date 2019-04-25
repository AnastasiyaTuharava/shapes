package by.epam.shapes.action;

import by.epam.shapes.entity.impl.Point;
import by.epam.shapes.entity.impl.Pyramid;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckPyramidLocationTest {
    private Pyramid pyramid;
    private CheckPyramidLocation check;
    @BeforeClass
    public void setUp() {
        pyramid = new Pyramid(new Point(5, -5, 0), new Point(-5, -5, 0),
                new Point(-5, 5, 0), new Point(5,5,0), new Point(0,0,10));
        check = new CheckPyramidLocation();
    }
    @AfterClass
    public void tearDown(){
        pyramid = null;
        check = null;
    }
    @Test
    public void isCrossingAxisXTest() {
        Assert.assertTrue(check.isCrossingAxisX(pyramid));
    }
    @Test
    public void isCrossingAxisYTest() {
        Assert.assertTrue(check.isCrossingAxisY(pyramid));
    }
    @Test
    public void isStandingOnPlaneXYTest() {
        Assert.assertTrue(check.isStandingOnPlaneXY(pyramid));
    }
}
