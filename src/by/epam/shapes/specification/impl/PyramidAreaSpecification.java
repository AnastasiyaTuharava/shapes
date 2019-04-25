package by.epam.shapes.specification.impl;

import by.epam.shapes.action.CalculateVolumeAndArea;
import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.specification.Specification;

public class PyramidAreaSpecification implements Specification<Pyramid> {
    private double minArea;
    private double maxArea;
    public PyramidAreaSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }
    @Override
    public boolean isSatisfied(Pyramid pyramid) {
        CalculateVolumeAndArea calc = new CalculateVolumeAndArea();
        double pyramidArea = calc.calculateArea(pyramid);
        return (pyramidArea >= minArea && pyramidArea <= maxArea);
    }
}
