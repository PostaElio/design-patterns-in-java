package structural.decorator;

public class AceitunasYOregano extends IngredienteDePizza{

    public AceitunasYOregano(Pizza wrapper, Long precio) {
        super(wrapper
                , precio
                , "El mejor oregano y la mejor aceituna :)"
                );
    }

}
