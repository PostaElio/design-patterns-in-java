package creational.AbstractFactory;

public class FactoryNVIDIA implements AbstractFactory{
    @Override
    public NVIDIA_CPU createCPU() {
        //more logic
        return new NVIDIA_CPU("fx 8320",8);
    }

    @Override
    public NVIDIA_GPU createGPU() {
        //more logic
        return new NVIDIA_GPU("rx 6800xt",16);
    }
}
