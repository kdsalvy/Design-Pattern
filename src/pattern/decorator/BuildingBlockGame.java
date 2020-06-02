package pattern.decorator;

import java.util.Map;

import pojo.Shape;

public interface BuildingBlockGame {

    public Map<Shape, Integer> getGameContents();

    public Double getGameCost();
}
