package ArtistEstrategia;

import java.awt.Color;

public class EstrategiaLunares implements Estrategia{

	Especificacion especPropia = new Especificacion(Color.BLUE, "Lunares", new int[] {600,100}, 5);

	@Override
	public void Decidir(Especificacion pEspecificaciones) {
		
		
		//Color
		if(pEspecificaciones.getColor().equals(Color.RED)) {
			especPropia.setColor(Color.BLUE);
		}
		if(pEspecificaciones.getColor().equals(Color.GREEN)) {
			especPropia.setColor(Color.RED);
		}
		if(pEspecificaciones.getColor().equals(Color.BLUE)) {
			especPropia.setColor(Color.GREEN);
		}
		
		//Posicion
		int[] newPosicion = new int[2];
		
		if(pEspecificaciones.getPosicionAnterior()[0] <= 300) {
			newPosicion[0] = getRandombetween(300, 600);
		}else {
			newPosicion[0] = getRandombetween(0, 300);
		}
		
		if(pEspecificaciones.getPosicionAnterior()[1] <= 300) {
			newPosicion[1] = getRandombetween(0, 300);
		}else {
			newPosicion[1] = getRandombetween(300, 600);
		}
		
		especPropia.setPosicionAnterior(newPosicion);
		
		// Tamaño
		if(pEspecificaciones.getTamañoAnterior() > 3) {
			especPropia.setTamañoAnterior(getRandombetween(1,3));
		}else {
			especPropia.setTamañoAnterior(getRandombetween(3,5));
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
