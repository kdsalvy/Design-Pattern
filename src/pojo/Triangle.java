package pojo;

import pattern.creational.abstractfactory.AbstractShape;

public class Triangle extends AbstractShape {

    private double height;
    private double base;

    public Triangle() {
	setShape("Triangle");
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (!(o instanceof Triangle))
	    return false;
	Triangle t = (Triangle) o;
	return getShape() == t.getShape() && t.height == height && t.base == base;
    }

    @Override
    public int hashCode() {
	return getShape().hashCode();
    }

    @Override
    public Double getMyArea() {
	return 0.5 * height * base;
    }

    public double getHeight() {
	return height;
    }

    public void setHeight(double height) {
	this.height = height;
    }

    public double getBase() {
	return base;
    }

    public void setBase(double base) {
	this.base = base;
    }

}
