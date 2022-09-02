package Solid.N_4SegregacionDeInterfaces;

import Solid.N_3SustitucionLiskov.Animal;
import Solid.N_3SustitucionLiskov.IFelino;

public class Jaguar extends Animal implements IFelinoSalvaje {

    public Jaguar(int edad, float peso) {
        super(edad, peso);
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void cazar() {
        System.out.println("El haguar caza");
    }
}
