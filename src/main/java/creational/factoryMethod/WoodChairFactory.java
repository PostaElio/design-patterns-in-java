package creational.factoryMethod;

public class WoodChairFactory implements WoodFactory{

    @Override
    public WoodProduct createProduct() {
        //Aplicar logica abstracta a la hora de crear el objeto
        return new WoodChairProduct();
    }
}
