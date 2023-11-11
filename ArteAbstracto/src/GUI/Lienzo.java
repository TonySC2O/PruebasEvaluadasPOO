package GUI;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;

import ArtistEstrategia.Especificacion;
import ArtistObservador.ObservadorLienzo;

public class Lienzo extends JPanel{
	
    private ArrayList<Figura> figuras = new ArrayList<>();
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (Figura figura : figuras) {
        	g2d.setColor(figura.getColor());
            g2d.fill(figura.getShape());
            g2d.draw(figura.getShape());
        }
    }
	
	public void pintar(Especificacion pEspecificacion) {
		
		Figura figura = null;
		
		if(pEspecificacion.getTipoPintorAnterior().equals("lunares")) {
			
			Ellipse2D lunar = CalcularLunares(pEspecificacion);
			figura = new Figura(lunar, pEspecificacion.getColor());
			
		}else if(pEspecificacion.getTipoPintorAnterior().equals("rayas")) {
			
			Rectangle raya = CalcularRaya(pEspecificacion);
			figura = new Figura(raya, pEspecificacion.getColor());
	        AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians((int)(Math.random()*((0-1)-(360+1)+1)+(360+1))), 
	        													  raya.getX() + raya.getWidth() / 2, raya.getY() + raya.getHeight() / 2);
	        figura.setShape(at.createTransformedShape(raya));
		}else {
			
			Polygon triangulo = CalcularPoligono(pEspecificacion);
			figura = new Figura(triangulo, pEspecificacion.getColor());
		}
		
        figuras.add(figura);
        Main.main.pintoresObservador.notificar(pEspecificacion);
        repaint();
	}
	
	private Ellipse2D CalcularLunares(Especificacion pEspecificacion) {
		Ellipse2D elementos = null;
		
		int[] posicion = pEspecificacion.getPosicionAnterior();
		
		int tamaño = 20 + 40 * (pEspecificacion.getTamañoAnterior() - 1);
		
		elementos = new Ellipse2D.Double(posicion[0], posicion[1], tamaño, tamaño);
		return elementos;
	}
	
	private Rectangle CalcularRaya(Especificacion pEspecificacion) {
		Rectangle raya = null;
		
		int[] posicion = pEspecificacion.getPosicionAnterior();
		
		int largo = 100 * pEspecificacion.getTamañoAnterior();
		int ancho = 20 + 20 * (pEspecificacion.getTamañoAnterior() - 1);
		
		
        raya = new Rectangle(posicion[0], posicion[1], ancho, largo);
		return raya;
	}
	
	private Polygon CalcularPoligono(Especificacion pEspecificacion) {
		Polygon triangulo = null;
		
		int[] posicion = pEspecificacion.getPosicionAnterior();
		int[] puntosX = new int[3];
		int[] puntosY = new int[3];
		
		puntosX[0] = posicion[0];
		puntosX[1] = posicion[0] - 20 * pEspecificacion.getTamañoAnterior();
		puntosX[2] = posicion[0] + 20 * pEspecificacion.getTamañoAnterior();

		puntosY[0] = posicion[1] - 20 * pEspecificacion.getTamañoAnterior();
		puntosY[1] = posicion[1] + 20 * pEspecificacion.getTamañoAnterior();
		puntosY[2] = posicion[1] + 20 * pEspecificacion.getTamañoAnterior();

		triangulo = new Polygon(puntosX, puntosY, 3);
		
		return triangulo;
	}
}
