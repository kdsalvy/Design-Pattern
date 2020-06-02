package pattern.creational.abstractfactory;

import pojo.Circle;
import pojo.Shape;

public class CircleBuildingFactory implements ShapeBuildingFactory {

    @Override
    public Shape makeShape() {
	Circle circle = new Circle();
	circle.setRadius(5);
	return circle;
    }

}
