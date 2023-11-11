package Pintores;

import ArtistEstrategia.Especificacion;
import ArtistEstrategia.Estrategia;
import GUI.Lienzo;

public class PintorPoligonos implements Pintor {

	Estrategia estrategia;
	Lienzo lienzo;
	boolean puedePintar = false;
	
	public PintorPoligonos(Estrategia pEstrategia, Lienzo pLienzo) {
		this.estrategia = pEstrategia;
		this.lienzo = pLienzo;
	}
	
    @Override
    public void pintar() {
        System.out.println("Pintando polígonos");
    }
    
	@Override
	public void update(Especificacion aporte) {
		if(aporte.getTipoPintorAnterior().equals("rayas")){
			puedePintar = true;
			estrategia.Decidir(aporte);
        }
	}
}
