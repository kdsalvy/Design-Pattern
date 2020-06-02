package pattern.creational.builder;

public interface HutPaintingBuilder {

    public void buildBaseShape() throws Exception;

    public void buildTopShape() throws Exception;

    public void buildDoorShape() throws Exception;

    public void buildWindowShape() throws Exception;

    public HutPainting getHutPainting() throws Exception;

}
