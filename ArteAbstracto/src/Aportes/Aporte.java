package Aportes;

import java.awt.Color;

public class Aporte {
	private String tipoAporte;
	private Color color;
	
	public Aporte(int[] pAristasX, int[] pAristasY, Color pColor) {
		this.tipoAporte = "poligono";
		this.color = pColor;
	}
	
	public Aporte(int x, int y, int pWidth, int pHeight, Color pColor) {
		this.tipoAporte = "xywh";
		this.color = pColor;
	}
}
