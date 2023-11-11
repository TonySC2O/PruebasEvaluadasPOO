package Pintores;

import ArtistEstrategia.Especificacion;
import ArtistEstrategia.Estrategia;
import ArtistObservador.ObservadorLienzo;

public interface Pintor{
	
	ObservadorLienzo lienzo = new ObservadorLienzo();
	
	void pintar();
	void update(Especificacion aporte);
	boolean puedePintar();
	void setPuedePintar(boolean puede);
	void setGrupoAtascado(boolean atasco);
	boolean aportesCompletados();
}
