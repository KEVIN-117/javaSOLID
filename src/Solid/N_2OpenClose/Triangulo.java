package Solid.N_2OpenClose;

public class Triangulo extends AreasFiguras implements IFigura{
    private float base;
    private float altura;

    public Triangulo(float  base, float altura){
        super(base, altura);
    }

    public String datas() {
        return this.getClass().getName().toUpperCase()+"{" +
                "\nbase=" + this.getBase() +
                "\naltura=" + this.getAltura() +
                '}';
    }

    @Override
    public float area() {
        return (this.getAltura()*this.getBase())/2;
    }
}
