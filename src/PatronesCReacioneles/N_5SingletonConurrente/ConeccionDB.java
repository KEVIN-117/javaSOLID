package PatronesCReacioneles.N_5SingletonConurrente;


public class ConeccionDB {
    private static ConeccionDB conexion;
    public String host;
    private ConeccionDB(){

    }
    public synchronized static ConeccionDB obtenerConeccionDB(){//synchronized () con esto garantizamos que
        // se cree solo un objeto apoesar de su concurrencia ya que sin esio se crearan muchos objetos
        if (conexion == null) {
            conexion = new ConeccionDB();
        }
        return conexion;
    }
}
