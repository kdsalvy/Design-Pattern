package pattern.decorator;

import java.util.Map;

import pojo.Shape;
import pojo.Square;

public class SquareShapeAssembler extends BuildingBlockShapeAssembler {
    private Square square;

    public SquareShapeAssembler(BuildingBlockGame buildingBlockGame) {
	super(buildingBlockGame);
	square = new Square();
    }

    @Override
    public Map<Shape, Integer> getGameContents() {
	Map<Shape, Integer> contentMap = buildingBlockGame.getGameContents();
	int count = contentMap.containsKey(square) ? contentMap.get(square) + 1 : 1;
	contentMap.put(square, count);
	return contentMap;
    }

    @Override
    public Double getGameCost() {
	return buildingBlockGame.getGameCost() + 150;
    }

}
