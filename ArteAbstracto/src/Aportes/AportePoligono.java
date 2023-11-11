package Aportes;

import java.awt.Color;

public class AportePoligono extends Aporte{
	
	// Se baja el x[1] y se sube el x[2] 10 unidades, mientras que y[1] y y[2] suben 20
	// Minimo: new int[] {200,190,210}, new int[] {200,220,220}, 3);
	// Maximo: new int[] {300,250,350}, new int[] {300,400,400}, 3);
	
	private int[] aristasX;
	private int[] aristasY;
	private int cantidadAristas;
	
	public AportePoligono(int[] pAristasX, int[] pAristasY, Color pColor) {
		super(pAristasX, pAristasY, pColor);
		this.aristasX = pAristasX;
		this.aristasY = pAristasY;
		this.cantidadAristas = pAristasX.length;
	}

}
