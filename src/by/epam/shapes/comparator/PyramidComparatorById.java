package by.epam.shapes.comparator;

import by.epam.shapes.entity.impl.Pyramid;

public class PyramidComparatorById extends PyramidComparator {
    @Override
    public int compare(Pyramid pyramid1, Pyramid pyramid2) {
        return Long.compare(pyramid1.getPyramidId(), pyramid2.getPyramidId());
    }
}
