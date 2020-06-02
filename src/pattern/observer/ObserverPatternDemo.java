package pattern.observer;

import pattern.creational.factory.ShapeFactory;
import pojo.Shape;

public class ObserverPatternDemo {

    public static void main(String[] args) {
	Subject subject = new ShapeRepository();
	Observer observer1 = new ShapeObserver();
	Observer observer2 = new ShapeCountObserver();

	subject.register(observer1, observer2);

	try {
	    Shape circle = ShapeFactory.createShape("Circle");
	    Shape square = ShapeFactory.createShape("Square");
	    Shape triangle = ShapeFactory.createShape("Triangle");
	    Shape circle2 = ShapeFactory.createShape("Circle");
	    Shape square2 = ShapeFactory.createShape("Square");
	    Shape triangle2 = ShapeFactory.createShape("Triangle");

	    subject.update(circle);
	    subject.update(square);
	    subject.update(triangle);
	    subject.update(circle2);
	    subject.update(square2);
	    subject.update(triangle2);

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
