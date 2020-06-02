package pattern.creational.abstractfactory;

import pojo.Ellipse;
import pojo.Shape;

public class EllipseBuildingFactory implements ShapeBuildingFactory {

    @Override
    public Shape makeShape() {
	Ellipse ellipse = new Ellipse();
	ellipse.setFirstRadius(5);
	ellipse.setSecondRadius(8);
	return ellipse;
    }

}
