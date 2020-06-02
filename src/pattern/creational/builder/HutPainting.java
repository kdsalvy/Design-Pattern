package pattern.creational.builder;

import pojo.Shape;

public interface HutPainting {

    public void setBaseShape(Shape shape);

    public void setTopShape(Shape shape);

    public void setGateShape(Shape shape);

    public void setWindowShape(Shape shape);
}
