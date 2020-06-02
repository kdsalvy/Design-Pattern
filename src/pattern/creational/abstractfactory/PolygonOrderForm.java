package pattern.creational.abstractfactory;

import pojo.Shape;

public class PolygonOrderForm extends ShapeOrderForm {

    @Override
    protected Shape makeOrderedShape(String shapeType) {
	switch (shapeType.toUpperCase()) {
	case "TRIANGLE":
	    buildingFactory = new TriangleBuildingFactory();
	    shape = buildingFactory.makeShape();
	    break;
	case "SQUARE":
	    buildingFactory = new SquareBuildingFactory();
	    shape = buildingFactory.makeShape();
	    break;
	default:
	    shape = null;
	}
	return shape;
    }

}
