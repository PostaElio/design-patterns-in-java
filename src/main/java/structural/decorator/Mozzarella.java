package structural.decorator;

public class Mozzarella extends IngredienteDePizza{

    public Mozzarella(Pizza wrapper, Long precio) {
        super(wrapper
                , precio
                , "La mejor Mozzarella :)"
        );
    }
}
