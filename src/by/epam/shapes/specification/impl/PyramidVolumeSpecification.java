package by.epam.shapes.specification.impl;

import by.epam.shapes.action.CalculateVolumeAndArea;
import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.specification.Specification;

public class PyramidVolumeSpecification implements Specification <Pyramid> {
    private double minVolume;
    private double maxVolume;
    public PyramidVolumeSpecification(double minVolume, double maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }
    @Override
    public boolean isSatisfied(Pyramid pyramid) {
        CalculateVolumeAndArea calc = new CalculateVolumeAndArea();
        double pyramidVolume = calc.calculateVolume(pyramid);
        return (pyramidVolume >= minVolume && pyramidVolume <= maxVolume);
    }
}
