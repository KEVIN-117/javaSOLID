package Solid.N_1ResponsabilidadSimple;

public class Rectangulo extends Areas_y_Figuras{
    private float base;
    private float altura;


    public Rectangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "\nbase=" + base +
                "\naltura=" + altura +
                "\narea = " + this.getAltura()*this.getBase()+
                '}';
    }
}
