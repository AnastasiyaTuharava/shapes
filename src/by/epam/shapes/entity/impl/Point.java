package by.epam.shapes.entity.impl;

import by.epam.shapes.entity.ObserverEntity;
import by.epam.shapes.event.PointEvent;
import by.epam.shapes.observer.EntityObserver;
import by.epam.shapes.observer.impl.PointObserver;
import by.epam.shapes.util.GeneratorID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Point implements ObserverEntity {
    private long pointId;
    private double x; //point coordinate on the x axis
    private double y; //point coordinate on the y axis
    private double z; //point coordinate on the z axis
    private List<EntityObserver> observerList =new ArrayList<>();
    private static final Logger logger = LogManager.getLogger();

    public Point(double x, double y, double z) {
        this.pointId = GeneratorID.getPointId();
        this.x = x;
        this.y = y;
        this.z = z;
        attach(new PointObserver());
    }

    public long getPointId() {
        return pointId;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
        notifyObserver();
    }

    public void setY(double y) {
        this.y = y;
        notifyObserver();
    }

    public void setZ(double z) {
        this.z = z;
        notifyObserver();
    }

    @Override
    public void attach(EntityObserver entityObserver) {
        if (entityObserver != null) {
            observerList.add(entityObserver);
        } else {
            logger.error("Observer is null");
        }
    }

    @Override
    public void detach(EntityObserver entityObserver) {
        if (entityObserver != null) {
            observerList.add(entityObserver);
        } else {
            logger.error("Observer is null");
        }
    }

    @Override
    public void notifyObserver() {
        for (EntityObserver entityObserver : observerList) {
            entityObserver.update(new PointEvent(this));
        }
    }

    @Override
    public String toString() {
        return "Point{pointId = " + pointId + ", x = " + x + ", y = " + y + ", z = " + z + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (pointId != point.pointId) return false;
        if (Double.compare(point.x, x) != 0) return false;
        if (Double.compare(point.y, y) != 0) return false;
        return Double.compare(point.z, z) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (pointId ^ (pointId >>> 32));
        temp = Double.doubleToLongBits(x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
