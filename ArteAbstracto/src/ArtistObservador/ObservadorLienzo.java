package ArtistObservador;

import java.util.ArrayList;

import ArtistEstrategia.Especificacion;
import Pintores.Pintor;

public class ObservadorLienzo implements LienzoObservable{
	
    private ArrayList<Pintor> observadores = new ArrayList<>();
    
    @Override
    public void addObserver(Pintor observer) {
    	observadores.add(observer);
    }

    @Override
    public void notificar(Especificacion aporte) {
        for (Pintor observer : observadores) {
            observer.update(aporte);
        }
    }
}
