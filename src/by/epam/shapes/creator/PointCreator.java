package by.epam.shapes.creator;

import by.epam.shapes.entity.impl.Point;

public class PointCreator {
    public Point create (double x, double y, double z) {
        return new Point (x, y, z);
    }
}
