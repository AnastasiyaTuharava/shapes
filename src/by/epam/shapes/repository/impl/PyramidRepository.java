package by.epam.shapes.repository.impl;
import by.epam.shapes.comparator.PyramidComparator;
import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.repository.Repository;
import by.epam.shapes.specification.Specification;

import java.util.*;

public class PyramidRepository implements Repository {
    private static PyramidRepository pyramidRepository;
    private List<Pyramid> pyramidsList;
    private PyramidRepository() {
        pyramidsList = new ArrayList<>();
    }
    public static PyramidRepository getPyramidRepository() {
        if (pyramidRepository == null) {
            pyramidRepository = new PyramidRepository();
        }
        return pyramidRepository;
    }
    @Override
    public void addPyramid(Pyramid pyramid) {
        pyramidsList.add(pyramid);
    }
    @Override
    public void removePyramid(Pyramid pyramid) {
        pyramidsList.remove(pyramid);
    }
    @Override
    public void sort(PyramidComparator comparator) {
        pyramidsList.sort(comparator);
    }
    @Override
    public List<Pyramid> query(Specification<Pyramid> specification) {
        List<Pyramid> pyramids = new ArrayList<>();
        for (Pyramid pyramid : pyramidsList) {
            if (specification.isSatisfied(pyramid)) {
                pyramids.add(pyramid);
            }
        }
        return pyramids;
    }
}
