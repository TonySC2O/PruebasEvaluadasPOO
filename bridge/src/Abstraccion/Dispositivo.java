package Abstraccion;

public interface Dispositivo {
	 void encender();
	 void apagar();
	 void mostrarImagen(String pImagen);
	 void ajustarVolumen(int pNivel);
	 void ajustarImagen();
	 void mostrarInfo();
	 void cambiarCanal(int pCanal);
	 void editarImagen(String pEdicion);
	}