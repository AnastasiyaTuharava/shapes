package by.epam.shapes.specification.impl;

import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.specification.Specification;

public class PyramidPointIdSpecification implements Specification<Pyramid> {
    private long pointId;
    public PyramidPointIdSpecification(long pointId) {
        this.pointId = pointId;
    }
    @Override
    public boolean isSatisfied(Pyramid pyramid) {
        long aPointId=pyramid.getA().getPointId();
        long bPointId=pyramid.getB().getPointId();
        long cPointId=pyramid.getC().getPointId();
        long dPointId=pyramid.getD().getPointId();
        long topPointId=pyramid.getTop().getPointId();
        return (pointId==aPointId || pointId==bPointId || pointId == cPointId
                || pointId == dPointId || pointId == topPointId);
    }
}
