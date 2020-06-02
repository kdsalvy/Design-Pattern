package pattern.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
	BuildingBlockGame simpleBuildingBlockGame = new SquareShapeAssembler(
		new CircleShapeAssembler(new BasicBuildingBlockGame()));

	System.out.println("Simple Building Block Game Contents: " + simpleBuildingBlockGame.getGameContents());
	System.out.println("Simple Building Block Game Cost: " + simpleBuildingBlockGame.getGameCost());

	BuildingBlockGame complexBuildingBlockGame = new SquareShapeAssembler(
		new SquareShapeAssembler(new CircleShapeAssembler(new BasicBuildingBlockGame())));

	System.out.println("Complex Building Block Game Contents: " + complexBuildingBlockGame.getGameContents());
	System.out.println("Complex Building Block Game Cost: " + complexBuildingBlockGame.getGameCost());

    }

}
