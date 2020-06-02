package pattern.creational.abstractfactory;

import pojo.Shape;
import pojo.Triangle;

public class TriangleBuildingFactory implements ShapeBuildingFactory {

    @Override
    public Shape makeShape() {
	Triangle triangle = new Triangle();
	triangle.setBase(8);
	triangle.setHeight(5);
	return triangle;
    }

}
