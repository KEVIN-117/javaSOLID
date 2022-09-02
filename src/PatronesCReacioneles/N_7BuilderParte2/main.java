package PatronesCReacioneles.N_7BuilderParte2;


public class main {
    public static void main(String[] args) {


        Usuario codi = Usuario.Make("kevin", "faciñlito")
                        .setMedioContacto(true).setDireccion("alguien@gmail.com")
                        .setTelefono("nnnn-nnnnn-nnnnn").setMedioPago(true).setMetodoPago("Pay Pal").setToken("2564").Build().Build();
        System.out.println(codi);
    }
}
