package pattern.creational.singleton;

public class SingletonShapeFactoryDemo {

    public static void main(String[] args) {
	SingletonShapeFactory shapeFactory = SingletonShapeFactory.getSingletonShapeFactory();
	System.out.println(shapeFactory.getShapeType());
	shapeFactory.setShapeType("CIRCLE");

	shapeFactory = SingletonShapeFactory.getSingletonShapeFactory();
	System.out.println(shapeFactory.getShapeType());
    }
}
