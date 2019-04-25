package by.epam.shapes.parser;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataParserTest {
    @Test
    public void parseNumbersToCreatePointsTest() {
        List<String> strings = new ArrayList<>();
        strings.add("5.0 -5.0 0.0 -5.0 -5.0 0.0 -5.0 5.0 0.0 5.0 5.0 0.0 0.0 0.0 10.0");
        ArrayList<double[][]> doubles = new ArrayList<>();
        doubles.add(new double[][]{{5.0, -5.0, 0.0}, {-5.0, -5.0, 0.0}, {-5.0, 5.0, 0.0},
                                    {5.0, 5.0, 0.0}, {0.0, 0.0, 10.0}} );
        DataParser parser = new DataParser();
        List<double[][]> actual = parser.parseNumbersToCreatePoints(strings);
        Assert.assertEquals(actual, doubles);
    }
}
