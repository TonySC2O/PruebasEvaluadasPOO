package IAGeneros;

import java.util.ArrayList;

import Generos.GeneroMusical;
import Programa.Cancion;

public class GeneroIA{
	
	private ArrayList<GeneroMusical> generos;
	
	public GeneroIA() {
		this.generos = new ArrayList<GeneroMusical>();
	}
	
	public ArrayList<GeneroMusical> getGeneros() {
		return generos;
	}
	
	public void addGeneros(GeneroMusical pGenero){
		if(generos.size() < 3) {
			generos.add(pGenero);
		}else {
			System.out.println("Se ha alcanzado el número máximo de generos permitidos");
		}
	}
}
