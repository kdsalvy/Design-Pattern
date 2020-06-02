package pattern.behavioral.observer;

public interface Subject {

    public void register(Observer... observers);

    public void unregister(Observer... observers);

    public void notifyObservers();

    <T> void update(T t);
}
