package ArtistEstrategia;

import java.awt.Color;

public class Especificacion {
	
	private Color color;
	private String tipoPintorAnterior;
	private int[] posicionAnterior; 
	private int tamañoAnterior;
	
	public Especificacion(Color pColor, String pTipo, int[] pPosicion, int pTamaño){
		this.color = pColor;
		this.tipoPintorAnterior = pTipo;
		this.posicionAnterior = pPosicion;
		this.tamañoAnterior = pTamaño;
	}

	public Especificacion() {
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getTipoPintorAnterior() {
		return tipoPintorAnterior;
	}

	public void setTipoPintorAnterior(String tipoPintorAnterior) {
		this.tipoPintorAnterior = tipoPintorAnterior;
	}

	public int[] getPosicionAnterior() {
		return posicionAnterior;
	}

	public void setPosicionAnterior(int[] posicionAnterior) {
		this.posicionAnterior = posicionAnterior;
	}

	public int getTamañoAnterior() {
		return tamañoAnterior;
	}

	public void setTamañoAnterior(int tamañoAnterior) {
		this.tamañoAnterior = tamañoAnterior;
	}
}
