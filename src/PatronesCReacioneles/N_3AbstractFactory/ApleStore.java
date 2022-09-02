package PatronesCReacioneles.N_3AbstractFactory;

public class ApleStore implements IAbstractFactory{
    @Override
    public IComputadora crearComputadora() {
        return new MacBookPro();
    }

    @Override
    public ITablet crearTablet() {
        return new IPad();
    }
}
