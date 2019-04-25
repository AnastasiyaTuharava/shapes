package by.epam.shapes.entity;

import by.epam.shapes.action.CalculateVolumeAndArea;
import by.epam.shapes.entity.impl.Pyramid;

public class PyramidData {
    private long pyramidDataId;
    private double volume;
    private double area;
    public PyramidData(Pyramid pyramid) {
        CalculateVolumeAndArea calc = new CalculateVolumeAndArea();
        pyramidDataId = pyramid.getPyramidId();
        volume = calc.calculateVolume(pyramid);
        area = calc.calculateArea(pyramid);
    }
    public PyramidData(double volume, double area) {
        this.volume = volume;
        this.area = area;
    }
    public double getVolume() {
        return volume;
    }
    public double getArea() {
        return area;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getPyramidDataId() {
        return pyramidDataId;
    }

    @Override
    public String toString() {
        return "PyramidData{" + "pyramidDataId=" + pyramidDataId + ", volume=" + volume + ", area=" + area + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PyramidData that = (PyramidData) o;

        if (pyramidDataId != that.pyramidDataId) return false;
        if (Double.compare(that.volume, volume) != 0) return false;
        return Double.compare(that.area, area) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (pyramidDataId ^ (pyramidDataId >>> 32));
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
