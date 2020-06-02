package pojo;

import pattern.creational.abstractfactory.AbstractShape;

public class Rectangle extends AbstractShape {

    private double length;
    private double breadth;

    public Rectangle() {
	setShape("Rectangle");
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (!(o instanceof Rectangle))
	    return false;
	Rectangle s = (Rectangle) o;
	return getShape() == s.getShape() && s.length == length && s.breadth == breadth;
    }

    @Override
    public int hashCode() {
	return getShape().hashCode();
    }

    @Override
    public Double getMyArea() {
	return length * breadth;
    }

    public double getLength() {
	return length;
    }

    public void setLength(double length) {
	this.length = length;
    }

    public double getBreadth() {
	return breadth;
    }

    public void setBreadth(double breadth) {
	this.breadth = breadth;
    }
}
