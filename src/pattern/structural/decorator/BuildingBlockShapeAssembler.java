package pattern.structural.decorator;

import java.util.Map;

import pojo.Shape;

public abstract class BuildingBlockShapeAssembler implements BuildingBlockGame {

    protected BuildingBlockGame buildingBlockGame;

    public BuildingBlockShapeAssembler(BuildingBlockGame buildingBlockGame) {
	this.buildingBlockGame = buildingBlockGame;
    }

    public abstract Map<Shape, Integer> getGameContents();

    public abstract Double getGameCost();
}
