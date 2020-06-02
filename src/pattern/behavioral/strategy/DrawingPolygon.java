package pattern.behavioral.strategy;

import pojo.Shape;

public class DrawingPolygon implements DrawingShape {

    @Override
    public void draw(Shape shape) {
	System.out.println("Drawing Polygon: " + shape.getMyShape());
    }

}
