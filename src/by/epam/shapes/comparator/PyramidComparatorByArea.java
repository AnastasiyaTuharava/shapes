package by.epam.shapes.comparator;

import by.epam.shapes.action.CalculateVolumeAndArea;
import by.epam.shapes.entity.impl.Pyramid;

public class PyramidComparatorByArea extends PyramidComparator {
    private CalculateVolumeAndArea calc = new CalculateVolumeAndArea();
    @Override
    public int compare(Pyramid pyramid1, Pyramid pyramid2) {
        return Double.compare(calc.calculateArea(pyramid1), calc.calculateArea(pyramid2));
    }
}
