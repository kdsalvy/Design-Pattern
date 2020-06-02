package pattern.behavioral.strategy;

import pattern.creational.factory.ShapeFactory;
import pojo.Shape;

public class StrategyPatternDemo {

    public static void main(String[] args) {
	try {
	    Shape circle = ShapeFactory.createShape("Circle");
	    Shape square = ShapeFactory.createShape("Square");
	    Shape triangle = ShapeFactory.createShape("Triangle");
	    Drawing drawing = new Drawing(new DrawingConics());
	    drawing.doDrawing(circle);
	    drawing = new Drawing(new DrawingPolygon());
	    drawing.doDrawing(triangle);
	    drawing.doDrawing(square);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
