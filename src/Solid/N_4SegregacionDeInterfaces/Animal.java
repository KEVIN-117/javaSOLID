package Solid.N_4SegregacionDeInterfaces;

public class Animal {
    private int Edad;
    private float peso;

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Animal(int edad, float peso) {
        this.Edad = edad;
        this.peso = peso;

    }

}
