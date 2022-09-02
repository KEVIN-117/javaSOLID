package Solid.N_1ResponsabilidadSimple;

public class main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 50);
        Presentacion presentacion = new Presentacion();
        presentacion.loadData(rectangulo);
        System.out.println();
        Triangle triangle = new Triangle(5, 2);
        presentacion.loadData(triangle);
    }
}
