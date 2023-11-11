package Main;

import GUI.Lienzo;
import GUI.Ventana;

import java.awt.Color;

import ArtistEstrategia.Especificacion;
import ArtistFactory.FabricaPintores;
import Pintores.Pintor;
import ArtistObservador.ObservadorLienzo;

/* Ejercicio evaluado especial por un 7%. se quiere crear un generador de arte abstracto en java el cual vaya creando una "pintura" artística multiculor 
 * en forma automática en la pantalla y con un tamaño definido. el generador deberá tener N pintores funcionando en paralelo, existen 3 tipos de pintores, 
 * los que saben pintar lunares de colores de diversos tamaños, los que saben pintar rayas de diversos colores y grosores, finalmente los que saben pintar 
 * polígonos de diversos tamaños y colores. los pintores se crean dinámicamente, recibiendo cada pintor diferentes parámetros y reglas que determinan su 
 * estilo de pintura y su prioridad para pintar. aunque todos los pintores estén activos en todo momento, solo uno de ellos pinta a la vez, dando 300 
 * milisegundos entre cada pintor. todos los pintores ponen atención al último pintor que pintó, la posición donde pintó, el tamaño y el color que pintó, y 
 * esos 4 parámetros determinan el turno del siguiente pintor, la posición, el color y estilo que va a pintar el siguiente, y así sucesivamente. se busca 
 * que los pintores puedan generar diversidad de formas, colores y posiciones. el UI será una ventana de un tamaño fijo, donde los pintores irán dibujando 
 * en el Graphics de dicha ventana. diseñe e implemente una jerarquía de objetos que resuelva el problema de generación de pinturas abstractas haciendo uso 
 * estratégico de los patrones de diseño strategy, observer, iterator y factory. los pintores iran agregando elementos a la obra y terminarán hasta que todos 
 * hayan aportando X cantidad de elementos a la pintura, donde X es configurable.
 * 
 * REGLAS:
 * 
 * El orden es el siguiente: Lunares -> Rayas -> Poligonos -> Lunares ...
 * 
 * Extrategias:
 * 
 * 
 */


public class main {

	public static void main(String[] args) {

		FabricaPintores fabrica = new FabricaPintores();
		String[] pintores = {"Lunares","Rayas","poligonos"};
		ObservadorLienzo pintoresObservador = new ObservadorLienzo();
		
		Lienzo panelLienzo = new Lienzo();
		
		for(int i = 0; i < pintores.length; i++) {
			Pintor pintor = fabrica.crearPintor(pintores[i], panelLienzo);
			pintoresObservador.addObserver(pintor);
		}
		
		Ventana ventana = new Ventana();
		ventana.add(panelLienzo);
		panelLienzo.pintar(new Especificacion(Color.RED, "poligonos", new int[] {1,2}, 3));
		panelLienzo.pintar(new Especificacion(Color.BLUE, "rayas", new int[] {1,2}, 3));
		ventana.setVisible(true);
	}

}
