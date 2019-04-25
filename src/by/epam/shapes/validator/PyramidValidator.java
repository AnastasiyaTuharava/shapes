package by.epam.shapes.validator;

import by.epam.shapes.entity.impl.Pyramid;

public class PyramidValidator {
    public static boolean isPyramid (Pyramid pyramid) {
        double x1 = pyramid.getA().getX();
        double x2 = pyramid.getB().getX();
        double x3 = pyramid.getC().getX();
        double x4 = pyramid.getD().getX();
        double y1 = pyramid.getA().getY();
        double y2 = pyramid.getB().getY();
        double y3 = pyramid.getC().getY();
        double y4 = pyramid.getD().getY();
        double z1 = pyramid.getA().getZ();
        double z2 = pyramid.getB().getZ();
        double z3 = pyramid.getC().getZ();
        double z4 = pyramid.getD().getZ();
        double z5 = pyramid.getTop().getZ();
        return (((x1 != x2 && x3 != x4) || (x1 != x3 && x2 != x4) || (x1 != x4 && x2 != x3))
                && ((y1 != y2 && y3 != y4) || (y1 != y3 && y2 != y4) || (y1 != y4 && y2 != y3))
                && (z1 == z2 && z2 == z3 && z3 == z4 && z5 != z1));
    }
}