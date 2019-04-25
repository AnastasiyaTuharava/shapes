package by.epam.shapes.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataValidatorTest {
    @Test
    public void validatePositiveScenarioTest() {
        String string = "5.0 -5.0 0.0 -5.0 -5.0 0.0 -5.0 5.0 0.0 5.0 5.0 0.0 0.0 0.0 10.0";
        DataValidator validator = new DataValidator();
        boolean actual = validator.validate(string);
        Assert.assertTrue(actual);
    }
    @Test
    public void validateNegativeScenarioTest() {
        String string = "y -5.0 0.0 dfgkjh - /// 54.0 10.0";
        DataValidator validator = new DataValidator();
        boolean actual = validator.validate(string);
        Assert.assertFalse(actual);
    }
}
