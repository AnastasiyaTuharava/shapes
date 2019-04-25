package by.epam.shapes.reader;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {
    @Test
    public void readPositiveScenarioTest() {
        List<String> expected = new ArrayList<>();
        expected.add("5.0 -5.0 0.0 -5.0 -5.0 0.0 -5.0 5.0 0.0 5.0 5.0 0.0 0.0 0.0 10.0");
        expected.add("10.0 10.0 5.0 -10.0 10.0 5.0 -10.0 30.0 5.0 10.0 30.0 5.0 20.0 0.0 40.0");
        expected.add("8.0 -8.0 0.0 -8.0 -8.0 0.0 -8.0 8.0 0.0 8.0 8.0 0.0 0.0 0.0 15.0");
        DataReader reader = new DataReader();
        List<String> actual = reader.read("test\\file\\InputTest.txt");
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void readNegativeScenarioTest() throws RuntimeException {
        try {
            DataReader reader = new DataReader();
            reader.read("test\\file\\Input.txt");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}