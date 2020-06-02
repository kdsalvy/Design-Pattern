package pattern.structural.decorator;

import java.util.HashMap;
import java.util.Map;

import pojo.Shape;

public class BasicBuildingBlockGame implements BuildingBlockGame {

    private Map<Shape, Integer> blockMap;
    private Double gameCost;

    public BasicBuildingBlockGame() {
	blockMap = new HashMap<>();
	gameCost = 0.0;
    }

    @Override
    public Map<Shape, Integer> getGameContents() {
	return blockMap;
    }

    @Override
    public Double getGameCost() {
	return gameCost;
    }

}
