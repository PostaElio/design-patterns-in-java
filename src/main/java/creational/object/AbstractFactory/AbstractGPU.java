package creational.object.AbstractFactory;

public abstract class AbstractGPU {
    private String model;
    private int vram;

    public AbstractGPU(String model, int vram) {
        this.model = model;
        this.vram = vram;
    }
}
