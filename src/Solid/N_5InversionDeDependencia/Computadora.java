package Solid.N_5InversionDeDependencia;

public class Computadora {
    private ITeclado teclado;
    private IMouse mouse;

    public Computadora( ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;

    }

    public void encender(){
        this.mouse.conectar();
        this.teclado.conectar();
    }
}
