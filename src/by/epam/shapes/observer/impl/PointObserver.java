package by.epam.shapes.observer.impl;

import by.epam.shapes.entity.impl.Point;
import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.observer.EntityObserver;
import by.epam.shapes.repository.impl.PyramidRepository;
import by.epam.shapes.specification.impl.PyramidPointIdSpecification;

import java.util.EventObject;
import java.util.List;

public class PointObserver implements EntityObserver {
    @Override
    public void update(EventObject event) {
        Point point = (Point) event.getSource();
        PyramidPointIdSpecification specification = new PyramidPointIdSpecification(point.getPointId());
        List<Pyramid> pyramidList = PyramidRepository.getPyramidRepository().query(specification);
        for (Pyramid pyramid: pyramidList) {
            pyramid.notifyObserver();
        }
    }
}
