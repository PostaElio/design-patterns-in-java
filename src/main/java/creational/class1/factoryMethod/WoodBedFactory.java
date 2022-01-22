package creational.class1.factoryMethod;

public class WoodBedFactory implements WoodFactory{
    @Override
    public WoodProduct createProduct() {
        //Aplicar logica abstracta a la hora de crear el objeto
        return new WoodBedProduct();
    }
}
