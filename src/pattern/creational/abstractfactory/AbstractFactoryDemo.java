package pattern.creational.abstractfactory;

import enums.ShapeEnum;
import pojo.Shape;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
	ShapeOrderForm orderForm = new ConicOrderForm();

	Shape circle = orderForm.orderShape(ShapeEnum.Circle.name());
	System.out.println(circle.getMyShape() + " area: " + circle.getMyArea());

	Shape ellipse = orderForm.orderShape(ShapeEnum.Ellipse.name());
	System.out.println(ellipse.getMyShape() + " area: " + ellipse.getMyArea());
    }
}
