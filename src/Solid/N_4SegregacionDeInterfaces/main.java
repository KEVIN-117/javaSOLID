package Solid.N_4SegregacionDeInterfaces;

public class main {
    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar(10, 10.5F);
        jaguar.cazar();
        jaguar.rugir();
        IFelinoSalvaje iFelinoSalvaje = new Jaguar(20, 12F);
        iFelinoSalvaje.rugir();
        iFelinoSalvaje.cazar();


    }
}
