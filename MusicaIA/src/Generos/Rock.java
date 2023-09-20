package Generos;

public class Rock extends GeneroMusical{
	
	private String[] artistas = {"Guns n' Roses", "Kiss", "AC/DC"};

	public Rock(String[] pInstrumentos, String pRitmo, String pEmocion) {
		super("Rock", pInstrumentos, pRitmo, pEmocion);
		// TODO Auto-generated constructor stub
	}

	public String[] getArtistas() {
		return artistas;
	}

	public void setArtistas(String[] artistas) {
		this.artistas = artistas;
	}

}
