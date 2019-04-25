package by.epam.shapes.entity;

import by.epam.shapes.observer.EntityObserver;

public interface ObserverEntity {
    void attach(EntityObserver entityObserver);

    void detach(EntityObserver entityObserver);

    void notifyObserver();
}
