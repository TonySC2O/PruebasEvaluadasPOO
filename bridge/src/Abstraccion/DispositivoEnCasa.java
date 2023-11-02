package Abstraccion;

import Abstraccion.Dispositivo;

public class DispositivoEnCasa implements Dispositivo {
	protected String estado = "Apagado";
	protected String imagenActual = "";
	protected int volumen = 0;
	protected boolean ajustado;
	protected String dispositivo = "";
	
	public DispositivoEnCasa(String pDispositivo) {
		this.dispositivo = pDispositivo;
	}
	
	@Override
	public void encender() {
	   estado = "Encendido";
		System.out.println("Se ha encendido el dispositivo");
	}
	
	@Override
	public void apagar() {
	   estado = "Apagado";
		System.out.println("Se ha apagado el dispositivo");
	}
	
	@Override
	public void mostrarImagen(String imagen) {
		if(estado.equals("Encendido")) {
			imagenActual = imagen;
			System.out.println("Mostrando imagen en " + dispositivo + ": " + imagen);
		}else {
			System.out.println("El dispositivo no esta encendido");
		}
	}
	
	@Override
	public void ajustarVolumen(int nivel) {
		if(estado.equals("Encendido")) {
			volumen = nivel;
			System.out.println("Ajustando volumen en " + dispositivo + ": " + nivel);
		}else {
			System.out.println("El dispositivo no esta encendido");
		}
	}
	
	@Override
	public void ajustarImagen() {
		if(estado.equals("Encendido")) {
			if(ajustado) {
				ajustado = true;
				System.out.println("Se ha ajustado la imagen al display");
			}else {
				System.out.println("La imagen ya está ajustada");
			}
		}else {
			System.out.println("El dispositivo no esta encendido");
		}
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Dispositivo: " + dispositivo);
		System.out.println("Estado: " + estado);
		System.out.println("Imagen actual: " + imagenActual);
		System.out.println("Volumen: " + Integer.toString(volumen));
		System.out.println("Imagen ajustada: " + Boolean.toString(ajustado));
	}

	@Override
	public void cambiarCanal(int pCanal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarImagen(String pEdicion) {
		// TODO Auto-generated method stub
		
	}
}
