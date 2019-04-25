package by.epam.shapes.observer.impl;

import by.epam.shapes.action.CalculateVolumeAndArea;
import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.entity.PyramidData;
import by.epam.shapes.observer.EntityObserver;
import by.epam.shapes.warehouse.Warehouse;

import java.util.EventObject;

public class PyramidObserver implements EntityObserver {
    @Override
    public void update(EventObject event) {
        Pyramid pyramid = (Pyramid) event.getSource();
        CalculateVolumeAndArea calc =new CalculateVolumeAndArea();
        double volume = calc.calculateVolume(pyramid);
        double area = calc.calculateArea(pyramid);
        PyramidData pyramidData = new PyramidData(volume, area);
        Warehouse.getWarehouse().putPyramidMapData(pyramidData);
    }
}
