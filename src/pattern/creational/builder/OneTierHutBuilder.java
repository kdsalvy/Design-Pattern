package pattern.creational.builder;

import enums.ShapeEnum;
import pattern.creational.factory.ShapeFactory;
import pojo.Shape;

public class OneTierHutBuilder implements HutPaintingBuilder {

    private HutPainting hutPainting;

    public OneTierHutBuilder() {
	hutPainting = new OneTierHutPainting();
    }

    @Override
    public void buildBaseShape() throws Exception {
	Shape square = ShapeFactory.createShape(ShapeEnum.Square.name());
	hutPainting.setBaseShape(square);
	System.out.println("Base is Square");
    }

    @Override
    public void buildTopShape() throws Exception {
	Shape triangle = ShapeFactory.createShape(ShapeEnum.Triangle.name());
	hutPainting.setTopShape(triangle);
	System.out.println("Top is triangle");
    }

    @Override
    public void buildDoorShape() throws Exception {
	Shape rectangle = ShapeFactory.createShape(ShapeEnum.Rectangle.name());
	hutPainting.setGateShape(rectangle);
	System.out.println("Door is rectangle");
    }

    @Override
    public void buildWindowShape() throws Exception {
	Shape circle = ShapeFactory.createShape(ShapeEnum.Circle.name());
	hutPainting.setWindowShape(circle);
	System.out.println("Window is circle");
    }

    @Override
    public HutPainting getHutPainting() throws Exception {
	return hutPainting;
    }

}
