package by.epam.shapes.util;

public class GeneratorID {
    private static long start = 1000;
    private static long end = 9999;
    private static long pointId = start;
    private static long pyramidId = start;

    public static long getPointId() {
        if (pointId > end) {
            pointId = start;
        }
        return pointId++;
    }

    public static long getPyramidId() {
        if (pyramidId > end) {
            pyramidId= start;
        }
        return pyramidId++;
    }
}
