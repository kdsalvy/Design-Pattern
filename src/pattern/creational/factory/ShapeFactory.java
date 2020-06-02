package pattern.creational.factory;

import pojo.Circle;
import pojo.Ellipse;
import pojo.Rectangle;
import pojo.Shape;
import pojo.Square;
import pojo.Triangle;

/**
 * Concrete Factory Class: Generates Shapes based on given name.
 * 
 * @author saukedia1
 *
 */
public class ShapeFactory {

    public static Shape createShape(String name) throws Exception {
	String upperCaseName = name.toUpperCase();

	switch (upperCaseName) {
	case "CIRCLE":
	    return new Circle();
	case "TRIANGLE":
	    return new Triangle();
	case "SQUARE":
	    return new Square();
	case "RECTANGLE":
	    return new Rectangle();
	case "ELLIPSE":
	    return new Ellipse();
	default:
	    throw new Exception("Shape Not Found");
	}
    }

}
