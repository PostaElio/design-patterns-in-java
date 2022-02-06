package structural.decorator;

public class Main {

    public static void main(String[] args) {
        Pizza pizzaMozzarella = new AceitunasYOregano(
                                            new Mozzarella(
                                                        new SalsaDeTomate(
                                                                    new PrePizza("Mozzarella"),
                                                    20L),

                                    50L),
                        10L);
        Pizza pizzaEspecial = new AceitunasYOregano(new Morron(new Jamon(new Mozzarella(new SalsaDeTomate
                (new PrePizza("Especial"),10L),15L),20L),20L),10L);

        System.out.println(pizzaMozzarella.obtenerInformacionGeneral());
        System.out.println("/****************************************/");
        System.out.println(pizzaEspecial.obtenerInformacionGeneral());

    }
}
