package pattern.creational.prototype;

public interface Prototype extends Cloneable {

    public Object getClone() throws CloneNotSupportedException;
}
