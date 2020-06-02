package pattern.creational.abstractfactory;

import pojo.Shape;

public class ConicOrderForm extends ShapeOrderForm {

    @Override
    protected Shape makeOrderedShape(String shapeType) {

	switch (shapeType.toUpperCase()) {
	case "CIRCLE":
	    buildingFactory = new CircleBuildingFactory();
	    shape = buildingFactory.makeShape();
	    break;
	case "ELLIPSE":
	    buildingFactory = new EllipseBuildingFactory();
	    shape = buildingFactory.makeShape();
	    break;
	default:
	    shape = null;
	    break;
	}
	return shape;
    }

}
