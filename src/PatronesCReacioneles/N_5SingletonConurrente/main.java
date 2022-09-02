package PatronesCReacioneles.N_5SingletonConurrente;



public class main {
    public static void main(String[] args) {
        //todos los objetos creados siempre seran los mismos
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConeccionDB coneccionDB = ConeccionDB.obtenerConeccionDB();
                System.out.println(coneccionDB.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConeccionDB coneccionDB = ConeccionDB.obtenerConeccionDB();
                System.out.println(coneccionDB.hashCode());
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConeccionDB db = ConeccionDB.obtenerConeccionDB();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
