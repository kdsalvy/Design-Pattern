package pattern.behavioral.observer;

import java.util.HashMap;
import java.util.Map;

import pojo.Shape;

public class ShapeCountObserver implements Observer {

    private Map<Shape, Integer> shapeMap;

    public ShapeCountObserver() {
	shapeMap = new HashMap<>();
    }

    @Override
    public void update(Shape shape) {
	int count = shapeMap.containsKey(shape) ? shapeMap.get(shape) + 1 : 1;
	shapeMap.put(shape, count);
	System.out.println("ShapeCountObserver:: " + shapeMap);
    }

}
