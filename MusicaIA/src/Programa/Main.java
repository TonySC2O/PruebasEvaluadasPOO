package Programa;

import IAGeneros.GeneroIA;
import IAGeneros.Generos;
import IAGeneros.TaskGeneros;
import IALetras.Letra;
import IALetras.LetraIA;

public class Main {
	
	public static void main(String[] args) {
		
		GeneroIA generosCancion = new GeneroIA();
		Letra letraCancion = new Letra();
		TaskGeneros taskGeneros = new TaskGeneros();
		LetraIA letraIA = new LetraIA();
		Cancion cancion;
		
		String[] frases = {"Me siento estupendo", "Me quiero mover"};
		
		letraIA.addFrases(frases);
		
		
		String[] generos = {"Rock", "Pop"};
		
		for(int i = 0; i < generos.length; i++) {
			taskGeneros.Agregar(Generos.valueOf(generos[i]), generosCancion);
		}
		
		letraCancion = LetraIA.generarLetra(generosCancion);
		
		cancion = new Cancion(generosCancion.getGeneros(), letraCancion);
		
	}
	
}
