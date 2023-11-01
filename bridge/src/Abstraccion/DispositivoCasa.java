package Abstraccion;

import Implementacion.DispositivoControl;

public abstract class DispositivoCasa {
    protected int volumen;
    protected boolean fotoAjustada;
    protected boolean displayAjustado;

    public DispositivoCasa() {
    }

    public abstract void realizarMostrarFoto();
    public abstract void realizarCambiarVolumen(int nivel);
    public abstract void realizarAjustarDisplay();
}
