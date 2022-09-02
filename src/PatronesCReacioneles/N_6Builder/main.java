package PatronesCReacioneles.N_6Builder;

public class main {
    public static void main(String[] args) {


        Usuario codi = Usuario.Make("Codi", "faciñlito").setEmail("codi@gmail.com").setTelefono("xxx-xxx-xx").setDireccion("Argentina").Build();
        System.out.println(codi);
    }
}
