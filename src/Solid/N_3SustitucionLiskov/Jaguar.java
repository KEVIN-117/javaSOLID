package Solid.N_3SustitucionLiskov;

public class Jaguar extends Animal implements IFelino{

    public Jaguar(int edad, float peso) {
        super(edad, peso);
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void maullar() {
        throw new UnsupportedOperationException("El jaguar no maulla");
    }
    @Override
    public void cazar() {
        System.out.println("El haguar caza");
    }
}
