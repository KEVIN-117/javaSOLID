package Solid.N_1ResponsabilidadSimple;

public class Triangle extends Areas_y_Figuras{
    private float base;
    private float altura;

    public Triangle(float  base, float altura){
        super(base, altura);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "\nbase=" + base +
                "\naltura=" + altura +
                "\narea = " + (this.getAltura()*this.getBase())/2+
                '}';
    }
}
