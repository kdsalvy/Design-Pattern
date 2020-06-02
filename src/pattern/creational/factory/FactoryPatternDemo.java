package pattern.creational.factory;

import enums.ShapeEnum;
import pojo.Shape;

public class FactoryPatternDemo {

    public static void main(String[] args) throws Exception {
	Shape circle = ShapeFactory.createShape(ShapeEnum.Circle.name());
	System.out.println(circle.getMyShape());

	Shape square = ShapeFactory.createShape(ShapeEnum.Square.name());
	System.out.println(square.getMyShape());

    }

}
