package pattern.creational.abstractfactory;

import pattern.creational.prototype.Prototype;
import pojo.Shape;

public abstract class AbstractShape implements Shape, Prototype {

    private String shape;

    public AbstractShape() {
    }

    public abstract Double getMyArea();

    public String getShape() {
	return shape;
    }

    public void setShape(String name) {
	this.shape = name;
    }

    @Override
    public String getMyShape() {
	return getShape();
    }

    @Override
    public String toString() {
	return shape;
    }

    @Override
    public Object getClone() throws CloneNotSupportedException {
	return super.clone();
    }

}
