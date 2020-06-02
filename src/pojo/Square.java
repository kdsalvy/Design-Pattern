package pojo;

import pattern.creational.abstractfactory.AbstractShape;

public class Square extends AbstractShape {

    private double side;

    public Square() {
	setShape("Square");
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (!(o instanceof Square))
	    return false;
	Square s = (Square) o;
	return getShape() == s.getShape() && s.side == side;
    }

    @Override
    public int hashCode() {
	return getShape().hashCode();
    }

    @Override
    public Double getMyArea() {
	return side * side;
    }

    public double getSide() {
	return side;
    }

    public void setSide(double side) {
	this.side = side;
    }
}
