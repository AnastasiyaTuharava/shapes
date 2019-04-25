package by.epam.shapes.entity.impl;

import by.epam.shapes.entity.ObserverEntity;
import by.epam.shapes.event.PyramidEvent;
import by.epam.shapes.observer.EntityObserver;
import by.epam.shapes.observer.impl.PyramidObserver;
import by.epam.shapes.util.GeneratorID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Pyramid implements ObserverEntity {
    private long pyramidId;
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Point top;
    private List<EntityObserver> observerList =new ArrayList<>();
    private static final Logger logger= LogManager.getLogger();

    public Pyramid(Point a, Point b, Point c, Point d, Point top) {
        this.pyramidId = GeneratorID.getPyramidId();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.top = top;
        attach(new PyramidObserver());
    }

    public long getPyramidId() {
        return pyramidId;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public Point getTop() {
        return top;
    }

    public void setA(Point a) {
        this.a = a;
        notifyObserver();
    }

    public void setB(Point b) {
        this.b = b;
        notifyObserver();
    }

    public void setC(Point c) {
        this.c = c;
        notifyObserver();
    }

    public void setD(Point d) {
        this.d = d;
        notifyObserver();
    }

    public void setTop(Point top) {
        this.top = top;
        notifyObserver();
    }

    @Override
    public void attach(EntityObserver entityObserver) {
        if(entityObserver!=null) {
            observerList.add(entityObserver);
        } else {
            logger.error("Observer is null, couldn't attach PyramidObserver");
        }
    }

    @Override
    public void detach(EntityObserver entityObserver) {
        if (entityObserver!=null) {
            observerList.add(entityObserver);
        } else {
            logger.error("Observer is null, couldn't detach PyramidObserver");
        }
    }

    @Override
    public void notifyObserver() {
        for (EntityObserver entityObserver : observerList) {
            entityObserver.update(new PyramidEvent(this));
        }
    }

    @Override
    public String toString() {
        return "Pyramid{" + "pyramidId = " + pyramidId + ", a = " + a + ", b = " + b + ", c = " + c + ", d = "
                + d + ", top = " + top + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pyramid pyramid = (Pyramid) o;

        return pyramidId == pyramid.pyramidId && a.equals(pyramid.a) && b.equals(pyramid.b)
                && c.equals(pyramid.c) && d.equals(pyramid.d) && top.equals(pyramid.top);
    }

    @Override
    public int hashCode() {
        int result = (int) (pyramidId ^ (pyramidId >>> 32));
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (d != null ? d.hashCode() : 0);
        result = 31 * result + (top != null ? top.hashCode() : 0);
        return result;
    }
}
