package PatronesCReacioneles.N_1SimpleFactory;

public class Pizzeria {
    public Pizza creaPizzaChica(){
        return new Pizza(6);
    }
    public Pizza creaPizzaMEdiana(){
        return new Pizza(8);
    }
    public Pizza creaPizzaGrande(){
        return new Pizza(12);
    }
}
