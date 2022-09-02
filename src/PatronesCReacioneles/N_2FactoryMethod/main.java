package PatronesCReacioneles.N_2FactoryMethod;

public class main {
    public static void main(String[] args) {
        PizzeriaCF cf = new PizzeriaCF();
        Pizza peperoni = cf.crearPizza("Peperoni");
        Pizza hawaiana = cf.crearPizza("Hawaiana");
        Pizza otro = cf.crearPizza("Otro");
        Pizza orillaRellena = cf.crearPizza("Peperoni orilla rellena");
        System.out.println(peperoni);
        System.out.println(hawaiana);
        System.out.println(otro);
        System.out.println(orillaRellena);
    }
}
