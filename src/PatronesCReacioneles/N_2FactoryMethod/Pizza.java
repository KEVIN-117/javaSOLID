package PatronesCReacioneles.N_2FactoryMethod;

public class Pizza {
    private int cantidadRebanadas;
    private String specilidad;
    public Pizza(int cantidadRebanadas, String specilidad) {
        this.cantidadRebanadas = cantidadRebanadas;
        this.specilidad = specilidad;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cantidadRebanadas=" + this.cantidadRebanadas +
                ",specilidad='" + this.specilidad + '\'' +
                '}';
    }
}
