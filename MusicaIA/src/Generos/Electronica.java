package Generos;

public class Electronica extends GeneroMusical{
	
	private String[] artistas = {"Avicii", "Daft Punk", "Alan Walker"};

	public Electronica(String[] pInstrumentos, String pRitmo, String pEmocion) {
		super("Electronica", pInstrumentos, pRitmo, pEmocion);
		// TODO Auto-generated constructor stub
	}

	public String[] getArtistas() {
		return artistas;
	}

	public void setArtistas(String[] artistas) {
		this.artistas = artistas;
	}

}
