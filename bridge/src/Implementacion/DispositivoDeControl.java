package Implementacion;

import Abstraccion.Dispositivo;

public class DispositivoDeControl {
	 protected Dispositivo dispositivo;

	 public DispositivoDeControl(Dispositivo pDispositivo) {
	     this.dispositivo = pDispositivo;
	 }

	 public void encender() {
	     dispositivo.encender();
	 }

	 public void apagar() {
	     dispositivo.apagar();
	 }

	 public void mostrarImagen(String imagen) {
	     dispositivo.mostrarImagen(imagen);
	 }

	 public void ajustarVolumen(int nivel) {
	     dispositivo.ajustarVolumen(nivel);
	 }
	 
	 public void ajustarImagen() {
	     dispositivo.ajustarImagen();
	 }
	 
	 public void mostrarInformacion() {
		 dispositivo.mostrarInfo();
	 }
	 
	 public void editarImagen(String pEdicion) {
		// TODO Auto-generated method stub
	 }

	public void cambiarCanal(int canal) {
		// TODO Auto-generated method stub
	}
}