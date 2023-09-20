package Programa;

import java.util.ArrayList;

import Generos.GeneroMusical;
import IALetras.Letra;

public class Cancion {
	
	private ArrayList<GeneroMusical> generos;
	private Letra letra;
	boolean reproduciendo = false;
	
	public Cancion(ArrayList<GeneroMusical> pGeneros, Letra pLetra) {
		this.generos = pGeneros;
		this.letra = pLetra;
		reproduciendo = true;
	}
	
	boolean isReproduciendo() {
		return reproduciendo;
	}
	
	public void addGenero(GeneroMusical pGenero) {
		if(reproduciendo && generos.size() < 3) {
			generos.add(pGenero);
		}
	}
}
