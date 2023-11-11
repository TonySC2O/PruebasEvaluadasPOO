package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import ArtistEstrategia.Especificacion;

public class Lienzo extends JPanel{
	
	private Especificacion especificacion;

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		graphics.setColor(especificacion.getColor());
		
		if(especificacion.getTipoPintorAnterior().equals("poligonos")) {
			graphics.fillPolygon(new int[] {200,190,210}, new int[] {200,220,220}, 3);
	
			graphics.fillPolygon(new int[] {300,250,350}, new int[] {300,400,400}, 3);
		}else if(especificacion.getTipoPintorAnterior().equals("lunares")){
			int[] elementos = CalcularLunares();
			graphics.fillOval(elementos[0], elementos[1], elementos[2], elementos[3]);
		}else {
			graphics.fillRect(100, 500, 100, 100);
		}
	}
	
	public void pintar(Especificacion pEspecificacion) {
		this.especificacion = pEspecificacion;
	}
	
	private int[] CalcularLunares() {
		int[] elementos = new int[4];
		
		return elementos;
	}
}
