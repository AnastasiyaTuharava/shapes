package by.epam.shapes.parser;

import by.epam.shapes.validator.DataValidator;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    private static final String REGEX_SPACE = "\\s";
    //Method returns an array of points to create a shape
    public List<double[][]> parseNumbersToCreatePoints(List<String> list) {
        List<double[][]> doubleList = new ArrayList<>();
        for (String s: list) {
            doubleList.add(parseToDoubleArrayOfCoordinates(s));
        }
        return doubleList;
    }
    //Method parses data from string with coordinates to double array
    private static double[] parseToDouble (String s){
        double[] doubleArray = new double[15];

        DataValidator validator = new DataValidator();
        if (validator.validate(s)) {
            String[] strings = s.split(REGEX_SPACE);
            for (int i = 0; i < doubleArray.length; i++){
                doubleArray[i] = Double.parseDouble(strings[i]);
            }
        }
        return doubleArray;
    }
    //Method parse double arrays with coordinates by Points
    private static double[][] parseToDoubleArrayOfCoordinates (String s){
        double[][] doubleCoordinates = new double[5][3];
        double[] doubleArray = parseToDouble(s);
        int k = 0; //counter for doubleArray
        for (int i = 0; i <doubleCoordinates.length ; i++) {
            for (int j = 0; j <doubleCoordinates[i].length ; j++) {
                doubleCoordinates[i][j] = doubleArray[k++];
            }
        }
        return doubleCoordinates;
    }
}
