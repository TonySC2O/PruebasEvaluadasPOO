package ArtistFactory;

import ArtistEstrategia.EstrategiaLunares;
import ArtistEstrategia.EstrategiaPoligonos;
import ArtistEstrategia.EstrategiaRayas;
import GUI.Lienzo;
import Pintores.Pintor;
import Pintores.PintorLunares;
import Pintores.PintorPoligonos;
import Pintores.PintorRayas;

public class FabricaPintores {
	
	private int aportesMaximos;
	
	public FabricaPintores(int pAportesMaximos) {
		this.aportesMaximos = pAportesMaximos;
	}
	
	public Pintor crearPintor(String pTipoPintor, Lienzo pLienzo) {
		 
		 switch(pTipoPintor.toLowerCase()) {
		 	case "lunares":
		        return new PintorLunares(new EstrategiaLunares(), pLienzo, aportesMaximos);
		 	case "rayas":
		        return new PintorRayas(new EstrategiaRayas(), pLienzo, aportesMaximos);
		 	case "poligonos":
		        return new PintorPoligonos(new EstrategiaPoligonos(), pLienzo, aportesMaximos);
		        
		    default:
		    	return null;
		 }
	}
}
