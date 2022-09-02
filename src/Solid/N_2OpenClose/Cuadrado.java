package Solid.N_2OpenClose;

public class Cuadrado extends AreasFiguras implements IFigura{
    private float base;
    private float altura;
    public Cuadrado(Float base, Float altura) {
        super(base, altura);
    }

    @Override
    public float area() {
        return this.getBase()*this.getAltura();
    }

    @Override
    public String datas() {
        return this.getClass().getName().toUpperCase()+"{" +
                "\nbase=" + this.getBase() +
                "\naltura=" + this.getAltura() +
                '}';
    }
}
