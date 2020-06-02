package pattern.behavioral.strategy;

import pojo.Shape;

public class Drawing {
    private DrawingShape drawingShape;

    public Drawing(DrawingShape drawingShape) {
	this.drawingShape = drawingShape;
    }

    public void doDrawing(Shape shape) {
	drawingShape.draw(shape);
    }
}
