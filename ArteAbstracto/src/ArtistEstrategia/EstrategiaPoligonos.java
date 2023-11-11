package ArtistEstrategia;

import java.awt.Color;

public class EstrategiaPoligonos implements Estrategia{

	Especificacion especPropia = new Especificacion(Color.GREEN, "poligonos", new int[] {500,200}, 2);

	@Override
	public void Decidir(Especificacion pEspecificaciones) {
		
		especPropia.setColor(pEspecificaciones.getColor());
		
		//Posicion
		
		int[] newPosicion = new int[2];
		
		if(pEspecificaciones.getPosicionAnterior()[0] <= 300) {
			newPosicion[0] = getRandombetween(0, 300);
		}else {
			newPosicion[0] = getRandombetween(300, 500);
		}
		
		if(pEspecificaciones.getPosicionAnterior()[1] <= 300) {
			newPosicion[1] = getRandombetween(0, 300);
		}else {
			newPosicion[1] = getRandombetween(300, 500);
		}
		
		especPropia.setPosicionAnterior(newPosicion);
		
		// Tamaño
		// Tamaño
		if(pEspecificaciones.getTamañoAnterior() < 3) {
			especPropia.setTamañoAnterior(getRandombetween(3,5));
		}else {
			especPropia.setTamañoAnterior(getRandombetween(1,3));
		}
	}

	private int getRandombetween(int n, int m) {
		return (int)(Math.random()*((n-1)-(m+1)+1)+(m+1));
	}

	@Override
	public Especificacion getEspecificaciones() {
		return especPropia;
	}

}
