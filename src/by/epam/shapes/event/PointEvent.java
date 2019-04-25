package by.epam.shapes.event;

import by.epam.shapes.entity.impl.Point;

import java.util.EventObject;

public class PointEvent extends EventObject {
    public PointEvent(Point source) {
        super(source);
    }
    public Point getSource() {
        return (Point) super.getSource();
    }
}
