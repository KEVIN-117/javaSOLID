package PatronesCReacioneles.N_1SimpleFactory;

public class main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        Pizza pizzaPeperoni = pizzeria.creaPizzaChica();
        System.out.println(pizzaPeperoni);
    }
}
