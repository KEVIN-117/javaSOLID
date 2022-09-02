package PatronesCReacioneles.N_4Singleton;

public class ConexxionDB {

    private static ConexxionDB conexion;
    public String host;
    private ConexxionDB(){

    }
    public static ConexxionDB obtenerConexxionDB(){
        if (conexion == null) {
            conexion = new ConexxionDB();
        }
        return conexion;
    }
}
