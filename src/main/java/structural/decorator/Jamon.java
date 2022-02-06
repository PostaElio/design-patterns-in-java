package structural.decorator;

public class Jamon extends IngredienteDePizza {

    public Jamon(Pizza wrapper, Long precio) {
        super(wrapper
                , precio
                , "El mejor jamon :)"
        );
    }
}
