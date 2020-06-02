package pattern.creational.prototype;

import pojo.Circle;

public class PrototypePatternDemo {

    public static void main(String[] args) {
	// Assuming circle object is a resource expensive object which we have currently
	// of radius 4 units
	Circle expensiveObject = new Circle();
	expensiveObject.setRadius(4.0);

	System.out.println("\nOriginal Expensive Object\n");

	System.out.println(expensiveObject.getMyShape() + " with radius: " + expensiveObject.getRadius()
		+ " having area: " + expensiveObject.getMyArea() + " and hash: " + expensiveObject.hashCode());

	// Now we need a circle object having radius as 8. Since the object creation is
	// expensive we will clone the previous object and change its state to meet our
	// requirements.
	System.out.println("\nCloning the object\n");
	Circle clonedExpensiveObject = null;
	try {
	    clonedExpensiveObject = (Circle) expensiveObject.getClone();
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}

	System.out.println("\nCloned Object in same state\n");

	System.out.println(clonedExpensiveObject.getMyShape() + " with radius: " + clonedExpensiveObject.getRadius()
		+ " having area: " + clonedExpensiveObject.getMyArea() + " and hash: "
		+ clonedExpensiveObject.hashCode());

	System.out.println("\nChanging the cloned object's state\n");

	clonedExpensiveObject.setRadius(8.0);

	System.out.println(clonedExpensiveObject.getMyShape() + " with radius: " + clonedExpensiveObject.getRadius()
		+ " having area: " + clonedExpensiveObject.getMyArea() + " and hash: "
		+ clonedExpensiveObject.hashCode());

	System.out.println("\nChecking original object's state\n");

	System.out.println(expensiveObject.getMyShape() + " with radius: " + expensiveObject.getRadius()
		+ " having area: " + expensiveObject.getMyArea() + " and hash: " + expensiveObject.hashCode());

	System.out.println("\nChecking if the instances are equal\n");
	System.out.println(expensiveObject == clonedExpensiveObject);

    }

}
