package pojo;

import java.util.Objects;

import pattern.creational.abstractfactory.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public double getRadius() {
	return radius;
    }

    public void setRadius(double radius) {
	this.radius = radius;
    }

    public Circle() {
	setShape("Circle");
    }

    @Override
    public Double getMyArea() {
	return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (!(o instanceof Circle))
	    return false;
	Circle c = (Circle) o;
	return getShape() == c.getShape() && c.radius == radius;
    }

    @Override
    public int hashCode() {
	return Objects.hashCode(getShape());
    }

}
