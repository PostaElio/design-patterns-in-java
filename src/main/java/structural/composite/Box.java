package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends Component{
    private List<Component> components = new ArrayList<>();

    public Box(Long price, Long weight) {
        super(price, weight);
    }
    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public Long getPriceTotal() {
        return components.stream().mapToLong(component -> component.getPriceTotal()).sum() + this.price;
    }
    @Override
    public Long getweightTotal() {
        return components.stream().mapToLong(component -> component.getweightTotal()).sum() + this.weight;
    }
}
