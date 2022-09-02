package Solid.N_2OpenClose;

public class main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10F,20F);
        Triangulo triangulo = new Triangulo(10F, 5F);
        Cuadrado cuadrado = new Cuadrado(5F, 10F);
        Imprimir imprimir = new Imprimir();
        System.out.println();
        imprimir.l0oadData(rectangulo);
        System.out.println();
        imprimir.l0oadData(triangulo);
        System.out.println();
        imprimir.l0oadData(cuadrado);
    }
}
