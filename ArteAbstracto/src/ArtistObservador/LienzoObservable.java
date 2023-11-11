package ArtistObservador;

import ArtistEstrategia.Especificacion;
import Pintores.Pintor;

public interface LienzoObservable {
	void addObserver(Pintor observer);
	void notificar(Especificacion aporte);
}
