package creational.AbstractFactory;

public abstract class AbstractCPU {
    private String model;
    private int cores;

    public AbstractCPU(String model, int cores) {
        this.model = model;
        this.cores = cores;
    }
}
