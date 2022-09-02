package PatronesCReacioneles.N_3AbstractFactory;

public class SamsungStore implements IAbstractFactory{
    @Override
    public IComputadora crearComputadora() {
        return new SamsungQX410();
    }

    @Override
    public ITablet crearTablet() {
        return new SamsungTab_S3();
    }
}
