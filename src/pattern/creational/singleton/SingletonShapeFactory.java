package pattern.creational.singleton;

/**
 * Assuming shape factory is a quite expensive resource to create and thus we
 * maintain a single instance of it across multiple requests.
 * 
 * @author saukedia1
 *
 */
public class SingletonShapeFactory {

    private static volatile SingletonShapeFactory shapeFactory;
    private String shapeType;

    /**
     * Making the constructor private to avoid creation of multiple instances of
     * this class using new keyword.
     */
    private SingletonShapeFactory() {

    }

    public static SingletonShapeFactory getSingletonShapeFactory() {
	if (null == shapeFactory)
	    synchronized (SingletonShapeFactory.class) {
		if (null == shapeFactory)
		    shapeFactory = new SingletonShapeFactory();
	    }
	return shapeFactory;
    }

    public String getShapeType() {
	return shapeType;
    }

    public void setShapeType(String shapeType) {
	this.shapeType = shapeType;
    }
}
