package Generos;

public class GeneroMusical {
	
	private String nombre;
	private String[] instrumentos;
	private String ritmo;
	private String emocion;
	
	public GeneroMusical(String pNombre, String[] pInstrumentos, String pRitmo, String pEmocion) {
		this.nombre = pNombre;
		this.instrumentos = pInstrumentos;
		this.ritmo = pRitmo;
		this.emocion = pEmocion;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(String[] instrumentos) {
		this.instrumentos = instrumentos;
	}

	public String getRitmo() {
		return ritmo;
	}

	public void setRitmo(String ritmo) {
		this.ritmo = ritmo;
	}

	public String getEmocion() {
		return emocion;
	}

	public void setEmocion(String emocion) {
		this.emocion = emocion;
	}
	
	
}
