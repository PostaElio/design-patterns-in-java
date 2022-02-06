package structural.decorator;

public class Morron extends IngredienteDePizza{

    public Morron(Pizza wrapper, Long precio) {
        super(wrapper
                , precio
                , "El mejor Morron :)");
    }
}
