package Pintores;

import ArtistEstrategia.Especificacion;
import ArtistEstrategia.Estrategia;
import ArtistObservador.ObservadorLienzo;
import GUI.Lienzo;

public class PintorLunares implements Pintor {
	
	Estrategia estrategia;
	Lienzo lienzo;
	boolean puedePintar = false;
	
	public PintorLunares(Estrategia pEstrategia, Lienzo pLienzo) {
		this.estrategia = pEstrategia;
		this.lienzo = pLienzo;
	}

	@Override
    public void pintar() {
		estrategia.getEspecificaciones();
    }

	@Override
	public void update(Especificacion aporte) {
		if(aporte.getTipoPintorAnterior().equals("poligonos")){
			puedePintar = true;
			estrategia.Decidir(aporte);
        }
	}
}
