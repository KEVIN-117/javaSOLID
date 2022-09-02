package PatronesCReacioneles.N_2FactoryMethod;

public class PizzeriaCF implements IPizzeria {

    @Override
    public Pizza crearPizza(String tipo) {
        if (tipo.equals("Peperoni")){
            return new Pizza(8, "Peperoni");
        }
        if (tipo.equals("Hawaiana")){
            return new Pizza(8, "Hawaiana");
        }
        if (tipo.equals("Peperoni orilla rellena")){
            return new pizzaOrillaRellena(12, "Peperoni ");
        }
        return new Pizza(0, "La pizza que desea ya se termino");
    }
}
