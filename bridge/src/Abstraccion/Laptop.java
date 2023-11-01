package Abstraccion;

public class Laptop extends DispositivoCasa {
    public Laptop() {
        super();
    }

    @Override
    public void realizarMostrarFoto() {
    	fotoAjustada = true;
        System.out.println("Mostrando foto en la laptop.");
    }

    @Override
    public void realizarCambiarVolumen(int pnivel) {
    	volumen = pnivel;
        System.out.println("Volumen de la laptop ajustado a " + pnivel);
    }

    @Override
    public void realizarAjustarDisplay() {
    	displayAjustado = true;
    	System.out.println("El display de la foto se ajustó al tamaño de la pantalla de la laptop.");
    }
}
