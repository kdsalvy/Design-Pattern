package pattern.creational.builder;

public class Painter {

    private HutPaintingBuilder hutPaintingBuilder;

    public Painter(HutPaintingBuilder hutPaintingBuilder) {
	this.hutPaintingBuilder = hutPaintingBuilder;
    }

    public HutPainting getHut() throws Exception {
	return this.hutPaintingBuilder.getHutPainting();
    }

    public void paintHut() throws Exception {
	this.hutPaintingBuilder.buildBaseShape();
	this.hutPaintingBuilder.buildTopShape();
	this.hutPaintingBuilder.buildDoorShape();
	this.hutPaintingBuilder.buildWindowShape();
    }
}
