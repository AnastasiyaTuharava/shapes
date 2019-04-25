package by.epam.shapes.validator;

import by.epam.shapes.entity.impl.Point;
import by.epam.shapes.entity.impl.Pyramid;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PyramidValidatorTest {
    @Test
    public void isPyramidPositiveScenarioTest() {
        boolean actual = PyramidValidator.isPyramid(new Pyramid(new Point(5, -5, 0),
                        new Point(-5, -5, 0), new Point(-5, 5, 0),
                        new Point(5,5,0), new Point(0,0,10)));
        Assert.assertTrue(actual);
    }
    @Test
    public void isPyramidNegativeScenarioTest() {
        boolean actual = PyramidValidator.isPyramid(new Pyramid(new Point(5, -5, 0),
                new Point(-5, -5, 0), new Point(-5, 5, 0),
                new Point(5,5,0), new Point(0,0,0)));
        Assert.assertFalse(actual);
    }
}