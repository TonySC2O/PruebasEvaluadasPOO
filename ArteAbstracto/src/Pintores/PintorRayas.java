package Pintores;

import ArtistEstrategia.Especificacion;
import ArtistEstrategia.Estrategia;
import GUI.Lienzo;

public class PintorRayas implements Pintor {

	Estrategia estrategia;
	Lienzo lienzo;
	boolean puedePintar = false;
	
	public PintorRayas(Estrategia pEstrategia, Lienzo pLienzo) {
		this.estrategia = pEstrategia;
		this.lienzo = pLienzo;
	}
	
    @Override
    public void pintar() {
    	lienzo.pintar(estrategia.getEspecificaciones());
    }

	@Override
	public void update(Especificacion aporte) {
		if(aporte.getTipoPintorAnterior().equals("lunares")){
			puedePintar = true;
			estrategia.Decidir(aporte);
        }
	}
}
