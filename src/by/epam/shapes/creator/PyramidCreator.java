package by.epam.shapes.creator;

import by.epam.shapes.entity.impl.Point;
import by.epam.shapes.entity.impl.Pyramid;

public class PyramidCreator {
    public Pyramid create (Point a, Point b, Point c, Point d, Point top) {
        return new Pyramid(a, b, c, d, top);
    }
}
