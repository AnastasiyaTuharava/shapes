package by.epam.shapes.event;

import by.epam.shapes.entity.impl.Pyramid;

import java.util.EventObject;

public class PyramidEvent extends EventObject {
    public PyramidEvent(Pyramid source) {
        super(source);
    }
    public Pyramid getSource(){
        return (Pyramid) super.getSource();
    }
}
