package by.epam.shapes.comparator;

import by.epam.shapes.action.CalculateVolumeAndArea;
import by.epam.shapes.entity.impl.Pyramid;

public class PyramidComparatorByVolume extends PyramidComparator {
    private CalculateVolumeAndArea calc = new CalculateVolumeAndArea();
    @Override
    public int compare(Pyramid pyramid1, Pyramid pyramid2) {
        return Double.compare(calc.calculateVolume(pyramid1), calc.calculateVolume(pyramid2));
    }
}
