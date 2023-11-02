package Abstraccion;

public class Laptop extends DispositivoEnCasa {
	
	private String edicion;
	
    public Laptop() {
        super("Laptop");
        this.edicion = "";
    }

	@Override
	public void mostrarInfo() {
		System.out.println("Dispositivo: " + dispositivo);
		System.out.println("Estado: " + estado);
		System.out.println("Imagen actual: " + imagenActual);
		System.out.println("Volumen: " + Integer.toString(volumen));
		System.out.println("Imagen ajustada: " + Boolean.toString(ajustado));
		System.out.println("Edición colocada: " + edicion);
	}
   
    @Override
	public void editarImagen(String pEdicion) {
    	if(estado.equals("Encendido")) {
			edicion = pEdicion;
	    	System.out.println("Se ha editado la imagen con: " + pEdicion);
		}else {
			System.out.println("El dispositivo no esta encendido");
		}
    }
    
}
