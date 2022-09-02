package PatronesCReacioneles.N_1SimpleFactory;

public class Pizza {
    private int cantidadRebanadas;

    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "\ncantidad de Rebanadas: " + this.cantidadRebanadas +
                '}';
    }
}
