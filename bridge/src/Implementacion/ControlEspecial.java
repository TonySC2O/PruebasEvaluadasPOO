package Implementacion;

import Abstraccion.Dispositivo;

public class ControlEspecial extends DispositivoDeControl{

	public ControlEspecial(Dispositivo pDispositivo) {
		super(pDispositivo);
	}
	
	public void cambiarCanal(int pCanal){
		dispositivo.cambiarCanal(pCanal);
	}

}
