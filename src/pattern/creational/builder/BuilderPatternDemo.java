package pattern.creational.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
	HutPaintingBuilder oneTierHutBuilder = new OneTierHutBuilder();
	Painter painter = new Painter(oneTierHutBuilder);
	try {
	    painter.paintHut();
	    System.out.println(painter.getHut());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
