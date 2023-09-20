package Generos;

public class Reggae extends GeneroMusical{
	
	private String[] artistas = {"Bob Marley", "Sean Paul", "Spice"};

	public Reggae(String[] pInstrumentos, String pRitmo, String pEmocion) {
		super("Reggae", pInstrumentos, pRitmo, pEmocion);
		// TODO Auto-generated constructor stub
	}

	public String[] getArtistas() {
		return artistas;
	}

	public void setArtistas(String[] artistas) {
		this.artistas = artistas;
	}
}
