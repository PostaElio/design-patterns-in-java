package structural.decorator;

public class SalsaDeTomate extends IngredienteDePizza{

    public SalsaDeTomate(Pizza wrapper, Long precio) {
        super(wrapper
                , precio
                , "La mejor salsa de tomate :)"
        );
    }


}
