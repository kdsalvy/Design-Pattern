package pattern.behavioral.strategy;

import pojo.Shape;

public class DrawingConics implements DrawingShape {

    @Override
    public void draw(Shape shape) {
	System.out.println("Drawing Conic: " + shape.getMyShape());
    }

}
