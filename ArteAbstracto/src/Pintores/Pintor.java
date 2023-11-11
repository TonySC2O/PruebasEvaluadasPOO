package Pintores;

import ArtistEstrategia.Especificacion;
import ArtistEstrategia.Estrategia;
import ArtistObservador.ObservadorLienzo;

public interface Pintor{
	
	ObservadorLienzo lienzo = new ObservadorLienzo();
	Especificacion ultimoAporte = new Especificacion();
	
	void pintar();
	void update(Especificacion aporte);
}
