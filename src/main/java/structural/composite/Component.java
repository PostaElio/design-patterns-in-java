package structural.composite;

/**
 * Puede ser una interfaz o abstract class, en este caso use abstract para poder obtener sus atributos
 */
public abstract class Component {
    protected Long price;
    protected Long weight;

    public Component(Long price, Long weight) {
        this.price = price;
        this.weight = weight;
    }

    abstract public Long getPriceTotal();
    abstract public Long getweightTotal();
}
