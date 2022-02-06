package structural.composite;

/**
 * Esta clase podria ser abstracta de esta forma podriamos tener ProductToy,ProductHardware,ProductStudy,ProductDraw
 */
public class Product extends Component {

    public Product(Long price, Long weight, String name) {
        super(price, weight);
        this.name = name;
    }
    private String name;
    @Override
    public Long getPriceTotal() {
        return this.price;
    }

    @Override
    public Long getweightTotal() {
        return this.weight;
    }
}
