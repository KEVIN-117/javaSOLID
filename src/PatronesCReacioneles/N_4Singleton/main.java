package PatronesCReacioneles.N_4Singleton;

public class main {
    public static void main(String[] args) {
        //todos los objetos creados siempre seran los mismos
        ConexxionDB conexxionDB = ConexxionDB.obtenerConexxionDB();
        ConexxionDB conexxionDB2 = ConexxionDB.obtenerConexxionDB();
        conexxionDB.host = "localhost";
        System.out.println(conexxionDB.host);
        System.out.println(conexxionDB2.host);
    }
}
