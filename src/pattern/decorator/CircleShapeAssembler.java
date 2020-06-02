package pattern.decorator;

import java.util.Map;

import pojo.Circle;
import pojo.Shape;

public class CircleShapeAssembler extends BuildingBlockShapeAssembler {

    private Circle circle;

    public CircleShapeAssembler(BuildingBlockGame buildingBlockGame) {
	super(buildingBlockGame);
	circle = new Circle();
    }

    @Override
    public Map<Shape, Integer> getGameContents() {
	Map<Shape, Integer> contentMap = buildingBlockGame.getGameContents();
	int count = contentMap.containsKey(circle) ? contentMap.get(circle) + 1 : 1;
	contentMap.put(circle, count);
	return contentMap;
    }

    @Override
    public Double getGameCost() {
	return buildingBlockGame.getGameCost() + 200.0;
    }

}
