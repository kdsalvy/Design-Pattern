package pojo;

import pattern.creational.abstractfactory.AbstractShape;

public class Ellipse extends AbstractShape {

    private double firstRadius;
    private double secondRadius;

    public Ellipse() {
	setShape("Ellipse");
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (!(o instanceof Ellipse))
	    return false;
	Ellipse e = (Ellipse) o;
	return getShape() == e.getShape() && firstRadius == e.firstRadius && secondRadius == e.secondRadius;
    }

    @Override
    public int hashCode() {
	return getShape().hashCode();
    }

    @Override
    public Double getMyArea() {
	return Math.PI * firstRadius * secondRadius;
    }

    public double getFirstRadius() {
	return firstRadius;
    }

    public void setFirstRadius(double firstRadius) {
	this.firstRadius = firstRadius;
    }

    public double getSecondRadius() {
	return secondRadius;
    }

    public void setSecondRadius(double secondRadius) {
	this.secondRadius = secondRadius;
    }
}
