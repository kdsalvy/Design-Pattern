package pattern.observer;

import pojo.Shape;

public class ShapeObserver implements Observer {

    @Override
    public void update(Shape shape) {
	System.out.println("ShapeObserver:: Received: " + shape.getMyShape());
    }

}
