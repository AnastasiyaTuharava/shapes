package by.epam.shapes.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class PathValidatorTest {
    @Test
    public void isValidPathPositiveScenarioTest() {
        String path = "file\\Input.txt";
        PathValidator validator = new PathValidator();
        boolean actual = validator.isValidPath(path);
        Assert.assertTrue(actual);
    }
    @Test
    public void isValidPathNegativeScenarioTest() {
        String path = "file\\Input2222.txt";
        PathValidator validator = new PathValidator();
        boolean actual = validator.isValidPath(path);
        Assert.assertFalse(actual);
    }
}
