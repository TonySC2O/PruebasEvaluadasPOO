package Pintores;

import ArtistEstrategia.Especificacion;
import ArtistEstrategia.Estrategia;
import GUI.Lienzo;

public class PintorRayas implements Pintor {

	Estrategia estrategia;
	Lienzo lienzo;
	boolean puedePintar = false;
	boolean grupoAtascado = false;
	int aportes = 0;
	int aportesMaximos;
	
	public PintorRayas(Estrategia pEstrategia, Lienzo pLienzo, int pAportesMaximos) {
		this.estrategia = pEstrategia;
		this.lienzo = pLienzo;
		this.aportesMaximos = pAportesMaximos;
	}
	
    @Override
    public void pintar() {
    	aportes++;
		System.out.println("Pintando Rayas " + Integer.toString(aportes));
    	lienzo.pintar(estrategia.getEspecificaciones());
    }

	@Override
	public void update(Especificacion aporte) {
		if(aporte.getTipoPintorAnterior().equals("lunares") || grupoAtascado){
			puedePintar = true;
			estrategia.Decidir(aporte);
        }
	}

	@Override
	public boolean puedePintar() {
		return puedePintar;
	}

	@Override
	public void setPuedePintar(boolean puede) {
		this.puedePintar = puede;
	}

	@Override
	public boolean aportesCompletados() {
		return aportes >= aportesMaximos;
	}

	@Override
	public void setGrupoAtascado(boolean atasco) {
		this.grupoAtascado = atasco;
		
	}
}
