package PatronesCReacioneles.N_3AbstractFactory;

public class main {
    public static void main(String[] args) {
        SamsungStore samsungStore = new SamsungStore();
        ApleStore apleStore = new ApleStore();

        IComputadora mac = apleStore.crearComputadora();
        ITablet ipad = apleStore.crearTablet();

        IComputadora qx = samsungStore.crearComputadora();
        ITablet tablet = samsungStore.crearTablet();
    }
}
