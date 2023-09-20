package Generos;

public class Pop extends GeneroMusical{
	
	private String[] artistas = {"Ed Sheeran", "Michael Jackson", "Bee Gees"};

	public Pop(String[] pInstrumentos, String pRitmo, String pEmocion) {
		super("Pop", pInstrumentos, pRitmo, pEmocion);
		// TODO Auto-generated constructor stub
	}

	public String[] getArtistas() {
		return artistas;
	}

	public void setArtistas(String[] artistas) {
		this.artistas = artistas;
	}

}
