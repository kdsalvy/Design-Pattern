package pattern.creational.abstractfactory;

import pojo.Shape;
import pojo.Square;

public class SquareBuildingFactory implements ShapeBuildingFactory {

    @Override
    public Shape makeShape() {
	Square square = new Square();
	square.setSide(5);
	return square;
    }
}
