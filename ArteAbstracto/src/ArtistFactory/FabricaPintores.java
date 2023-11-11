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
	
	public FabricaPintores() {
		
	}
	
	public Pintor crearPintor(String pTipoPintor, Lienzo pLienzo) {
		 
		 switch(pTipoPintor.toLowerCase()) {
		 	case "lunares":
		        return new PintorLunares(new EstrategiaLunares(), pLienzo);
		 	case "rayas":
		        return new PintorRayas(new EstrategiaRayas(), pLienzo);
		 	case "poligonos":
		        return new PintorPoligonos(new EstrategiaPoligonos(), pLienzo);
		        
		    default:
		    	return null;
		 }
	}
}
