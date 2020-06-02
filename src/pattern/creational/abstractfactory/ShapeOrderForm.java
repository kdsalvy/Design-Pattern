package pattern.creational.abstractfactory;

import pojo.Shape;

public abstract class ShapeOrderForm {

    public Shape shape = null;
    public ShapeBuildingFactory buildingFactory = null;

    /**
     * Abstract method that makes the shape ordered and must be implemented by the
     * subclasses in order to give specific creation steps.
     * 
     * @param shapeType
     * @return Shape
     */
    protected abstract Shape makeOrderedShape(String shapeType);

    /**
     * Executes the necessary steps required to create the ordered shape.
     * 
     * @param shapeType
     * @return Shape
     */
    public Shape orderShape(String shapeType) {
	System.out.println("ShapeOrderForm ordered Shape: " + shapeType);
	shape = makeOrderedShape(shapeType);
	return shape;
    }
}
