package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import pojo.Shape;

public class ShapeRepository implements Subject {

    private List<Observer> observersList;
    private Shape currentShape;

    public ShapeRepository() {
	observersList = new ArrayList<>();
    }

    @Override
    public void register(Observer... observers) {
	for (Observer observer : observers)
	    observersList.add(observer);
	System.out.println("Observers Registered");
    }

    @Override
    public void unregister(Observer... observers) {
	for (Observer observer : observers)
	    observersList.remove(observer);
	System.out.println("Observers Unregistered");
    }

    @Override
    public void notifyObservers() {
	observersList.forEach(x -> x.update(currentShape));
    }

    @Override
    public <T> void update(T t) {
	currentShape = t instanceof Shape ? (Shape) t : null;
	notifyObservers();
    }

}
