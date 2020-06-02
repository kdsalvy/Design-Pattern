package pattern.creational.builder;

import pojo.Shape;

public class OneTierHutPainting implements HutPainting {

    private Shape base;
    private Shape top;
    private Shape rectangle;
    private Shape circle;

    @Override
    public void setBaseShape(Shape shape) {
	base = shape;
    }

    public Shape getBaseShape() {
	return base;
    }

    @Override
    public void setTopShape(Shape shape) {
	top = shape;
    }

    public Shape getTopShape() {
	return top;
    }

    @Override
    public void setGateShape(Shape shape) {
	rectangle = shape;
    }

    public Shape getGateShape() {
	return rectangle;
    }

    @Override
    public void setWindowShape(Shape shape) {
	circle = shape;
    }

    public Shape getWindowShape() {
	return circle;
    }

    @Override
    public String toString() {
	return "OneTierHutPainting [base=" + base + ", top=" + top + ", rectangle=" + rectangle + ", circle=" + circle
		+ "]";
    }

}
