package Solid.N_2OpenClose;

public class Rectangulo extends AreasFiguras implements IFigura{
    private float base;
    private float altura;
    public Rectangulo(Float base, Float altura) {
        super(base, altura);
    }
    public String datas() {
        return this.getClass().getName().toUpperCase()+ "{" +
                "\nbase=" + this.getBase() +
                "\naltura=" + this.getAltura() +
                '}';
    }


    @Override
    public float area() {
        return this.getAltura()*this.getBase();
    }
}
