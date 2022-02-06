package creational.AbstractFactory;

public class FactoryAMD implements AbstractFactory{

    @Override
    public AMD_CPU createCPU() {
        //more logic
        return new AMD_CPU("fx 8320",8);
    }
    @Override
    public AMD_GPU createGPU() {
        //more logic
        return new AMD_GPU("rx 6800xt",16);
    }
}
