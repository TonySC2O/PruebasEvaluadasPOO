package IALetras;

import java.util.ArrayList;

import IAGeneros.GeneroIA;

public class LetraIA {
	
	private ArrayList<String> frases;
	
	public LetraIA() {
		this.frases = new ArrayList<String>();
	}
	
	public static Letra generarLetra(GeneroIA pGenerosCancion) {
		Letra letra = new Letra();
		return letra;
	}
	
	public void addFrases(String[] pFrases) {
		for(int i = 0; i < pFrases.length; i++) {
			frases.add(pFrases[i]);
		}
	}
	
}
