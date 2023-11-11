package ArtistEstrategia;

import java.awt.Color;

public class EstrategiaRayas implements Estrategia{
	
	Especificacion especPropia = new Especificacion(Color.RED, "Rayas", new int[] {100,200}, 3);

	@Override
	public void Decidir(Especificacion pEspecificaciones) {
		
		if(pEspecificaciones.getColor().equals(Color.RED)) {
			especPropia.setColor(Color.GREEN);
		}
		if(pEspecificaciones.getColor().equals(Color.GREEN)) {
			especPropia.setColor(Color.BLUE);
		}
		if(pEspecificaciones.getColor().equals(Color.BLUE)) {
			especPropia.setColor(Color.RED);
		}
		
		//Posicion
		
		int[] newPosicion = new int[2];
		
		if(pEspecificaciones.getPosicionAnterior()[0] <= 300) {
			newPosicion[0] = getRandombetween(0, 300);
		}else {
			newPosicion[0] = getRandombetween(300, 600);
		}
		
		if(pEspecificaciones.getPosicionAnterior()[1] <= 300) {
			newPosicion[1] = getRandombetween(300, 600);
		}else {
			newPosicion[1] = getRandombetween(0, 300);
		}
		
		especPropia.setPosicionAnterior(newPosicion);
		
		// Tamaño
		especPropia.setTamañoAnterior(pEspecificaciones.getTamañoAnterior());
	}

	private int getRandombetween(int n, int m) {
		return (int)(Math.random()*((n-1)-(m+1)+1)+(m+1));
	}

	@Override
	public Especificacion getEspecificaciones() {
		return especPropia;
	}

}
