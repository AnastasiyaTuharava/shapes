package by.epam.shapes.action;

import by.epam.shapes.entity.impl.Pyramid;

public class CheckPyramidLocation {
    public boolean isCrossingAxisX (Pyramid pyramid) {
        double y1 = pyramid.getA().getY();
        double y2 = pyramid.getB().getY();
        double y3 = pyramid.getC().getY();
        return ((y1 < 0 && y2 > 0) || (y1 > 0 && y2 < 0) || (y2 < 0 && y3 > 0) || (y2 > 0 && y3 < 0));
    }
    public boolean isCrossingAxisY (Pyramid pyramid) {
        double x1 = pyramid.getA().getX();
        double x2 = pyramid.getB().getX();
        double x3 = pyramid.getC().getX();
        return ((x1 < 0 && x2 > 0) || (x1 > 0 && x2 < 0) || (x2 < 0 && x3 > 0) || (x2 > 0 && x3 < 0));
    }
    public boolean isStandingOnPlaneXY(Pyramid pyramid) {
        double z1 = pyramid.getA().getZ();
        double z2 = pyramid.getB().getZ();
        double z3 = pyramid.getC().getZ();
        double z4 = pyramid.getD().getZ();
        double z5 = pyramid.getTop().getZ();
        return (z1 == 0 && z2 == 0 && z3 == 0 && z4 == 0 && z5 != 0);
    }
}
