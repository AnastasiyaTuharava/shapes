package by.epam.shapes.repository;

import by.epam.shapes.comparator.PyramidComparator;
import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.specification.Specification;

import java.util.List;

public interface Repository {
    void addPyramid (Pyramid pyramid);
    void removePyramid (Pyramid pyramid);
    void sort (PyramidComparator comparator);
    List<Pyramid> query (Specification<Pyramid> specification);
}
