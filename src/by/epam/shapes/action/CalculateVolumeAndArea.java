package by.epam.shapes.action;

import by.epam.shapes.entity.impl.Pyramid;

import static java.lang.Math.*;

public class CalculateVolumeAndArea {
    public double calculateVolume(Pyramid pyramid) {
        double h = calculateHeight(pyramid);
        double a = calculateBaseSide(pyramid);
        return (1.0/3 * h * pow(a,2));
    }
    public double calculateArea(Pyramid pyramid) {
        double a = calculateBaseSide(pyramid);
        double b = calculateEdge(pyramid);
        double sBase = pow(a,2);
        double sSide = pow(a,2) + 2*a*sqrt(pow(b,2)-pow(a,2)/4);
        return (sBase + sSide);
    }
    private double calculateBaseSide(Pyramid pyramid) {
        double x1 = pyramid.getA().getX();
        double x2 = pyramid.getB().getX();
        double y1 = pyramid.getA().getY();
        double y2 = pyramid.getB().getY();
        double z1 = pyramid.getA().getZ();
        double z2 = pyramid.getB().getZ();
        return (sqrt(pow(x2-x1,2) + pow(y2-y1,2) + pow(z2-z1,2)));
    }
    private double calculateEdge(Pyramid pyramid) {
        double x1 = pyramid.getA().getX();
        double x2 = pyramid.getTop().getX();
        double y1 = pyramid.getA().getY();
        double y2 = pyramid.getTop().getY();
        double z1 = pyramid.getA().getZ();
        double z2 = pyramid.getTop().getZ();
        return (sqrt(pow(x2-x1,2) + pow(y2-y1,2) + pow(z2-z1,2)));
    }
    private double calculateHeight(Pyramid pyramid) {
        double a = calculateBaseSide(pyramid);
        double b = calculateEdge(pyramid);
        return (sqrt(pow(b,2) - (pow(a,2) / 2)));
    }
}
