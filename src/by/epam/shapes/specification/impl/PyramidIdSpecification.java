package by.epam.shapes.specification.impl;

import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.specification.Specification;

public class PyramidIdSpecification implements Specification <Pyramid> {
    private long pyramidId;
    public PyramidIdSpecification(long pyramidId) {
            this.pyramidId = pyramidId;
        }
    @Override
    public boolean isSatisfied(Pyramid pyramid) {
        return (pyramid.getPyramidId() == pyramidId);
    }
}
