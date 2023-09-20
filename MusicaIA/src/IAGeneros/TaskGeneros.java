package IAGeneros;

import Generos.Electronica;
import Generos.Pop;
import Generos.Reggae;
import Generos.Rock;

public class TaskGeneros implements ITaskGeneros{
	
	private String[] instrumentos;
	
	@Override
	public void Agregar(Generos pGenero, GeneroIA generoIA) {
		try {
			if(pGenero==Generos.Rock) {
				instrumentos = new String[] {"Guitarra", "Batería", "Bajo"};
				generoIA.addGeneros(new Rock(instrumentos, "Normal", "Fuerte"));
			}
			if(pGenero==Generos.Reggae) {
				instrumentos = new String[] {"Tambor Samba", "Maracas", "Bongoe"};
				generoIA.addGeneros(new Reggae(instrumentos, "Lento", "Calmado"));
			}
			if(pGenero==Generos.Electronica) {
				instrumentos = new String[] {"Sintetizador", "Piano Electrico", "Guitarra Electrica"};
				generoIA.addGeneros(new Electronica(instrumentos, "Normal", "Animado"));
			}
			if(pGenero==Generos.Pop) {
				instrumentos = new String[] {"Microfono", "Batería", "Guitarra"};
				generoIA.addGeneros(new Pop(instrumentos, "Normal", "Animado"));
			}
		}catch(Exception ex) {
			System.out.println("Ha ocurrido un error: " + ex);
		}
	}
}
