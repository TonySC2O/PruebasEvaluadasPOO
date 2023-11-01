package Implementacion;

import Abstraccion.DispositivoCasa;

public class ControlRemoto implements DispositivoControl{
    private DispositivoCasa dispositivoCasa;

    public ControlRemoto(DispositivoCasa dispositivoCasa) {
        this.dispositivoCasa = dispositivoCasa;
    }

	@Override
	public void mostrarFoto() {
        dispositivoCasa.realizarMostrarFoto();
	}

	@Override
	public void cambiarVolumen(int nivel) {
        dispositivoCasa.realizarCambiarVolumen(nivel);
	}

	@Override
	public void ajustarDisplay() {
        dispositivoCasa.realizarAjustarDisplay();
		
	}
}
