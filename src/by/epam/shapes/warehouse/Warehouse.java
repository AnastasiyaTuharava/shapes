package by.epam.shapes.warehouse;

import by.epam.shapes.entity.PyramidData;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static Warehouse warehouse;
    private Map<Long, PyramidData> pyramidDataWarehouse;
    private Warehouse () {
        pyramidDataWarehouse = new HashMap<>();
    }
    public static Warehouse getWarehouse() {
        if (warehouse == null) {
            warehouse = new Warehouse();
        }
        return warehouse;
    }

    public Map<Long, PyramidData> getPyramidMapData() {
        return new HashMap<>(pyramidDataWarehouse);
    }

    public void putPyramidMapData(PyramidData data) {
        pyramidDataWarehouse.put(data.getPyramidDataId(), data);
    }

    public void removePyramidData(PyramidData data) {
        pyramidDataWarehouse.remove(data.getPyramidDataId());
    }
}
